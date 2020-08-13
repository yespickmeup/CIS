/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.adjustments;

import cis.academic.Academic_year_fees;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.finance.Enrollment_assessment_payment_modes;
import cis.finance.Enrollment_assessment_payments;
import cis.finance.Enrollment_assessments.to_enrollment_assessments;
import cis.utils.DateType;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;

/**
 *
 * @author User
 */
public class Assessment_adjustments {

    public static void run_adjustment() {

        String where2 = "  ";

        List<to_enrollment_assessments> assessments = ret_data(where2);
        int not_equal_units = 0;
        for (to_enrollment_assessments to : assessments) {
            List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where enrollment_id='" + to.enrollment_id + "' ");
            double lec_units = 0;
            double lab_units = 0;
            for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects sub : subjects) {
                lec_units += sub.lecture_units;
                lab_units += sub.lab_units;
            }
            double total_units = lec_units + lab_units;

            //<editor-fold defaultstate="collapsed" desc=" ret per unit ">
            String where = " where id<>0 ";
            where = where + " and academic_year_id='" + to.academic_year_id + "' "
                    + " and department_id='" + to.department_id + "' "
                    + " and level_id='" + to.level_id + "' "
                    + " and course_id='" + to.course_id + "' "
                    + " and period like '" + to.year_level + "' "
                    + " and group_id=0 ";
            List<Academic_year_fees.to_academic_year_fees> datas = Academic_year_fees.ret_data(where);
            double tuition_amount = 0;
            if (!datas.isEmpty()) {

                Academic_year_fees.to_academic_year_fees to2 = (Academic_year_fees.to_academic_year_fees) datas.get(0);
                if (to2.is_per_unit == 0) {
                    tuition_amount = to2.amount;
                } else {
                    tuition_amount = to2.per_unit * total_units;
                }
            }
            //</editor-fold>

            not_equal_units++;

            double sub_total = tuition_amount + to.miscellaneous_amount + to.other_fees_amount;

            double downpayment = 0;

            List<Enrollment_assessment_payments.to_enrollment_assessment_payments> payments = Enrollment_assessment_payments.ret_data(" where enrollment_assessment_id='" + to.id + "' ");
            if (!payments.isEmpty()) {
                Enrollment_assessment_payments.to_enrollment_assessment_payments payment = payments.get(0);
                downpayment = payment.amount_paid;
            }
            double payable = sub_total - downpayment;

            List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> modes = mode_of_payment(to.mode_of_payment, sub_total, downpayment);

            System.out.println("-----------------------------------");
            System.out.println("Id: " + to.id);
            System.out.println("Name: " + to.lname + ", " + to.fname);
            System.out.println("Department: " + to.department);
            System.out.println("total_units: " + to.no_of_units + " / " + total_units);
            System.out.println("Tuition amount: " + to.tuition_amount + " / " + tuition_amount);
            System.out.println("Sub Total: " + sub_total);
            System.out.println("Downpayment: " + downpayment);
            System.out.println("Payable: " + payable);
            System.out.println("******************");

//            for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes mode : modes) {
//                double balance = mode.amount - mode.paid;
//                System.out.println("        " + mode.mode + " | " + mode.amount + " | " + mode.paid + " | " + balance);
//
//            }
            try {
                Connection conn = MyConnection.connect();
                conn.setAutoCommit(false);
                PreparedStatement stmt = conn.prepareStatement("");
                String up1 = " update enrollment_assessments set tuition_amount='" + tuition_amount + "',no_of_units='" + total_units + "' where id='" + to.id + "' ";
                stmt.addBatch(up1);
                for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes mode : modes) {
                    double balance = mode.amount - mode.paid;
                    System.out.println("        " + mode.mode + " | " + mode.amount + " | " + mode.paid + " | " + balance);
                    String up2 = " update enrollment_assessment_payment_modes set amount='" + mode.amount + "',paid='" + mode.paid + "' where enrollment_assessment_id='" + to.id + "' and mode like '" + mode.mode + "' ";
                    String up3 = " update enrollment_assessment_payment_details set amount='" + mode.amount + "',paid='" + mode.paid + "' where enrollment_assessment_id='" + to.id + "' and mode like '" + mode.mode + "' ";
                    stmt.addBatch(up2);
                    stmt.addBatch(up3);
                }

                stmt.executeBatch();
                conn.commit();
                Lg.s(Assessment_adjustments.class, "Successfully Updated");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                MyConnection.close();
            }

        }
        System.out.println("--------------------------------------");
        System.out.println("not_equal_units: " + not_equal_units);
    }

    public static void main(String[] args) {
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

    }

    private static List<Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> mode_of_payment(int payment_mode_no, double total, double downpayment2) {

        List< Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes> modes = new ArrayList();
        double downpayment = 2000;
        String date = DateType.sf.format(new Date());
        if (payment_mode_no == 1) {
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Full Payment", 0, date, total, 0, 0, "", "", "", "", 0, 0);
            modes.add(p1);
        }
        if (payment_mode_no == 2) {

            double to_pay = total - downpayment;
            to_pay = to_pay / 2;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
        }

        if (payment_mode_no == 3) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 3;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
        }
        if (payment_mode_no == 4) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 4;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p5 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "4th Payment", 4, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
            modes.add(p5);
        }
        if (payment_mode_no == 5) {
            double to_pay = total - downpayment;
            to_pay = to_pay / 5;
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p1 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "Downpayment", 0, date, downpayment, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p2 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "1st Payment", 1, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p3 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "2nd Payment", 2, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p4 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "3rd Payment", 3, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p5 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "4th Payment", 4, date, to_pay, 0, 0, "", "", "", "", 0, 0);
            Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes p6 = new Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes(0, 0, 0, "", 0, "", "5th Payment", 5, date, to_pay, 0, 0, "", "", "", "", 0, 0);

            modes.add(p1);
            modes.add(p2);
            modes.add(p3);
            modes.add(p4);
            modes.add(p5);
            modes.add(p6);
        }

        double total1 = downpayment2;

        for (Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes mode : modes) {
            double amount = mode.amount;
            double prev_total = total1;
            total1 = total1 - amount;
            if (total1 >= 0) {
                mode.setPaid(amount);
            } else {
                if (prev_total >= 0) {
                    mode.setPaid(prev_total);
                } else {
                    mode.setPaid(0);
                }
            }
        }
        return modes;
    }

    public static List<to_enrollment_assessments> ret_data(String where) {
        List<to_enrollment_assessments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",lname"
                    + ",mi"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",curriculum_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",year_level"
                    + ",year_level_status"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",tuition_amount"
                    + ",no_of_units"
                    + ",amount_per_unit"
                    + ",tuition_discount"
                    + ",miscellaneous_amount"
                    + ",miscellaneous_discount"
                    + ",other_fees_amount"
                    + ",other_fees_discount"
                    + ",mode_of_payment"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from enrollment_assessments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_id = rs.getInt(2);
                String enrollment_no = rs.getString(3);
                int student_id = rs.getInt(4);
                String student_no = rs.getString(5);
                String fname = rs.getString(6);
                String lname = rs.getString(7);
                String mi = rs.getString(8);
                int academic_year_id = rs.getInt(9);
                String academic_year = rs.getString(10);
                int curriculum_id = rs.getInt(11);
                int course_id = rs.getInt(12);
                String course_code = rs.getString(13);
                String course_description = rs.getString(14);
                String term = rs.getString(15);
                String year_level = rs.getString(16);
                String year_level_status = rs.getString(17);
                int level_id = rs.getInt(18);
                String level = rs.getString(19);
                int college_id = rs.getInt(20);
                String college = rs.getString(21);
                int department_id = rs.getInt(22);
                String department = rs.getString(23);
                double tuition_amount = rs.getDouble(24);
                int no_of_units = rs.getInt(25);
                double amount_per_unit = rs.getDouble(26);
                double tuition_discount = rs.getDouble(27);
                double miscellaneous_amount = rs.getDouble(28);
                double miscellaneous_discount = rs.getDouble(29);
                double other_fees_amount = rs.getDouble(30);
                double other_fees_discount = rs.getDouble(31);
                int mode_of_payment = rs.getInt(32);
                String created_at = rs.getString(33);
                String updated_at = rs.getString(34);
                String created_by = rs.getString(35);
                String updated_by = rs.getString(36);
                int status = rs.getInt(37);
                int is_uploaded = rs.getInt(38);

                to_enrollment_assessments to = new to_enrollment_assessments(id, enrollment_id, enrollment_no, student_id, student_no, fname, lname, mi, academic_year_id, academic_year, curriculum_id, course_id, course_code, course_description, term, year_level, year_level_status, level_id, level, college_id, college, department_id, department, tuition_amount, no_of_units, amount_per_unit, tuition_discount, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount, mode_of_payment, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

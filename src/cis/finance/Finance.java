/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.students.Students;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Finance {

    public static class fees {

        public final int id;
        public final String title;
        public final String date;
        public final String deadline;
        public final double amount;
        public final double interest;
        public final double paid;
        public final double balance;
        public boolean selected;
        public final int trans_type;
        public double new_payment;
        public final String mode;

        public fees(int id, String title, String date, String deadline, double amount, double interest, double paid, double balance, boolean selected, int trans_type, double new_payment, String mode) {
            this.id = id;
            this.title = title;
            this.date = date;
            this.deadline = deadline;
            this.amount = amount;
            this.interest = interest;
            this.paid = paid;
            this.balance = balance;
            this.selected = selected;
            this.trans_type = trans_type;
            this.new_payment = new_payment;
            this.mode = mode;
        }

        public double getNew_payment() {
            return new_payment;
        }

        public void setNew_payment(double new_payment) {
            this.new_payment = new_payment;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }
    }

    public static class transactions {

        public final int id;
        public final String date;
        public final String trans_type;
        public final double amount;

        public transactions(int id, String date, String trans_type, double amount) {
            this.id = id;
            this.date = date;
            this.trans_type = trans_type;
            this.amount = amount;
        }

    }

    public static List<fees> ret_data(Students.to_students stud) {
        List<fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "ea.id"
                    + ",ea.enrollment_assessment_id"
                    + ",ea.enrollment_id"
                    + ",ea.enrollment_no"
                    + ",ea.academic_year_id"
                    + ",ea.academic_year"
                    + ",ea.mode"
                    + ",ea.mode_order"
                    + ",ea.to_pay"
                    + ",ea.amount"
                    + ",ea.discount"
                    + ",ea.paid"
                    + ",ea.created_at"
                    + ",ea.updated_at"
                    + ",ea.created_by"
                    + ",ea.updated_by"
                    + ",ea.status"
                    + ",ea.is_uploaded"
                    + ",e.term"
                    + ",e.year_level"
                    + " from enrollment_assessment_payment_modes ea "
                    + " left join enrollment_assessments e "
                    + " on ea.enrollment_assessment_id = e.id "
                    + " where e.student_id='" + stud.id + "' "
                    + " and (ea.amount-ea.paid) >0 ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);

            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_assessment_id = rs.getInt(2);

                int enrollment_id = rs.getInt(3);
                String enrollment_no = rs.getString(4);
                int academic_year_id = rs.getInt(5);
                String academic_year = rs.getString(6);
                String mode = rs.getString(7);
                int mode_order = rs.getInt(8);
                String to_pay = rs.getString(9);
                double amount = rs.getDouble(10);
                double discount = rs.getDouble(11);
                double paid = rs.getDouble(12);
                String created_at = rs.getString(13);
                String updated_at = rs.getString(14);
                String created_by = rs.getString(15);
                String updated_by = rs.getString(16);
                int status = rs.getInt(17);
                int is_uploaded = rs.getInt(18);
                String term = rs.getString(19);
                String year_level = rs.getString(20);

                String title
                        = "<html><body>"
                        + "&nbsp <font color=\"black\";size=\"4\"><b>" + mode + "</b> - " + term + "</font><br>"
                        + "&nbsp <font size=\"2\"> " + year_level + " (" + academic_year + ")</font><br>"
                        + "</body>"
                        + "</html>";

                String date = DateType.convert_slash_datetime(created_at);
                String deadline = DateType.convert_slash_datetime2(to_pay);
                double amount2 = amount;
                double interest = 0;
                double paid2 = paid;
                double balance = amount2 - paid2;
                boolean selected = false;

                String s10 = "select "
                        + "id"
                        + ",paid"
                        + " from enrollment_assessment_payment_details"
                        + " where enrollment_assessment_id='" + enrollment_assessment_id + "' "
                        + " and mode like '" + mode + "' and mode_order=100 ";

                Statement stmt10 = conn.createStatement();
                ResultSet rs10 = stmt10.executeQuery(s10);
                double payment = 0;
                while (rs10.next()) {
                    int id10 = rs10.getInt(1);
                    payment += rs10.getDouble(2);

                }
                paid2 = paid2 + payment;
                balance = balance - payment;
                fees f = new fees(id, title, date, deadline, amount, interest, paid2, balance, selected, 1, 0, mode);
                if (balance > 0) {
                    datas.add(f);
                }

            }

            //<editor-fold defaultstate="collapsed" desc=" Search Academic Year feess ">
            String where3 = " where id<>0 ";
            where3 = where3 + " and academic_year_id='" + stud.academic_year_id + "' "
                    + " and department_id='" + stud.department_id + "' "
                    + " and level_id='" + stud.level_id + "' "
                    + " and course_id='" + stud.course_id + "' "
                    + " and period like '" + stud.year_level + "' "
                    + " and group_id=0 ";

            String s100 = "select "
                    + "fee_id"
                    + ",fee"
                    + ",amount"
                    + ",is_per_unit"
                    + ",per_unit"
                    + ",lab_unit_amount"
                    + " from academic_year_fees"
                    + " " + where3;

            Statement stmt100 = conn.createStatement();
            ResultSet rs100 = stmt100.executeQuery(s100);
            double fee_amount = 0;
            int is_per_unit = 0;
            double per_unit = 0;
            double lab_unit_amount = 0;
            int no_of_units_lec = 0;
            int no_of_units_lab = 0;
            if (rs100.next()) {
                int fee_id = rs100.getInt(1);
                String fee = rs100.getString(2);
                fee_amount = rs100.getDouble(3);
                is_per_unit = rs100.getInt(4);
                per_unit = rs100.getDouble(5);
                lab_unit_amount = rs100.getDouble(6);

            }

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" loaded subjects ">
            String s2 = "select "
                    + "subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",created_at"
                    + ",id"
                    + " from enrollment_student_loaded_subjects"
                    + " where student_id='" + stud.id + "' and status=0 ";

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            String subject_codes = "";
            int added_subjects = 0;
            String added_subjects_date = "";
            while (rs2.next()) {
                int subject_id = rs2.getInt(1);
                String subject_code = rs2.getString(2);
                String description = rs2.getString(3);
                int lecture_units = rs2.getInt(4);
                int lab_units = rs2.getInt(5);
                String created_at = rs2.getString(6);
                int idd = rs2.getInt(7);

                String s3 = "select "
                        + " id"
                        + " from enrollment_sls_payment_details "
                        + " where enrollment_sls_id = '" + idd + "'  and status=1 and trans_type=1 ";

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);

                int is_paid = 0;
                if (rs3.next()) {
                    is_paid = 1;
                }
                if (is_paid == 0) {
                    if (added_subjects == 0) {
                        subject_codes = subject_code;
                    } else {
                        subject_codes = subject_codes + ", " + subject_code;
                    }

                    added_subjects_date = DateType.convert_slash_datetime(created_at);
                    no_of_units_lec += lecture_units;
                    no_of_units_lab += lab_units;
                    added_subjects++;
                }

            }
            double amount2 = 0;

            if (is_per_unit == 1) {
                double total_lec_amount = per_unit * no_of_units_lec;
                double total_lab_amount = lab_unit_amount * no_of_units_lab;
                amount2 = total_lec_amount + total_lab_amount;
            } else {
                amount2 = fee_amount;
            }
            double total_units = no_of_units_lec + no_of_units_lab;
            String title
                    = "<html><body>"
                    + "&nbsp <font color=\"black\";size=\"4\"><b>" + "Add Subject Requests" + "</b> - " + total_units + " units </font><br>"
                    + "&nbsp <font size=\"2\"> " + "Subject/s: " + " (" + subject_codes + ")</font><br>"
                    + "</body>"
                    + "</html>";

            String date = added_subjects_date;
            String deadline = "";
            double interest = 0;
            double paid2 = 0;
            double balance = amount2 - paid2;
            boolean selected = false;

            if (added_subjects != 0) {
                fees f = new fees(0, title, date, deadline, amount2, interest, paid2, balance, selected, 2, 0, "Add Subject");
                datas.add(f);
            }
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc=" Drop subjects ">
            String s4 = "select "
                    + "subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",created_at"
                    + ",id"
                    + " from enrollment_student_loaded_subjects_drop_requests"
                    + " where student_id='" + stud.id + "' and status=0 ";

            Statement stmt4 = conn.createStatement();
            ResultSet rs4 = stmt4.executeQuery(s4);
            String subject_codes2 = "";
            int dropped_subjects2 = 0;
            String added_subjects_date2 = "";
            double no_of_units_lec2 = 0;
            double no_of_units_lab2 = 0;
            while (rs4.next()) {
                int subject_id = rs4.getInt(1);
                String subject_code = rs4.getString(2);
                String description = rs4.getString(3);
                int lecture_units = rs4.getInt(4);
                int lab_units = rs4.getInt(5);
                String created_at = rs4.getString(6);
                int idd = rs4.getInt(7);

                String s3 = "select "
                        + " id"
                        + " from enrollment_sls_payment_details "
                        + " where enrollment_sls_id = '" + idd + "'  and status=1 and trans_type=2 ";

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);

                int is_paid = 0;
                if (rs3.next()) {
                    is_paid = 1;
                }

                if (is_paid == 0) {
                    if (dropped_subjects2 == 0) {
                        subject_codes2 = subject_code;
                    } else {
                        subject_codes2 = subject_codes2 + ", " + subject_code;
                    }

                    added_subjects_date2 = DateType.convert_slash_datetime(created_at);
                    no_of_units_lec2 += lecture_units;
                    no_of_units_lab2 += lab_units;
                    dropped_subjects2++;
                }

            }
            double amount3 = 0;

            if (is_per_unit == 1) {
                double total_lec_amount = per_unit * no_of_units_lec2;
                double total_lab_amount = lab_unit_amount * no_of_units_lab2;
                amount3 = total_lec_amount + total_lab_amount;
            } else {
                amount3 = fee_amount;
            }
            double total_units2 = no_of_units_lec2 + no_of_units_lab2;
            String title2
                    = "<html><body>"
                    + "&nbsp <font color=\"black\";size=\"4\"><b>" + "Drop Subject Requests" + "</b> - " + total_units2 + " units </font><br>"
                    + "&nbsp <font size=\"2\"> " + "Subject/s: " + " (" + subject_codes2 + ")</font><br>"
                    + "</body>"
                    + "</html>";

            String date2 = added_subjects_date2;
            String deadline2 = "";
            double interest2 = 0;
            double paid3 = 0;
            double balance2 = amount3 - paid3;
            boolean selected2 = false;

            if (dropped_subjects2 != 0) {
                fees f = new fees(0, title2, date2, deadline2, amount3, interest2, paid3, balance2, selected2, 3, 0, "Drop Subject");
                datas.add(f);
            }
            //</editor-fold>
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Finance.transactions> ret_transactions(Students.to_students student) {
        List<Finance.transactions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " eap.id"
                    + ",eap.amount_paid"
                    + ",eap.created_at"
                    + " from enrollment_assessment_payments eap "
                    + " join enrollment_assessments ea "
                    + " on eap.enrollment_assessment_id = ea.id "
                    + " where ea.student_id='" + student.id + "' "
                    + " order by eap.created_at desc ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                double amount_paid = rs.getDouble(2);
                String created_at = rs.getString(3);
                Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), "Assessment Payment", amount_paid);
                datas.add(to);
            }

            String s2 = "select "
                    + "id"
                    + ",trans_type"
                    + ",amount_paid"
                    + ",created_at"
                    + " from enrollment_sls_payments"
                    + " where student_id='" + student.id + "' ";

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            while (rs2.next()) {
                int id = rs2.getInt(1);
                int trans_type = rs2.getInt(2);
                double amount_paid = rs2.getDouble(3);
                String created_at = rs2.getString(4);
                if (trans_type == 1) {
                    Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), "Add Subject", amount_paid);
                    datas.add(to);
                }
                if (trans_type == 2) {
                    Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), "Drop Subject", amount_paid);
                    datas.add(to);
                }

            }

            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

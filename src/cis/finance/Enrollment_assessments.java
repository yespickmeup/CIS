/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.finance.Enrollment_assessment_payment_modes.to_enrollment_assessment_payment_modes;
import cis.students.Students;
import cis.users.MyUser;
import cis.utils.DateType;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Ronescape
 */
public class Enrollment_assessments {

    public static class to_enrollment_assessments {

        public final int id;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int student_id;
        public final String student_no;
        public final String fname;
        public final String lname;
        public final String mi;
        public final int academic_year_id;
        public final String academic_year;
        public final int curriculum_id;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final String term;
        public final String year_level;
        public final String year_level_status;
        public final int level_id;
        public final String level;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department;
        public final double tuition_amount;
        public final int no_of_units;
        public final double amount_per_unit;
        public final double tuition_discount;
        public final double miscellaneous_amount;
        public final double miscellaneous_discount;
        public final double other_fees_amount;
        public final double other_fees_discount;
        public final int mode_of_payment;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_enrollment_assessments(int id, int enrollment_id, String enrollment_no, int student_id, String student_no, String fname, String lname, String mi, int academic_year_id, String academic_year, int curriculum_id, int course_id, String course_code, String course_description, String term, String year_level, String year_level_status, int level_id, String level, int college_id, String college, int department_id, String department, double tuition_amount, int no_of_units, double amount_per_unit, double tuition_discount, double miscellaneous_amount, double miscellaneous_discount, double other_fees_amount, double other_fees_discount, int mode_of_payment, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.student_id = student_id;
            this.student_no = student_no;
            this.fname = fname;
            this.lname = lname;
            this.mi = mi;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.curriculum_id = curriculum_id;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.term = term;
            this.year_level = year_level;
            this.year_level_status = year_level_status;
            this.level_id = level_id;
            this.level = level;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.tuition_amount = tuition_amount;
            this.no_of_units = no_of_units;
            this.amount_per_unit = amount_per_unit;
            this.tuition_discount = tuition_discount;
            this.miscellaneous_amount = miscellaneous_amount;
            this.miscellaneous_discount = miscellaneous_discount;
            this.other_fees_amount = other_fees_amount;
            this.other_fees_discount = other_fees_discount;
            this.mode_of_payment = mode_of_payment;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_enrollment_assessments to_enrollment_assessments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_assessments("
                    + "enrollment_id"
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
                    + ")values("
                    + ":enrollment_id"
                    + ",:enrollment_no"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:lname"
                    + ",:mi"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:curriculum_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:term"
                    + ",:year_level"
                    + ",:year_level_status"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:tuition_amount"
                    + ",:no_of_units"
                    + ",:amount_per_unit"
                    + ",:tuition_discount"
                    + ",:miscellaneous_amount"
                    + ",:miscellaneous_discount"
                    + ",:other_fees_amount"
                    + ",:other_fees_discount"
                    + ",:mode_of_payment"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                    .setNumber("student_id", to_enrollment_assessments.student_id)
                    .setString("student_no", to_enrollment_assessments.student_no)
                    .setString("fname", to_enrollment_assessments.fname)
                    .setString("lname", to_enrollment_assessments.lname)
                    .setString("mi", to_enrollment_assessments.mi)
                    .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                    .setString("academic_year", to_enrollment_assessments.academic_year)
                    .setNumber("curriculum_id", to_enrollment_assessments.curriculum_id)
                    .setNumber("course_id", to_enrollment_assessments.course_id)
                    .setString("course_code", to_enrollment_assessments.course_code)
                    .setString("course_description", to_enrollment_assessments.course_description)
                    .setString("term", to_enrollment_assessments.term)
                    .setString("year_level", to_enrollment_assessments.year_level)
                    .setString("year_level_status", to_enrollment_assessments.year_level_status)
                    .setNumber("level_id", to_enrollment_assessments.level_id)
                    .setString("level", to_enrollment_assessments.level)
                    .setNumber("college_id", to_enrollment_assessments.college_id)
                    .setString("college", to_enrollment_assessments.college)
                    .setNumber("department_id", to_enrollment_assessments.department_id)
                    .setString("department", to_enrollment_assessments.department)
                    .setNumber("tuition_amount", to_enrollment_assessments.tuition_amount)
                    .setNumber("no_of_units", to_enrollment_assessments.no_of_units)
                    .setNumber("amount_per_unit", to_enrollment_assessments.amount_per_unit)
                    .setNumber("tuition_discount", to_enrollment_assessments.tuition_discount)
                    .setNumber("miscellaneous_amount", to_enrollment_assessments.miscellaneous_amount)
                    .setNumber("miscellaneous_discount", to_enrollment_assessments.miscellaneous_discount)
                    .setNumber("other_fees_amount", to_enrollment_assessments.other_fees_amount)
                    .setNumber("other_fees_discount", to_enrollment_assessments.other_fees_discount)
                    .setNumber("mode_of_payment", to_enrollment_assessments.mode_of_payment)
                    .setString("created_at", to_enrollment_assessments.created_at)
                    .setString("updated_at", to_enrollment_assessments.updated_at)
                    .setString("created_by", to_enrollment_assessments.created_by)
                    .setString("updated_by", to_enrollment_assessments.updated_by)
                    .setNumber("status", to_enrollment_assessments.status)
                    .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data2(to_enrollment_assessments to_enrollment_assessments, List<to_enrollment_assessment_payment_modes> to_enrollment_assessment_payment_modes1, Enrollment_assessment_payments.to_enrollment_assessment_payments pay, List<Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details> payments) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into enrollment_assessments("
                    + "enrollment_id"
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
                    + ")values("
                    + ":enrollment_id"
                    + ",:enrollment_no"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:lname"
                    + ",:mi"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:curriculum_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:term"
                    + ",:year_level"
                    + ",:year_level_status"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:tuition_amount"
                    + ",:no_of_units"
                    + ",:amount_per_unit"
                    + ",:tuition_discount"
                    + ",:miscellaneous_amount"
                    + ",:miscellaneous_discount"
                    + ",:other_fees_amount"
                    + ",:other_fees_discount"
                    + ",:mode_of_payment"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                    .setNumber("student_id", to_enrollment_assessments.student_id)
                    .setString("student_no", to_enrollment_assessments.student_no)
                    .setString("fname", to_enrollment_assessments.fname)
                    .setString("lname", to_enrollment_assessments.lname)
                    .setString("mi", to_enrollment_assessments.mi)
                    .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                    .setString("academic_year", to_enrollment_assessments.academic_year)
                    .setNumber("curriculum_id", to_enrollment_assessments.curriculum_id)
                    .setNumber("course_id", to_enrollment_assessments.course_id)
                    .setString("course_code", to_enrollment_assessments.course_code)
                    .setString("course_description", to_enrollment_assessments.course_description)
                    .setString("term", to_enrollment_assessments.term)
                    .setString("year_level", to_enrollment_assessments.year_level)
                    .setString("year_level_status", to_enrollment_assessments.year_level_status)
                    .setNumber("level_id", to_enrollment_assessments.level_id)
                    .setString("level", to_enrollment_assessments.level)
                    .setNumber("college_id", to_enrollment_assessments.college_id)
                    .setString("college", to_enrollment_assessments.college)
                    .setNumber("department_id", to_enrollment_assessments.department_id)
                    .setString("department", to_enrollment_assessments.department)
                    .setNumber("tuition_amount", to_enrollment_assessments.tuition_amount)
                    .setNumber("no_of_units", to_enrollment_assessments.no_of_units)
                    .setNumber("amount_per_unit", to_enrollment_assessments.amount_per_unit)
                    .setNumber("tuition_discount", to_enrollment_assessments.tuition_discount)
                    .setNumber("miscellaneous_amount", to_enrollment_assessments.miscellaneous_amount)
                    .setNumber("miscellaneous_discount", to_enrollment_assessments.miscellaneous_discount)
                    .setNumber("other_fees_amount", to_enrollment_assessments.other_fees_amount)
                    .setNumber("other_fees_discount", to_enrollment_assessments.other_fees_discount)
                    .setNumber("mode_of_payment", to_enrollment_assessments.mode_of_payment)
                    .setString("created_at", to_enrollment_assessments.created_at)
                    .setString("updated_at", to_enrollment_assessments.updated_at)
                    .setString("created_by", to_enrollment_assessments.created_by)
                    .setString("updated_by", to_enrollment_assessments.updated_by)
                    .setNumber("status", to_enrollment_assessments.status)
                    .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);

            String s4 = "update enrollments set "
                    + " assessed_by_id = '" + MyUser.getUser_id() + "' "
                    + ",assessed_by = '" + MyUser.getUser_screen_name() + "' "
                    + ",assessed_date = '" + DateType.now() + "' "
                    + " where id='" + to_enrollment_assessments.enrollment_id + "' "
                    + " ";

            stmt.addBatch(s4);

            stmt.executeBatch();

            String s3 = "select "
                    + " id"
                    + " from enrollment_assessments"
                    + " order by id desc limit 1";

            Statement stmt3 = conn.createStatement();
            ResultSet rs3 = stmt3.executeQuery(s3);
            int id2 = 0;
            if (rs3.next()) {
                id2 = rs3.getInt(1);
            }

            //insert payment
            String s5 = "insert into enrollment_assessment_payments("
                    + "enrollment_assessment_id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",amount_paid"
                    + ",cash"
                    + ",discount_name"
                    + ",discount_rate"
                    + ",discount_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",check_holder"
                    + ",check_date"
                    + ",credit_card_type"
                    + ",credit_card_rate"
                    + ",credit_card_amount"
                    + ",credit_card_no"
                    + ",credit_card_holder"
                    + ",gift_certificate_from"
                    + ",gift_certificate_description"
                    + ",gift_certificate_no"
                    + ",gift_certificate_amount"
                    + ",online_bank"
                    + ",online_reference_no"
                    + ",online_amount"
                    + ",online_holder"
                    + ",online_date"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":enrollment_assessment_id"
                    + ",:enrollment_id"
                    + ",:enrollment_no"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:amount_paid"
                    + ",:cash"
                    + ",:discount_name"
                    + ",:discount_rate"
                    + ",:discount_amount"
                    + ",:discount_customer_name"
                    + ",:discount_customer_id"
                    + ",:check_bank"
                    + ",:check_no"
                    + ",:check_amount"
                    + ",:check_holder"
                    + ",:check_date"
                    + ",:credit_card_type"
                    + ",:credit_card_rate"
                    + ",:credit_card_amount"
                    + ",:credit_card_no"
                    + ",:credit_card_holder"
                    + ",:gift_certificate_from"
                    + ",:gift_certificate_description"
                    + ",:gift_certificate_no"
                    + ",:gift_certificate_amount"
                    + ",:online_bank"
                    + ",:online_reference_no"
                    + ",:online_amount"
                    + ",:online_holder"
                    + ",:online_date"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s5 = SqlStringUtil.parse(s5)
                    .setNumber("enrollment_assessment_id", id2)
                    .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                    .setString("academic_year", to_enrollment_assessments.academic_year)
                    .setNumber("amount_paid", pay.amount_paid)
                    .setNumber("cash", pay.cash)
                    .setString("discount_name", pay.discount_name)
                    .setNumber("discount_rate", pay.discount_rate)
                    .setNumber("discount_amount", pay.discount_amount)
                    .setString("discount_customer_name", pay.discount_customer_name)
                    .setString("discount_customer_id", pay.discount_customer_id)
                    .setString("check_bank", pay.check_bank)
                    .setString("check_no", pay.check_no)
                    .setNumber("check_amount", pay.check_amount)
                    .setString("check_holder", pay.check_holder)
                    .setString("check_date", pay.check_date)
                    .setString("credit_card_type", pay.credit_card_type)
                    .setNumber("credit_card_rate", pay.credit_card_rate)
                    .setNumber("credit_card_amount", pay.credit_card_amount)
                    .setString("credit_card_no", pay.credit_card_no)
                    .setString("credit_card_holder", pay.credit_card_holder)
                    .setString("gift_certificate_from", pay.gift_certificate_from)
                    .setString("gift_certificate_description", pay.gift_certificate_description)
                    .setString("gift_certificate_no", pay.gift_certificate_no)
                    .setNumber("gift_certificate_amount", pay.gift_certificate_amount)
                    .setString("online_bank", pay.online_bank)
                    .setString("online_reference_no", pay.online_reference_no)
                    .setNumber("online_amount", pay.online_amount)
                    .setString("online_holder", pay.online_holder)
                    .setString("online_date", pay.online_date)
                    .setString("created_at", to_enrollment_assessments.created_at)
                    .setString("updated_at", to_enrollment_assessments.updated_at)
                    .setString("created_by", to_enrollment_assessments.created_by)
                    .setString("updated_by", to_enrollment_assessments.updated_by)
                    .setNumber("status", to_enrollment_assessments.status)
                    .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                    .ok();

            PreparedStatement stmt5 = conn.prepareStatement("");
            stmt5.addBatch(s5);
            stmt5.executeBatch();

            //search payment id
            String s6 = "select "
                    + " id"
                    + " from enrollment_assessment_payments"
                    + " order by id desc limit 1";

            Statement stmt6 = conn.createStatement();
            ResultSet rs6 = stmt6.executeQuery(s6);
            int id3 = 0;
            if (rs6.next()) {
                id3 = rs6.getInt(1);
            }
            //insert payment details
            PreparedStatement stmt4 = conn.prepareStatement("");
            for (Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details payment : payments) {
                String s7 = "insert into enrollment_assessment_payment_details("
                        + "enrollment_assessment_payment_id"
                        + ",enrollment_assessment_id"
                        + ",enrollment_id"
                        + ",enrollment_no"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",mode"
                        + ",mode_order"
                        + ",to_pay"
                        + ",amount"
                        + ",discount"
                        + ",paid"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + ":enrollment_assessment_payment_id"
                        + ",:enrollment_assessment_id"
                        + ",:enrollment_id"
                        + ",:enrollment_no"
                        + ",:academic_year_id"
                        + ",:academic_year"
                        + ",:mode"
                        + ",:mode_order"
                        + ",:to_pay"
                        + ",:amount"
                        + ",:discount"
                        + ",:paid"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s7 = SqlStringUtil.parse(s7)
                        .setNumber("enrollment_assessment_payment_id", id3)
                        .setNumber("enrollment_assessment_id", id2)
                        .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                        .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                        .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                        .setString("academic_year", to_enrollment_assessments.academic_year)
                        .setString("mode", payment.mode)
                        .setNumber("mode_order", payment.mode_order)
                        .setString("to_pay", payment.to_pay)
                        .setNumber("amount", payment.amount)
                        .setNumber("discount", payment.discount)
                        .setNumber("paid", payment.paid)
                        .setString("created_at", to_enrollment_assessments.created_at)
                        .setString("updated_at", to_enrollment_assessments.updated_at)
                        .setString("created_by", to_enrollment_assessments.created_by)
                        .setString("updated_by", to_enrollment_assessments.updated_by)
                        .setNumber("status", to_enrollment_assessments.status)
                        .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                        .ok();
                stmt4.addBatch(s7);
            }

            // insert payment modes
            PreparedStatement stmt2 = conn.prepareStatement("");
            for (to_enrollment_assessment_payment_modes to_enrollment_assessment_payment_modes : to_enrollment_assessment_payment_modes1) {
                String s2 = "insert into enrollment_assessment_payment_modes("
                        + "enrollment_assessment_id"
                        + ",enrollment_id"
                        + ",enrollment_no"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",mode"
                        + ",mode_order"
                        + ",to_pay"
                        + ",amount"
                        + ",discount"
                        + ",paid"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + ":enrollment_assessment_id"
                        + ",:enrollment_id"
                        + ",:enrollment_no"
                        + ",:academic_year_id"
                        + ",:academic_year"
                        + ",:mode"
                        + ",:mode_order"
                        + ",:to_pay"
                        + ",:amount"
                        + ",:discount"
                        + ",:paid"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s2 = SqlStringUtil.parse(s2)
                        .setNumber("enrollment_assessment_id", id2)
                        .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                        .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                        .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                        .setString("academic_year", to_enrollment_assessments.academic_year)
                        .setString("mode", to_enrollment_assessment_payment_modes.mode)
                        .setNumber("mode_order", to_enrollment_assessment_payment_modes.mode_order)
                        .setString("to_pay", to_enrollment_assessment_payment_modes.to_pay)
                        .setNumber("amount", to_enrollment_assessment_payment_modes.amount)
                        .setNumber("discount", to_enrollment_assessment_payment_modes.discount)
                        .setNumber("paid", to_enrollment_assessment_payment_modes.paid)
                        .setString("created_at", to_enrollment_assessments.created_at)
                        .setString("updated_at", to_enrollment_assessments.updated_at)
                        .setString("created_by", to_enrollment_assessments.created_by)
                        .setString("updated_by", to_enrollment_assessments.updated_by)
                        .setNumber("status", to_enrollment_assessments.status)
                        .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                        .ok();

                stmt2.addBatch(s2);
            }

            String s7 = "update enrollment_student_loaded_subjects set "
                    + " is_payed= 1 "
                    + " where enrollment_id='" + to_enrollment_assessments.enrollment_id + "' and status=0 "
                    + " ";
            stmt2.addBatch(s7);

            if (to_enrollment_assessments.student_id != 0) {

                String s10 = "select "
                        + "id"
                        + ",balance"
                        + ",prepaid"
                        + " from students"
                        + " where id='" + to_enrollment_assessments.student_id + "' ";
                Statement stmt10 = conn.createStatement();
                ResultSet rs10 = stmt10.executeQuery(s10);
                double balance = 0;
                if (rs10.next()) {
                    balance = rs10.getDouble(2);
                }
                double new_balance = balance + (to_enrollment_assessments.other_fees_discount - pay.amount_paid);

                String s11 = "update students set "
                        + " balance= :balance "
                        + " where id='" + to_enrollment_assessments.student_id + "' "
                        + " ";

                s11 = SqlStringUtil.parse(s11)
                        .setNumber("balance", new_balance)
                        .ok();
                stmt4.addBatch(s11);
            }

            stmt4.executeBatch();
            stmt2.executeBatch();
            conn.commit();

            Lg.s(Enrollment_assessments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data3(Enrollment_assessment_payments.to_enrollment_assessment_payments to_enrollment_assessment_payments, List<Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details> payments, Students.to_students student) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            String s5 = "insert into enrollment_assessment_payments("
                    + "enrollment_assessment_id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",amount_paid"
                    + ",cash"
                    + ",discount_name"
                    + ",discount_rate"
                    + ",discount_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",check_holder"
                    + ",check_date"
                    + ",credit_card_type"
                    + ",credit_card_rate"
                    + ",credit_card_amount"
                    + ",credit_card_no"
                    + ",credit_card_holder"
                    + ",gift_certificate_from"
                    + ",gift_certificate_description"
                    + ",gift_certificate_no"
                    + ",gift_certificate_amount"
                    + ",online_bank"
                    + ",online_reference_no"
                    + ",online_amount"
                    + ",online_holder"
                    + ",online_date"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":enrollment_assessment_id"
                    + ",:enrollment_id"
                    + ",:enrollment_no"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:amount_paid"
                    + ",:cash"
                    + ",:discount_name"
                    + ",:discount_rate"
                    + ",:discount_amount"
                    + ",:discount_customer_name"
                    + ",:discount_customer_id"
                    + ",:check_bank"
                    + ",:check_no"
                    + ",:check_amount"
                    + ",:check_holder"
                    + ",:check_date"
                    + ",:credit_card_type"
                    + ",:credit_card_rate"
                    + ",:credit_card_amount"
                    + ",:credit_card_no"
                    + ",:credit_card_holder"
                    + ",:gift_certificate_from"
                    + ",:gift_certificate_description"
                    + ",:gift_certificate_no"
                    + ",:gift_certificate_amount"
                    + ",:online_bank"
                    + ",:online_reference_no"
                    + ",:online_amount"
                    + ",:online_holder"
                    + ",:online_date"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s5 = SqlStringUtil.parse(s5)
                    .setNumber("enrollment_assessment_id", to_enrollment_assessment_payments.enrollment_assessment_id)
                    .setNumber("enrollment_id", to_enrollment_assessment_payments.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessment_payments.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_assessment_payments.academic_year_id)
                    .setString("academic_year", to_enrollment_assessment_payments.academic_year)
                    .setNumber("amount_paid", to_enrollment_assessment_payments.amount_paid)
                    .setNumber("cash", to_enrollment_assessment_payments.cash)
                    .setString("discount_name", to_enrollment_assessment_payments.discount_name)
                    .setNumber("discount_rate", to_enrollment_assessment_payments.discount_rate)
                    .setNumber("discount_amount", to_enrollment_assessment_payments.discount_amount)
                    .setString("discount_customer_name", to_enrollment_assessment_payments.discount_customer_name)
                    .setString("discount_customer_id", to_enrollment_assessment_payments.discount_customer_id)
                    .setString("check_bank", to_enrollment_assessment_payments.check_bank)
                    .setString("check_no", to_enrollment_assessment_payments.check_no)
                    .setNumber("check_amount", to_enrollment_assessment_payments.check_amount)
                    .setString("check_holder", to_enrollment_assessment_payments.check_holder)
                    .setString("check_date", to_enrollment_assessment_payments.check_date)
                    .setString("credit_card_type", to_enrollment_assessment_payments.credit_card_type)
                    .setNumber("credit_card_rate", to_enrollment_assessment_payments.credit_card_rate)
                    .setNumber("credit_card_amount", to_enrollment_assessment_payments.credit_card_amount)
                    .setString("credit_card_no", to_enrollment_assessment_payments.credit_card_no)
                    .setString("credit_card_holder", to_enrollment_assessment_payments.credit_card_holder)
                    .setString("gift_certificate_from", to_enrollment_assessment_payments.gift_certificate_from)
                    .setString("gift_certificate_description", to_enrollment_assessment_payments.gift_certificate_description)
                    .setString("gift_certificate_no", to_enrollment_assessment_payments.gift_certificate_no)
                    .setNumber("gift_certificate_amount", to_enrollment_assessment_payments.gift_certificate_amount)
                    .setString("online_bank", to_enrollment_assessment_payments.online_bank)
                    .setString("online_reference_no", to_enrollment_assessment_payments.online_reference_no)
                    .setNumber("online_amount", to_enrollment_assessment_payments.online_amount)
                    .setString("online_holder", to_enrollment_assessment_payments.online_holder)
                    .setString("online_date", to_enrollment_assessment_payments.online_date)
                    .setString("created_at", to_enrollment_assessment_payments.created_at)
                    .setString("updated_at", to_enrollment_assessment_payments.updated_at)
                    .setString("created_by", to_enrollment_assessment_payments.created_by)
                    .setString("updated_by", to_enrollment_assessment_payments.updated_by)
                    .setNumber("status", to_enrollment_assessment_payments.status)
                    .setNumber("is_uploaded", to_enrollment_assessment_payments.is_uploaded)
                    .ok();

            PreparedStatement stmt5 = conn.prepareStatement("");
            stmt5.addBatch(s5);
            stmt5.executeBatch();

            //search payment id
            String s6 = "select "
                    + " id"
                    + " from enrollment_assessment_payments "
                    + " order by id desc limit 1";

            Statement stmt6 = conn.createStatement();
            ResultSet rs6 = stmt6.executeQuery(s6);
            int id3 = 0;
            if (rs6.next()) {
                id3 = rs6.getInt(1);
            }
            //insert payment details
            PreparedStatement stmt4 = conn.prepareStatement("");
            for (Enrollment_assessment_payment_details.to_enrollment_assessment_payment_details payment : payments) {
                String s7 = "insert into enrollment_assessment_payment_details("
                        + "enrollment_assessment_payment_id"
                        + ",enrollment_assessment_id"
                        + ",enrollment_id"
                        + ",enrollment_no"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",mode"
                        + ",mode_order"
                        + ",to_pay"
                        + ",amount"
                        + ",discount"
                        + ",paid"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + ":enrollment_assessment_payment_id"
                        + ",:enrollment_assessment_id"
                        + ",:enrollment_id"
                        + ",:enrollment_no"
                        + ",:academic_year_id"
                        + ",:academic_year"
                        + ",:mode"
                        + ",:mode_order"
                        + ",:to_pay"
                        + ",:amount"
                        + ",:discount"
                        + ",:paid"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s7 = SqlStringUtil.parse(s7)
                        .setNumber("enrollment_assessment_payment_id", id3)
                        .setNumber("enrollment_assessment_id", to_enrollment_assessment_payments.enrollment_assessment_id)
                        .setNumber("enrollment_id", to_enrollment_assessment_payments.enrollment_id)
                        .setString("enrollment_no", to_enrollment_assessment_payments.enrollment_no)
                        .setNumber("academic_year_id", to_enrollment_assessment_payments.academic_year_id)
                        .setString("academic_year", to_enrollment_assessment_payments.academic_year)
                        .setString("mode", payment.mode)
                        .setNumber("mode_order", payment.mode_order)
                        .setString("to_pay", payment.to_pay)
                        .setNumber("amount", payment.amount)
                        .setNumber("discount", payment.discount)
                        .setNumber("paid", payment.paid)
                        .setString("created_at", payment.created_at)
                        .setString("updated_at", payment.updated_at)
                        .setString("created_by", payment.created_by)
                        .setString("updated_by", payment.updated_by)
                        .setNumber("status", payment.status)
                        .setNumber("is_uploaded", payment.is_uploaded)
                        .ok();
                stmt4.addBatch(s7);
            }

            String s10 = "select "
                    + "id"
                    + ",balance"
                    + ",prepaid"
                    + " from students"
                    + " where id='" + student.id + "' ";
            Statement stmt10 = conn.createStatement();
            ResultSet rs10 = stmt10.executeQuery(s10);
            double balance = 0;
            if (rs10.next()) {
                balance = rs10.getDouble(2);
            }
            double new_balance = balance - to_enrollment_assessment_payments.amount_paid;
//            System.out.println("balance: " + balance + " - " + to_enrollment_assessment_payments.amount_paid);
            String s11 = "update students set "
                    + " balance= :balance "
                    + " where id='" + student.id + "' "
                    + " ";

            s11 = SqlStringUtil.parse(s11)
                    .setNumber("balance", new_balance)
                    .ok();
            stmt4.addBatch(s11);

            stmt4.executeBatch();
            conn.commit();

            Lg.s(Enrollment_assessments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_assessments to_enrollment_assessments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_assessments set "
                    + "enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",lname= :lname "
                    + ",mi= :mi "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",curriculum_id= :curriculum_id "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",term= :term "
                    + ",year_level= :year_level "
                    + ",year_level_status= :year_level_status "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",tuition_amount= :tuition_amount "
                    + ",no_of_units= :no_of_units "
                    + ",amount_per_unit= :amount_per_unit "
                    + ",tuition_discount= :tuition_discount "
                    + ",miscellaneous_amount= :miscellaneous_amount "
                    + ",miscellaneous_discount= :miscellaneous_discount "
                    + ",other_fees_amount= :other_fees_amount "
                    + ",other_fees_discount= :other_fees_discount "
                    + ",mode_of_payment= :mode_of_payment "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_enrollment_assessments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_assessments.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessments.enrollment_no)
                    .setNumber("student_id", to_enrollment_assessments.student_id)
                    .setString("student_no", to_enrollment_assessments.student_no)
                    .setString("fname", to_enrollment_assessments.fname)
                    .setString("lname", to_enrollment_assessments.lname)
                    .setString("mi", to_enrollment_assessments.mi)
                    .setNumber("academic_year_id", to_enrollment_assessments.academic_year_id)
                    .setString("academic_year", to_enrollment_assessments.academic_year)
                    .setNumber("curriculum_id", to_enrollment_assessments.curriculum_id)
                    .setNumber("course_id", to_enrollment_assessments.course_id)
                    .setString("course_code", to_enrollment_assessments.course_code)
                    .setString("course_description", to_enrollment_assessments.course_description)
                    .setString("term", to_enrollment_assessments.term)
                    .setString("year_level", to_enrollment_assessments.year_level)
                    .setString("year_level_status", to_enrollment_assessments.year_level_status)
                    .setNumber("level_id", to_enrollment_assessments.level_id)
                    .setString("level", to_enrollment_assessments.level)
                    .setNumber("college_id", to_enrollment_assessments.college_id)
                    .setString("college", to_enrollment_assessments.college)
                    .setNumber("department_id", to_enrollment_assessments.department_id)
                    .setString("department", to_enrollment_assessments.department)
                    .setNumber("tuition_amount", to_enrollment_assessments.tuition_amount)
                    .setNumber("no_of_units", to_enrollment_assessments.no_of_units)
                    .setNumber("amount_per_unit", to_enrollment_assessments.amount_per_unit)
                    .setNumber("tuition_discount", to_enrollment_assessments.tuition_discount)
                    .setNumber("miscellaneous_amount", to_enrollment_assessments.miscellaneous_amount)
                    .setNumber("miscellaneous_discount", to_enrollment_assessments.miscellaneous_discount)
                    .setNumber("other_fees_amount", to_enrollment_assessments.other_fees_amount)
                    .setNumber("other_fees_discount", to_enrollment_assessments.other_fees_discount)
                    .setNumber("mode_of_payment", to_enrollment_assessments.mode_of_payment)
                    .setString("created_at", to_enrollment_assessments.created_at)
                    .setString("updated_at", to_enrollment_assessments.updated_at)
                    .setString("created_by", to_enrollment_assessments.created_by)
                    .setString("updated_by", to_enrollment_assessments.updated_by)
                    .setNumber("status", to_enrollment_assessments.status)
                    .setNumber("is_uploaded", to_enrollment_assessments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_assessments to_enrollment_assessments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_assessments  "
                    + " where id='" + to_enrollment_assessments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
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

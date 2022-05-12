/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.collections.Collection;
import cis.students.Students;
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
 * @author User
 */
public class Student_balance_adjustments {

    public static class to_student_balance_adjustments {

        public final int id;
        public final int student_id;
        public final String student_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final int is_transferee;
        public final String academic_year;
        public final int academic_year_id;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final String year_level;
        public final String term;
        public final int department_id;
        public final String department;
        public final int college_id;
        public final String college;
        public final double adjustment_amount;
        public final double paid;
        public final String remarks;
        public final int status;
        public final String created_at;
        public final int created_by;
        public final String updated_at;
        public final int updated_by;
        public final int particular_id;
        public final String particular;
        public final int is_payable;
        public final int is_add;

        public to_student_balance_adjustments(int id, int student_id, String student_no, String fname, String mi, String lname, int is_transferee, String academic_year, int academic_year_id, int course_id, String course_code, String course_description, String year_level, String term, int department_id, String department, int college_id, String college, double adjustment_amount, double paid, String remarks, int status, String created_at, int created_by, String updated_at, int updated_by, int particular_id, String particular, int is_payable, int is_add) {
            this.id = id;
            this.student_id = student_id;
            this.student_no = student_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.is_transferee = is_transferee;
            this.academic_year = academic_year;
            this.academic_year_id = academic_year_id;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.year_level = year_level;
            this.term = term;
            this.department_id = department_id;
            this.department = department;
            this.college_id = college_id;
            this.college = college;
            this.adjustment_amount = adjustment_amount;
            this.paid = paid;
            this.remarks = remarks;
            this.status = status;
            this.created_at = created_at;
            this.created_by = created_by;
            this.updated_at = updated_at;
            this.updated_by = updated_by;
            this.particular_id = particular_id;
            this.particular = particular;
            this.is_payable = is_payable;
            this.is_add = is_add;
        }
    }

    public static void add_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into student_balance_adjustments("
                    + "student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",is_transferee"
                    + ",academic_year"
                    + ",academic_year_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",year_level"
                    + ",term"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",adjustment_amount"
                    + ",paid"
                    + ",remarks"
                    + ",status"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",particular_id"
                    + ",particular"
                    + ",is_payable"
                    + ",is_add"
                    + ")values("
                    + ":student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:is_transferee"
                    + ",:academic_year"
                    + ",:academic_year_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:year_level"
                    + ",:term"
                    + ",:department_id"
                    + ",:department"
                    + ",:college_id"
                    + ",:college"
                    + ",:adjustment_amount"
                    + ",:paid"
                    + ",:remarks"
                    + ",:status"
                    + ",:created_at"
                    + ",:created_by"
                    + ",:updated_at"
                    + ",:updated_by"
                    + ",:particular_id"
                    + ",:particular"
                    + ",:is_payable"
                    + ",:is_add"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("student_id", to_student_balance_adjustments.student_id)
                    .setString("student_no", to_student_balance_adjustments.student_no)
                    .setString("fname", to_student_balance_adjustments.fname)
                    .setString("mi", to_student_balance_adjustments.mi)
                    .setString("lname", to_student_balance_adjustments.lname)
                    .setNumber("is_transferee", to_student_balance_adjustments.is_transferee)
                    .setString("academic_year", to_student_balance_adjustments.academic_year)
                    .setNumber("academic_year_id", to_student_balance_adjustments.academic_year_id)
                    .setNumber("course_id", to_student_balance_adjustments.course_id)
                    .setString("course_code", to_student_balance_adjustments.course_code)
                    .setString("course_description", to_student_balance_adjustments.course_description)
                    .setString("year_level", to_student_balance_adjustments.year_level)
                    .setString("term", to_student_balance_adjustments.term)
                    .setNumber("department_id", to_student_balance_adjustments.department_id)
                    .setString("department", to_student_balance_adjustments.department)
                    .setNumber("college_id", to_student_balance_adjustments.college_id)
                    .setString("college", to_student_balance_adjustments.college)
                    .setNumber("adjustment_amount", to_student_balance_adjustments.adjustment_amount)
                    .setNumber("paid", to_student_balance_adjustments.paid)
                    .setString("remarks", to_student_balance_adjustments.remarks)
                    .setNumber("status", to_student_balance_adjustments.status)
                    .setString("created_at", to_student_balance_adjustments.created_at)
                    .setNumber("created_by", to_student_balance_adjustments.created_by)
                    .setString("updated_at", to_student_balance_adjustments.updated_at)
                    .setNumber("updated_by", to_student_balance_adjustments.updated_by)
                    .setNumber("particular_id", to_student_balance_adjustments.particular_id)
                    .setString("particular", to_student_balance_adjustments.particular)
                    .setNumber("is_payable", to_student_balance_adjustments.is_payable)
                    .setNumber("is_add", to_student_balance_adjustments.is_add)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);
            //search/update student balance
            String s10 = "select "
                    + "id"
                    + ",balance"
                    + " from students"
                    + " where id='" + to_student_balance_adjustments.student_id + "' ";

            Statement stmt10 = conn.createStatement();
            ResultSet rs10 = stmt10.executeQuery(s10);
            double balance = 0;
            if (rs10.next()) {
                int id = rs10.getInt(1);
                balance = rs10.getDouble(2);
            }
            double new_balance = balance + to_student_balance_adjustments.adjustment_amount;
            if (to_student_balance_adjustments.is_add == 0 && to_student_balance_adjustments.is_payable == 0) {
                new_balance = balance - to_student_balance_adjustments.adjustment_amount;
            }
            String s11 = " update students set balance='" + new_balance + "' where id='" + to_student_balance_adjustments.student_id + "' ";
            stmt.addBatch(s11);
            // end student exe

            stmt.executeBatch();
            conn.commit();
            Lg.s(Student_balance_adjustments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update student_balance_adjustments set "
                    + "student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",is_transferee= :is_transferee "
                    + ",academic_year= :academic_year "
                    + ",academic_year_id= :academic_year_id "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",year_level= :year_level "
                    + ",term= :term "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",adjustment_amount= :adjustment_amount "
                    + ",paid= :paid "
                    + ",remarks= :remarks "
                    + ",status= :status "
                    + ",created_at= :created_at "
                    + ",created_by= :created_by "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",particular_id= :particular_id "
                    + ",particular= :particular "
                    + ",is_payable= :is_payable "
                    + ",is_add= :is_add"
                    + " where id='" + to_student_balance_adjustments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("student_id", to_student_balance_adjustments.student_id)
                    .setString("student_no", to_student_balance_adjustments.student_no)
                    .setString("fname", to_student_balance_adjustments.fname)
                    .setString("mi", to_student_balance_adjustments.mi)
                    .setString("lname", to_student_balance_adjustments.lname)
                    .setNumber("is_transferee", to_student_balance_adjustments.is_transferee)
                    .setString("academic_year", to_student_balance_adjustments.academic_year)
                    .setNumber("academic_year_id", to_student_balance_adjustments.academic_year_id)
                    .setNumber("course_id", to_student_balance_adjustments.course_id)
                    .setString("course_code", to_student_balance_adjustments.course_code)
                    .setString("course_description", to_student_balance_adjustments.course_description)
                    .setString("year_level", to_student_balance_adjustments.year_level)
                    .setString("term", to_student_balance_adjustments.term)
                    .setNumber("department_id", to_student_balance_adjustments.department_id)
                    .setString("department", to_student_balance_adjustments.department)
                    .setNumber("college_id", to_student_balance_adjustments.college_id)
                    .setString("college", to_student_balance_adjustments.college)
                    .setNumber("adjustment_amount", to_student_balance_adjustments.adjustment_amount)
                    .setNumber("paid", to_student_balance_adjustments.paid)
                    .setString("remarks", to_student_balance_adjustments.remarks)
                    .setNumber("status", to_student_balance_adjustments.status)
                    .setString("created_at", to_student_balance_adjustments.created_at)
                    .setNumber("created_by", to_student_balance_adjustments.created_by)
                    .setString("updated_at", to_student_balance_adjustments.updated_at)
                    .setNumber("updated_by", to_student_balance_adjustments.updated_by)
                    .setNumber("particular_id", to_student_balance_adjustments.particular_id)
                    .setString("particular", to_student_balance_adjustments.particular)
                    .setNumber("is_payable", to_student_balance_adjustments.is_payable)
                    .setNumber("is_add", to_student_balance_adjustments.is_add)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Student_balance_adjustments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from student_balance_adjustments  "
                    + " where id='" + to_student_balance_adjustments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Student_balance_adjustments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_student_balance_adjustments> ret_data(String where) {
        List<to_student_balance_adjustments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",is_transferee"
                    + ",academic_year"
                    + ",academic_year_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",year_level"
                    + ",term"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",adjustment_amount"
                    + ",paid"
                    + ",remarks"
                    + ",status"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",particular_id"
                    + ",particular"
                    + ",is_payable"
                    + ",is_add"
                    + " from student_balance_adjustments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int student_id = rs.getInt(2);
                String student_no = rs.getString(3);
                String fname = rs.getString(4);
                String mi = rs.getString(5);
                String lname = rs.getString(6);
                int is_transferee = rs.getInt(7);
                String academic_year = rs.getString(8);
                int academic_year_id = rs.getInt(9);
                int course_id = rs.getInt(10);
                String course_code = rs.getString(11);
                String course_description = rs.getString(12);
                String year_level = rs.getString(13);
                String term = rs.getString(14);
                int department_id = rs.getInt(15);
                String department = rs.getString(16);
                int college_id = rs.getInt(17);
                String college = rs.getString(18);
                double adjustment_amount = rs.getDouble(19);
                double paid = rs.getDouble(20);
                String remarks = rs.getString(21);
                int status = rs.getInt(22);
                String created_at = rs.getString(23);
                int created_by = rs.getInt(24);
                String updated_at = rs.getString(25);
                int updated_by = rs.getInt(26);
                int particular_id = rs.getInt(27);
                String particular = rs.getString(28);
                int is_payable = rs.getInt(29);
                int is_add = rs.getInt(30);
                to_student_balance_adjustments to = new to_student_balance_adjustments(id, student_id, student_no, fname, mi, lname, is_transferee, academic_year, academic_year_id, course_id, course_code, course_description, year_level, term, department_id, department, college_id, college, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by, particular_id, particular, is_payable, is_add);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String add_payment(Student_balance_adjustment_payments.to_student_balance_adjustment_payments to_student_balance_adjustment_payments, Students.to_students student, boolean has_or, Collection.to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            //Add Collection Details
            String collection_or_no = "";
            int collection_id = 0;
            if (has_or) {
                collection_or_no = Collection.increment_id();
                String s0 = "insert into collections("
                        + "collection_no"
                        + ",or_no"
                        + ",payment_type"
                        + ",amount_paid"
                        + ",cash"
                        + ",discount_name"
                        + ",discount_rate"
                        + ",discount_amount"
                        + ",discount_customer_name"
                        + ",discount_customer_id"
                        + ",check_amount"
                        + ",check_bank"
                        + ",check_no"
                        + ",check_holder"
                        + ",check_date"
                        + ",credit_card_type"
                        + ",credit_card_rate"
                        + ",credit_card_amount"
                        + ",credit_card_no"
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
                        + ",school_year"
                        + ",period"
                        + ",year_level"
                        + ",department_id"
                        + ",department"
                        + ",college_id"
                        + ",college"
                        + ",course_id"
                        + ",course"
                        + ",student_id"
                        + ",student_no"
                        + ",student_name"
                        + ")values("
                        + ":collection_no"
                        + ",:or_no"
                        + ",:payment_type"
                        + ",:amount_paid"
                        + ",:cash"
                        + ",:discount_name"
                        + ",:discount_rate"
                        + ",:discount_amount"
                        + ",:discount_customer_name"
                        + ",:discount_customer_id"
                        + ",:check_amount"
                        + ",:check_bank"
                        + ",:check_no"
                        + ",:check_holder"
                        + ",:check_date"
                        + ",:credit_card_type"
                        + ",:credit_card_rate"
                        + ",:credit_card_amount"
                        + ",:credit_card_no"
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
                        + ",:school_year"
                        + ",:period"
                        + ",:year_level"
                        + ",:department_id"
                        + ",:department"
                        + ",:college_id"
                        + ",:college"
                        + ",:course_id"
                        + ",:course"
                        + ",:student_id"
                        + ",:student_no"
                        + ",:student_name"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("collection_no", collection_or_no)
                        .setString("or_no", to_collections.or_no)
                        .setString("payment_type", to_collections.payment_type)
                        .setNumber("amount_paid", to_collections.amount_paid)
                        .setNumber("cash", to_collections.cash)
                        .setString("discount_name", to_collections.discount_name)
                        .setNumber("discount_rate", to_collections.discount_rate)
                        .setNumber("discount_amount", to_collections.discount_amount)
                        .setString("discount_customer_name", to_collections.discount_customer_name)
                        .setString("discount_customer_id", to_collections.discount_customer_id)
                        .setNumber("check_amount", to_collections.check_amount)
                        .setString("check_bank", to_collections.check_bank)
                        .setString("check_no", to_collections.check_no)
                        .setString("check_holder", to_collections.check_holder)
                        .setString("check_date", to_collections.check_date)
                        .setString("credit_card_type", to_collections.credit_card_type)
                        .setNumber("credit_card_rate", to_collections.credit_card_rate)
                        .setNumber("credit_card_amount", to_collections.credit_card_amount)
                        .setString("credit_card_no", to_collections.credit_card_no)
                        .setString("gift_certificate_from", to_collections.gift_certificate_from)
                        .setString("gift_certificate_description", to_collections.gift_certificate_description)
                        .setString("gift_certificate_no", to_collections.gift_certificate_no)
                        .setNumber("gift_certificate_amount", to_collections.gift_certificate_amount)
                        .setString("online_bank", to_collections.online_bank)
                        .setString("online_reference_no", to_collections.online_reference_no)
                        .setNumber("online_amount", to_collections.online_amount)
                        .setString("online_holder", to_collections.online_holder)
                        .setString("online_date", to_collections.online_date)
                        .setString("created_at", to_collections.created_at)
                        .setString("updated_at", to_collections.updated_at)
                        .setString("created_by", to_collections.created_by)
                        .setString("updated_by", to_collections.updated_by)
                        .setNumber("status", to_collections.status)
                        .setNumber("is_uploaded", to_collections.is_uploaded)
                        .setString("school_year", to_collections.school_year)
                        .setString("period", to_collections.period)
                        .setString("year_level", to_collections.year_level)
                        .setString("department_id", to_collections.department_id)
                        .setString("department", to_collections.department)
                        .setString("college_id", to_collections.college_id)
                        .setString("college", to_collections.college)
                        .setString("course_id", to_collections.course_id)
                        .setString("course", to_collections.course)
                        .setString("student_id", to_collections.student_id)
                        .setString("student_no", to_collections.student_no)
                        .setString("student_name", to_collections.student_name)
                        .ok();

                PreparedStatement stmt5 = conn.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
                stmt5.addBatch(s0);
                stmt5.executeBatch();

                ResultSet rs = stmt5.getGeneratedKeys();
                if (rs.next()) {
                    int last_inserted_id = rs.getInt(1);
                    collection_id = last_inserted_id;
                }

            }

            String s5 = "insert into student_balance_adjustment_payments("
                    + "sba_id"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",adjustment_amount"
                    + ",paid"
                    + ",remarks"
                    + ",status"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",particular_id"
                    + ",particular"
                    + ",collection_id"
                    + ",collection_no"
                    + ",collection_sales_no"
                    + ")values("
                    + ":sba_id"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:adjustment_amount"
                    + ",:paid"
                    + ",:remarks"
                    + ",:status"
                    + ",:created_at"
                    + ",:created_by"
                    + ",:updated_at"
                    + ",:updated_by"
                    + ",:particular_id"
                    + ",:particular"
                    + ",:collection_id"
                    + ",:collection_no"
                    + ",:collection_sales_no"
                    + ")";

            s5 = SqlStringUtil.parse(s5)
                    .setNumber("sba_id", to_student_balance_adjustment_payments.sba_id)
                    .setNumber("student_id", to_student_balance_adjustment_payments.student_id)
                    .setString("student_no", to_student_balance_adjustment_payments.student_no)
                    .setString("fname", to_student_balance_adjustment_payments.fname)
                    .setString("mi", to_student_balance_adjustment_payments.mi)
                    .setString("lname", to_student_balance_adjustment_payments.lname)
                    .setNumber("adjustment_amount", to_student_balance_adjustment_payments.adjustment_amount)
                    .setNumber("paid", to_student_balance_adjustment_payments.paid)
                    .setString("remarks", to_student_balance_adjustment_payments.remarks)
                    .setNumber("status", to_student_balance_adjustment_payments.status)
                    .setString("created_at", to_student_balance_adjustment_payments.created_at)
                    .setNumber("created_by", to_student_balance_adjustment_payments.created_by)
                    .setString("updated_at", to_student_balance_adjustment_payments.updated_at)
                    .setNumber("updated_by", to_student_balance_adjustment_payments.updated_by)
                    .setNumber("particular_id", to_student_balance_adjustment_payments.particular_id)
                    .setString("particular", to_student_balance_adjustment_payments.particular)
                    .setNumber("collection_id", collection_id)
                    .setString("collection_no", collection_or_no)
                    .setString("collection_sales_no", to_student_balance_adjustment_payments.collection_sales_no)
                    .ok();

            PreparedStatement stmt5 = conn.prepareStatement("");
            stmt5.addBatch(s5);
            stmt5.executeBatch();

            //search payment id
            String s6 = "select "
                    + " id"
                    + " from student_balance_adjustment_payments "
                    + " order by id desc limit 1";

            Statement stmt6 = conn.createStatement();
            ResultSet rs6 = stmt6.executeQuery(s6);
            int eap_id = 0;
            if (rs6.next()) {
                eap_id = rs6.getInt(1);
            }

            //Search Payment
            String s12 = "select "
                    + " paid"
                    + " from student_balance_adjustments"
                    + " where id='" + to_student_balance_adjustment_payments.sba_id + "' ";
            Statement stmt12 = conn.createStatement();
            ResultSet rs12 = stmt12.executeQuery(s12);
            double paid = 0;
            if (rs12.next()) {
                paid = rs12.getDouble(1);
            }
            double new_paid = paid + to_student_balance_adjustment_payments.paid;
            String s13 = "update student_balance_adjustments set "
                    + " paid= :new_paid "
                    + " where id='" + to_student_balance_adjustment_payments.sba_id + "' "
                    + " ";

            s13 = SqlStringUtil.parse(s13)
                    .setNumber("new_paid", new_paid)
                    .ok();
            stmt5.addBatch(s13);

            //Search Student
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
            double new_balance = balance - to_student_balance_adjustment_payments.paid;
//            System.out.println("balance: " + balance + " - " + to_enrollment_assessment_payments.amount_paid);
            String s11 = "update students set "
                    + " balance= :balance "
                    + " where id='" + student.id + "' "
                    + " ";

            s11 = SqlStringUtil.parse(s11)
                    .setNumber("balance", new_balance)
                    .ok();
            stmt5.addBatch(s11);

            String s14 = "update collections set "
                    + " ref_id= :ref_id "
                    + " where id='" + collection_id + "' "
                    + " ";

            s14 = SqlStringUtil.parse(s14)
                    .setNumber("ref_id", eap_id)
                    .ok();
            stmt5.addBatch(s14);

            stmt5.executeBatch();
            conn.commit();

            Lg.s(Enrollment_assessments.class, "Successfully Added");

            return collection_or_no;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

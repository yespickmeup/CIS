/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

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
public class Enrollment_assessment_payments {

    public static class to_enrollment_assessment_payments {

        public final int id;
        public final int enrollment_assessment_id;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int academic_year_id;
        public final String academic_year;
        public final double amount_paid;
        public final double cash;
        public final String discount_name;
        public final double discount_rate;
        public final double discount_amount;
        public final String discount_customer_name;
        public final String discount_customer_id;
        public final String check_bank;
        public final String check_no;
        public final double check_amount;
        public final String check_holder;
        public final String check_date;
        public final String credit_card_type;
        public final double credit_card_rate;
        public final double credit_card_amount;
        public final String credit_card_no;
        public final String credit_card_holder;
        public final String gift_certificate_from;
        public final String gift_certificate_description;
        public final String gift_certificate_no;
        public final double gift_certificate_amount;
        public final String online_bank;
        public final String online_reference_no;
        public final double online_amount;
        public final String online_holder;
        public final String online_date;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final int collection_id;
        public final String collection_no;
        public final String collection_sales_no;

        public to_enrollment_assessment_payments(int id, int enrollment_assessment_id, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, double amount_paid, double cash, String discount_name, double discount_rate, double discount_amount, String discount_customer_name, String discount_customer_id, String check_bank, String check_no, double check_amount, String check_holder, String check_date, String credit_card_type, double credit_card_rate, double credit_card_amount, String credit_card_no, String credit_card_holder, String gift_certificate_from, String gift_certificate_description, String gift_certificate_no, double gift_certificate_amount, String online_bank, String online_reference_no, double online_amount, String online_holder, String online_date, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int collection_id, String collection_no, String collection_sales_no) {
            this.id = id;
            this.enrollment_assessment_id = enrollment_assessment_id;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.amount_paid = amount_paid;
            this.cash = cash;
            this.discount_name = discount_name;
            this.discount_rate = discount_rate;
            this.discount_amount = discount_amount;
            this.discount_customer_name = discount_customer_name;
            this.discount_customer_id = discount_customer_id;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_amount = check_amount;
            this.check_holder = check_holder;
            this.check_date = check_date;
            this.credit_card_type = credit_card_type;
            this.credit_card_rate = credit_card_rate;
            this.credit_card_amount = credit_card_amount;
            this.credit_card_no = credit_card_no;
            this.credit_card_holder = credit_card_holder;
            this.gift_certificate_from = gift_certificate_from;
            this.gift_certificate_description = gift_certificate_description;
            this.gift_certificate_no = gift_certificate_no;
            this.gift_certificate_amount = gift_certificate_amount;
            this.online_bank = online_bank;
            this.online_reference_no = online_reference_no;
            this.online_amount = online_amount;
            this.online_holder = online_holder;
            this.online_date = online_date;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.collection_id = collection_id;
            this.collection_no = collection_no;
            this.collection_sales_no = collection_sales_no;
        }
    }

    public static void add_data(to_enrollment_assessment_payments to_enrollment_assessment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_assessment_payments("
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
                    + ",collection_id"
                    + ",collection_no"
                    + ",collection_sales_no"
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
                    + ",:collection_id"
                    + ",:collection_no"
                    + ",:collection_sales_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
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
                    .setNumber("collection_id", to_enrollment_assessment_payments.collection_id)
                    .setString("collection_no", to_enrollment_assessment_payments.collection_no)
                    .setString("collection_sales_no", to_enrollment_assessment_payments.collection_sales_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_assessment_payments to_enrollment_assessment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_assessment_payments set "
                    + "enrollment_assessment_id= :enrollment_assessment_id "
                    + ",enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",amount_paid= :amount_paid "
                    + ",cash= :cash "
                    + ",discount_name= :discount_name "
                    + ",discount_rate= :discount_rate "
                    + ",discount_amount= :discount_amount "
                    + ",discount_customer_name= :discount_customer_name "
                    + ",discount_customer_id= :discount_customer_id "
                    + ",check_bank= :check_bank "
                    + ",check_no= :check_no "
                    + ",check_amount= :check_amount "
                    + ",check_holder= :check_holder "
                    + ",check_date= :check_date "
                    + ",credit_card_type= :credit_card_type "
                    + ",credit_card_rate= :credit_card_rate "
                    + ",credit_card_amount= :credit_card_amount "
                    + ",credit_card_no= :credit_card_no "
                    + ",credit_card_holder= :credit_card_holder "
                    + ",gift_certificate_from= :gift_certificate_from "
                    + ",gift_certificate_description= :gift_certificate_description "
                    + ",gift_certificate_no= :gift_certificate_no "
                    + ",gift_certificate_amount= :gift_certificate_amount "
                    + ",online_bank= :online_bank "
                    + ",online_reference_no= :online_reference_no "
                    + ",online_amount= :online_amount "
                    + ",online_holder= :online_holder "
                    + ",online_date= :online_date "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + ",collection_id= :collection_id "
                    + ",collection_no= :collection_no "
                    + ",collection_sales_no= :collection_sales_no "
                    + " where id='" + to_enrollment_assessment_payments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
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
                    .setNumber("collection_id", to_enrollment_assessment_payments.collection_id)
                    .setString("collection_no", to_enrollment_assessment_payments.collection_no)
                    .setString("collection_sales_no", to_enrollment_assessment_payments.collection_sales_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_assessment_payments to_enrollment_assessment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_assessment_payments  "
                    + " where id='" + to_enrollment_assessment_payments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_assessment_payments> ret_data(String where) {
        List<to_enrollment_assessment_payments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_assessment_id"
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
                    + ",collection_id"
                    + ",collection_no"
                    + ",collection_sales_no"
                    + " from enrollment_assessment_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_assessment_id = rs.getInt(2);
                int enrollment_id = rs.getInt(3);
                String enrollment_no = rs.getString(4);
                int academic_year_id = rs.getInt(5);
                String academic_year = rs.getString(6);
                double amount_paid = rs.getDouble(7);
                double cash = rs.getDouble(8);
                String discount_name = rs.getString(9);
                double discount_rate = rs.getDouble(10);
                double discount_amount = rs.getDouble(11);
                String discount_customer_name = rs.getString(12);
                String discount_customer_id = rs.getString(13);
                String check_bank = rs.getString(14);
                String check_no = rs.getString(15);
                double check_amount = rs.getDouble(16);
                String check_holder = rs.getString(17);
                String check_date = rs.getString(18);
                String credit_card_type = rs.getString(19);
                double credit_card_rate = rs.getDouble(20);
                double credit_card_amount = rs.getDouble(21);
                String credit_card_no = rs.getString(22);
                String credit_card_holder = rs.getString(23);
                String gift_certificate_from = rs.getString(24);
                String gift_certificate_description = rs.getString(25);
                String gift_certificate_no = rs.getString(26);
                double gift_certificate_amount = rs.getDouble(27);
                String online_bank = rs.getString(28);
                String online_reference_no = rs.getString(29);
                double online_amount = rs.getDouble(30);
                String online_holder = rs.getString(31);
                String online_date = rs.getString(32);
                String created_at = rs.getString(33);
                String updated_at = rs.getString(34);
                String created_by = rs.getString(35);
                String updated_by = rs.getString(36);
                int status = rs.getInt(37);
                int is_uploaded = rs.getInt(38);
                int collection_id = rs.getInt(39);
                String collection_no = rs.getString(40);
                String collection_sales_no = rs.getString(41);

                to_enrollment_assessment_payments to = new to_enrollment_assessment_payments(id, enrollment_assessment_id, enrollment_id, enrollment_no, academic_year_id, academic_year, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_bank, check_no, check_amount, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, credit_card_holder, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, created_by, updated_by, status, is_uploaded, collection_id, collection_no, collection_sales_no);
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

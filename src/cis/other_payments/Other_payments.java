/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.other_payments;

import cis.collections.Collection;
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
 * @author USER
 */
public class Other_payments {

    public static class to_other_payments {

        public final int id;
        public final String reference_no;
        public final String customer_id;
        public final String customer_name;
        public final double amount;
        public final int particular_id;
        public final String particular;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int collection_id;
        public final String collection_no;

        public to_other_payments(int id, String reference_no, String customer_id, String customer_name, double amount, int particular_id, String particular, String created_by, String updated_by, String created_at, String updated_at, int status, int collection_id, String collection_no) {
            this.id = id;
            this.reference_no = reference_no;
            this.customer_id = customer_id;
            this.customer_name = customer_name;
            this.amount = amount;
            this.particular_id = particular_id;
            this.particular = particular;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.collection_id = collection_id;
            this.collection_no = collection_no;
        }
    }

    public static void add_data(to_other_payments to_other_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into other_payments("
                    + "reference_no"
                    + ",customer_id"
                    + ",customer_name"
                    + ",amount"
                    + ",particular_id"
                    + ",particular"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",collection_id"
                    + ",collection_no"
                    + ")values("
                    + ":reference_no"
                    + ",:customer_id"
                    + ",:customer_name"
                    + ",:amount"
                    + ",:particular_id"
                    + ",:particular"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:collection_id"
                    + ",:collection_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_other_payments.reference_no)
                    .setString("customer_id", to_other_payments.customer_id)
                    .setString("customer_name", to_other_payments.customer_name)
                    .setNumber("amount", to_other_payments.amount)
                    .setNumber("particular_id", to_other_payments.particular_id)
                    .setString("particular", to_other_payments.particular)
                    .setString("created_by", to_other_payments.created_by)
                    .setString("updated_by", to_other_payments.updated_by)
                    .setString("created_at", to_other_payments.created_at)
                    .setString("updated_at", to_other_payments.updated_at)
                    .setNumber("status", to_other_payments.status)
                    .setNumber("collection_id", to_other_payments.collection_id)
                    .setString("collection_no", to_other_payments.collection_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Other_payments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String pay(to_other_payments to_other_payments, Collection.to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            String collection_or_no = "";
            int collection_id = 0;

            collection_or_no = Collection.increment_id();
            String s2 = "insert into collections("
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

            s2 = SqlStringUtil.parse(s2)
                    .setString("collection_no", collection_or_no)
                    .setString("or_no", to_other_payments.reference_no)
                    .setString("payment_type", to_other_payments.particular)
                    .setNumber("amount_paid", to_other_payments.amount)
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
            stmt5.addBatch(s2);
            stmt5.executeBatch();

            ResultSet rs = stmt5.getGeneratedKeys();
            if (rs.next()) {
                int last_inserted_id = rs.getInt(1);
                collection_id = last_inserted_id;
            }

            String s0 = "insert into other_payments("
                    + "reference_no"
                    + ",customer_id"
                    + ",customer_name"
                    + ",amount"
                    + ",particular_id"
                    + ",particular"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",collection_id"
                    + ",collection_no"
                    + ")values("
                    + ":reference_no"
                    + ",:customer_id"
                    + ",:customer_name"
                    + ",:amount"
                    + ",:particular_id"
                    + ",:particular"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:collection_id"
                    + ",:collection_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_other_payments.reference_no)
                    .setString("customer_id", to_other_payments.customer_id)
                    .setString("customer_name", to_other_payments.customer_name)
                    .setNumber("amount", to_other_payments.amount)
                    .setNumber("particular_id", to_other_payments.particular_id)
                    .setString("particular", to_other_payments.particular)
                    .setString("created_by", to_other_payments.created_by)
                    .setString("updated_by", to_other_payments.updated_by)
                    .setString("created_at", to_other_payments.created_at)
                    .setString("updated_at", to_other_payments.updated_at)
                    .setNumber("status", to_other_payments.status)
                    .setNumber("collection_id", collection_id)
                    .setString("collection_no", collection_or_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);
            stmt.executeBatch();
            
            

            conn.commit();
            Lg.s(Other_payments.class, "Successfully Added");

            return collection_or_no;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_other_payments to_other_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update other_payments set "
                    + "reference_no= :reference_no "
                    + ",customer_id= :customer_id "
                    + ",customer_name= :customer_name "
                    + ",amount= :amount "
                    + ",particular_id= :particular_id "
                    + ",particular= :particular "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",collection_id= :collection_id "
                    + ",collection_no= :collection_no "
                    + " where id='" + to_other_payments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_other_payments.reference_no)
                    .setString("customer_id", to_other_payments.customer_id)
                    .setString("customer_name", to_other_payments.customer_name)
                    .setNumber("amount", to_other_payments.amount)
                    .setNumber("particular_id", to_other_payments.particular_id)
                    .setString("particular", to_other_payments.particular)
                    .setString("created_by", to_other_payments.created_by)
                    .setString("updated_by", to_other_payments.updated_by)
                    .setString("created_at", to_other_payments.created_at)
                    .setString("updated_at", to_other_payments.updated_at)
                    .setNumber("status", to_other_payments.status)
                    .setNumber("collection_id", to_other_payments.collection_id)
                    .setString("collection_no", to_other_payments.collection_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Other_payments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_other_payments to_other_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from other_payments  "
                    + " where id='" + to_other_payments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Other_payments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_other_payments> ret_data(String where) {
        List<to_other_payments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reference_no"
                    + ",customer_id"
                    + ",customer_name"
                    + ",amount"
                    + ",particular_id"
                    + ",particular"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",collection_id"
                    + ",collection_no"
                    + " from other_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reference_no = rs.getString(2);
                String customer_id = rs.getString(3);
                String customer_name = rs.getString(4);
                double amount = rs.getDouble(5);
                int particular_id = rs.getInt(6);
                String particular = rs.getString(7);
                String created_by = rs.getString(8);
                String updated_by = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                int status = rs.getInt(12);
                int collection_id = rs.getInt(13);
                String collection_no = rs.getString(14);

                to_other_payments to = new to_other_payments(id, reference_no, customer_id, customer_name, amount, particular_id, particular, created_by, updated_by, created_at, updated_at, status, collection_id, collection_no);
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

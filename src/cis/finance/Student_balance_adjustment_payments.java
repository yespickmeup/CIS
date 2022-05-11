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
 * @author USER
 */
public class Student_balance_adjustment_payments {

    public static class to_student_balance_adjustment_payments {

        public final int id;
        public final int sba_id;
        public final int student_id;
        public final String student_no;
        public final String fname;
        public final String mi;
        public final String lname;
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
        public final int collection_id;
        public final String collection_no;
        public final String collection_sales_no;

        public to_student_balance_adjustment_payments(int id, int sba_id, int student_id, String student_no, String fname, String mi, String lname, double adjustment_amount, double paid, String remarks, int status, String created_at, int created_by, String updated_at, int updated_by, int particular_id, String particular, int collection_id, String collection_no, String collection_sales_no) {
            this.id = id;
            this.sba_id = sba_id;
            this.student_id = student_id;
            this.student_no = student_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
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
            this.collection_id = collection_id;
            this.collection_no = collection_no;
            this.collection_sales_no = collection_sales_no;
        }
    }

    public static void add_data(to_student_balance_adjustment_payments to_student_balance_adjustment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into student_balance_adjustment_payments("
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
                    + ")";

            s0 = SqlStringUtil.parse(s0)
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
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Student_balance_adjustment_payments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_student_balance_adjustment_payments to_student_balance_adjustment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update student_balance_adjustment_payments set "
                    + "sba_id= :sba_id "
                    + ",student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
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
                    + " where id='" + to_student_balance_adjustment_payments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
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
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Student_balance_adjustment_payments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_student_balance_adjustment_payments to_student_balance_adjustment_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from student_balance_adjustment_payments  "
                    + " where id='" + to_student_balance_adjustment_payments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Student_balance_adjustment_payments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_student_balance_adjustment_payments> ret_data(String where) {
        List<to_student_balance_adjustment_payments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",sba_id"
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
                    + " from student_balance_adjustment_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int sba_id = rs.getInt(2);
                int student_id = rs.getInt(3);
                String student_no = rs.getString(4);
                String fname = rs.getString(5);
                String mi = rs.getString(6);
                String lname = rs.getString(7);
                double adjustment_amount = rs.getDouble(8);
                double paid = rs.getDouble(9);
                String remarks = rs.getString(10);
                int status = rs.getInt(11);
                String created_at = rs.getString(12);
                int created_by = rs.getInt(13);
                String updated_at = rs.getString(14);
                int updated_by = rs.getInt(15);
                int particular_id = rs.getInt(16);
                String particular = rs.getString(17);
                int collection_id = rs.getInt(18);
                String collection_no = rs.getString(19);
                String collection_sales_no = rs.getString(20);

                to_student_balance_adjustment_payments to = new to_student_balance_adjustment_payments(id, sba_id, student_id, student_no, fname, mi, lname, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by, particular_id, particular, collection_id, collection_no, collection_sales_no);
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

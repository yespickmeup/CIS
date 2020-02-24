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
public class Enrollment_assessment_payment_modes {

    public static class to_enrollment_assessment_payment_modes {

        public final int id;
        public final int enrollment_assessment_id;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int academic_year_id;
        public final String academic_year;
        public final String mode;
        public final int mode_order;
        public final String to_pay;
        public final double amount;
        public final double discount;
        public final double paid;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_enrollment_assessment_payment_modes(int id, int enrollment_assessment_id, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, String mode, int mode_order, String to_pay, double amount, double discount, double paid, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.enrollment_assessment_id = enrollment_assessment_id;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.mode = mode;
            this.mode_order = mode_order;
            this.to_pay = to_pay;
            this.amount = amount;
            this.discount = discount;
            this.paid = paid;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_enrollment_assessment_payment_modes to_enrollment_assessment_payment_modes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_assessment_payment_modes("
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

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_assessment_id", to_enrollment_assessment_payment_modes.enrollment_assessment_id)
                    .setNumber("enrollment_id", to_enrollment_assessment_payment_modes.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessment_payment_modes.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_assessment_payment_modes.academic_year_id)
                    .setString("academic_year", to_enrollment_assessment_payment_modes.academic_year)
                    .setString("mode", to_enrollment_assessment_payment_modes.mode)
                    .setNumber("mode_order", to_enrollment_assessment_payment_modes.mode_order)
                    .setString("to_pay", to_enrollment_assessment_payment_modes.to_pay)
                    .setNumber("amount", to_enrollment_assessment_payment_modes.amount)
                    .setNumber("discount", to_enrollment_assessment_payment_modes.discount)
                    .setNumber("paid", to_enrollment_assessment_payment_modes.paid)
                    .setString("created_at", to_enrollment_assessment_payment_modes.created_at)
                    .setString("updated_at", to_enrollment_assessment_payment_modes.updated_at)
                    .setString("created_by", to_enrollment_assessment_payment_modes.created_by)
                    .setString("updated_by", to_enrollment_assessment_payment_modes.updated_by)
                    .setNumber("status", to_enrollment_assessment_payment_modes.status)
                    .setNumber("is_uploaded", to_enrollment_assessment_payment_modes.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payment_modes.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_assessment_payment_modes to_enrollment_assessment_payment_modes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_assessment_payment_modes set "
                    + "enrollment_assessment_id= :enrollment_assessment_id "
                    + ",enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",mode= :mode "
                    + ",mode_order= :mode_order "
                    + ",to_pay= :to_pay "
                    + ",amount= :amount "
                    + ",discount= :discount "
                    + ",paid= :paid "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_enrollment_assessment_payment_modes.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_assessment_id", to_enrollment_assessment_payment_modes.enrollment_assessment_id)
                    .setNumber("enrollment_id", to_enrollment_assessment_payment_modes.enrollment_id)
                    .setString("enrollment_no", to_enrollment_assessment_payment_modes.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_assessment_payment_modes.academic_year_id)
                    .setString("academic_year", to_enrollment_assessment_payment_modes.academic_year)
                    .setString("mode", to_enrollment_assessment_payment_modes.mode)
                    .setNumber("mode_order", to_enrollment_assessment_payment_modes.mode_order)
                    .setString("to_pay", to_enrollment_assessment_payment_modes.to_pay)
                    .setNumber("amount", to_enrollment_assessment_payment_modes.amount)
                    .setNumber("discount", to_enrollment_assessment_payment_modes.discount)
                    .setNumber("paid", to_enrollment_assessment_payment_modes.paid)
                    .setString("created_at", to_enrollment_assessment_payment_modes.created_at)
                    .setString("updated_at", to_enrollment_assessment_payment_modes.updated_at)
                    .setString("created_by", to_enrollment_assessment_payment_modes.created_by)
                    .setString("updated_by", to_enrollment_assessment_payment_modes.updated_by)
                    .setNumber("status", to_enrollment_assessment_payment_modes.status)
                    .setNumber("is_uploaded", to_enrollment_assessment_payment_modes.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payment_modes.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_assessment_payment_modes to_enrollment_assessment_payment_modes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_assessment_payment_modes  "
                    + " where id='" + to_enrollment_assessment_payment_modes.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_assessment_payment_modes.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_assessment_payment_modes> ret_data(String where) {
        List<to_enrollment_assessment_payment_modes> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + " from enrollment_assessment_payment_modes"
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

                to_enrollment_assessment_payment_modes to = new to_enrollment_assessment_payment_modes(id, enrollment_assessment_id, enrollment_id, enrollment_no, academic_year_id, academic_year, mode, mode_order, to_pay, amount, discount, paid, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

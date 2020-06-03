/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

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
public class Academic_year_fees {

    public static class to_academic_year_fees {

        public final int id;
        public final int academic_year_id;
        public final String academic_year;
        public final int department_id;
        public final String department;
        public final int level_id;
        public final String level;
        public final int course_id;
        public final String course;
        public final String period;
        public final int group_id;
        public final String group_name;
        public final int fee_id;
        public final String fee;
        public final double amount;
        public final int is_per_unit;
        public final double per_unit;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final double lab_unit_amount;

        public to_academic_year_fees(int id, int academic_year_id, String academic_year, int department_id, String department, int level_id, String level, int course_id, String course, String period, int group_id, String group_name, int fee_id, String fee, double amount, int is_per_unit, double per_unit, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded,double lab_unit_amount) {
            this.id = id;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.department_id = department_id;
            this.department = department;
            this.level_id = level_id;
            this.level = level;
            this.course_id = course_id;
            this.course = course;
            this.period = period;
            this.group_id = group_id;
            this.group_name = group_name;
            this.fee_id = fee_id;
            this.fee = fee;
            this.amount = amount;
            this.is_per_unit = is_per_unit;
            this.per_unit = per_unit;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.lab_unit_amount=lab_unit_amount;
        }
    }

    public static void add_data(to_academic_year_fees to_academic_year_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_year_fees("
                    + "academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",level_id"
                    + ",level"
                    + ",course_id"
                    + ",course"
                    + ",period"
                    + ",group_id"
                    + ",group_name"
                    + ",fee_id"
                    + ",fee"
                    + ",amount"
                    + ",is_per_unit"
                    + ",per_unit"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",lab_unit_amount"
                    + ")values("
                    + ":academic_year_id"
                    + ",:academic_year"
                    + ",:department_id"
                    + ",:department"
                    + ",:level_id"
                    + ",:level"
                    + ",:course_id"
                    + ",:course"
                    + ",:period"
                    + ",:group_id"
                    + ",:group_name"
                    + ",:fee_id"
                    + ",:fee"
                    + ",:amount"
                    + ",:is_per_unit"
                    + ",:per_unit"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ",:lab_unit_amount"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_year_fees.academic_year_id)
                    .setString("academic_year", to_academic_year_fees.academic_year)
                    .setNumber("department_id", to_academic_year_fees.department_id)
                    .setString("department", to_academic_year_fees.department)
                    .setNumber("level_id", to_academic_year_fees.level_id)
                    .setString("level", to_academic_year_fees.level)
                    .setNumber("course_id", to_academic_year_fees.course_id)
                    .setString("course", to_academic_year_fees.course)
                    .setString("period", to_academic_year_fees.period)
                    .setNumber("group_id", to_academic_year_fees.group_id)
                    .setString("group_name", to_academic_year_fees.group_name)
                    .setNumber("fee_id", to_academic_year_fees.fee_id)
                    .setString("fee", to_academic_year_fees.fee)
                    .setNumber("amount", to_academic_year_fees.amount)
                    .setNumber("is_per_unit", to_academic_year_fees.is_per_unit)
                    .setNumber("per_unit", to_academic_year_fees.per_unit)
                    .setString("created_at", to_academic_year_fees.created_at)
                    .setString("updated_at", to_academic_year_fees.updated_at)
                    .setString("created_by", to_academic_year_fees.created_by)
                    .setString("updated_by", to_academic_year_fees.updated_by)
                    .setNumber("status", to_academic_year_fees.status)
                    .setNumber("is_uploaded", to_academic_year_fees.is_uploaded)
                    .setNumber("lab_unit_amount",to_academic_year_fees.lab_unit_amount)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_fees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_year_fees to_academic_year_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_fees set "
                    + "academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",course_id= :course_id "
                    + ",course= :course "
                    + ",period= :period "
                    + ",group_id= :group_id "
                    + ",group_name= :group_name "
                    + ",fee_id= :fee_id "
                    + ",fee= :fee "
                    + ",amount= :amount "
                    + ",is_per_unit= :is_per_unit "
                    + ",per_unit= :per_unit "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + ",lab_unit_amount= :lab_unit_amount"
                    + " where id='" + to_academic_year_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_year_fees.academic_year_id)
                    .setString("academic_year", to_academic_year_fees.academic_year)
                    .setNumber("department_id", to_academic_year_fees.department_id)
                    .setString("department", to_academic_year_fees.department)
                    .setNumber("level_id", to_academic_year_fees.level_id)
                    .setString("level", to_academic_year_fees.level)
                    .setNumber("course_id", to_academic_year_fees.course_id)
                    .setString("course", to_academic_year_fees.course)
                    .setString("period", to_academic_year_fees.period)
                    .setNumber("group_id", to_academic_year_fees.group_id)
                    .setString("group_name", to_academic_year_fees.group_name)
                    .setNumber("fee_id", to_academic_year_fees.fee_id)
                    .setString("fee", to_academic_year_fees.fee)
                    .setNumber("amount", to_academic_year_fees.amount)
                    .setNumber("is_per_unit", to_academic_year_fees.is_per_unit)
                    .setNumber("per_unit", to_academic_year_fees.per_unit)
                    .setString("created_at", to_academic_year_fees.created_at)
                    .setString("updated_at", to_academic_year_fees.updated_at)
                    .setString("created_by", to_academic_year_fees.created_by)
                    .setString("updated_by", to_academic_year_fees.updated_by)
                    .setNumber("status", to_academic_year_fees.status)
                    .setNumber("is_uploaded", to_academic_year_fees.is_uploaded)
                    .setNumber("lab_unit_amount",to_academic_year_fees.lab_unit_amount)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data2(to_academic_year_fees to_academic_year_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_fees set "
                    + "amount= :amount "
                    + " where id='" + to_academic_year_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("amount", to_academic_year_fees.amount)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data_tuition(to_academic_year_fees to_academic_year_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_fees set "
                    + " amount= :amount "
                    + " ,is_per_unit= :is_per_unit "
                    + " ,per_unit= :per_unit "
                    + ",lab_unit_amount= :lab_unit_amount"
                    + " where id='" + to_academic_year_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("amount", to_academic_year_fees.amount)
                    .setNumber("is_per_unit", to_academic_year_fees.is_per_unit)
                    .setNumber("per_unit", to_academic_year_fees.per_unit)
                    .setNumber("lab_unit_amount",to_academic_year_fees.lab_unit_amount)
                    .ok();
            

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_year_fees to_academic_year_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_year_fees  "
                    + " where id='" + to_academic_year_fees.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_fees.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_year_fees> ret_data(String where) {
        List<to_academic_year_fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",level_id"
                    + ",level"
                    + ",course_id"
                    + ",course"
                    + ",period"
                    + ",group_id"
                    + ",group_name"
                    + ",fee_id"
                    + ",fee"
                    + ",amount"
                    + ",is_per_unit"
                    + ",per_unit"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",lab_unit_amount"
                    + " from academic_year_fees"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                String academic_year = rs.getString(3);
                int department_id = rs.getInt(4);
                String department = rs.getString(5);
                int level_id = rs.getInt(6);
                String level = rs.getString(7);
                int course_id = rs.getInt(8);
                String course = rs.getString(9);
                String period = rs.getString(10);
                int group_id = rs.getInt(11);
                String group_name = rs.getString(12);
                int fee_id = rs.getInt(13);
                String fee = rs.getString(14);
                double amount = rs.getDouble(15);
                int is_per_unit = rs.getInt(16);
                double per_unit = rs.getDouble(17);
                String created_at = rs.getString(18);
                String updated_at = rs.getString(19);
                String created_by = rs.getString(20);
                String updated_by = rs.getString(21);
                int status = rs.getInt(22);
                int is_uploaded = rs.getInt(23);
                double lab_unit_amount=rs.getDouble(24);
                to_academic_year_fees to = new to_academic_year_fees(id, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course, period, group_id, group_name, fee_id, fee, amount, is_per_unit, per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded,lab_unit_amount);
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

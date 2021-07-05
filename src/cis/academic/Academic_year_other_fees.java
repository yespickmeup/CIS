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
 * @author User
 */
public class Academic_year_other_fees {

    public static class to_academic_year_other_fees {

        public final int id;
        public final int academic_year_id;
        public final String academic_year;
        public final int department_id;
        public final String department;
        public final int level_id;
        public final String level;
        public final int course_id;
        public final String course;
        public final String name;
        public final String remarks;
        public final double amount1;
        public final double amount2;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;

        public to_academic_year_other_fees(int id, int academic_year_id, String academic_year, int department_id, String department, int level_id, String level, int course_id, String course, String name, String remarks, double amount1, double amount2, String created_at, String updated_at, String created_by, String updated_by, int status) {

            this.id = id;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.department_id = department_id;
            this.department = department;
            this.level_id = level_id;
            this.level = level;
            this.course_id = course_id;
            this.course = course;
            this.name = name;
            this.remarks = remarks;
            this.amount1 = amount1;
            this.amount2 = amount2;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_academic_year_other_fees to_academic_year_other_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_year_other_fees("
                    + "academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",level_id"
                    + ",level"
                    + ",course_id"
                    + ",course"
                    + ",name"
                    + ",remarks"
                    + ",amount1"
                    + ",amount2"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":academic_year_id"
                    + ",:academic_year"
                    + ",:department_id"
                    + ",:department"
                    + ",:level_id"
                    + ",:level"
                    + ",:course_id"
                    + ",:course"
                    + ",:name"
                    + ",:remarks"
                    + ",:amount1"
                    + ",:amount2"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_year_other_fees.academic_year_id)
                    .setString("academic_year", to_academic_year_other_fees.academic_year)
                    .setNumber("department_id", to_academic_year_other_fees.department_id)
                    .setString("department", to_academic_year_other_fees.department)
                    .setNumber("level_id", to_academic_year_other_fees.level_id)
                    .setString("level", to_academic_year_other_fees.level)
                    .setNumber("course_id", to_academic_year_other_fees.course_id)
                    .setString("course", to_academic_year_other_fees.course)
                    .setString("name", to_academic_year_other_fees.name)
                    .setString("remarks", to_academic_year_other_fees.remarks)
                    .setNumber("amount1", to_academic_year_other_fees.amount1)
                    .setNumber("amount2", to_academic_year_other_fees.amount2)
                    .setString("created_at", to_academic_year_other_fees.created_at)
                    .setString("updated_at", to_academic_year_other_fees.updated_at)
                    .setString("created_by", to_academic_year_other_fees.created_by)
                    .setString("updated_by", to_academic_year_other_fees.updated_by)
                    .setNumber("status", to_academic_year_other_fees.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_other_fees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_year_other_fees to_academic_year_other_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_other_fees set "
                    + "academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",course_id= :course_id "
                    + ",course= :course "
                    + ",name= :name "
                    + ",remarks= :remarks "
                    + ",amount1= :amount1 "
                    + ",amount2= :amount2 "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_academic_year_other_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_year_other_fees.academic_year_id)
                    .setString("academic_year", to_academic_year_other_fees.academic_year)
                    .setNumber("department_id", to_academic_year_other_fees.department_id)
                    .setString("department", to_academic_year_other_fees.department)
                    .setNumber("level_id", to_academic_year_other_fees.level_id)
                    .setString("level", to_academic_year_other_fees.level)
                    .setNumber("course_id", to_academic_year_other_fees.course_id)
                    .setString("course", to_academic_year_other_fees.course)
                    .setString("name", to_academic_year_other_fees.name)
                    .setString("remarks", to_academic_year_other_fees.remarks)
                    .setNumber("amount1", to_academic_year_other_fees.amount1)
                    .setNumber("amount2", to_academic_year_other_fees.amount2)
                    .setString("created_at", to_academic_year_other_fees.created_at)
                    .setString("updated_at", to_academic_year_other_fees.updated_at)
                    .setString("created_by", to_academic_year_other_fees.created_by)
                    .setString("updated_by", to_academic_year_other_fees.updated_by)
                    .setNumber("status", to_academic_year_other_fees.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_other_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data2(to_academic_year_other_fees to_academic_year_other_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_other_fees set "
                    + "remarks= :remarks "
                    + ",amount1= :amount1 "
                    + ",amount2= :amount2 "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + " where id='" + to_academic_year_other_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("remarks", to_academic_year_other_fees.remarks)
                    .setNumber("amount1", to_academic_year_other_fees.amount1)
                    .setNumber("amount2", to_academic_year_other_fees.amount2)
                    .setString("updated_at", to_academic_year_other_fees.updated_at)
                    .setString("updated_by", to_academic_year_other_fees.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_other_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_year_other_fees to_academic_year_other_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_year_other_fees  "
                    + " where id='" + to_academic_year_other_fees.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_other_fees.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_year_other_fees> ret_data(String where) {
        List<to_academic_year_other_fees> datas = new ArrayList();

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
                    + ",name"
                    + ",remarks"
                    + ",amount1"
                    + ",amount2"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + " from academic_year_other_fees"
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
                String name = rs.getString(10);
                String remarks = rs.getString(11);
                double amount1 = rs.getDouble(12);
                double amount2 = rs.getDouble(13);
                String created_at = rs.getString(14);
                String updated_at = rs.getString(15);
                String created_by = rs.getString(16);
                String updated_by = rs.getString(17);
                int status = rs.getInt(18);

                to_academic_year_other_fees to = new to_academic_year_other_fees(id, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course, name, remarks, amount1, amount2, created_at, updated_at, created_by, updated_by, status);
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

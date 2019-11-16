/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.colleges;

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
public class Colleges {

    public static class to_colleges {

        public final int id;
        public final String college_name;
        public final int college_admin_id;
        public final String college_admin_name;
        public final String department_name;
        public final String department_id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final int no_of_courses;

        public to_colleges(int id, String college_name, int college_admin_id, String college_admin_name, String department_name, String department_id, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int no_of_courses) {
            this.id = id;
            this.college_name = college_name;
            this.college_admin_id = college_admin_id;
            this.college_admin_name = college_admin_name;
            this.department_name = department_name;
            this.department_id = department_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.no_of_courses = no_of_courses;
        }
    }

    public static void add_data(to_colleges to_colleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into colleges("
                    + "college_name"
                    + ",college_admin_id"
                    + ",college_admin_name"
                    + ",department_name"
                    + ",department_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":college_name"
                    + ",:college_admin_id"
                    + ",:college_admin_name"
                    + ",:department_name"
                    + ",:department_id"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("college_name", to_colleges.college_name)
                    .setNumber("college_admin_id", to_colleges.college_admin_id)
                    .setString("college_admin_name", to_colleges.college_admin_name)
                    .setString("department_name", to_colleges.department_name)
                    .setString("department_id", to_colleges.department_id)
                    .setString("created_at", to_colleges.created_at)
                    .setString("updated_at", to_colleges.updated_at)
                    .setString("created_by", to_colleges.created_by)
                    .setString("updated_by", to_colleges.updated_by)
                    .setNumber("status", to_colleges.status)
                    .setNumber("is_uploaded", to_colleges.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Colleges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_colleges to_colleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update colleges set "
                    + "college_name= :college_name "
                    + ",college_admin_id= :college_admin_id "
                    + ",college_admin_name= :college_admin_name "
                    + ",department_name= :department_name "
                    + ",department_id= :department_id "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_colleges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("college_name", to_colleges.college_name)
                    .setNumber("college_admin_id", to_colleges.college_admin_id)
                    .setString("college_admin_name", to_colleges.college_admin_name)
                    .setString("department_name", to_colleges.department_name)
                    .setString("department_id", to_colleges.department_id)
                    .setString("created_at", to_colleges.created_at)
                    .setString("updated_at", to_colleges.updated_at)
                    .setString("created_by", to_colleges.created_by)
                    .setString("updated_by", to_colleges.updated_by)
                    .setNumber("status", to_colleges.status)
                    .setNumber("is_uploaded", to_colleges.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Colleges.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_colleges to_colleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from colleges  "
                    + " where id='" + to_colleges.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Colleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_colleges> ret_data(String where) {
        List<to_colleges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",college_name"
                    + ",college_admin_id"
                    + ",college_admin_name"
                    + ",department_name"
                    + ",department_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from colleges"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String college_name = rs.getString(2);
                int college_admin_id = rs.getInt(3);
                String college_admin_name = rs.getString(4);
                String department_name = rs.getString(5);
                String department_id = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                String created_by = rs.getString(9);
                String updated_by = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);
                int no_of_courses = 0;
                to_colleges to = new to_colleges(id, college_name, college_admin_id, college_admin_name, department_name, department_id, created_at, updated_at, created_by, updated_by, status, is_uploaded, no_of_courses);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_colleges> ret_data_with_courses(String where) {
        List<to_colleges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",college_name"
                    + ",college_admin_id"
                    + ",college_admin_name"
                    + ",department_name"
                    + ",department_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from colleges"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String college_name = rs.getString(2);
                int college_admin_id = rs.getInt(3);
                String college_admin_name = rs.getString(4);
                String department_name = rs.getString(5);
                String department_id = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                String created_by = rs.getString(9);
                String updated_by = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);
                int no_of_courses = 0;

                String s2 = "select "
                        + "count(id)"
                        + " from courses"
                        + " where college_id='" + id + "' ";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    no_of_courses = rs2.getInt(1);

                }
                to_colleges to = new to_colleges(id, college_name, college_admin_id, college_admin_name, department_name, department_id, created_at, updated_at, created_by, updated_by, status, is_uploaded, no_of_courses);
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

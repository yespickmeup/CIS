/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.courses;

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
public class Courses {

    public static class to_courses {

        public final int id;
        public final String course_code;
        public final String course_description;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department_name;
        public final int no_of_years;
        public final String studies;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public boolean selected;

        public to_courses(int id, String course_code, String course_description, int college_id, String college, int department_id, String department_name, int no_of_years, String studies, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, boolean selected) {
            this.id = id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department_name = department_name;
            this.no_of_years = no_of_years;
            this.studies = studies;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.selected = selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    public static void add_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into courses("
                    + "course_code"
                    + ",course_description"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department_name"
                    + ",no_of_years"
                    + ",studies"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":course_code"
                    + ",:course_description"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department_name"
                    + ",:no_of_years"
                    + ",:studies"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("course_code", to_courses.course_code)
                    .setString("course_description", to_courses.course_description)
                    .setNumber("college_id", to_courses.college_id)
                    .setString("college", to_courses.college)
                    .setNumber("department_id", to_courses.department_id)
                    .setString("department_name", to_courses.department_name)
                    .setNumber("no_of_years", to_courses.no_of_years)
                    .setString("studies", to_courses.studies)
                    .setString("created_at", to_courses.created_at)
                    .setString("updated_at", to_courses.updated_at)
                    .setString("created_by", to_courses.created_by)
                    .setString("updated_by", to_courses.updated_by)
                    .setNumber("status", to_courses.status)
                    .setNumber("is_uploaded", to_courses.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update courses set "
                    + "course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department_name= :department_name "
                    + ",no_of_years= :no_of_years "
                    + ",studies= :studies "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_courses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("course_code", to_courses.course_code)
                    .setString("course_description", to_courses.course_description)
                    .setNumber("college_id", to_courses.college_id)
                    .setString("college", to_courses.college)
                    .setNumber("department_id", to_courses.department_id)
                    .setString("department_name", to_courses.department_name)
                    .setNumber("no_of_years", to_courses.no_of_years)
                    .setString("studies", to_courses.studies)
                    .setString("created_at", to_courses.created_at)
                    .setString("updated_at", to_courses.updated_at)
                    .setString("created_by", to_courses.created_by)
                    .setString("updated_by", to_courses.updated_by)
                    .setNumber("status", to_courses.status)
                    .setNumber("is_uploaded", to_courses.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_level_college(List<to_courses> to_courses1, String department, String department_id, String college, String college_id) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            PreparedStatement stmt = conn.prepareStatement("");
            for (to_courses to_courses : to_courses1) {
                String s0 = "update courses set "
                        + "college_id= :college_id "
                        + ",college= :college "
                        + ",department_id= :department_id "
                        + ",department_name= :department_name "
                        + " where id='" + to_courses.id + "' "
                        + " ";

                s0 = SqlStringUtil.parse(s0)
                        .setString("college_id", college_id)
                        .setString("college", college)
                        .setString("department_id", department_id)
                        .setString("department_name", department)
                        .ok();

                stmt.addBatch(s0);

            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Courses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from courses  "
                    + " where id='" + to_courses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_courses> ret_data(String where) {
        List<to_courses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",course_code"
                    + ",course_description"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department_name"
                    + ",no_of_years"
                    + ",studies"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from courses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String course_code = rs.getString(2);
                String course_description = rs.getString(3);
                int college_id = rs.getInt(4);
                String college = rs.getString(5);
                int department_id = rs.getInt(6);
                String department_name = rs.getString(7);
                int no_of_years = rs.getInt(8);
                String studies = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                String created_by = rs.getString(12);
                String updated_by = rs.getString(13);
                int status = rs.getInt(14);
                int is_uploaded = rs.getInt(15);

                to_courses to = new to_courses(id, course_code, course_description, college_id, college, department_id, department_name, no_of_years, studies, created_at, updated_at, created_by, updated_by, status, is_uploaded, false);
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

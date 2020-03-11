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
public class Academic_offerings {

    public static class to_academic_offerings {

        public final int id;
        public final int academic_year_id;
        public final String academic_year;
        public final int course_id;
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

        public to_academic_offerings(int id, int academic_year_id, String academic_year, int course_id, String course_code, String course_description, int college_id, String college, int department_id, String department_name, int no_of_years, String studies, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, boolean selected) {
            this.id = id;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.course_id = course_id;
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

    public static void add_data(to_academic_offerings to_academic_offerings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_offerings("
                    + "academic_year_id"
                    + ",academic_year"
                    + ",course_id"
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
                    + ")values("
                    + ":academic_year_id"
                    + ",:academic_year"
                    + ",:course_id"
                    + ",:course_code"
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
                    .setNumber("academic_year_id", to_academic_offerings.academic_year_id)
                    .setString("academic_year", to_academic_offerings.academic_year)
                    .setNumber("course_id", to_academic_offerings.course_id)
                    .setString("course_code", to_academic_offerings.course_code)
                    .setString("course_description", to_academic_offerings.course_description)
                    .setNumber("college_id", to_academic_offerings.college_id)
                    .setString("college", to_academic_offerings.college)
                    .setNumber("department_id", to_academic_offerings.department_id)
                    .setString("department_name", to_academic_offerings.department_name)
                    .setNumber("no_of_years", to_academic_offerings.no_of_years)
                    .setString("studies", to_academic_offerings.studies)
                    .setString("created_at", to_academic_offerings.created_at)
                    .setString("updated_at", to_academic_offerings.updated_at)
                    .setString("created_by", to_academic_offerings.created_by)
                    .setString("updated_by", to_academic_offerings.updated_by)
                    .setNumber("status", to_academic_offerings.status)
                    .setNumber("is_uploaded", to_academic_offerings.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offerings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_offerings(List<to_academic_offerings> to_academic_offerings1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            for (to_academic_offerings to_academic_offerings : to_academic_offerings1) {
                String s0 = "insert into academic_offerings("
                        + "academic_year_id"
                        + ",academic_year"
                        + ",course_id"
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
                        + ")values("
                        + ":academic_year_id"
                        + ",:academic_year"
                        + ",:course_id"
                        + ",:course_code"
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
                        .setNumber("academic_year_id", to_academic_offerings.academic_year_id)
                        .setString("academic_year", to_academic_offerings.academic_year)
                        .setNumber("course_id", to_academic_offerings.course_id)
                        .setString("course_code", to_academic_offerings.course_code)
                        .setString("course_description", to_academic_offerings.course_description)
                        .setNumber("college_id", to_academic_offerings.college_id)
                        .setString("college", to_academic_offerings.college)
                        .setNumber("department_id", to_academic_offerings.department_id)
                        .setString("department_name", to_academic_offerings.department_name)
                        .setNumber("no_of_years", to_academic_offerings.no_of_years)
                        .setString("studies", to_academic_offerings.studies)
                        .setString("created_at", to_academic_offerings.created_at)
                        .setString("updated_at", to_academic_offerings.updated_at)
                        .setString("created_by", to_academic_offerings.created_by)
                        .setString("updated_by", to_academic_offerings.updated_by)
                        .setNumber("status", to_academic_offerings.status)
                        .setNumber("is_uploaded", to_academic_offerings.is_uploaded)
                        .ok();

                stmt.addBatch(s0);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Academic_offerings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_offerings to_academic_offerings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offerings set "
                    + "academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
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
                    + " where id='" + to_academic_offerings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_offerings.academic_year_id)
                    .setString("academic_year", to_academic_offerings.academic_year)
                    .setNumber("course_id", to_academic_offerings.course_id)
                    .setString("course_code", to_academic_offerings.course_code)
                    .setString("course_description", to_academic_offerings.course_description)
                    .setNumber("college_id", to_academic_offerings.college_id)
                    .setString("college", to_academic_offerings.college)
                    .setNumber("department_id", to_academic_offerings.department_id)
                    .setString("department_name", to_academic_offerings.department_name)
                    .setNumber("no_of_years", to_academic_offerings.no_of_years)
                    .setString("studies", to_academic_offerings.studies)
                    .setString("created_at", to_academic_offerings.created_at)
                    .setString("updated_at", to_academic_offerings.updated_at)
                    .setString("created_by", to_academic_offerings.created_by)
                    .setString("updated_by", to_academic_offerings.updated_by)
                    .setNumber("status", to_academic_offerings.status)
                    .setNumber("is_uploaded", to_academic_offerings.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offerings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_offerings to_academic_offerings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_offerings  "
                    + " where id='" + to_academic_offerings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offerings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_offering(to_academic_offerings to_academic_offerings) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s0 = "delete from academic_offerings  "
                    + " where id='" + to_academic_offerings.id + "' "
                    + " ";

            stmt.addBatch(s0);

            String s2 = "delete from academic_offering_subjects  "
                    + " where academic_offering_id='" + to_academic_offerings.id + "' "
                    + " ";
            stmt.addBatch(s2);

            String s3 = "delete from academic_offering_subject_prerequisites  "
                    + " where academic_offering_id='" + to_academic_offerings.id + "' "
                    + " ";
            stmt.addBatch(s3);

            String s4 = "delete from academic_offering_subject_sections  "
                    + " where academic_offering_id='" + to_academic_offerings.id + "' "
                    + " ";
            stmt.addBatch(s4);

            String s5 = "delete from academic_offering_subject_sections  "
                    + " where academic_offering_id='" + to_academic_offerings.id + "' "
                    + " ";
            stmt.addBatch(s5);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Academic_offerings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_offerings> ret_data(String where) {
        List<to_academic_offerings> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",course_id"
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
                    + " from academic_offerings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                String academic_year = rs.getString(3);
                int course_id = rs.getInt(4);
                String course_code = rs.getString(5);
                String course_description = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department_name = rs.getString(10);
                int no_of_years = rs.getInt(11);
                String studies = rs.getString(12);
                String created_at = rs.getString(13);
                String updated_at = rs.getString(14);
                String created_by = rs.getString(15);
                String updated_by = rs.getString(16);
                int status = rs.getInt(17);
                int is_uploaded = rs.getInt(18);

                to_academic_offerings to = new to_academic_offerings(id, academic_year_id, academic_year, course_id, course_code, course_description, college_id, college, department_id, department_name, no_of_years, studies, created_at, updated_at, created_by, updated_by, status, is_uploaded, false);
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

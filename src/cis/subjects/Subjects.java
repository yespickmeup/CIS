/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.subjects;

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
public class Subjects {

    public static class to_subjects {

        public final int id;
        public final String subject_code;
        public final String description;
        public final int level_id;
        public final String level;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final double lecture_units;
        public final double lab_units;
        public final double amount;
        public final String prerequisites_course_ids;
        public final String subject_group;
        public final int subject_group_id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public boolean selected;
        public to_subjects(int id, String subject_code, String description, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, double lecture_units, double lab_units, double amount, String prerequisites_course_ids, String subject_group, int subject_group_id, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded,boolean selected) {
            this.id = id;
            this.subject_code = subject_code;
            this.description = description;
            this.level_id = level_id;
            this.level = level;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.amount = amount;
            this.prerequisites_course_ids = prerequisites_course_ids;
            this.subject_group = subject_group;
            this.subject_group_id = subject_group_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.selected=selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }
        
    }

    public static void add_data(to_subjects to_subjects, List<Subject_prerequisites.to_subject_prerequisites> prerequisites1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s0 = "insert into subjects("
                    + " subject_code"
                    + ",description"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",prerequisites_course_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + " :subject_code"
                    + ",:description"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:amount"
                    + ",:prerequisites_course_ids"
                    + ",:subject_group"
                    + ",:subject_group_id"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("subject_code", to_subjects.subject_code)
                    .setString("description", to_subjects.description)
                    .setNumber("level_id", to_subjects.level_id)
                    .setString("level", to_subjects.level)
                    .setNumber("college_id", to_subjects.college_id)
                    .setString("college", to_subjects.college)
                    .setNumber("department_id", to_subjects.department_id)
                    .setString("department", to_subjects.department)
                    .setNumber("course_id", to_subjects.course_id)
                    .setString("course_code", to_subjects.course_code)
                    .setString("course_description", to_subjects.course_description)
                    .setNumber("lecture_units", to_subjects.lecture_units)
                    .setNumber("lab_units", to_subjects.lab_units)
                    .setNumber("amount", to_subjects.amount)
                    .setString("prerequisites_course_ids", to_subjects.prerequisites_course_ids)
                    .setString("subject_group", to_subjects.subject_group)
                    .setNumber("subject_group_id", to_subjects.subject_group_id)
                    .setString("created_at", to_subjects.created_at)
                    .setString("updated_at", to_subjects.updated_at)
                    .setString("created_by", to_subjects.created_by)
                    .setString("updated_by", to_subjects.updated_by)
                    .setNumber("status", to_subjects.status)
                    .setNumber("is_uploaded", to_subjects.is_uploaded)
                    .ok();

            stmt.addBatch(s0);

            for (Subject_prerequisites.to_subject_prerequisites to_subject_prerequisites : prerequisites1) {
                String s2 = "insert into subject_prerequisites("
                        + "subject_id"
                        + ",subject_code"
                        + ",description"
                        + ",lecture_units"
                        + ",lab_units"
                        + ",remarks"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + ":subject_id"
                        + ",:subject_code"
                        + ",:description"
                        + ",:lecture_units"
                        + ",:lab_units"
                        + ",:remarks"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s2 = SqlStringUtil.parse(s2)
                        .setNumber("subject_id", to_subjects.id)
                        .setString("subject_code", to_subject_prerequisites.subject_code)
                        .setString("description", to_subject_prerequisites.description)
                        .setNumber("lecture_units", to_subject_prerequisites.lecture_units)
                        .setNumber("lab_units", to_subject_prerequisites.lab_units)
                        .setString("remarks", to_subject_prerequisites.remarks)
                        .setString("created_at", to_subject_prerequisites.created_at)
                        .setString("updated_at", to_subject_prerequisites.updated_at)
                        .setString("created_by", to_subject_prerequisites.created_by)
                        .setString("updated_by", to_subject_prerequisites.updated_by)
                        .setNumber("status", to_subject_prerequisites.status)
                        .setNumber("is_uploaded", to_subject_prerequisites.is_uploaded)
                        .ok();
                stmt.addBatch(s2);

            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Subjects.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data_list(List<to_subjects> to_subjects1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            for (to_subjects to_subjects : to_subjects1) {
                String s0 = "insert into subjects("
                        + " subject_code"
                        + ",description"
                        + ",level_id"
                        + ",level"
                        + ",college_id"
                        + ",college"
                        + ",department_id"
                        + ",department"
                        + ",course_id"
                        + ",course_code"
                        + ",course_description"
                        + ",lecture_units"
                        + ",lab_units"
                        + ",amount"
                        + ",prerequisites_course_ids"
                        + ",subject_group"
                        + ",subject_group_id"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + " :subject_code"
                        + ",:description"
                        + ",:level_id"
                        + ",:level"
                        + ",:college_id"
                        + ",:college"
                        + ",:department_id"
                        + ",:department"
                        + ",:course_id"
                        + ",:course_code"
                        + ",:course_description"
                        + ",:lecture_units"
                        + ",:lab_units"
                        + ",:amount"
                        + ",:prerequisites_course_ids"
                        + ",:subject_group"
                        + ",:subject_group_id"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("subject_code", to_subjects.subject_code)
                        .setString("description", to_subjects.description)
                        .setNumber("level_id", to_subjects.level_id)
                        .setString("level", to_subjects.level)
                        .setNumber("college_id", to_subjects.college_id)
                        .setString("college", to_subjects.college)
                        .setNumber("department_id", to_subjects.department_id)
                        .setString("department", to_subjects.department)
                        .setNumber("course_id", to_subjects.course_id)
                        .setString("course_code", to_subjects.course_code)
                        .setString("course_description", to_subjects.course_description)
                        .setNumber("lecture_units", to_subjects.lecture_units)
                        .setNumber("lab_units", to_subjects.lab_units)
                        .setNumber("amount", to_subjects.amount)
                        .setString("prerequisites_course_ids", to_subjects.prerequisites_course_ids)
                        .setString("subject_group", to_subjects.subject_group)
                        .setNumber("subject_group_id", to_subjects.subject_group_id)
                        .setString("created_at", to_subjects.created_at)
                        .setString("updated_at", to_subjects.updated_at)
                        .setString("created_by", to_subjects.created_by)
                        .setString("updated_by", to_subjects.updated_by)
                        .setNumber("status", to_subjects.status)
                        .setNumber("is_uploaded", to_subjects.is_uploaded)
                        .ok();

                stmt.addBatch(s0);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Subjects.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_subjects to_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update subjects set "
                    + "subject_code= :subject_code "
                    + ",description= :description "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
                    + ",amount= :amount "
                    + ",prerequisites_course_ids= :prerequisites_course_ids "
                    + ",subject_group= :subject_group "
                    + ",subject_group_id= :subject_group_id "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_subjects.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("subject_code", to_subjects.subject_code)
                    .setString("description", to_subjects.description)
                    .setNumber("level_id", to_subjects.level_id)
                    .setString("level", to_subjects.level)
                    .setNumber("college_id", to_subjects.college_id)
                    .setString("college", to_subjects.college)
                    .setNumber("department_id", to_subjects.department_id)
                    .setString("department", to_subjects.department)
                    .setNumber("course_id", to_subjects.course_id)
                    .setString("course_code", to_subjects.course_code)
                    .setString("course_description", to_subjects.course_description)
                    .setNumber("lecture_units", to_subjects.lecture_units)
                    .setNumber("lab_units", to_subjects.lab_units)
                    .setNumber("amount", to_subjects.amount)
                    .setString("prerequisites_course_ids", to_subjects.prerequisites_course_ids)
                    .setString("subject_group", to_subjects.subject_group)
                    .setNumber("subject_group_id", to_subjects.subject_group_id)
                    .setString("created_at", to_subjects.created_at)
                    .setString("updated_at", to_subjects.updated_at)
                    .setString("created_by", to_subjects.created_by)
                    .setString("updated_by", to_subjects.updated_by)
                    .setNumber("status", to_subjects.status)
                    .setNumber("is_uploaded", to_subjects.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_subjects to_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from subjects  "
                    + " where id='" + to_subjects.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subjects.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_subjects> ret_data(String where) {
        List<to_subjects> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",subject_code"
                    + ",description"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",prerequisites_course_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String subject_code = rs.getString(2);
                String description = rs.getString(3);
                int level_id = rs.getInt(4);
                String level = rs.getString(5);
                int college_id = rs.getInt(6);
                String college = rs.getString(7);
                int department_id = rs.getInt(8);
                String department = rs.getString(9);
                int course_id = rs.getInt(10);
                String course_code = rs.getString(11);
                String course_description = rs.getString(12);
                double lecture_units = rs.getDouble(13);
                double lab_units = rs.getDouble(14);
                double amount = rs.getDouble(15);
                String prerequisites_course_ids = rs.getString(16);
                String subject_group = rs.getString(17);
                int subject_group_id = rs.getInt(18);
                String created_at = rs.getString(19);
                String updated_at = rs.getString(20);
                String created_by = rs.getString(21);
                String updated_by = rs.getString(22);
                int status = rs.getInt(23);
                int is_uploaded = rs.getInt(24);
                boolean selected=false;
                to_subjects to = new to_subjects(id, subject_code, description, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, lecture_units, lab_units, amount, prerequisites_course_ids, subject_group, subject_group_id, created_at, updated_at, created_by, updated_by, status, is_uploaded,false);
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

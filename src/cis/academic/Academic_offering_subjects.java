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
public class Academic_offering_subjects {

    public static class to_academic_offering_subjects {

        public final int id;
        public final int academic_offering_id;
        public final int academic_year_id;
        public final String academic_year;
        public final int level_id;
        public final String level;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final String term;
        public final String year_level;
        public final int subject_id;
        public final String subject_code;
        public final String description;
        public final double units;
        public final double lecture_units;
        public final double lab_units;
        public final double amount;
        public final int is_lab;
        public final int max_students;
        public final String prerequisite_subject_ids;
        public final String subject_group;
        public final int subject_group_id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final int faculty_id;
        public final String faculty_name;
        public final String room;
        public final String schedule;
        public final int room_id;

        public to_academic_offering_subjects(int id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, double units, double lecture_units, double lab_units, double amount, int is_lab, int max_students, String prerequisite_subject_ids, String subject_group, int subject_group_id, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int faculty_id, String faculty_name, String room, String schedule, int room_id) {
            this.id = id;
            this.academic_offering_id = academic_offering_id;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.level_id = level_id;
            this.level = level;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.term = term;
            this.year_level = year_level;
            this.subject_id = subject_id;
            this.subject_code = subject_code;
            this.description = description;
            this.units = units;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.amount = amount;
            this.is_lab = is_lab;
            this.max_students = max_students;
            this.prerequisite_subject_ids = prerequisite_subject_ids;
            this.subject_group = subject_group;
            this.subject_group_id = subject_group_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
            this.room = room;
            this.schedule = schedule;
            this.room_id = room_id;
        }
    }

    public static void add_data(to_academic_offering_subjects to_academic_offering_subjects, List<Academic_offering_subject_prerequisites.to_academic_offering_subject_prerequisites> to_academic_offering_subject_prerequisites1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s0 = "insert into academic_offering_subjects("
                    + "academic_offering_id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",year_level"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
                    + ",prerequisite_subject_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",room"
                    + ",schedule"
                    + ",room_id"
                    + ")values("
                    + ":academic_offering_id"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:term"
                    + ",:year_level"
                    + ",:subject_id"
                    + ",:subject_code"
                    + ",:description"
                    + ",:units"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:amount"
                    + ",:is_lab"
                    + ",:max_students"
                    + ",:prerequisite_subject_ids"
                    + ",:subject_group"
                    + ",:subject_group_id"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ",:faculty_id"
                    + ",:faculty_name"
                    + ",:room"
                    + ",:schedule"
                    + ",:room_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_offering_id", to_academic_offering_subjects.academic_offering_id)
                    .setNumber("academic_year_id", to_academic_offering_subjects.academic_year_id)
                    .setString("academic_year", to_academic_offering_subjects.academic_year)
                    .setNumber("level_id", to_academic_offering_subjects.level_id)
                    .setString("level", to_academic_offering_subjects.level)
                    .setNumber("college_id", to_academic_offering_subjects.college_id)
                    .setString("college", to_academic_offering_subjects.college)
                    .setNumber("department_id", to_academic_offering_subjects.department_id)
                    .setString("department", to_academic_offering_subjects.department)
                    .setNumber("course_id", to_academic_offering_subjects.course_id)
                    .setString("course_code", to_academic_offering_subjects.course_code)
                    .setString("course_description", to_academic_offering_subjects.course_description)
                    .setString("term", to_academic_offering_subjects.term)
                    .setString("year_level", to_academic_offering_subjects.year_level)
                    .setNumber("subject_id", to_academic_offering_subjects.subject_id)
                    .setString("subject_code", to_academic_offering_subjects.subject_code)
                    .setString("description", to_academic_offering_subjects.description)
                    .setNumber("units", to_academic_offering_subjects.units)
                    .setNumber("lecture_units", to_academic_offering_subjects.lecture_units)
                    .setNumber("lab_units", to_academic_offering_subjects.lab_units)
                    .setNumber("amount", to_academic_offering_subjects.amount)
                    .setNumber("is_lab", to_academic_offering_subjects.is_lab)
                    .setNumber("max_students", to_academic_offering_subjects.max_students)
                    .setString("prerequisite_subject_ids", to_academic_offering_subjects.prerequisite_subject_ids)
                    .setString("subject_group", to_academic_offering_subjects.subject_group)
                    .setNumber("subject_group_id", to_academic_offering_subjects.subject_group_id)
                    .setString("created_at", to_academic_offering_subjects.created_at)
                    .setString("updated_at", to_academic_offering_subjects.updated_at)
                    .setString("created_by", to_academic_offering_subjects.created_by)
                    .setString("updated_by", to_academic_offering_subjects.updated_by)
                    .setNumber("status", to_academic_offering_subjects.status)
                    .setNumber("is_uploaded", to_academic_offering_subjects.is_uploaded)
                    .setNumber("faculty_id", to_academic_offering_subjects.faculty_id)
                    .setString("faculty_name", to_academic_offering_subjects.faculty_name)
                    .setString("room", to_academic_offering_subjects.room)
                    .setString("schedule", to_academic_offering_subjects.schedule)
                    .setNumber("room_id", to_academic_offering_subjects.room_id)
                    .ok();

            stmt.addBatch(s0);

            for (Academic_offering_subject_prerequisites.to_academic_offering_subject_prerequisites to_academic_offering_subject_prerequisites : to_academic_offering_subject_prerequisites1) {
                String s2 = "insert into academic_offering_subject_prerequisites("
                        + "academic_offering_id"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",level_id"
                        + ",level"
                        + ",college_id"
                        + ",college"
                        + ",department_id"
                        + ",department"
                        + ",course_id"
                        + ",course_code"
                        + ",course_description"
                        + ",term"
                        + ",year_level"
                        + ",ref_subject_id"
                        + ",main_subject_id"
                        + ",subject_code"
                        + ",description"
                        + ",lecture_units"
                        + ",lab_units"
                        + ",remarks"
                        + ",subject_group"
                        + ",subject_group_id"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ")values("
                        + ":academic_offering_id"
                        + ",:academic_year_id"
                        + ",:academic_year"
                        + ",:level_id"
                        + ",:level"
                        + ",:college_id"
                        + ",:college"
                        + ",:department_id"
                        + ",:department"
                        + ",:course_id"
                        + ",:course_code"
                        + ",:course_description"
                        + ",:term"
                        + ",:year_level"
                        + ",:ref_subject_id"
                        + ",:main_subject_id"
                        + ",:subject_code"
                        + ",:description"
                        + ",:lecture_units"
                        + ",:lab_units"
                        + ",:remarks"
                        + ",:subject_group"
                        + ",:subject_group_id"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:is_uploaded"
                        + ")";

                s2 = SqlStringUtil.parse(s2)
                        .setNumber("academic_offering_id", to_academic_offering_subject_prerequisites.academic_offering_id)
                        .setNumber("academic_year_id", to_academic_offering_subject_prerequisites.academic_year_id)
                        .setString("academic_year", to_academic_offering_subject_prerequisites.academic_year)
                        .setNumber("level_id", to_academic_offering_subject_prerequisites.level_id)
                        .setString("level", to_academic_offering_subject_prerequisites.level)
                        .setNumber("college_id", to_academic_offering_subject_prerequisites.college_id)
                        .setString("college", to_academic_offering_subject_prerequisites.college)
                        .setNumber("department_id", to_academic_offering_subject_prerequisites.department_id)
                        .setString("department", to_academic_offering_subject_prerequisites.department)
                        .setNumber("course_id", to_academic_offering_subject_prerequisites.course_id)
                        .setString("course_code", to_academic_offering_subject_prerequisites.course_code)
                        .setString("course_description", to_academic_offering_subject_prerequisites.course_description)
                        .setString("term", to_academic_offering_subject_prerequisites.term)
                        .setString("year_level", to_academic_offering_subject_prerequisites.year_level)
                        .setNumber("ref_subject_id", to_academic_offering_subject_prerequisites.ref_subject_id)
                        .setNumber("main_subject_id", to_academic_offering_subject_prerequisites.main_subject_id)
                        .setString("subject_code", to_academic_offering_subject_prerequisites.subject_code)
                        .setString("description", to_academic_offering_subject_prerequisites.description)
                        .setNumber("lecture_units", to_academic_offering_subject_prerequisites.lecture_units)
                        .setNumber("lab_units", to_academic_offering_subject_prerequisites.lab_units)
                        .setString("remarks", to_academic_offering_subject_prerequisites.remarks)
                        .setString("subject_group", to_academic_offering_subject_prerequisites.subject_group)
                        .setNumber("subject_group_id", to_academic_offering_subject_prerequisites.subject_group_id)
                        .setString("created_at", to_academic_offering_subject_prerequisites.created_at)
                        .setString("updated_at", to_academic_offering_subject_prerequisites.updated_at)
                        .setString("created_by", to_academic_offering_subject_prerequisites.created_by)
                        .setString("updated_by", to_academic_offering_subject_prerequisites.updated_by)
                        .setNumber("status", to_academic_offering_subject_prerequisites.status)
                        .setNumber("is_uploaded", to_academic_offering_subject_prerequisites.is_uploaded)
                        .ok();

                stmt.addBatch(s2);
            }

            stmt.executeBatch();

            conn.commit();
            Lg.s(Academic_offering_subjects.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_offering_subjects to_academic_offering_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offering_subjects set "
                    + "academic_offering_id= :academic_offering_id "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",term= :term "
                    + ",year_level= :year_level "
                    + ",subject_id= :subject_id "
                    + ",subject_code= :subject_code "
                    + ",description= :description "
                    + ",units= :units "
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
                    + ",amount= :amount "
                    + ",is_lab= :is_lab "
                    + ",max_students= :max_students "
                    + ",prerequisite_subject_ids= :prerequisite_subject_ids "
                    + ",subject_group= :subject_group "
                    + ",subject_group_id= :subject_group_id "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + ",faculty_id= :faculty_id"
                    + ",faculty_name= :faculty_name "
                    + ",room= :room "
                    + ",schedule= :schedule "
                    + ",room_id= :room_id "
                    + " where id='" + to_academic_offering_subjects.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_offering_id", to_academic_offering_subjects.academic_offering_id)
                    .setNumber("academic_year_id", to_academic_offering_subjects.academic_year_id)
                    .setString("academic_year", to_academic_offering_subjects.academic_year)
                    .setNumber("level_id", to_academic_offering_subjects.level_id)
                    .setString("level", to_academic_offering_subjects.level)
                    .setNumber("college_id", to_academic_offering_subjects.college_id)
                    .setString("college", to_academic_offering_subjects.college)
                    .setNumber("department_id", to_academic_offering_subjects.department_id)
                    .setString("department", to_academic_offering_subjects.department)
                    .setNumber("course_id", to_academic_offering_subjects.course_id)
                    .setString("course_code", to_academic_offering_subjects.course_code)
                    .setString("course_description", to_academic_offering_subjects.course_description)
                    .setString("term", to_academic_offering_subjects.term)
                    .setString("year_level", to_academic_offering_subjects.year_level)
                    .setNumber("subject_id", to_academic_offering_subjects.subject_id)
                    .setString("subject_code", to_academic_offering_subjects.subject_code)
                    .setString("description", to_academic_offering_subjects.description)
                    .setNumber("units", to_academic_offering_subjects.units)
                    .setNumber("lecture_units", to_academic_offering_subjects.lecture_units)
                    .setNumber("lab_units", to_academic_offering_subjects.lab_units)
                    .setNumber("amount", to_academic_offering_subjects.amount)
                    .setNumber("is_lab", to_academic_offering_subjects.is_lab)
                    .setNumber("max_students", to_academic_offering_subjects.max_students)
                    .setString("prerequisite_subject_ids", to_academic_offering_subjects.prerequisite_subject_ids)
                    .setString("subject_group", to_academic_offering_subjects.subject_group)
                    .setNumber("subject_group_id", to_academic_offering_subjects.subject_group_id)
                    .setString("created_at", to_academic_offering_subjects.created_at)
                    .setString("updated_at", to_academic_offering_subjects.updated_at)
                    .setString("created_by", to_academic_offering_subjects.created_by)
                    .setString("updated_by", to_academic_offering_subjects.updated_by)
                    .setNumber("status", to_academic_offering_subjects.status)
                    .setNumber("is_uploaded", to_academic_offering_subjects.is_uploaded)
                    .setNumber("faculty_id", to_academic_offering_subjects.faculty_id)
                    .setString("faculty_name", to_academic_offering_subjects.faculty_name)
                    .setString("room", to_academic_offering_subjects.room)
                    .setString("schedule", to_academic_offering_subjects.schedule)
                    .setNumber("room_id", to_academic_offering_subjects.room_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_faculty(int id, String faculty_id, String faculty_name) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offering_subjects set "
                    + " faculty_id= :faculty_id"
                    + ",faculty_name= :faculty_name "
                    + " where id='" + id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("faculty_id", faculty_id)
                    .setString("faculty_name", faculty_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_faculty_remove(int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offering_subjects set "
                    + " faculty_id= :faculty_id"
                    + ",faculty_name= :faculty_name "
                    + " where id='" + id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("faculty_id", 0F)
                    .setString("faculty_name", "")
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
    public static void delete_data(to_academic_offering_subjects to_academic_offering_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_offering_subjects  "
                    + " where id='" + to_academic_offering_subjects.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subjects.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_offering_subjects> ret_data(String where) {
        List<to_academic_offering_subjects> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_offering_id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",year_level"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
                    + ",prerequisite_subject_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",room"
                    + ",schedule"
                    + ",room_id"
                    + " from academic_offering_subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_offering_id = rs.getInt(2);
                int academic_year_id = rs.getInt(3);
                String academic_year = rs.getString(4);
                int level_id = rs.getInt(5);
                String level = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department = rs.getString(10);
                int course_id = rs.getInt(11);
                String course_code = rs.getString(12);
                String course_description = rs.getString(13);
                String term = rs.getString(14);
                String year_level = rs.getString(15);
                int subject_id = rs.getInt(16);
                String subject_code = rs.getString(17);
                String description = rs.getString(18);
                double units = rs.getDouble(19);
                double lecture_units = rs.getDouble(20);
                double lab_units = rs.getDouble(21);
                double amount = rs.getDouble(22);
                int is_lab = rs.getInt(23);
                int max_students = rs.getInt(24);
                String prerequisite_subject_ids = rs.getString(25);
                String subject_group = rs.getString(26);
                int subject_group_id = rs.getInt(27);
                String created_at = rs.getString(28);
                String updated_at = rs.getString(29);
                String created_by = rs.getString(30);
                String updated_by = rs.getString(31);
                int status = rs.getInt(32);
                int is_uploaded = rs.getInt(33);
                int faculty_id = rs.getInt(34);
                String faculty_name = rs.getString(35);
                String room = rs.getString(36);
                String schedule = rs.getString(37);
                int room_id = rs.getInt(38);

                to_academic_offering_subjects to = new to_academic_offering_subjects(id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, created_at, updated_at, created_by, updated_by, status, is_uploaded, faculty_id, faculty_name, room, schedule, room_id);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_offering_subjects> ret_data_with_prerequisites(String where) {
        List<to_academic_offering_subjects> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_offering_id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",year_level"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
                    + ",prerequisite_subject_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",room"
                    + ",schedule"
                    + ",room_id"
                    + " from academic_offering_subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_offering_id = rs.getInt(2);
                int academic_year_id = rs.getInt(3);
                String academic_year = rs.getString(4);
                int level_id = rs.getInt(5);
                String level = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department = rs.getString(10);
                int course_id = rs.getInt(11);
                String course_code = rs.getString(12);
                String course_description = rs.getString(13);
                String term = rs.getString(14);
                String year_level = rs.getString(15);
                int subject_id = rs.getInt(16);
                String subject_code = rs.getString(17);
                String description = rs.getString(18);
                double units = rs.getDouble(19);
                double lecture_units = rs.getDouble(20);
                double lab_units = rs.getDouble(21);
                double amount = rs.getDouble(22);
                int is_lab = rs.getInt(23);
                int max_students = rs.getInt(24);
                String prerequisite_subject_ids = rs.getString(25);
                String subject_group = rs.getString(26);
                int subject_group_id = rs.getInt(27);
                String created_at = rs.getString(28);
                String updated_at = rs.getString(29);
                String created_by = rs.getString(30);
                String updated_by = rs.getString(31);
                int status = rs.getInt(32);
                int is_uploaded = rs.getInt(33);
                int faculty_id = rs.getInt(34);
                String faculty_name = rs.getString(35);
                String room = rs.getString(36);
                String schedule = rs.getString(37);
                int room_id = rs.getInt(38);

                String s2 = "select "
                        + "id"
                        + ",main_subject_id"
                        + ",subject_code"
                        + ",description"
                        + ",lecture_units"
                        + ",lab_units"
                        + ",remarks"
                        + " from academic_offering_subject_prerequisites"
                        + " where academic_offering_id='" + academic_offering_id + "' and ref_subject_id='" + subject_id + "' ";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                String pres = "";

                while (rs2.next()) {
                    int id2 = rs2.getInt(1);
                    int subject_id2 = rs2.getInt(2);
                    String subject_code2 = rs2.getString(3);
//                    System.out.println("subject_code2:" +subject_code2);
                    String description2 = rs2.getString(4);
                    double lecture_units2 = rs2.getDouble(5);
                    double lab_units2 = rs2.getDouble(6);
                    String remarks = rs2.getString(7);
                    if (pres.isEmpty()) {
                        pres = subject_code2;
                    } else {
                        pres = pres + ", " + subject_code2;
                    }

                }

                to_academic_offering_subjects to = new to_academic_offering_subjects(id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, pres, subject_group, subject_group_id, created_at, updated_at, created_by, updated_by, status, is_uploaded, faculty_id, faculty_name, room, schedule, room_id);
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

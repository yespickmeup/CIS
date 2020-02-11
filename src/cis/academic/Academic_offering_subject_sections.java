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
public class Academic_offering_subject_sections {

    public static class to_academic_offering_subject_sections {

        public final int id;
        public final int academic_offering_subject_id;
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
        public final String section;
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
        public final int faculty_id;
        public final String faculty_name;
        public final int room_id;
        public final String room;
        public final String schedule;
        public final String start_date;
        public final String end_date;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_academic_offering_subject_sections(int id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, String section, int subject_id, String subject_code, String description, double units, double lecture_units, double lab_units, double amount, int is_lab, int max_students, String prerequisite_subject_ids, String subject_group, int subject_group_id, int faculty_id, String faculty_name, int room_id, String room, String schedule, String start_date, String end_date, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.academic_offering_subject_id = academic_offering_subject_id;
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
            this.section = section;
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
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
            this.room_id = room_id;
            this.room = room;
            this.schedule = schedule;
            this.start_date = start_date;
            this.end_date = end_date;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_academic_offering_subject_sections to_academic_offering_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_offering_subject_sections("
                    + "academic_offering_subject_id"
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
                    + ",section"
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
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",room_id"
                    + ",room"
                    + ",schedule"
                    + ",start_date"
                    + ",end_date"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":academic_offering_subject_id"
                    + ",:academic_offering_id"
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
                    + ",:section"
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
                    + ",:faculty_id"
                    + ",:faculty_name"
                    + ",:room_id"
                    + ",:room"
                    + ",:schedule"
                    + ",:start_date"
                    + ",:end_date"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_offering_subject_id", to_academic_offering_subject_sections.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_academic_offering_subject_sections.academic_offering_id)
                    .setNumber("academic_year_id", to_academic_offering_subject_sections.academic_year_id)
                    .setString("academic_year", to_academic_offering_subject_sections.academic_year)
                    .setNumber("level_id", to_academic_offering_subject_sections.level_id)
                    .setString("level", to_academic_offering_subject_sections.level)
                    .setNumber("college_id", to_academic_offering_subject_sections.college_id)
                    .setString("college", to_academic_offering_subject_sections.college)
                    .setNumber("department_id", to_academic_offering_subject_sections.department_id)
                    .setString("department", to_academic_offering_subject_sections.department)
                    .setNumber("course_id", to_academic_offering_subject_sections.course_id)
                    .setString("course_code", to_academic_offering_subject_sections.course_code)
                    .setString("course_description", to_academic_offering_subject_sections.course_description)
                    .setString("term", to_academic_offering_subject_sections.term)
                    .setString("year_level", to_academic_offering_subject_sections.year_level)
                    .setString("section", to_academic_offering_subject_sections.section)
                    .setNumber("subject_id", to_academic_offering_subject_sections.subject_id)
                    .setString("subject_code", to_academic_offering_subject_sections.subject_code)
                    .setString("description", to_academic_offering_subject_sections.description)
                    .setNumber("units", to_academic_offering_subject_sections.units)
                    .setNumber("lecture_units", to_academic_offering_subject_sections.lecture_units)
                    .setNumber("lab_units", to_academic_offering_subject_sections.lab_units)
                    .setNumber("amount", to_academic_offering_subject_sections.amount)
                    .setNumber("is_lab", to_academic_offering_subject_sections.is_lab)
                    .setNumber("max_students", to_academic_offering_subject_sections.max_students)
                    .setString("prerequisite_subject_ids", to_academic_offering_subject_sections.prerequisite_subject_ids)
                    .setString("subject_group", to_academic_offering_subject_sections.subject_group)
                    .setNumber("subject_group_id", to_academic_offering_subject_sections.subject_group_id)
                    .setNumber("faculty_id", to_academic_offering_subject_sections.faculty_id)
                    .setString("faculty_name", to_academic_offering_subject_sections.faculty_name)
                    .setNumber("room_id", to_academic_offering_subject_sections.room_id)
                    .setString("room", to_academic_offering_subject_sections.room)
                    .setString("schedule", to_academic_offering_subject_sections.schedule)
                    .setString("start_date", to_academic_offering_subject_sections.start_date)
                    .setString("end_date", to_academic_offering_subject_sections.end_date)
                    .setString("created_at", to_academic_offering_subject_sections.created_at)
                    .setString("updated_at", to_academic_offering_subject_sections.updated_at)
                    .setString("created_by", to_academic_offering_subject_sections.created_by)
                    .setString("updated_by", to_academic_offering_subject_sections.updated_by)
                    .setNumber("status", to_academic_offering_subject_sections.status)
                    .setNumber("is_uploaded", to_academic_offering_subject_sections.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_sections.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_offering_subject_sections to_academic_offering_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offering_subject_sections set "
                    + "academic_offering_subject_id= :academic_offering_subject_id "
                    + ",academic_offering_id= :academic_offering_id "
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
                    + ",section= :section "
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
                    + ",faculty_id= :faculty_id "
                    + ",faculty_name= :faculty_name "
                    + ",room_id= :room_id "
                    + ",room= :room "
                    + ",schedule= :schedule "
                    + ",start_date= :start_date "
                    + ",end_date= :end_date "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_academic_offering_subject_sections.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_offering_subject_id", to_academic_offering_subject_sections.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_academic_offering_subject_sections.academic_offering_id)
                    .setNumber("academic_year_id", to_academic_offering_subject_sections.academic_year_id)
                    .setString("academic_year", to_academic_offering_subject_sections.academic_year)
                    .setNumber("level_id", to_academic_offering_subject_sections.level_id)
                    .setString("level", to_academic_offering_subject_sections.level)
                    .setNumber("college_id", to_academic_offering_subject_sections.college_id)
                    .setString("college", to_academic_offering_subject_sections.college)
                    .setNumber("department_id", to_academic_offering_subject_sections.department_id)
                    .setString("department", to_academic_offering_subject_sections.department)
                    .setNumber("course_id", to_academic_offering_subject_sections.course_id)
                    .setString("course_code", to_academic_offering_subject_sections.course_code)
                    .setString("course_description", to_academic_offering_subject_sections.course_description)
                    .setString("term", to_academic_offering_subject_sections.term)
                    .setString("year_level", to_academic_offering_subject_sections.year_level)
                    .setString("section", to_academic_offering_subject_sections.section)
                    .setNumber("subject_id", to_academic_offering_subject_sections.subject_id)
                    .setString("subject_code", to_academic_offering_subject_sections.subject_code)
                    .setString("description", to_academic_offering_subject_sections.description)
                    .setNumber("units", to_academic_offering_subject_sections.units)
                    .setNumber("lecture_units", to_academic_offering_subject_sections.lecture_units)
                    .setNumber("lab_units", to_academic_offering_subject_sections.lab_units)
                    .setNumber("amount", to_academic_offering_subject_sections.amount)
                    .setNumber("is_lab", to_academic_offering_subject_sections.is_lab)
                    .setNumber("max_students", to_academic_offering_subject_sections.max_students)
                    .setString("prerequisite_subject_ids", to_academic_offering_subject_sections.prerequisite_subject_ids)
                    .setString("subject_group", to_academic_offering_subject_sections.subject_group)
                    .setNumber("subject_group_id", to_academic_offering_subject_sections.subject_group_id)
                    .setNumber("faculty_id", to_academic_offering_subject_sections.faculty_id)
                    .setString("faculty_name", to_academic_offering_subject_sections.faculty_name)
                    .setNumber("room_id", to_academic_offering_subject_sections.room_id)
                    .setString("room", to_academic_offering_subject_sections.room)
                    .setString("schedule", to_academic_offering_subject_sections.schedule)
                    .setString("start_date", to_academic_offering_subject_sections.start_date)
                    .setString("end_date", to_academic_offering_subject_sections.end_date)
                    .setString("created_at", to_academic_offering_subject_sections.created_at)
                    .setString("updated_at", to_academic_offering_subject_sections.updated_at)
                    .setString("created_by", to_academic_offering_subject_sections.created_by)
                    .setString("updated_by", to_academic_offering_subject_sections.updated_by)
                    .setNumber("status", to_academic_offering_subject_sections.status)
                    .setNumber("is_uploaded", to_academic_offering_subject_sections.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_sections.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_offering_subject_sections to_academic_offering_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_offering_subject_sections  "
                    + " where id='" + to_academic_offering_subject_sections.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_sections.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_offering_subject_sections> ret_data(String where) {
        List<to_academic_offering_subject_sections> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_offering_subject_id"
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
                    + ",section"
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
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",room_id"
                    + ",room"
                    + ",schedule"
                    + ",start_date"
                    + ",end_date"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from academic_offering_subject_sections"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_offering_subject_id = rs.getInt(2);
                int academic_offering_id = rs.getInt(3);
                int academic_year_id = rs.getInt(4);
                String academic_year = rs.getString(5);
                int level_id = rs.getInt(6);
                String level = rs.getString(7);
                int college_id = rs.getInt(8);
                String college = rs.getString(9);
                int department_id = rs.getInt(10);
                String department = rs.getString(11);
                int course_id = rs.getInt(12);
                String course_code = rs.getString(13);
                String course_description = rs.getString(14);
                String term = rs.getString(15);
                String year_level = rs.getString(16);
                String section = rs.getString(17);
                int subject_id = rs.getInt(18);
                String subject_code = rs.getString(19);
                String description = rs.getString(20);
                double units = rs.getDouble(21);
                double lecture_units = rs.getDouble(22);
                double lab_units = rs.getDouble(23);
                double amount = rs.getDouble(24);
                int is_lab = rs.getInt(25);
                int max_students = rs.getInt(26);
                String prerequisite_subject_ids = rs.getString(27);
                String subject_group = rs.getString(28);
                int subject_group_id = rs.getInt(29);
                int faculty_id = rs.getInt(30);
                String faculty_name = rs.getString(31);
                int room_id = rs.getInt(32);
                String room = rs.getString(33);
                String schedule = rs.getString(34);
                String start_date = rs.getString(35);
                String end_date = rs.getString(36);
                String created_at = rs.getString(37);
                String updated_at = rs.getString(38);
                String created_by = rs.getString(39);
                String updated_by = rs.getString(40);
                int status = rs.getInt(41);
                int is_uploaded = rs.getInt(42);

                to_academic_offering_subject_sections to = new to_academic_offering_subject_sections(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, section, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, start_date, end_date, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

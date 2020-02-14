/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

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
public class Enrollment_offered_subject_section_instructors {

    public static class to_enrollment_offered_subject_section_instructors {

        public final int id;
        public final int enrollment_offered_subject_section_id;
        public final int enrollment_offered_subject_id;
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
        public final int subject_id;
        public final String subject_code;
        public final String description;
        public final String faculty_id;
        public final String faculty_name;
        public final String section;
        public final int room_id;
        public final String room;
        public final String schedule;
        public final String day;
        public final String time;
        public final String start_time;
        public final String closing_time;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_enrollment_offered_subject_section_instructors(int id, int enrollment_offered_subject_section_id, int enrollment_offered_subject_id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, String faculty_id, String faculty_name, String section, int room_id, String room, String schedule, String day, String time, String start_time, String closing_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.enrollment_offered_subject_section_id = enrollment_offered_subject_section_id;
            this.enrollment_offered_subject_id = enrollment_offered_subject_id;
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
            this.subject_id = subject_id;
            this.subject_code = subject_code;
            this.description = description;
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
            this.section = section;
            this.room_id = room_id;
            this.room = room;
            this.schedule = schedule;
            this.day = day;
            this.time = time;
            this.start_time = start_time;
            this.closing_time = closing_time;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_enrollment_offered_subject_section_instructors to_enrollment_offered_subject_section_instructors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_offered_subject_section_instructors("
                    + "enrollment_offered_subject_section_id"
                    + ",enrollment_offered_subject_id"
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
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",section"
                    + ",room_id"
                    + ",room"
                    + ",schedule"
                    + ",day"
                    + ",time"
                    + ",start_time"
                    + ",closing_time"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":enrollment_offered_subject_section_id"
                    + ",:enrollment_offered_subject_id"
                    + ",:academic_offering_subject_id"
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
                    + ",:subject_id"
                    + ",:subject_code"
                    + ",:description"
                    + ",:faculty_id"
                    + ",:faculty_name"
                    + ",:section"
                    + ",:room_id"
                    + ",:room"
                    + ",:schedule"
                    + ",:day"
                    + ",:time"
                    + ",:start_time"
                    + ",:closing_time"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_offered_subject_section_instructors.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_section_instructors.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_section_instructors.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_offered_subject_section_instructors.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_offered_subject_section_instructors.academic_year_id)
                    .setString("academic_year", to_enrollment_offered_subject_section_instructors.academic_year)
                    .setNumber("level_id", to_enrollment_offered_subject_section_instructors.level_id)
                    .setString("level", to_enrollment_offered_subject_section_instructors.level)
                    .setNumber("college_id", to_enrollment_offered_subject_section_instructors.college_id)
                    .setString("college", to_enrollment_offered_subject_section_instructors.college)
                    .setNumber("department_id", to_enrollment_offered_subject_section_instructors.department_id)
                    .setString("department", to_enrollment_offered_subject_section_instructors.department)
                    .setNumber("course_id", to_enrollment_offered_subject_section_instructors.course_id)
                    .setString("course_code", to_enrollment_offered_subject_section_instructors.course_code)
                    .setString("course_description", to_enrollment_offered_subject_section_instructors.course_description)
                    .setString("term", to_enrollment_offered_subject_section_instructors.term)
                    .setString("year_level", to_enrollment_offered_subject_section_instructors.year_level)
                    .setNumber("subject_id", to_enrollment_offered_subject_section_instructors.subject_id)
                    .setString("subject_code", to_enrollment_offered_subject_section_instructors.subject_code)
                    .setString("description", to_enrollment_offered_subject_section_instructors.description)
                    .setString("faculty_id", to_enrollment_offered_subject_section_instructors.faculty_id)
                    .setString("faculty_name", to_enrollment_offered_subject_section_instructors.faculty_name)
                    .setString("section", to_enrollment_offered_subject_section_instructors.section)
                    .setNumber("room_id", to_enrollment_offered_subject_section_instructors.room_id)
                    .setString("room", to_enrollment_offered_subject_section_instructors.room)
                    .setString("schedule", to_enrollment_offered_subject_section_instructors.schedule)
                    .setString("day", to_enrollment_offered_subject_section_instructors.day)
                    .setString("time", to_enrollment_offered_subject_section_instructors.time)
                    .setString("start_time", to_enrollment_offered_subject_section_instructors.start_time)
                    .setString("closing_time", to_enrollment_offered_subject_section_instructors.closing_time)
                    .setString("created_at", to_enrollment_offered_subject_section_instructors.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_section_instructors.updated_at)
                    .setString("created_by", to_enrollment_offered_subject_section_instructors.created_by)
                    .setString("updated_by", to_enrollment_offered_subject_section_instructors.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_section_instructors.status)
                    .setNumber("is_uploaded", to_enrollment_offered_subject_section_instructors.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_instructors.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_offered_subject_section_instructors to_enrollment_offered_subject_section_instructors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_offered_subject_section_instructors set "
                    + "enrollment_offered_subject_section_id= :enrollment_offered_subject_section_id "
                    + ",enrollment_offered_subject_id= :enrollment_offered_subject_id "
                    + ",academic_offering_subject_id= :academic_offering_subject_id "
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
                    + ",subject_id= :subject_id "
                    + ",subject_code= :subject_code "
                    + ",description= :description "
                    + ",faculty_id= :faculty_id "
                    + ",faculty_name= :faculty_name "
                    + ",section= :section "
                    + ",room_id= :room_id "
                    + ",room= :room "
                    + ",schedule= :schedule "
                    + ",day= :day "
                    + ",time= :time "
                    + ",start_time= :start_time "
                    + ",closing_time= :closing_time "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_enrollment_offered_subject_section_instructors.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_offered_subject_section_instructors.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_section_instructors.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_section_instructors.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_offered_subject_section_instructors.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_offered_subject_section_instructors.academic_year_id)
                    .setString("academic_year", to_enrollment_offered_subject_section_instructors.academic_year)
                    .setNumber("level_id", to_enrollment_offered_subject_section_instructors.level_id)
                    .setString("level", to_enrollment_offered_subject_section_instructors.level)
                    .setNumber("college_id", to_enrollment_offered_subject_section_instructors.college_id)
                    .setString("college", to_enrollment_offered_subject_section_instructors.college)
                    .setNumber("department_id", to_enrollment_offered_subject_section_instructors.department_id)
                    .setString("department", to_enrollment_offered_subject_section_instructors.department)
                    .setNumber("course_id", to_enrollment_offered_subject_section_instructors.course_id)
                    .setString("course_code", to_enrollment_offered_subject_section_instructors.course_code)
                    .setString("course_description", to_enrollment_offered_subject_section_instructors.course_description)
                    .setString("term", to_enrollment_offered_subject_section_instructors.term)
                    .setString("year_level", to_enrollment_offered_subject_section_instructors.year_level)
                    .setNumber("subject_id", to_enrollment_offered_subject_section_instructors.subject_id)
                    .setString("subject_code", to_enrollment_offered_subject_section_instructors.subject_code)
                    .setString("description", to_enrollment_offered_subject_section_instructors.description)
                    .setString("faculty_id", to_enrollment_offered_subject_section_instructors.faculty_id)
                    .setString("faculty_name", to_enrollment_offered_subject_section_instructors.faculty_name)
                    .setString("section", to_enrollment_offered_subject_section_instructors.section)
                    .setNumber("room_id", to_enrollment_offered_subject_section_instructors.room_id)
                    .setString("room", to_enrollment_offered_subject_section_instructors.room)
                    .setString("schedule", to_enrollment_offered_subject_section_instructors.schedule)
                    .setString("day", to_enrollment_offered_subject_section_instructors.day)
                    .setString("time", to_enrollment_offered_subject_section_instructors.time)
                    .setString("start_time", to_enrollment_offered_subject_section_instructors.start_time)
                    .setString("closing_time", to_enrollment_offered_subject_section_instructors.closing_time)
                    .setString("created_at", to_enrollment_offered_subject_section_instructors.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_section_instructors.updated_at)
                    .setString("created_by", to_enrollment_offered_subject_section_instructors.created_by)
                    .setString("updated_by", to_enrollment_offered_subject_section_instructors.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_section_instructors.status)
                    .setNumber("is_uploaded", to_enrollment_offered_subject_section_instructors.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_instructors.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_offered_subject_section_instructors to_enrollment_offered_subject_section_instructors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_offered_subject_section_instructors  "
                    + " where id='" + to_enrollment_offered_subject_section_instructors.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_instructors.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_offered_subject_section_instructors> ret_data(String where) {
        List<to_enrollment_offered_subject_section_instructors> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_offered_subject_section_id"
                    + ",enrollment_offered_subject_id"
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
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",section"
                    + ",room_id"
                    + ",room"
                    + ",schedule"
                    + ",day"
                    + ",time"
                    + ",start_time"
                    + ",closing_time"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from enrollment_offered_subject_section_instructors"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_offered_subject_section_id = rs.getInt(2);
                int enrollment_offered_subject_id = rs.getInt(3);
                int academic_offering_subject_id = rs.getInt(4);
                int academic_offering_id = rs.getInt(5);
                int academic_year_id = rs.getInt(6);
                String academic_year = rs.getString(7);
                int level_id = rs.getInt(8);
                String level = rs.getString(9);
                int college_id = rs.getInt(10);
                String college = rs.getString(11);
                int department_id = rs.getInt(12);
                String department = rs.getString(13);
                int course_id = rs.getInt(14);
                String course_code = rs.getString(15);
                String course_description = rs.getString(16);
                String term = rs.getString(17);
                String year_level = rs.getString(18);
                int subject_id = rs.getInt(19);
                String subject_code = rs.getString(20);
                String description = rs.getString(21);
                String faculty_id = rs.getString(22);
                String faculty_name = rs.getString(23);
                String section = rs.getString(24);
                int room_id = rs.getInt(25);
                String room = rs.getString(26);
                String schedule = rs.getString(27);
                String day = rs.getString(28);
                String time = rs.getString(29);
                String start_time = rs.getString(30);
                String closing_time = rs.getString(31);
                String created_at = rs.getString(32);
                String updated_at = rs.getString(33);
                String created_by = rs.getString(34);
                String updated_by = rs.getString(35);
                int status = rs.getInt(36);
                int is_uploaded = rs.getInt(37);

                to_enrollment_offered_subject_section_instructors to = new to_enrollment_offered_subject_section_instructors(id, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

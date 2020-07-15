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
 * @author User
 */
public class Enrollment_student_loaded_subjects_drop_requests {

    public static class to_enrollment_student_loaded_subjects_drop_requests {

        public final int id;
        public final int enrollment_student_loaded_subject_id;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int student_id;
        public final String student_no;
        public final String fname;
        public final String mi;
        public final String lname;
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
        public final int lecture_units;
        public final int lab_units;
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

        public to_enrollment_student_loaded_subjects_drop_requests(int id, int enrollment_student_loaded_subject_id, int enrollment_id, String enrollment_no, int student_id, String student_no, String fname, String mi, String lname, int enrollment_offered_subject_section_id, int enrollment_offered_subject_id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, int lecture_units, int lab_units, String faculty_id, String faculty_name, String section, int room_id, String room, String schedule, String day, String time, String start_time, String closing_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.enrollment_student_loaded_subject_id = enrollment_student_loaded_subject_id;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.student_id = student_id;
            this.student_no = student_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
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
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
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

    public static void add_data(to_enrollment_student_loaded_subjects_drop_requests to_enrollment_student_loaded_subjects_drop_requests) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_student_loaded_subjects_drop_requests("
                    + "enrollment_student_loaded_subject_id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
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
                    + ",lecture_units"
                    + ",lab_units"
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
                    + ":enrollment_student_loaded_subject_id"
                    + ",:enrollment_id"
                    + ",:enrollment_no"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:enrollment_offered_subject_section_id"
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
                    + ",:lecture_units"
                    + ",:lab_units"
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
                    .setNumber("enrollment_student_loaded_subject_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_student_loaded_subject_id)
                    .setNumber("enrollment_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_id)
                    .setString("enrollment_no", to_enrollment_student_loaded_subjects_drop_requests.enrollment_no)
                    .setNumber("student_id", to_enrollment_student_loaded_subjects_drop_requests.student_id)
                    .setString("student_no", to_enrollment_student_loaded_subjects_drop_requests.student_no)
                    .setString("fname", to_enrollment_student_loaded_subjects_drop_requests.fname)
                    .setString("mi", to_enrollment_student_loaded_subjects_drop_requests.mi)
                    .setString("lname", to_enrollment_student_loaded_subjects_drop_requests.lname)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects_drop_requests.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects_drop_requests.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_student_loaded_subjects_drop_requests.academic_year_id)
                    .setString("academic_year", to_enrollment_student_loaded_subjects_drop_requests.academic_year)
                    .setNumber("level_id", to_enrollment_student_loaded_subjects_drop_requests.level_id)
                    .setString("level", to_enrollment_student_loaded_subjects_drop_requests.level)
                    .setNumber("college_id", to_enrollment_student_loaded_subjects_drop_requests.college_id)
                    .setString("college", to_enrollment_student_loaded_subjects_drop_requests.college)
                    .setNumber("department_id", to_enrollment_student_loaded_subjects_drop_requests.department_id)
                    .setString("department", to_enrollment_student_loaded_subjects_drop_requests.department)
                    .setNumber("course_id", to_enrollment_student_loaded_subjects_drop_requests.course_id)
                    .setString("course_code", to_enrollment_student_loaded_subjects_drop_requests.course_code)
                    .setString("course_description", to_enrollment_student_loaded_subjects_drop_requests.course_description)
                    .setString("term", to_enrollment_student_loaded_subjects_drop_requests.term)
                    .setString("year_level", to_enrollment_student_loaded_subjects_drop_requests.year_level)
                    .setNumber("subject_id", to_enrollment_student_loaded_subjects_drop_requests.subject_id)
                    .setString("subject_code", to_enrollment_student_loaded_subjects_drop_requests.subject_code)
                    .setString("description", to_enrollment_student_loaded_subjects_drop_requests.description)
                    .setNumber("lecture_units", to_enrollment_student_loaded_subjects_drop_requests.lecture_units)
                    .setNumber("lab_units", to_enrollment_student_loaded_subjects_drop_requests.lab_units)
                    .setString("faculty_id", to_enrollment_student_loaded_subjects_drop_requests.faculty_id)
                    .setString("faculty_name", to_enrollment_student_loaded_subjects_drop_requests.faculty_name)
                    .setString("section", to_enrollment_student_loaded_subjects_drop_requests.section)
                    .setNumber("room_id", to_enrollment_student_loaded_subjects_drop_requests.room_id)
                    .setString("room", to_enrollment_student_loaded_subjects_drop_requests.room)
                    .setString("schedule", to_enrollment_student_loaded_subjects_drop_requests.schedule)
                    .setString("day", to_enrollment_student_loaded_subjects_drop_requests.day)
                    .setString("time", to_enrollment_student_loaded_subjects_drop_requests.time)
                    .setString("start_time", to_enrollment_student_loaded_subjects_drop_requests.start_time)
                    .setString("closing_time", to_enrollment_student_loaded_subjects_drop_requests.closing_time)
                    .setString("created_at", to_enrollment_student_loaded_subjects_drop_requests.created_at)
                    .setString("updated_at", to_enrollment_student_loaded_subjects_drop_requests.updated_at)
                    .setString("created_by", to_enrollment_student_loaded_subjects_drop_requests.created_by)
                    .setString("updated_by", to_enrollment_student_loaded_subjects_drop_requests.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subjects_drop_requests.status)
                    .setNumber("is_uploaded", to_enrollment_student_loaded_subjects_drop_requests.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects_drop_requests.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_student_loaded_subjects_drop_requests to_enrollment_student_loaded_subjects_drop_requests) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_student_loaded_subjects_drop_requests set "
                    + "enrollment_student_loaded_subject_id= :enrollment_student_loaded_subject_id "
                    + ",enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",enrollment_offered_subject_section_id= :enrollment_offered_subject_section_id "
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
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
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
                    + " where id='" + to_enrollment_student_loaded_subjects_drop_requests.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_student_loaded_subject_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_student_loaded_subject_id)
                    .setNumber("enrollment_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_id)
                    .setString("enrollment_no", to_enrollment_student_loaded_subjects_drop_requests.enrollment_no)
                    .setNumber("student_id", to_enrollment_student_loaded_subjects_drop_requests.student_id)
                    .setString("student_no", to_enrollment_student_loaded_subjects_drop_requests.student_no)
                    .setString("fname", to_enrollment_student_loaded_subjects_drop_requests.fname)
                    .setString("mi", to_enrollment_student_loaded_subjects_drop_requests.mi)
                    .setString("lname", to_enrollment_student_loaded_subjects_drop_requests.lname)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects_drop_requests.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects_drop_requests.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects_drop_requests.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_student_loaded_subjects_drop_requests.academic_year_id)
                    .setString("academic_year", to_enrollment_student_loaded_subjects_drop_requests.academic_year)
                    .setNumber("level_id", to_enrollment_student_loaded_subjects_drop_requests.level_id)
                    .setString("level", to_enrollment_student_loaded_subjects_drop_requests.level)
                    .setNumber("college_id", to_enrollment_student_loaded_subjects_drop_requests.college_id)
                    .setString("college", to_enrollment_student_loaded_subjects_drop_requests.college)
                    .setNumber("department_id", to_enrollment_student_loaded_subjects_drop_requests.department_id)
                    .setString("department", to_enrollment_student_loaded_subjects_drop_requests.department)
                    .setNumber("course_id", to_enrollment_student_loaded_subjects_drop_requests.course_id)
                    .setString("course_code", to_enrollment_student_loaded_subjects_drop_requests.course_code)
                    .setString("course_description", to_enrollment_student_loaded_subjects_drop_requests.course_description)
                    .setString("term", to_enrollment_student_loaded_subjects_drop_requests.term)
                    .setString("year_level", to_enrollment_student_loaded_subjects_drop_requests.year_level)
                    .setNumber("subject_id", to_enrollment_student_loaded_subjects_drop_requests.subject_id)
                    .setString("subject_code", to_enrollment_student_loaded_subjects_drop_requests.subject_code)
                    .setString("description", to_enrollment_student_loaded_subjects_drop_requests.description)
                    .setNumber("lecture_units", to_enrollment_student_loaded_subjects_drop_requests.lecture_units)
                    .setNumber("lab_units", to_enrollment_student_loaded_subjects_drop_requests.lab_units)
                    .setString("faculty_id", to_enrollment_student_loaded_subjects_drop_requests.faculty_id)
                    .setString("faculty_name", to_enrollment_student_loaded_subjects_drop_requests.faculty_name)
                    .setString("section", to_enrollment_student_loaded_subjects_drop_requests.section)
                    .setNumber("room_id", to_enrollment_student_loaded_subjects_drop_requests.room_id)
                    .setString("room", to_enrollment_student_loaded_subjects_drop_requests.room)
                    .setString("schedule", to_enrollment_student_loaded_subjects_drop_requests.schedule)
                    .setString("day", to_enrollment_student_loaded_subjects_drop_requests.day)
                    .setString("time", to_enrollment_student_loaded_subjects_drop_requests.time)
                    .setString("start_time", to_enrollment_student_loaded_subjects_drop_requests.start_time)
                    .setString("closing_time", to_enrollment_student_loaded_subjects_drop_requests.closing_time)
                    .setString("created_at", to_enrollment_student_loaded_subjects_drop_requests.created_at)
                    .setString("updated_at", to_enrollment_student_loaded_subjects_drop_requests.updated_at)
                    .setString("created_by", to_enrollment_student_loaded_subjects_drop_requests.created_by)
                    .setString("updated_by", to_enrollment_student_loaded_subjects_drop_requests.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subjects_drop_requests.status)
                    .setNumber("is_uploaded", to_enrollment_student_loaded_subjects_drop_requests.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects_drop_requests.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_student_loaded_subjects_drop_requests to_enrollment_student_loaded_subjects_drop_requests) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subjects_drop_requests  "
                    + " where id='" + to_enrollment_student_loaded_subjects_drop_requests.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects_drop_requests.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data2(int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subjects_drop_requests  "
                    + " where id='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects_drop_requests.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void approve_data(int id, int sls_id) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "update  enrollment_student_loaded_subjects_drop_requests  set status=1 "
                    + " where id='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            String s2 = "update  enrollment_student_loaded_subjects  set status=4 "
                    + " where id='" + sls_id + "' "
                    + " ";

            stmt.addBatch(s2);
            stmt.executeBatch();
            conn.commit();
            Lg.s(Enrollment_student_loaded_subjects_drop_requests.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_student_loaded_subjects_drop_requests> ret_data(String where) {
        List<to_enrollment_student_loaded_subjects_drop_requests> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_student_loaded_subject_id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
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
                    + ",lecture_units"
                    + ",lab_units"
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
                    + " from enrollment_student_loaded_subjects_drop_requests"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_student_loaded_subject_id = rs.getInt(2);
                int enrollment_id = rs.getInt(3);
                String enrollment_no = rs.getString(4);
                int student_id = rs.getInt(5);
                String student_no = rs.getString(6);
                String fname = rs.getString(7);
                String mi = rs.getString(8);
                String lname = rs.getString(9);
                int enrollment_offered_subject_section_id = rs.getInt(10);
                int enrollment_offered_subject_id = rs.getInt(11);
                int academic_offering_subject_id = rs.getInt(12);
                int academic_offering_id = rs.getInt(13);
                int academic_year_id = rs.getInt(14);
                String academic_year = rs.getString(15);
                int level_id = rs.getInt(16);
                String level = rs.getString(17);
                int college_id = rs.getInt(18);
                String college = rs.getString(19);
                int department_id = rs.getInt(20);
                String department = rs.getString(21);
                int course_id = rs.getInt(22);
                String course_code = rs.getString(23);
                String course_description = rs.getString(24);
                String term = rs.getString(25);
                String year_level = rs.getString(26);
                int subject_id = rs.getInt(27);
                String subject_code = rs.getString(28);
                String description = rs.getString(29);
                int lecture_units = rs.getInt(30);
                int lab_units = rs.getInt(31);
                String faculty_id = rs.getString(32);
                String faculty_name = rs.getString(33);
                String section = rs.getString(34);
                int room_id = rs.getInt(35);
                String room = rs.getString(36);
                String schedule = rs.getString(37);
                String day = rs.getString(38);
                String time = rs.getString(39);
                String start_time = rs.getString(40);
                String closing_time = rs.getString(41);
                String created_at = rs.getString(42);
                String updated_at = rs.getString(43);
                String created_by = rs.getString(44);
                String updated_by = rs.getString(45);
                int status = rs.getInt(46);
                int is_uploaded = rs.getInt(47);

                to_enrollment_student_loaded_subjects_drop_requests to = new to_enrollment_student_loaded_subjects_drop_requests(id, enrollment_student_loaded_subject_id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

import cis.reports.Srpt_list_of_students;
import cis.reports.Srpt_list_of_students_with_subjects;
import cis.utils.DateType;
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
public class Enrollment_student_loaded_subjects {

    public static class to_enrollment_student_loaded_subjects {

        public final int id;
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
        public final int is_added;
        public final double final_grade;
        public final String final_grade_remarks;
        public final String final_grade_created_at;
        public final String final_grade_created_by;
        
        public to_enrollment_student_loaded_subjects(int id, int enrollment_id, String enrollment_no, int student_id, String student_no, String fname, String mi, String lname, int enrollment_offered_subject_section_id, int enrollment_offered_subject_id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, int lecture_units, int lab_units, String faculty_id, String faculty_name, String section, int room_id, String room, String schedule, String day, String time, String start_time, String closing_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int is_added, double final_grade, String final_grade_remarks, String final_grade_created_at, String final_grade_created_by) {
            this.id = id;
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
            this.is_added = is_added;
            this.final_grade = final_grade;
            this.final_grade_remarks = final_grade_remarks;
            this.final_grade_created_at = final_grade_created_at;
            this.final_grade_created_by = final_grade_created_by;
        }
    }

    public static void add_data(to_enrollment_student_loaded_subjects to_enrollment_student_loaded_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_student_loaded_subjects("
                    + "enrollment_id"
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
                    + ",is_added"
                    + ")values("
                    + ":enrollment_id"
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
                    + ",:is_added"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_student_loaded_subjects.enrollment_id)
                    .setString("enrollment_no", to_enrollment_student_loaded_subjects.enrollment_no)
                    .setNumber("student_id", to_enrollment_student_loaded_subjects.student_id)
                    .setString("student_no", to_enrollment_student_loaded_subjects.student_no)
                    .setString("fname", to_enrollment_student_loaded_subjects.fname)
                    .setString("mi", to_enrollment_student_loaded_subjects.mi)
                    .setString("lname", to_enrollment_student_loaded_subjects.lname)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_student_loaded_subjects.academic_year_id)
                    .setString("academic_year", to_enrollment_student_loaded_subjects.academic_year)
                    .setNumber("level_id", to_enrollment_student_loaded_subjects.level_id)
                    .setString("level", to_enrollment_student_loaded_subjects.level)
                    .setNumber("college_id", to_enrollment_student_loaded_subjects.college_id)
                    .setString("college", to_enrollment_student_loaded_subjects.college)
                    .setNumber("department_id", to_enrollment_student_loaded_subjects.department_id)
                    .setString("department", to_enrollment_student_loaded_subjects.department)
                    .setNumber("course_id", to_enrollment_student_loaded_subjects.course_id)
                    .setString("course_code", to_enrollment_student_loaded_subjects.course_code)
                    .setString("course_description", to_enrollment_student_loaded_subjects.course_description)
                    .setString("term", to_enrollment_student_loaded_subjects.term)
                    .setString("year_level", to_enrollment_student_loaded_subjects.year_level)
                    .setNumber("subject_id", to_enrollment_student_loaded_subjects.subject_id)
                    .setString("subject_code", to_enrollment_student_loaded_subjects.subject_code)
                    .setString("description", to_enrollment_student_loaded_subjects.description)
                    .setNumber("lecture_units", to_enrollment_student_loaded_subjects.lecture_units)
                    .setNumber("lab_units", to_enrollment_student_loaded_subjects.lab_units)
                    .setString("faculty_id", to_enrollment_student_loaded_subjects.faculty_id)
                    .setString("faculty_name", to_enrollment_student_loaded_subjects.faculty_name)
                    .setString("section", to_enrollment_student_loaded_subjects.section)
                    .setNumber("room_id", to_enrollment_student_loaded_subjects.room_id)
                    .setString("room", to_enrollment_student_loaded_subjects.room)
                    .setString("schedule", to_enrollment_student_loaded_subjects.schedule)
                    .setString("day", to_enrollment_student_loaded_subjects.day)
                    .setString("time", to_enrollment_student_loaded_subjects.time)
                    .setString("start_time", to_enrollment_student_loaded_subjects.start_time)
                    .setString("closing_time", to_enrollment_student_loaded_subjects.closing_time)
                    .setString("created_at", to_enrollment_student_loaded_subjects.created_at)
                    .setString("updated_at", to_enrollment_student_loaded_subjects.updated_at)
                    .setString("created_by", to_enrollment_student_loaded_subjects.created_by)
                    .setString("updated_by", to_enrollment_student_loaded_subjects.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subjects.status)
                    .setNumber("is_uploaded", to_enrollment_student_loaded_subjects.is_uploaded)
                    .setNumber("is_added", to_enrollment_student_loaded_subjects.is_added)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data_all(List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> to_enrollment_student_loaded_subjects1
    ,int enrollment_id,String enrollment_no,int student_id,String student_no,String fname,String mi,String lname) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            for (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections to_enrollment_student_loaded_subjects : to_enrollment_student_loaded_subjects1) {
                String s0 = "insert into enrollment_student_loaded_subjects("
                        + "enrollment_id"
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
                        + ":enrollment_id"
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
                        .setNumber("enrollment_id", enrollment_id)
                        .setString("enrollment_no", enrollment_no)
                        .setNumber("student_id", student_id)
                        .setString("student_no",student_no)
                        .setString("fname", fname)
                        .setString("mi", mi)
                        .setString("lname", lname)
                        .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects.id)
                        .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_id)
                        .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects.academic_offering_subject_id)
                        .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects.academic_offering_id)
                        .setNumber("academic_year_id", to_enrollment_student_loaded_subjects.academic_year_id)
                        .setString("academic_year", to_enrollment_student_loaded_subjects.academic_year)
                        .setNumber("level_id", to_enrollment_student_loaded_subjects.level_id)
                        .setString("level", to_enrollment_student_loaded_subjects.level)
                        .setNumber("college_id", to_enrollment_student_loaded_subjects.college_id)
                        .setString("college", to_enrollment_student_loaded_subjects.college)
                        .setNumber("department_id", to_enrollment_student_loaded_subjects.department_id)
                        .setString("department", to_enrollment_student_loaded_subjects.department)
                        .setNumber("course_id", to_enrollment_student_loaded_subjects.course_id)
                        .setString("course_code", to_enrollment_student_loaded_subjects.course_code)
                        .setString("course_description", to_enrollment_student_loaded_subjects.course_description)
                        .setString("term", to_enrollment_student_loaded_subjects.term)
                        .setString("year_level", to_enrollment_student_loaded_subjects.year_level)
                        .setNumber("subject_id", to_enrollment_student_loaded_subjects.subject_id)
                        .setString("subject_code", to_enrollment_student_loaded_subjects.subject_code)
                        .setString("description", to_enrollment_student_loaded_subjects.description)
                        .setNumber("lecture_units", to_enrollment_student_loaded_subjects.lecture_units)
                        .setNumber("lab_units", to_enrollment_student_loaded_subjects.lab_units)
                        .setString("faculty_id", to_enrollment_student_loaded_subjects.faculty_id)
                        .setString("faculty_name", to_enrollment_student_loaded_subjects.faculty_name)
                        .setString("section", to_enrollment_student_loaded_subjects.section)
                        .setNumber("room_id", to_enrollment_student_loaded_subjects.room_id)
                        .setString("room", to_enrollment_student_loaded_subjects.room)
                        .setString("schedule", to_enrollment_student_loaded_subjects.schedule)
                        .setString("day", to_enrollment_student_loaded_subjects.day)
                        .setString("time", to_enrollment_student_loaded_subjects.time)
                        .setString("start_time", to_enrollment_student_loaded_subjects.start_time)
                        .setString("closing_time", to_enrollment_student_loaded_subjects.closing_time)
                        .setString("created_at", to_enrollment_student_loaded_subjects.created_at)
                        .setString("updated_at", to_enrollment_student_loaded_subjects.updated_at)
                        .setString("created_by", to_enrollment_student_loaded_subjects.created_by)
                        .setString("updated_by", to_enrollment_student_loaded_subjects.updated_by)
                        .setNumber("status", 0)
                        .setNumber("is_uploaded", to_enrollment_student_loaded_subjects.is_uploaded)
                        .ok();
                stmt.addBatch(s0);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_student_loaded_subjects to_enrollment_student_loaded_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_student_loaded_subjects set "
                    + "enrollment_id= :enrollment_id "
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
                    + " where id='" + to_enrollment_student_loaded_subjects.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_student_loaded_subjects.enrollment_id)
                    .setString("enrollment_no", to_enrollment_student_loaded_subjects.enrollment_no)
                    .setNumber("student_id", to_enrollment_student_loaded_subjects.student_id)
                    .setString("student_no", to_enrollment_student_loaded_subjects.student_no)
                    .setString("fname", to_enrollment_student_loaded_subjects.fname)
                    .setString("mi", to_enrollment_student_loaded_subjects.mi)
                    .setString("lname", to_enrollment_student_loaded_subjects.lname)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_student_loaded_subjects.academic_year_id)
                    .setString("academic_year", to_enrollment_student_loaded_subjects.academic_year)
                    .setNumber("level_id", to_enrollment_student_loaded_subjects.level_id)
                    .setString("level", to_enrollment_student_loaded_subjects.level)
                    .setNumber("college_id", to_enrollment_student_loaded_subjects.college_id)
                    .setString("college", to_enrollment_student_loaded_subjects.college)
                    .setNumber("department_id", to_enrollment_student_loaded_subjects.department_id)
                    .setString("department", to_enrollment_student_loaded_subjects.department)
                    .setNumber("course_id", to_enrollment_student_loaded_subjects.course_id)
                    .setString("course_code", to_enrollment_student_loaded_subjects.course_code)
                    .setString("course_description", to_enrollment_student_loaded_subjects.course_description)
                    .setString("term", to_enrollment_student_loaded_subjects.term)
                    .setString("year_level", to_enrollment_student_loaded_subjects.year_level)
                    .setNumber("subject_id", to_enrollment_student_loaded_subjects.subject_id)
                    .setString("subject_code", to_enrollment_student_loaded_subjects.subject_code)
                    .setString("description", to_enrollment_student_loaded_subjects.description)
                    .setNumber("lecture_units", to_enrollment_student_loaded_subjects.lecture_units)
                    .setNumber("lab_units", to_enrollment_student_loaded_subjects.lab_units)
                    .setString("faculty_id", to_enrollment_student_loaded_subjects.faculty_id)
                    .setString("faculty_name", to_enrollment_student_loaded_subjects.faculty_name)
                    .setString("section", to_enrollment_student_loaded_subjects.section)
                    .setNumber("room_id", to_enrollment_student_loaded_subjects.room_id)
                    .setString("room", to_enrollment_student_loaded_subjects.room)
                    .setString("schedule", to_enrollment_student_loaded_subjects.schedule)
                    .setString("day", to_enrollment_student_loaded_subjects.day)
                    .setString("time", to_enrollment_student_loaded_subjects.time)
                    .setString("start_time", to_enrollment_student_loaded_subjects.start_time)
                    .setString("closing_time", to_enrollment_student_loaded_subjects.closing_time)
                    .setString("created_at", to_enrollment_student_loaded_subjects.created_at)
                    .setString("updated_at", to_enrollment_student_loaded_subjects.updated_at)
                    .setString("created_by", to_enrollment_student_loaded_subjects.created_by)
                    .setString("updated_by", to_enrollment_student_loaded_subjects.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subjects.status)
                    .setNumber("is_uploaded", to_enrollment_student_loaded_subjects.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_student_loaded_subjects to_enrollment_student_loaded_subjects) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subjects  "
                    + " where id='" + to_enrollment_student_loaded_subjects.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data2(int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subjects  "
                    + " where id='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void approve_subject(int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_student_loaded_subjects  set status=1 "
                    + " where id='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subjects.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_student_loaded_subjects> ret_data(String where) {
        List<to_enrollment_student_loaded_subjects> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + ",is_added"
                    + ",final_grade"
                    + ",final_grade_remarks"
                    + ",final_grade_created_at"
                    + ",final_grade_created_by"
                    + " from enrollment_student_loaded_subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_id = rs.getInt(2);
                String enrollment_no = rs.getString(3);
                int student_id = rs.getInt(4);
                String student_no = rs.getString(5);
                String fname = rs.getString(6);
                String mi = rs.getString(7);
                String lname = rs.getString(8);
                int enrollment_offered_subject_section_id = rs.getInt(9);
                int enrollment_offered_subject_id = rs.getInt(10);
                int academic_offering_subject_id = rs.getInt(11);
                int academic_offering_id = rs.getInt(12);
                int academic_year_id = rs.getInt(13);
                String academic_year = rs.getString(14);
                int level_id = rs.getInt(15);
                String level = rs.getString(16);
                int college_id = rs.getInt(17);
                String college = rs.getString(18);
                int department_id = rs.getInt(19);
                String department = rs.getString(20);
                int course_id = rs.getInt(21);
                String course_code = rs.getString(22);
                String course_description = rs.getString(23);
                String term = rs.getString(24);
                String year_level = rs.getString(25);
                int subject_id = rs.getInt(26);
                String subject_code = rs.getString(27);
                String description = rs.getString(28);
                int lecture_units = rs.getInt(29);
                int lab_units = rs.getInt(30);
                String faculty_id = rs.getString(31);
                String faculty_name = rs.getString(32);
                String section = rs.getString(33);
                int room_id = rs.getInt(34);
                String room = rs.getString(35);
                String schedule = rs.getString(36);
                String day = rs.getString(37);
                String time = rs.getString(38);
                String start_time = rs.getString(39);
                String closing_time = rs.getString(40);
                String created_at = rs.getString(41);
                String updated_at = rs.getString(42);
                String created_by = rs.getString(43);
                String updated_by = rs.getString(44);
                int status = rs.getInt(45);
                int is_uploaded = rs.getInt(46);
                int is_added = rs.getInt(47);
                double final_grade = rs.getDouble(48);
                String final_grade_remarks = rs.getString(49);
                String final_grade_created_at = rs.getString(50);
                String final_grade_created_by = rs.getString(51);

                to_enrollment_student_loaded_subjects to = new to_enrollment_student_loaded_subjects(id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, is_added, final_grade, final_grade_remarks, final_grade_created_at, final_grade_created_by);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_student_loaded_subjects> ret_data2(String where) {
        List<to_enrollment_student_loaded_subjects> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + ",is_added"
                    + ",final_grade"
                    + ",final_grade_remarks"
                    + ",final_grade_created_at"
                    + ",final_grade_created_by"
                    + " from enrollment_student_loaded_subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_id = rs.getInt(2);
                String enrollment_no = rs.getString(3);
                int student_id = rs.getInt(4);
                String student_no = rs.getString(5);
                String fname = rs.getString(6);
                String mi = rs.getString(7);
                String lname = rs.getString(8);
                int enrollment_offered_subject_section_id = rs.getInt(9);
                int enrollment_offered_subject_id = rs.getInt(10);
                int academic_offering_subject_id = rs.getInt(11);
                int academic_offering_id = rs.getInt(12);
                int academic_year_id = rs.getInt(13);
                String academic_year = rs.getString(14);
                int level_id = rs.getInt(15);
                String level = rs.getString(16);
                int college_id = rs.getInt(17);
                String college = rs.getString(18);
                int department_id = rs.getInt(19);
                String department = rs.getString(20);
                int course_id = rs.getInt(21);
                String course_code = rs.getString(22);
                String course_description = rs.getString(23);
                String term = rs.getString(24);
                String year_level = rs.getString(25);
                int subject_id = rs.getInt(26);
                String subject_code = rs.getString(27);
                String description = rs.getString(28);
                int lecture_units = rs.getInt(29);
                int lab_units = rs.getInt(30);
                String faculty_id = rs.getString(31);
                String faculty_name = rs.getString(32);
                String section = rs.getString(33);
                int room_id = rs.getInt(34);
                String room = rs.getString(35);
                String schedule = rs.getString(36);
                String day = rs.getString(37);
                String time = rs.getString(38);
                String start_time = rs.getString(39);
                String closing_time = rs.getString(40);
                String created_at = rs.getString(41);
                String updated_at = rs.getString(42);
                String created_by = rs.getString(43);
                String updated_by = rs.getString(44);
                int status = rs.getInt(45);
                int is_uploaded = rs.getInt(46);
                int is_added = rs.getInt(47);
                day = DateType.mwf(day);
                double final_grade = rs.getDouble(48);
                String final_grade_remarks = rs.getString(49);
                String final_grade_created_at = rs.getString(50);
                String final_grade_created_by = rs.getString(51);
                to_enrollment_student_loaded_subjects to = new to_enrollment_student_loaded_subjects(id, enrollment_id, enrollment_no, student_id, student_no, fname, mi, lname, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, lecture_units, lab_units, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, is_added, final_grade, final_grade_remarks, final_grade_created_at, final_grade_created_by);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void ret_total_units(List<Srpt_list_of_students.field> fields) {

        try {
            Connection conn = MyConnection.connect();
            for (Srpt_list_of_students.field field : fields) {
                String s0 = "select "
                        + "id"
                        + ",sum(lecture_units+lab_units)"
                        + " from enrollment_student_loaded_subjects"
                        + " where enrollment_id='" + field.getEnrollment_id() + "' ";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(s0);
                double total_units = 0;
                while (rs.next()) {
                    int id = rs.getInt(1);
                    total_units += rs.getInt(2);
                }
                field.setNo_of_units(total_units);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Srpt_list_of_students_with_subjects.field> ret_subjects(List<Srpt_list_of_students.field> fields) {

        List<Srpt_list_of_students_with_subjects.field> list = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            for (Srpt_list_of_students.field field : fields) {
                String s0 = "select "
                        + "id"
                        + ",subject_id"
                        + ",subject_code"
                        + ",description"
                        + ",lecture_units"
                        + ",lab_units"
                        + " from enrollment_student_loaded_subjects"
                        + " where enrollment_id='" + field.getEnrollment_id() + "' ";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(s0);
                int i = 1;
                while (rs.next()) {
                    int id = rs.getInt(1);
                    int subject_id = rs.getInt(2);
                    String subject_code = rs.getString(3);
                    String description = rs.getString(4);
                    int lecture_units = rs.getInt(5);
                    int lab_units = rs.getInt(6);

                    String name = field.getName();
                    String course = field.getCourse();
                    double no_of_units = 0;

                    int no = i;

                    double lec_units = lecture_units;

                    Srpt_list_of_students_with_subjects.field f = new Srpt_list_of_students_with_subjects.field(field.getEnrollment_id(), field.getStudent_no(), name, course, no, subject_code, description, lec_units, lab_units);
                    list.add(f);
                    i++;
                }

            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

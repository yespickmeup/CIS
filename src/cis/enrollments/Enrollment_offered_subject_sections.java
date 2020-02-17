/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

import cis.utils.DateType;
import cis.utils.MyConnection;
import cis.utils.ReGroup;
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
public class Enrollment_offered_subject_sections {

    public static class to_enrollment_offered_subject_sections {

        public final int id;
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
        public final double units;
        public final double lecture_units;
        public final double lab_units;
        public final double amount;
        public final int is_lab;
        public final int max_students;
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

        public to_enrollment_offered_subject_sections(int id, int enrollment_offered_subject_id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, double units, double lecture_units, double lab_units, double amount, int is_lab, int max_students, String faculty_id, String faculty_name, String section, int room_id, String room, String schedule, String day, String time, String start_time, String closing_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
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
            this.units = units;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.amount = amount;
            this.is_lab = is_lab;
            this.max_students = max_students;
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

    public static void add_data(to_enrollment_offered_subject_sections to_enrollment_offered_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_offered_subject_sections("
                    + "enrollment_offered_subject_id"
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
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
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
                    + ":enrollment_offered_subject_id"
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
                    + ",:units"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:amount"
                    + ",:is_lab"
                    + ",:max_students"
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
                    .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_sections.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_sections.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_offered_subject_sections.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_offered_subject_sections.academic_year_id)
                    .setString("academic_year", to_enrollment_offered_subject_sections.academic_year)
                    .setNumber("level_id", to_enrollment_offered_subject_sections.level_id)
                    .setString("level", to_enrollment_offered_subject_sections.level)
                    .setNumber("college_id", to_enrollment_offered_subject_sections.college_id)
                    .setString("college", to_enrollment_offered_subject_sections.college)
                    .setNumber("department_id", to_enrollment_offered_subject_sections.department_id)
                    .setString("department", to_enrollment_offered_subject_sections.department)
                    .setNumber("course_id", to_enrollment_offered_subject_sections.course_id)
                    .setString("course_code", to_enrollment_offered_subject_sections.course_code)
                    .setString("course_description", to_enrollment_offered_subject_sections.course_description)
                    .setString("term", to_enrollment_offered_subject_sections.term)
                    .setString("year_level", to_enrollment_offered_subject_sections.year_level)
                    .setNumber("subject_id", to_enrollment_offered_subject_sections.subject_id)
                    .setString("subject_code", to_enrollment_offered_subject_sections.subject_code)
                    .setString("description", to_enrollment_offered_subject_sections.description)
                    .setNumber("units", to_enrollment_offered_subject_sections.units)
                    .setNumber("lecture_units", to_enrollment_offered_subject_sections.lecture_units)
                    .setNumber("lab_units", to_enrollment_offered_subject_sections.lab_units)
                    .setNumber("amount", to_enrollment_offered_subject_sections.amount)
                    .setNumber("is_lab", to_enrollment_offered_subject_sections.is_lab)
                    .setNumber("max_students", to_enrollment_offered_subject_sections.max_students)
                    .setString("faculty_id", to_enrollment_offered_subject_sections.faculty_id)
                    .setString("faculty_name", to_enrollment_offered_subject_sections.faculty_name)
                    .setString("section", to_enrollment_offered_subject_sections.section)
                    .setNumber("room_id", to_enrollment_offered_subject_sections.room_id)
                    .setString("room", to_enrollment_offered_subject_sections.room)
                    .setString("schedule", to_enrollment_offered_subject_sections.schedule)
                    .setString("day", to_enrollment_offered_subject_sections.day)
                    .setString("time", to_enrollment_offered_subject_sections.time)
                    .setString("start_time", to_enrollment_offered_subject_sections.start_time)
                    .setString("closing_time", to_enrollment_offered_subject_sections.closing_time)
                    .setString("created_at", to_enrollment_offered_subject_sections.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_sections.updated_at)
                    .setString("created_by", to_enrollment_offered_subject_sections.created_by)
                    .setString("updated_by", to_enrollment_offered_subject_sections.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_sections.status)
                    .setNumber("is_uploaded", to_enrollment_offered_subject_sections.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_sections.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_offered_subject_sections to_enrollment_offered_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_offered_subject_sections set "
                    + "enrollment_offered_subject_id= :enrollment_offered_subject_id "
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
                    + ",units= :units "
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
                    + ",amount= :amount "
                    + ",is_lab= :is_lab "
                    + ",max_students= :max_students "
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
                    + " where id='" + to_enrollment_offered_subject_sections.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_sections.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_sections.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_offered_subject_sections.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_offered_subject_sections.academic_year_id)
                    .setString("academic_year", to_enrollment_offered_subject_sections.academic_year)
                    .setNumber("level_id", to_enrollment_offered_subject_sections.level_id)
                    .setString("level", to_enrollment_offered_subject_sections.level)
                    .setNumber("college_id", to_enrollment_offered_subject_sections.college_id)
                    .setString("college", to_enrollment_offered_subject_sections.college)
                    .setNumber("department_id", to_enrollment_offered_subject_sections.department_id)
                    .setString("department", to_enrollment_offered_subject_sections.department)
                    .setNumber("course_id", to_enrollment_offered_subject_sections.course_id)
                    .setString("course_code", to_enrollment_offered_subject_sections.course_code)
                    .setString("course_description", to_enrollment_offered_subject_sections.course_description)
                    .setString("term", to_enrollment_offered_subject_sections.term)
                    .setString("year_level", to_enrollment_offered_subject_sections.year_level)
                    .setNumber("subject_id", to_enrollment_offered_subject_sections.subject_id)
                    .setString("subject_code", to_enrollment_offered_subject_sections.subject_code)
                    .setString("description", to_enrollment_offered_subject_sections.description)
                    .setNumber("units", to_enrollment_offered_subject_sections.units)
                    .setNumber("lecture_units", to_enrollment_offered_subject_sections.lecture_units)
                    .setNumber("lab_units", to_enrollment_offered_subject_sections.lab_units)
                    .setNumber("amount", to_enrollment_offered_subject_sections.amount)
                    .setNumber("is_lab", to_enrollment_offered_subject_sections.is_lab)
                    .setNumber("max_students", to_enrollment_offered_subject_sections.max_students)
                    .setString("faculty_id", to_enrollment_offered_subject_sections.faculty_id)
                    .setString("faculty_name", to_enrollment_offered_subject_sections.faculty_name)
                    .setString("section", to_enrollment_offered_subject_sections.section)
                    .setNumber("room_id", to_enrollment_offered_subject_sections.room_id)
                    .setString("room", to_enrollment_offered_subject_sections.room)
                    .setString("schedule", to_enrollment_offered_subject_sections.schedule)
                    .setString("day", to_enrollment_offered_subject_sections.day)
                    .setString("time", to_enrollment_offered_subject_sections.time)
                    .setString("start_time", to_enrollment_offered_subject_sections.start_time)
                    .setString("closing_time", to_enrollment_offered_subject_sections.closing_time)
                    .setString("created_at", to_enrollment_offered_subject_sections.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_sections.updated_at)
                    .setString("created_by", to_enrollment_offered_subject_sections.created_by)
                    .setString("updated_by", to_enrollment_offered_subject_sections.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_sections.status)
                    .setNumber("is_uploaded", to_enrollment_offered_subject_sections.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_sections.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_offered_subject_sections to_enrollment_offered_subject_sections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_offered_subject_sections  "
                    + " where id='" + to_enrollment_offered_subject_sections.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_sections.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_offered_subject_sections> ret_data(String where) {
        List<to_enrollment_offered_subject_sections> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
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
                    + " from enrollment_offered_subject_sections"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_offered_subject_id = rs.getInt(2);
                int academic_offering_subject_id = rs.getInt(3);
                int academic_offering_id = rs.getInt(4);
                int academic_year_id = rs.getInt(5);
                String academic_year = rs.getString(6);
                int level_id = rs.getInt(7);
                String level = rs.getString(8);
                int college_id = rs.getInt(9);
                String college = rs.getString(10);
                int department_id = rs.getInt(11);
                String department = rs.getString(12);
                int course_id = rs.getInt(13);
                String course_code = rs.getString(14);
                String course_description = rs.getString(15);
                String term = rs.getString(16);
                String year_level = rs.getString(17);
                int subject_id = rs.getInt(18);
                String subject_code = rs.getString(19);
                String description = rs.getString(20);
                double units = rs.getDouble(21);
                double lecture_units = rs.getDouble(22);
                double lab_units = rs.getDouble(23);
                double amount = rs.getDouble(24);
                int is_lab = rs.getInt(25);
                int max_students = rs.getInt(26);
                String faculty_id = rs.getString(27);
                String faculty_name = rs.getString(28);
                String section = rs.getString(29);
                int room_id = rs.getInt(30);
                String room = rs.getString(31);
                String schedule = rs.getString(32);
                String day = rs.getString(33);
                String time = rs.getString(34);
                String start_time = rs.getString(35);
                String closing_time = rs.getString(36);
                String created_at = rs.getString(37);
                String updated_at = rs.getString(38);
                String created_by = rs.getString(39);
                String updated_by = rs.getString(40);
                int status = rs.getInt(41);
                int is_uploaded = rs.getInt(42);

                to_enrollment_offered_subject_sections to = new to_enrollment_offered_subject_sections(id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_offered_subject_sections> ret_data2(String where) {
        List<to_enrollment_offered_subject_sections> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
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
                    + " from enrollment_offered_subject_sections"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_offered_subject_id = rs.getInt(2);
                int academic_offering_subject_id = rs.getInt(3);
                int academic_offering_id = rs.getInt(4);
                int academic_year_id = rs.getInt(5);
                String academic_year = rs.getString(6);
                int level_id = rs.getInt(7);
                String level = rs.getString(8);
                int college_id = rs.getInt(9);
                String college = rs.getString(10);
                int department_id = rs.getInt(11);
                String department = rs.getString(12);
                int course_id = rs.getInt(13);
                String course_code = rs.getString(14);
                String course_description = rs.getString(15);
                String term = rs.getString(16);
                String year_level = rs.getString(17);
                int subject_id = rs.getInt(18);
                String subject_code = rs.getString(19);
                String description = rs.getString(20);
                double units = rs.getDouble(21);
                double lecture_units = rs.getDouble(22);
                double lab_units = rs.getDouble(23);
                double amount = rs.getDouble(24);
                int is_lab = rs.getInt(25);
                int max_students = rs.getInt(26);
                String faculty_id = rs.getString(27);
                String faculty_name = rs.getString(28);
                String section = rs.getString(29);
                int room_id = rs.getInt(30);
                String room = rs.getString(31);
                String schedule = rs.getString(32);
                String day = rs.getString(33);
                String time = rs.getString(34);
                String start_time = rs.getString(35);
                String closing_time = rs.getString(36);
                String created_at = rs.getString(37);
                String updated_at = rs.getString(38);
                String created_by = rs.getString(39);
                String updated_by = rs.getString(40);
                int status = rs.getInt(41);
                int is_uploaded = rs.getInt(42);

                String s2 = "select "
                        + " room "
                        + ", day"
                        + ",concat(start_time,'/',closing_time) as time"
                        + " from enrollment_offered_subject_section_room_schedules"
                        + " where enrollment_offered_subject_section_id='" + id + "'  "; //group by room_id

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);

                String day1 = "";
                int i = 0;
                List<String> lroom = new ArrayList();
                List<String> lday = new ArrayList();
                while (rs2.next()) {
                    lroom.add(rs2.getString(1));
                    String day2 = rs2.getString(2);
                    String s = rs2.getString(3);
                    String[] ss = s.split("/");
                    String otime = ss[0];
                    String ctime = ss[1];
                    otime = DateType.convert_datetime_to_hour_minute(otime);
                    ctime = DateType.convert_datetime_to_hour_minute(ctime);
                    s = otime + "-" + ctime;
                    day2 = day2 + ": " + s;

                    if (i == 0) {
                        day = "&nbsp;&nbsp;" + day2;
                    } else {
                        day = day + "<br>" + "&nbsp;&nbsp;" + day2;
                    }
                    i++;
                }

                room = ReGroup.similar(lroom);

                // search instuctor
                String s3 = "select "
                        + " faculty_name "
                        + ",faculty_id"
                        + " from enrollment_offered_subject_section_instructors"
                        + " where enrollment_offered_subject_section_id='" + id + "'  "; //group by room_id

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);

                while (rs3.next()) {

                    faculty_name = rs3.getString(1);
                    faculty_id = rs3.getString(2);
                }

                to_enrollment_offered_subject_sections to = new to_enrollment_offered_subject_sections(id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

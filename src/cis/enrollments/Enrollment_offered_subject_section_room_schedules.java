/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

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
public class Enrollment_offered_subject_section_room_schedules {

    public static class to_enrollment_offered_subject_section_room_schedules {

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

        public to_enrollment_offered_subject_section_room_schedules(int id, int enrollment_offered_subject_section_id, int enrollment_offered_subject_id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, int room_id, String room, String schedule, String day, String time, String start_time, String closing_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
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

    public static void add_data(to_enrollment_offered_subject_section_room_schedules to_enrollment_offered_subject_section_room_schedules, List<String> days) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            PreparedStatement stmt3 = conn.prepareStatement("");
            for (String day : days) {
                String s0 = "insert into enrollment_offered_subject_section_room_schedules("
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
                        .setNumber("enrollment_offered_subject_section_id", to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id)
                        .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_id)
                        .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_section_room_schedules.academic_offering_subject_id)
                        .setNumber("academic_offering_id", to_enrollment_offered_subject_section_room_schedules.academic_offering_id)
                        .setNumber("academic_year_id", to_enrollment_offered_subject_section_room_schedules.academic_year_id)
                        .setString("academic_year", to_enrollment_offered_subject_section_room_schedules.academic_year)
                        .setNumber("level_id", to_enrollment_offered_subject_section_room_schedules.level_id)
                        .setString("level", to_enrollment_offered_subject_section_room_schedules.level)
                        .setNumber("college_id", to_enrollment_offered_subject_section_room_schedules.college_id)
                        .setString("college", to_enrollment_offered_subject_section_room_schedules.college)
                        .setNumber("department_id", to_enrollment_offered_subject_section_room_schedules.department_id)
                        .setString("department", to_enrollment_offered_subject_section_room_schedules.department)
                        .setNumber("course_id", to_enrollment_offered_subject_section_room_schedules.course_id)
                        .setString("course_code", to_enrollment_offered_subject_section_room_schedules.course_code)
                        .setString("course_description", to_enrollment_offered_subject_section_room_schedules.course_description)
                        .setString("term", to_enrollment_offered_subject_section_room_schedules.term)
                        .setString("year_level", to_enrollment_offered_subject_section_room_schedules.year_level)
                        .setNumber("subject_id", to_enrollment_offered_subject_section_room_schedules.subject_id)
                        .setString("subject_code", to_enrollment_offered_subject_section_room_schedules.subject_code)
                        .setString("description", to_enrollment_offered_subject_section_room_schedules.description)
                        .setNumber("room_id", to_enrollment_offered_subject_section_room_schedules.room_id)
                        .setString("room", to_enrollment_offered_subject_section_room_schedules.room)
                        .setString("schedule", to_enrollment_offered_subject_section_room_schedules.schedule)
                        .setString("day", day)
                        .setString("time", to_enrollment_offered_subject_section_room_schedules.time)
                        .setString("start_time", to_enrollment_offered_subject_section_room_schedules.start_time)
                        .setString("closing_time", to_enrollment_offered_subject_section_room_schedules.closing_time)
                        .setString("created_at", to_enrollment_offered_subject_section_room_schedules.created_at)
                        .setString("updated_at", to_enrollment_offered_subject_section_room_schedules.updated_at)
                        .setString("created_by", to_enrollment_offered_subject_section_room_schedules.created_by)
                        .setString("updated_by", to_enrollment_offered_subject_section_room_schedules.updated_by)
                        .setNumber("status", to_enrollment_offered_subject_section_room_schedules.status)
                        .setNumber("is_uploaded", to_enrollment_offered_subject_section_room_schedules.is_uploaded)
                        .ok();
                stmt.addBatch(s0);
            }

            stmt.executeBatch();

            String s2 = "select "
                    + " room "
                    + ", day"
                    + ",concat(start_time,'/',closing_time) as time"
                    + " from enrollment_offered_subject_section_room_schedules"
                    + " where enrollment_offered_subject_section_id='" + to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id + "'  "; //group by room_id

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);

            String day1 = "";
            int i = 0;
            String day = "";
            List<String> lday = new ArrayList();
            while (rs2.next()) {

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

            String s4 = "update enrollment_student_loaded_subjects set "
                    + " room= :room "
                    + ",day= :day "
                    + " where enrollment_offered_subject_section_id='" + to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id + "' "
                    + " ";

            s4 = SqlStringUtil.parse(s4)
                    .setString("room", to_enrollment_offered_subject_section_room_schedules.room)
                    .setString("day", day)
                    .ok();

            stmt3.addBatch(s4);

            stmt3.executeBatch();

            conn.commit();
            Lg.s(Enrollment_offered_subject_section_room_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_offered_subject_section_room_schedules to_enrollment_offered_subject_section_room_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_offered_subject_section_room_schedules set "
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
                    + " where id='" + to_enrollment_offered_subject_section_room_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_offered_subject_section_room_schedules.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_offered_subject_section_room_schedules.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_offered_subject_section_room_schedules.academic_year_id)
                    .setString("academic_year", to_enrollment_offered_subject_section_room_schedules.academic_year)
                    .setNumber("level_id", to_enrollment_offered_subject_section_room_schedules.level_id)
                    .setString("level", to_enrollment_offered_subject_section_room_schedules.level)
                    .setNumber("college_id", to_enrollment_offered_subject_section_room_schedules.college_id)
                    .setString("college", to_enrollment_offered_subject_section_room_schedules.college)
                    .setNumber("department_id", to_enrollment_offered_subject_section_room_schedules.department_id)
                    .setString("department", to_enrollment_offered_subject_section_room_schedules.department)
                    .setNumber("course_id", to_enrollment_offered_subject_section_room_schedules.course_id)
                    .setString("course_code", to_enrollment_offered_subject_section_room_schedules.course_code)
                    .setString("course_description", to_enrollment_offered_subject_section_room_schedules.course_description)
                    .setString("term", to_enrollment_offered_subject_section_room_schedules.term)
                    .setString("year_level", to_enrollment_offered_subject_section_room_schedules.year_level)
                    .setNumber("subject_id", to_enrollment_offered_subject_section_room_schedules.subject_id)
                    .setString("subject_code", to_enrollment_offered_subject_section_room_schedules.subject_code)
                    .setString("description", to_enrollment_offered_subject_section_room_schedules.description)
                    .setNumber("room_id", to_enrollment_offered_subject_section_room_schedules.room_id)
                    .setString("room", to_enrollment_offered_subject_section_room_schedules.room)
                    .setString("schedule", to_enrollment_offered_subject_section_room_schedules.schedule)
                    .setString("day", to_enrollment_offered_subject_section_room_schedules.day)
                    .setString("time", to_enrollment_offered_subject_section_room_schedules.time)
                    .setString("start_time", to_enrollment_offered_subject_section_room_schedules.start_time)
                    .setString("closing_time", to_enrollment_offered_subject_section_room_schedules.closing_time)
                    .setString("created_at", to_enrollment_offered_subject_section_room_schedules.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_section_room_schedules.updated_at)
                    .setString("created_by", to_enrollment_offered_subject_section_room_schedules.created_by)
                    .setString("updated_by", to_enrollment_offered_subject_section_room_schedules.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_section_room_schedules.status)
                    .setNumber("is_uploaded", to_enrollment_offered_subject_section_room_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_room_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_offered_subject_section_room_schedules to_enrollment_offered_subject_section_room_schedules) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            PreparedStatement stmt = conn.prepareStatement("");
            PreparedStatement stmt3 = conn.prepareStatement("");
            String s0 = "delete from enrollment_offered_subject_section_room_schedules  "
                    + " where id='" + to_enrollment_offered_subject_section_room_schedules.id + "' "
                    + " ";

            stmt.addBatch(s0);
            stmt.executeBatch();

            String s2 = "select "
                    + " room "
                    + ", day"
                    + ",concat(start_time,'/',closing_time) as time"
                    + " from enrollment_offered_subject_section_room_schedules"
                    + " where enrollment_offered_subject_section_id='" + to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id + "'  "; //group by room_id

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);

            String day1 = "";
            int i = 0;
            String day = "";
            List<String> lday = new ArrayList();
            while (rs2.next()) {

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

            String s4 = "update enrollment_student_loaded_subjects set "
                    + " room= :room "
                    + ",day= :day "
                    + " where enrollment_offered_subject_section_id='" + to_enrollment_offered_subject_section_room_schedules.enrollment_offered_subject_section_id + "' "
                    + " ";

            s4 = SqlStringUtil.parse(s4)
                    .setString("room", to_enrollment_offered_subject_section_room_schedules.room)
                    .setString("day", day)
                    .ok();

            stmt3.addBatch(s4);

            stmt3.executeBatch();

            conn.commit();
            Lg.s(Enrollment_offered_subject_section_room_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_offered_subject_section_room_schedules> ret_data(String where) {
        List<to_enrollment_offered_subject_section_room_schedules> datas = new ArrayList();

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
                    + " from enrollment_offered_subject_section_room_schedules"
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
                int room_id = rs.getInt(22);
                String room = rs.getString(23);
                String schedule = rs.getString(24);
                String day = rs.getString(25);
                String time = rs.getString(26);
                String start_time = rs.getString(27);
                String closing_time = rs.getString(28);
                String created_at = rs.getString(29);
                String updated_at = rs.getString(30);
                String created_by = rs.getString(31);
                String updated_by = rs.getString(32);
                int status = rs.getInt(33);
                int is_uploaded = rs.getInt(34);

                to_enrollment_offered_subject_section_room_schedules to = new to_enrollment_offered_subject_section_room_schedules(id, enrollment_offered_subject_section_id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

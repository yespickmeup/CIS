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
public class Enrollment_offered_subjects {

  public static class to_enrollment_offered_subjects {

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
    public final String faculty_id;
    public final String faculty_name;
    public final int room_id;
    public final String room;
    public final String schedule;
    public final String created_at;
    public final String updated_at;
    public final String created_by;
    public final String updated_by;
    public final int status;
    public final int is_uploaded;
    public boolean selected;
    public final double lec;
    public final double lab;
    public to_enrollment_offered_subjects(int id, int academic_offering_subject_id, int academic_offering_id, int academic_year_id, String academic_year, int level_id, String level, int college_id, String college, int department_id, String department, int course_id, String course_code, String course_description, String term, String year_level, int subject_id, String subject_code, String description, double units, double lecture_units, double lab_units, double amount, int is_lab, int max_students, String prerequisite_subject_ids, String subject_group, int subject_group_id, String faculty_id, String faculty_name, int room_id, String room, String schedule, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, boolean selected,double lec, double lab) {
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
      this.created_at = created_at;
      this.updated_at = updated_at;
      this.created_by = created_by;
      this.updated_by = updated_by;
      this.status = status;
      this.is_uploaded = is_uploaded;
      this.selected = selected;
      this.lec = lec;
      this.lab = lab;
    }

    public boolean isSelected() {
      return selected;
    }

    public void setSelected(boolean selected) {
      this.selected = selected;
    }

  }

  public static void add_data(List<to_enrollment_offered_subjects> to_enrollment_offered_subjects1, int no_of_sections, String section_name) {
    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);
      String[] sections = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
      for (to_enrollment_offered_subjects to_enrollment_offered_subjects : to_enrollment_offered_subjects1) {
        String s0 = "insert into enrollment_offered_subjects("
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
                + ",:created_at"
                + ",:updated_at"
                + ",:created_by"
                + ",:updated_by"
                + ",:status"
                + ",:is_uploaded"
                + ")";

        s0 = SqlStringUtil.parse(s0)
                .setNumber("academic_offering_subject_id", to_enrollment_offered_subjects.academic_offering_subject_id)
                .setNumber("academic_offering_id", to_enrollment_offered_subjects.academic_offering_id)
                .setNumber("academic_year_id", to_enrollment_offered_subjects.academic_year_id)
                .setString("academic_year", to_enrollment_offered_subjects.academic_year)
                .setNumber("level_id", to_enrollment_offered_subjects.level_id)
                .setString("level", to_enrollment_offered_subjects.level)
                .setNumber("college_id", to_enrollment_offered_subjects.college_id)
                .setString("college", to_enrollment_offered_subjects.college)
                .setNumber("department_id", to_enrollment_offered_subjects.department_id)
                .setString("department", to_enrollment_offered_subjects.department)
                .setNumber("course_id", to_enrollment_offered_subjects.course_id)
                .setString("course_code", to_enrollment_offered_subjects.course_code)
                .setString("course_description", to_enrollment_offered_subjects.course_description)
                .setString("term", to_enrollment_offered_subjects.term)
                .setString("year_level", to_enrollment_offered_subjects.year_level)
                .setNumber("subject_id", to_enrollment_offered_subjects.subject_id)
                .setString("subject_code", to_enrollment_offered_subjects.subject_code)
                .setString("description", to_enrollment_offered_subjects.description)
                .setNumber("units", to_enrollment_offered_subjects.units)
                .setNumber("lecture_units", to_enrollment_offered_subjects.lecture_units)
                .setNumber("lab_units", to_enrollment_offered_subjects.lab_units)
                .setNumber("amount", to_enrollment_offered_subjects.amount)
                .setNumber("is_lab", to_enrollment_offered_subjects.is_lab)
                .setNumber("max_students", to_enrollment_offered_subjects.max_students)
                .setString("prerequisite_subject_ids", to_enrollment_offered_subjects.prerequisite_subject_ids)
                .setString("subject_group", to_enrollment_offered_subjects.subject_group)
                .setNumber("subject_group_id", to_enrollment_offered_subjects.subject_group_id)
                .setString("faculty_id", to_enrollment_offered_subjects.faculty_id)
                .setString("faculty_name", to_enrollment_offered_subjects.faculty_name)
                .setNumber("room_id", to_enrollment_offered_subjects.room_id)
                .setString("room", to_enrollment_offered_subjects.room)
                .setString("schedule", to_enrollment_offered_subjects.schedule)
                .setString("created_at", to_enrollment_offered_subjects.created_at)
                .setString("updated_at", to_enrollment_offered_subjects.updated_at)
                .setString("created_by", to_enrollment_offered_subjects.created_by)
                .setString("updated_by", to_enrollment_offered_subjects.updated_by)
                .setNumber("status", to_enrollment_offered_subjects.status)
                .setNumber("is_uploaded", to_enrollment_offered_subjects.is_uploaded)
                .ok();

        PreparedStatement stmt = conn.prepareStatement("");
        stmt.addBatch(s0);
        stmt.executeBatch();

        String s3 = "select "
                + "id"
                + " from enrollment_offered_subjects"
                + " order by id desc limit 1";

        Statement stmt2 = conn.createStatement();
        ResultSet rs2 = stmt2.executeQuery(s3);
        int id2 = 0;
        if (rs2.next()) {
          id2 = rs2.getInt(1);
        }

        PreparedStatement stmt3 = conn.prepareStatement("");
        for (int i = 0; i < no_of_sections; i++) {
          int id = 0;
          int academic_offering_subject_id = to_enrollment_offered_subjects.academic_offering_subject_id;
          int academic_offering_id = to_enrollment_offered_subjects.academic_offering_id;
          int academic_year_id2 = to_enrollment_offered_subjects.academic_year_id;
          String academic_year = to_enrollment_offered_subjects.academic_year;
          int level_id = to_enrollment_offered_subjects.level_id;
          String level = to_enrollment_offered_subjects.level;
          int college_id = to_enrollment_offered_subjects.college_id;
          String college = to_enrollment_offered_subjects.college;
          int department_id = to_enrollment_offered_subjects.department_id;
          String department = to_enrollment_offered_subjects.department;
          int course_id = to_enrollment_offered_subjects.course_id;
          String course_code = to_enrollment_offered_subjects.course_code;
          String course_description = to_enrollment_offered_subjects.course_description;
          String term = to_enrollment_offered_subjects.term;
          String year_level = to_enrollment_offered_subjects.year_level;
          int subject_id = to_enrollment_offered_subjects.subject_id;
          String subject_code = to_enrollment_offered_subjects.subject_code;
          String description = to_enrollment_offered_subjects.description;
          double units = 0;
          double lecture_units = to_enrollment_offered_subjects.lecture_units;
          double lab_units = to_enrollment_offered_subjects.lab_units;
          double amount = 0;
          int is_lab = to_enrollment_offered_subjects.is_lab;
          int enrollment_offered_subject_id = id2;
          int max_students = to_enrollment_offered_subjects.max_students;
          String faculty_id = to_enrollment_offered_subjects.faculty_id;
          String faculty_name = to_enrollment_offered_subjects.faculty_name;
          String section = sections[i];
          if (no_of_sections == 1) {
            section = section_name;
          }
          int room_id = to_enrollment_offered_subjects.room_id;
          String room = to_enrollment_offered_subjects.room;
          String schedule = to_enrollment_offered_subjects.schedule;
          String day = "";
          String time = "";
          String start_time = null;
          String closing_time = null;
          String created_at = to_enrollment_offered_subjects.created_at;
          String updated_at = to_enrollment_offered_subjects.updated_at;
          String created_by = to_enrollment_offered_subjects.created_by;
          String updated_by = to_enrollment_offered_subjects.updated_by;
          int status = to_enrollment_offered_subjects.status;
          int is_uploaded = to_enrollment_offered_subjects.is_uploaded;
          Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections to_enrollment_offered_subject_sections = new Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections(id, enrollment_offered_subject_id, academic_offering_subject_id, academic_offering_id, academic_year_id2, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, faculty_id, faculty_name, section, room_id, room, schedule, day, time, start_time, closing_time, created_at, updated_at, created_by, updated_by, status, is_uploaded, false, false);

          String s2 = "insert into enrollment_offered_subject_sections("
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

          s2 = SqlStringUtil.parse(s2)
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
          stmt3.addBatch(s2);
        }
        stmt3.executeBatch();
      }

      conn.commit();
      Lg.s(Enrollment_offered_subjects.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_enrollment_offered_subjects to_enrollment_offered_subjects) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update enrollment_offered_subjects set "
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
              + ",created_at= :created_at "
              + ",updated_at= :updated_at "
              + ",created_by= :created_by "
              + ",updated_by= :updated_by "
              + ",status= :status "
              + ",is_uploaded= :is_uploaded "
              + " where id='" + to_enrollment_offered_subjects.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("academic_offering_subject_id", to_enrollment_offered_subjects.academic_offering_subject_id)
              .setNumber("academic_offering_id", to_enrollment_offered_subjects.academic_offering_id)
              .setNumber("academic_year_id", to_enrollment_offered_subjects.academic_year_id)
              .setString("academic_year", to_enrollment_offered_subjects.academic_year)
              .setNumber("level_id", to_enrollment_offered_subjects.level_id)
              .setString("level", to_enrollment_offered_subjects.level)
              .setNumber("college_id", to_enrollment_offered_subjects.college_id)
              .setString("college", to_enrollment_offered_subjects.college)
              .setNumber("department_id", to_enrollment_offered_subjects.department_id)
              .setString("department", to_enrollment_offered_subjects.department)
              .setNumber("course_id", to_enrollment_offered_subjects.course_id)
              .setString("course_code", to_enrollment_offered_subjects.course_code)
              .setString("course_description", to_enrollment_offered_subjects.course_description)
              .setString("term", to_enrollment_offered_subjects.term)
              .setString("year_level", to_enrollment_offered_subjects.year_level)
              .setNumber("subject_id", to_enrollment_offered_subjects.subject_id)
              .setString("subject_code", to_enrollment_offered_subjects.subject_code)
              .setString("description", to_enrollment_offered_subjects.description)
              .setNumber("units", to_enrollment_offered_subjects.units)
              .setNumber("lecture_units", to_enrollment_offered_subjects.lecture_units)
              .setNumber("lab_units", to_enrollment_offered_subjects.lab_units)
              .setNumber("amount", to_enrollment_offered_subjects.amount)
              .setNumber("is_lab", to_enrollment_offered_subjects.is_lab)
              .setNumber("max_students", to_enrollment_offered_subjects.max_students)
              .setString("prerequisite_subject_ids", to_enrollment_offered_subjects.prerequisite_subject_ids)
              .setString("subject_group", to_enrollment_offered_subjects.subject_group)
              .setNumber("subject_group_id", to_enrollment_offered_subjects.subject_group_id)
              .setString("faculty_id", to_enrollment_offered_subjects.faculty_id)
              .setString("faculty_name", to_enrollment_offered_subjects.faculty_name)
              .setNumber("room_id", to_enrollment_offered_subjects.room_id)
              .setString("room", to_enrollment_offered_subjects.room)
              .setString("schedule", to_enrollment_offered_subjects.schedule)
              .setString("created_at", to_enrollment_offered_subjects.created_at)
              .setString("updated_at", to_enrollment_offered_subjects.updated_at)
              .setString("created_by", to_enrollment_offered_subjects.created_by)
              .setString("updated_by", to_enrollment_offered_subjects.updated_by)
              .setNumber("status", to_enrollment_offered_subjects.status)
              .setNumber("is_uploaded", to_enrollment_offered_subjects.is_uploaded)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_offered_subjects.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data_status(int id, int status) {
    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);
      PreparedStatement stmt = conn.prepareStatement("");
      String s0 = "update enrollment_offered_subjects set "
              + " status= :status "
              + " where id='" + id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("status", status)
              .ok();
      stmt.addBatch(s0);

      String s2 = "update enrollment_offered_subject_sections set "
              + " status= :status "
              + " where enrollment_offered_subject_id='" + id + "' "
              + " ";

      s2 = SqlStringUtil.parse(s2)
              .setNumber("status", status)
              .ok();
      stmt.addBatch(s2);

      String s3 = "update enrollment_offered_subject_section_instructors set "
              + " status= :status "
              + " where enrollment_offered_subject_id='" + id + "' "
              + " ";

      s3 = SqlStringUtil.parse(s3)
              .setNumber("status", status)
              .ok();
      stmt.addBatch(s3);

      String s4 = "update enrollment_offered_subject_section_room_schedules set "
              + " status= :status "
              + " where enrollment_offered_subject_id='" + id + "' "
              + " ";

      s4 = SqlStringUtil.parse(s4)
              .setNumber("status", status)
              .ok();
      stmt.addBatch(s4);

      stmt.executeBatch();
      conn.commit();
      Lg.s(Enrollment_offered_subjects.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data_status_list(List<Enrollment_offered_subjects.to_enrollment_offered_subjects> datas, int status) {
    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);
      PreparedStatement stmt = conn.prepareStatement("");
      for (Enrollment_offered_subjects.to_enrollment_offered_subjects to : datas) {
        String s0 = "update enrollment_offered_subjects set "
                + " status= :status "
                + " where id='" + to.id + "' "
                + " ";

        s0 = SqlStringUtil.parse(s0)
                .setNumber("status", status)
                .ok();
        stmt.addBatch(s0);

        String s2 = "update enrollment_offered_subject_sections set "
                + " status= :status "
                + " where enrollment_offered_subject_id='" + to.id + "' "
                + " ";

        s2 = SqlStringUtil.parse(s2)
                .setNumber("status", status)
                .ok();
        stmt.addBatch(s2);

        String s3 = "update enrollment_offered_subject_section_instructors set "
                + " status= :status "
                + " where enrollment_offered_subject_id='" + to.id + "' "
                + " ";

        s3 = SqlStringUtil.parse(s3)
                .setNumber("status", status)
                .ok();
        stmt.addBatch(s3);

        String s4 = "update enrollment_offered_subject_section_room_schedules set "
                + " status= :status "
                + " where enrollment_offered_subject_id='" + to.id + "' "
                + " ";

        s4 = SqlStringUtil.parse(s4)
                .setNumber("status", status)
                .ok();
        stmt.addBatch(s4);
      }

      stmt.executeBatch();
      conn.commit();
      Lg.s(Enrollment_offered_subjects.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_units(int id, double lecture_units, double lab_units) {
    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);
      PreparedStatement stmt = conn.prepareStatement("");

      String s = "update enrollment_offered_subjects set "
              + " lecture_units= :lecture_units"
              + ",lab_units= :lab_units"
              + " where id='" + id + "' "
              + " ";

      s = SqlStringUtil.parse(s)
              .setNumber("lecture_units", lecture_units)
              .setNumber("lab_units", lab_units)
              .ok();
      stmt.addBatch(s);
      String s0 = "update enrollment_offered_subject_sections set "
              + " lecture_units= :lecture_units"
              + ",lab_units= :lab_units"
              + " where enrollment_offered_subject_id='" + id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("lecture_units", lecture_units)
              .setNumber("lab_units", lab_units)
              .ok();

      stmt.addBatch(s0);
      stmt.executeBatch();
      conn.commit();
      Lg.s(Enrollment_offered_subject_sections.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_enrollment_offered_subjects to_enrollment_offered_subjects) {
    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);
      String s0 = "delete from enrollment_offered_subjects  "
              + " where id='" + to_enrollment_offered_subjects.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement("");
      stmt.addBatch(s0);

      String s2 = "delete from enrollment_offered_subject_sections  "
              + " where enrollment_offered_subject_id='" + to_enrollment_offered_subjects.id + "' "
              + " ";
      stmt.addBatch(s2);

      String s3 = "delete from enrollment_offered_subject_section_instructors  "
              + " where enrollment_offered_subject_id='" + to_enrollment_offered_subjects.id + "' "
              + " ";
      stmt.addBatch(s3);

      String s4 = "delete from enrollment_offered_subject_section_room_schedules  "
              + " where enrollment_offered_subject_id='" + to_enrollment_offered_subjects.id + "' "
              + " ";
      stmt.addBatch(s4);

      stmt.executeBatch();
      conn.commit();
      Lg.s(Enrollment_offered_subjects.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_enrollment_offered_subjects> ret_data(String where) {
    List<to_enrollment_offered_subjects> datas = new ArrayList();

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
              + ",created_at"
              + ",updated_at"
              + ",created_by"
              + ",updated_by"
              + ",status"
              + ",is_uploaded"
              + " from enrollment_offered_subjects"
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
        int subject_id = rs.getInt(17);
        String subject_code = rs.getString(18);
        String description = rs.getString(19);
        double units = rs.getDouble(20);
        double lecture_units = rs.getDouble(21);
        double lab_units = rs.getDouble(22);
        double amount = rs.getDouble(23);
        int is_lab = rs.getInt(24);
        int max_students = rs.getInt(25);
        String prerequisite_subject_ids = rs.getString(26);
        String subject_group = rs.getString(27);
        int subject_group_id = rs.getInt(28);
        String faculty_id = rs.getString(29);
        String faculty_name = rs.getString(30);
        int room_id = rs.getInt(31);
        String room = rs.getString(32);
        String schedule = rs.getString(33);
        String created_at = rs.getString(34);
        String updated_at = rs.getString(35);
        String created_by = rs.getString(36);
        String updated_by = rs.getString(37);
        int status = rs.getInt(38);
        int is_uploaded = rs.getInt(39);

        to_enrollment_offered_subjects to = new to_enrollment_offered_subjects(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, created_at, updated_at, created_by, updated_by, status, is_uploaded, false,0,0);
        datas.add(to);
      }
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_enrollment_offered_subjects> ret_data2(String where) {
    List<to_enrollment_offered_subjects> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "eos.id"
              + ",eos.academic_offering_subject_id"
              + ",eos.academic_offering_id"
              + ",eos.academic_year_id"
              + ",eos.academic_year"
              + ",eos.level_id"
              + ",eos.level"
              + ",eos.college_id"
              + ",eos.college"
              + ",eos.department_id"
              + ",eos.department"
              + ",eos.course_id"
              + ",eos.course_code"
              + ",eos.course_description"
              + ",eos.term"
              + ",eos.year_level"
              + ",eos.subject_id"
              + ",eos.subject_code"
              + ",eos.description"
              + ",eos.units"
              + ",eos.lecture_units"
              + ",eos.lab_units"
              + ",eos.amount"
              + ",eos.is_lab"
              + ",eos.max_students"
              + ",eos.prerequisite_subject_ids"
              + ",eos.subject_group"
              + ",eos.subject_group_id"
              + ",eos.faculty_id"
              + ",eos.faculty_name"
              + ",eos.room_id"
              + ",eos.room"
              + ",eos.schedule"
              + ",eos.created_at"
              + ",eos.updated_at"
              + ",eos.created_by"
              + ",eos.updated_by"
              + ",eos.status"
              + ",eos.is_uploaded"
              + ",(select eosu.lec from enrollment_offered_subject_units eosu where eos.id=eosu.eos_id)"
              + ",(select eosu.lab from enrollment_offered_subject_units eosu where eos.id=eosu.eos_id)"
              + " from enrollment_offered_subjects eos "
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
        int subject_id = rs.getInt(17);
        String subject_code = rs.getString(18);
        String description = rs.getString(19);
        double units = rs.getDouble(20);
        double lecture_units = rs.getDouble(21);
        double lab_units = rs.getDouble(22);
        double amount = rs.getDouble(23);
        int is_lab = rs.getInt(24);
        int max_students = rs.getInt(25);
        String prerequisite_subject_ids = rs.getString(26);
        String subject_group = rs.getString(27);
        int subject_group_id = rs.getInt(28);
        String faculty_id = rs.getString(29);
        String faculty_name = rs.getString(30);
        int room_id = rs.getInt(31);
        String room = rs.getString(32);
        String schedule = rs.getString(33);
        String created_at = rs.getString(34);
        String updated_at = rs.getString(35);
        String created_by = rs.getString(36);
        String updated_by = rs.getString(37);
        int status = rs.getInt(38);
        int is_uploaded = rs.getInt(39);
        double lec = rs.getDouble(40);
        double lab = rs.getDouble(41);

        // ret sections
        List<String> lsections = new ArrayList();
        String s2 = "select "
                + " section "
                + " from enrollment_offered_subject_sections"
                + " where enrollment_offered_subject_id='" + id + "'  "; //group by room_id

        Statement stmt2 = conn.createStatement();
        ResultSet rs2 = stmt2.executeQuery(s2);
        while (rs2.next()) {
          lsections.add(rs2.getString(1));
        }
        prerequisite_subject_ids = ReGroup.similar(lsections);

        //ret instructors
        String s3 = "select "
                + " faculty_name "
                + " from enrollment_offered_subject_section_instructors"
                + " where enrollment_offered_subject_id='" + id + "'  "; //group by room_id

        Statement stmt3 = conn.createStatement();
        ResultSet rs3 = stmt3.executeQuery(s3);
        while (rs3.next()) {
          faculty_name = rs3.getString(1);
        }

        //ret rooms
        String s4 = "select "
                + " room "
                + ",concat(start_time,'/',closing_time) as time"
                + ",day"
                + " from enrollment_offered_subject_section_room_schedules"
                + " where enrollment_offered_subject_id='" + id + "'  "; //group by room_id

        List<String> l_rooms = new ArrayList();
        List<String> l_day = new ArrayList();
        Statement stmt4 = conn.createStatement();
        ResultSet rs4 = stmt4.executeQuery(s4);
        while (rs4.next()) {
          l_rooms.add(rs4.getString(1));
          String s = rs4.getString(2);
          String d = rs4.getString(3);
          l_day.add(d);
          String[] ss = s.split("/");
          String otime = ss[0];
          String ctime = ss[1];
          otime = DateType.convert_datetime_to_hour_minute(otime);
          ctime = DateType.convert_datetime_to_hour_minute(ctime);
          s = otime + "-" + ctime;

        }

        room = ReGroup.similar(l_rooms);
        schedule = ReGroup.similar(l_day);
        to_enrollment_offered_subjects to = new to_enrollment_offered_subjects(id, academic_offering_subject_id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, faculty_id, faculty_name, room_id, room, schedule, created_at, updated_at, created_by, updated_by, status, is_uploaded, false,lec,lab);
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

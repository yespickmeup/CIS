/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.students;

import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Students_curriculum {

  //status , loaded=0, enrolled=1, 2=passed, 3=failed,4=dropped
  public static class curriculum {

    public int id;
    public final int academic_year_id;
    public final int department_id;
    public final String department;
    public final int college_id;
    public final String college;
    public final int course_id;
    public final String course_code;
    public final String course_description;
    public final String year_level;
    public String term;
    public final int subject_id;
    public final String subject_code;
    public final String subject_description;
    public final double lec_units;
    public final double lab_units;
    public String section;
    public int status;
    public int academic_offering_subject_id;
    public final int is_paid;
    public final int sls_id;
    public boolean is_loaded;

    public curriculum(int id, int academic_year_id, int department_id, String department, int college_id, String college, int course_id, String course_code, String course_description, String year_level, String term, int subject_id, String subject_code, String subject_description, double lec_units, double lab_units, String section, int status, int academic_offering_subject_id, int is_paid, int sls_id, boolean is_loaded) {
      this.id = id;
      this.academic_year_id = academic_year_id;
      this.department_id = department_id;
      this.department = department;
      this.college_id = college_id;
      this.college = college;
      this.course_id = course_id;
      this.course_code = course_code;
      this.course_description = course_description;
      this.year_level = year_level;
      this.term = term;
      this.subject_id = subject_id;
      this.subject_code = subject_code;
      this.subject_description = subject_description;
      this.lec_units = lec_units;
      this.lab_units = lab_units;
      this.section = section;
      this.status = status;
      this.academic_offering_subject_id = academic_offering_subject_id;
      this.is_paid = is_paid;
      this.sls_id = sls_id;
      this.is_loaded = is_loaded;
    }

    public String getSection() {
      return section;
    }

    public void setSection(String section) {
      this.section = section;
    }

    public int getStatus() {
      return status;
    }

    public void setStatus(int status) {
      this.status = status;
    }

    public boolean isIs_loaded() {
      return is_loaded;
    }

    public void setIs_loaded(boolean is_loaded) {
      this.is_loaded = is_loaded;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTerm() {
      return term;
    }

    public void setTerm(String term) {
      this.term = term;
    }

    public int getAcademic_offering_subject_id() {
      return academic_offering_subject_id;
    }

    public void setAcademic_offering_subject_id(int academic_offering_subject_id) {
      this.academic_offering_subject_id = academic_offering_subject_id;
    }

  }

  public static void main(String[] args) {
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
    Students_curriculum.ret_data(1, 185, 9);
  }

  public static List<curriculum> ret_data(int academic_year_id, int course_id, int student_id) {

    List<curriculum> datas = new ArrayList();
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
              + " where academic_year_id like '" + academic_year_id + "' and course_id like '" + course_id + "' ";

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        int academic_offering_id = rs.getInt(2);
        int academic_year_id2 = rs.getInt(3);
        String academic_year = rs.getString(4);
        int level_id = rs.getInt(5);
        String level = rs.getString(6);
        int college_id = rs.getInt(7);
        String college = rs.getString(8);
        int department_id = rs.getInt(9);
        String department = rs.getString(10);
        int course_id2 = rs.getInt(11);
        String course_code = rs.getString(12);
        String course_description = rs.getString(13);
        String term = rs.getString(14);
        String year_level = rs.getString(15);
        int subject_id = rs.getInt(16);
        String subject_code = rs.getString(17);
//                System.out.println("subject_id: "+subject_id+ " subject_code= "+subject_code);
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
        int is_uploaded = rs.getInt(33);
        String faculty_id = rs.getString(34);
        String faculty_name = rs.getString(35);
        String room = rs.getString(36);
        String schedule = rs.getString(37);
        int room_id = rs.getInt(38);
        String subject_description = description;
        double lec_units = lecture_units;
        String section = "";
        int status = -1;
        int academic_offering_subject_id = -1;
        String s2 = "select "
                + "id"
                + ",status"
                + ",term"
                + ",section"
                + ",academic_offering_subject_id"
                + " from enrollment_student_loaded_subjects"
                + " where student_id='" + student_id + "' and subject_id like '" + subject_id + "'  order by id desc limit 1";

        Statement stmt2 = conn.createStatement();
        ResultSet rs2 = stmt2.executeQuery(s2);
        int id2 = 0;
        while (rs2.next()) {
          id2 = rs2.getInt(1);
          int status2 = rs2.getInt(2);
          status = status2;
          term = rs2.getString(3);
          section = rs2.getString(4);
          academic_offering_subject_id = rs2.getInt(5);
          id = id2;
        }
        int is_paid = 0;
        curriculum cu = new curriculum(id2, academic_year_id2, department_id, department, college_id, college, course_id2, course_code, course_description, year_level, term, subject_id, subject_code, subject_description, lec_units, lab_units, section, status, academic_offering_subject_id, is_paid, id, true);
        datas.add(cu);
      }

      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<String> getStudentEnrolledSubjectDetail(String student_id, String subject_id) {

    Connection conn = MyConnection.connect();
    List<String> datas = new ArrayList();
    try {
      String s2 = "select "
              + "id"
              + ",status"
              + ",term"
              + ",section"
              + ",academic_offering_subject_id"
              + " from enrollment_student_loaded_subjects"
              + " where student_id='" + student_id + "' and subject_id like '" + subject_id + "'  order by id desc limit 1";

      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(s2);
      int status = 0;
      String term = "";
      String section = "";
      int academic_offering_subject_id = 0;
      int id2 = 0;
      int id = 0;
      String is_found = "0";
      while (rs2.next()) {
        id = rs2.getInt(1);
        int status2 = rs2.getInt(2);
        status = status2;
        term = rs2.getString(3);
        section = rs2.getString(4);
        academic_offering_subject_id = rs2.getInt(5);
        is_found = "1";
      }
      datas.add("" + status);
      datas.add(term);
      datas.add(section);
      datas.add("" + academic_offering_subject_id);
      datas.add("" + id);
      datas.add("" + is_found);
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<curriculum> ret_data2(int academic_year_id, int course_id, int student_id) {

    List<curriculum> datas = new ArrayList();
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
              + " where academic_year_id like '" + academic_year_id + "' and course_id like '" + course_id + "' ";

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        int academic_offering_id = rs.getInt(2);
        int academic_year_id2 = rs.getInt(3);
        String academic_year = rs.getString(4);
        int level_id = rs.getInt(5);
        String level = rs.getString(6);
        int college_id = rs.getInt(7);
        String college = rs.getString(8);
        int department_id = rs.getInt(9);
        String department = rs.getString(10);
        int course_id2 = rs.getInt(11);
        String course_code = rs.getString(12);
        String course_description = rs.getString(13);
        String term = rs.getString(14);
        String year_level = rs.getString(15);
        int subject_id = rs.getInt(16);
        String subject_code = rs.getString(17);
//                System.out.println("subject_id: "+subject_id+ " subject_code= "+subject_code);
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
        int is_uploaded = rs.getInt(33);
        String faculty_id = rs.getString(34);
        String faculty_name = rs.getString(35);
        String room = rs.getString(36);
        String schedule = rs.getString(37);
        int room_id = rs.getInt(38);
        String subject_description = description;
        double lec_units = lecture_units;
        String section = "";
        int status = -1;
        int academic_offering_subject_id = -1;
//                String s2 = "select "
//                        + "id"
//                        + ",status"
//                        + ",term"
//                        + ",section"
//                        + ",academic_offering_subject_id"
//                        + " from enrollment_student_loaded_subjects"
//                        + " where student_id='" + student_id + "' and subject_id like '" + subject_id + "'  order by id desc limit 1";
//
//                Statement stmt2 = conn.createStatement();
//                ResultSet rs2 = stmt2.executeQuery(s2);
        int id2 = 0;
//                while (rs2.next()) {
//                    id2 = rs2.getInt(1);
//                    int status2 = rs2.getInt(2);
//                    status = status2;
//                    term = rs2.getString(3);
//                    section = rs2.getString(4);
//                    academic_offering_subject_id = rs2.getInt(5);
//                    id = id2;
//                }
        int is_paid = 0;
        curriculum cu = new curriculum(id2, academic_year_id2, department_id, department, college_id, college, course_id2, course_code, course_description, year_level, term, subject_id, subject_code, subject_description, lec_units, lab_units, section, status, academic_offering_subject_id, is_paid, id, false);
        datas.add(cu);
      }

      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<curriculum> ret_added_subjects(String where) {
    List<curriculum> datas = new ArrayList();

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

        String subject_description = description;
        double lec_units = lecture_units;

        String s3 = "select "
                + " id"
                + " from enrollment_sls_payment_details "
                + " where enrollment_sls_id = '" + id + "'  ";

        Statement stmt3 = conn.createStatement();
        ResultSet rs3 = stmt3.executeQuery(s3);

        int is_paid = 0;
        if (rs3.next()) {
          is_paid = 1;
        }
        curriculum cu = new curriculum(id, academic_year_id, department_id, department, college_id, college, course_id, course_code, course_description, year_level, term, subject_id, subject_code, subject_description, lec_units, lab_units, section, status, academic_offering_subject_id, is_paid, id, false);
        datas.add(cu);
      }
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<curriculum> ret_dropped_subjects(String where) {
    List<curriculum> datas = new ArrayList();

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
              + ",enrollment_student_loaded_subject_id"
              + " from enrollment_student_loaded_subjects_drop_requests"
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
        int enrollment_student_loaded_subject_id = rs.getInt(47);
        String subject_description = description;
        double lec_units = lecture_units;
        academic_offering_subject_id = enrollment_student_loaded_subject_id;

        String s3 = "select "
                + " id"
                + " from enrollment_sls_payment_details "
                + " where enrollment_sls_id = '" + id + "' and status=1 and trans_type=2 ";

        Statement stmt3 = conn.createStatement();
        ResultSet rs3 = stmt3.executeQuery(s3);
        int is_paid = 0;
        if (rs3.next()) {
          is_paid = 1;
        }

        curriculum cu = new curriculum(id, academic_year_id, department_id, department, college_id, college, course_id, course_code, course_description, year_level, term, subject_id, subject_code, subject_description, lec_units, lab_units, section, status, academic_offering_subject_id, is_paid, enrollment_student_loaded_subject_id, false);
        datas.add(cu);
      }
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.academic.Academic_offering_subjects;
import cis.academic.Academic_offering_subjects.to_academic_offering_subjects;
import cis.enrollments.Enrollment_student_loaded_subjects;
import cis.utils.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author User
 */
public class Srpt_transcript_of_records {

  public final String school_name;
  public final String school_address;
  public final String lname;
  public final String fname;
  public final String mname;
  public final String sname;
  public final String address;
  public final String bday;
  public final String school_last_attended;
  public final String school_last_attended_date;
  public final String entrance_credential;
  public final String date_of_admission;
  public final String elementary_school;
  public final String elementary_school_date;
  public final String high_school;
  public final String high_school_date;
  public final String course_code;
  public final String course;
  public final String prepared_by;
  public final String verified_by;
  public final String registrar;
  public final List<field> fields;
  public final String logo_path;
  public final String logo_path2;
  public final String department;
  public final String major;
  public final String date_of_graduation;
  public final String junior_high;
  public final String senior_high;
  public final String junior_high_date;
  public final String senior_high_date;
  public final String parents;
  public final String medium_of_instruction;
  public final String or;
  public final String date;
  public final String photo_url;

  public Srpt_transcript_of_records(String school_name, String school_address, String lname, String fname, String mname, String sname, String address, String bday, String school_last_attended, String school_last_attended_date, String entrance_credential, String date_of_admission, String elementary_school, String elementary_school_date, String high_school, String high_school_date, String course_code, String course, String prepared_by, String verified_by, String registrar, List<field> fields, String logo_path, String logo_path2, String department, String major, String date_of_graduation, String junior_high, String senior_high, String junior_high_date, String senior_high_date, String parents, String medium_of_instruction, String or, String date,String photo_url) {
    this.school_name = school_name;
    this.school_address = school_address;
    this.lname = lname;
    this.fname = fname;
    this.mname = mname;
    this.sname = sname;
    this.address = address;
    this.bday = bday;
    this.school_last_attended = school_last_attended;
    this.school_last_attended_date = school_last_attended_date;
    this.entrance_credential = entrance_credential;
    this.date_of_admission = date_of_admission;
    this.elementary_school = elementary_school;
    this.elementary_school_date = elementary_school_date;
    this.high_school = high_school;
    this.high_school_date = high_school_date;
    this.course_code = course_code;
    this.course = course;
    this.prepared_by = prepared_by;
    this.verified_by = verified_by;
    this.registrar = registrar;
    this.fields = new ArrayList();
    this.logo_path = logo_path;
    this.logo_path2 = logo_path2;
    this.department = department;
    this.major = major;
    this.date_of_graduation = date_of_graduation;
    this.junior_high = junior_high;
    this.senior_high = senior_high;
    this.junior_high_date = junior_high_date;
    this.senior_high_date = senior_high_date;
    this.parents = parents;
    this.medium_of_instruction = medium_of_instruction;
    this.or = or;
    this.date = date;
    this.photo_url=photo_url;
  }

  public static class field {

    String subject_code;
    String description;
    String final_grade;
    String re_exam;
    double units;
    int order;
    String year_level;
    String semester;
    String status;
    double amount;

    public field(String subject_code, String description, String final_grade, String re_exam, double units, int order, String year_level, String semester, String status,double amount) {
      this.subject_code = subject_code;
      this.description = description;
      this.final_grade = final_grade;
      this.re_exam = re_exam;
      this.units = units;
      this.order = order;
      this.year_level = year_level;
      this.semester = semester;
      this.status = status;
      this.amount=amount;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

    
    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public int getOrder() {
      return order;
    }

    public void setOrder(int order) {
      this.order = order;
    }

    public String getYear_level() {
      return year_level;
    }

    public void setYear_level(String year_level) {
      this.year_level = year_level;
    }

    public String getSemester() {
      return semester;
    }

    public void setSemester(String semester) {
      this.semester = semester;
    }

    public String getSubject_code() {
      return subject_code;
    }

    public void setSubject_code(String subject_code) {
      this.subject_code = subject_code;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getFinal_grade() {
      return final_grade;
    }

    public void setFinal_grade(String final_grade) {
      this.final_grade = final_grade;
    }

    public String getRe_exam() {
      return re_exam;
    }

    public void setRe_exam(String re_exam) {
      this.re_exam = re_exam;
    }

    public double getUnits() {
      return units;
    }

    public void setUnits(double units) {
      this.units = units;
    }

  }

  public static void main(String[] args) {
    System.setProperty("pool_db", "db_cis_cosca");
    System.setProperty("pool_password", "password");

    String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
    String school_address = System.getProperty("address", "Bishop Epifanio B. Surban Street, Dumaguete City, Negros Oriental");
    String lname = "SIMBULAN";
    String fname = "ERLYN";
    String mname = "PINEDA";
    String sname = "";
    String address = "36 St. B95 Madapdap Resettlement, Mabalacat, Pampanga";
    String bday = "May 31, 1987";
    String school_last_attended = "Madapdap Resettlement High School";
    String school_last_attended_date = "2004";
    String entrance_credential = "Form 137-A";
    String date_of_admission = "June 2004";
    String elementary_school = "M. Pasig Elementary School";
    String elementary_school_date = "2000";
    String high_school = "Madapdap Resettlement High School";
    String high_school_date = "2004";

    String course_code = "BSBA";
    String course = "Bachelor of Science in Business Administration Major in Management";
    String prepared_by = "";
    String verified_by = "";
    String registrar = "";

    List<field> fields = new ArrayList();

    String[] years = {"First Year", "Second year", "Third Year", "Fourth Year", "Fifth Year"};
    String[] period = {"First Semester", "Second Semester", "Summer Class"};

    int ii = 0;
    String academic_offering_id = "76";
    int student_id = 1366;
    String where = " where academic_offering_id='" + academic_offering_id + "' ";

    List<to_academic_offering_subjects> datas = Academic_offering_subjects.ret_data(where);
    List<Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects> subjects = Enrollment_student_loaded_subjects.ret_data(" where student_id='" + student_id + "' and academic_offering_id='" + academic_offering_id + "' and status=1 ");
    for (int i = 0; i < years.length; i++) {
      for (int iii = 0; iii < period.length; iii++) {
        for (to_academic_offering_subjects to : datas) {
          if (to.year_level.equalsIgnoreCase(years[i]) && to.term.equalsIgnoreCase(period[iii])) {
            String subject_code = to.subject_code;
            String description = to.description;
            String final_grade = "";
            String re_exam = "";
            double units = to.lab_units + to.lecture_units;
            int order = i;
            String year_level = years[i];
            String semester = period[iii];
            String status = "";
            for (Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects subject : subjects) {
              if (to.subject_id == subject.subject_id) {
                final_grade = "" + FitIn.fmt_wc_0(subject.final_grade);
                if (subject.final_grade == 0) {
                  final_grade = "";
                }
                if (subject.final_grade_created_at != null && subject.status == 1) {
                  status = "Ok";
                } else if (subject.final_grade_created_at == null && subject.status == 1) {
                  status = "Ongoing";
                }
                break;
              }
            }
            field f = new field(subject_code, description, final_grade, re_exam, units, order, year_level, semester, status,0);
            fields.add(f);
          }
        }
      }
    }

    String jrxml = "rpt_transcript_of_records.jrxml";
    String img_path = System.getProperty("img_path", "C:\\Users\\USER\\cis\\logo.jpg");
     String img_path2 = System.getProperty("img_path", "C:\\Users\\USER\\cis\\logo2.jpg");
    String department="Department";
    String major="Major";
    String date_of_graduation="Date of Gradaution";
    String junior_high="Junior High";
    String senior_high="Senior High";
    String junior_high_date="01/01/2001";
    String senior_high_date="01/01/2001";
    String parents="Parents";
    String medium_of_instruction="English CHED School COde: 0729 PRC School Code: 1038";
    String or="099689, 01/01/2001";
    String date="June 27, 2022";
    String photo_url="";
    Srpt_transcript_of_records rpt = new Srpt_transcript_of_records(school_name, school_address, lname, fname, mname, sname, address, bday, school_last_attended, school_last_attended_date, entrance_credential, date_of_admission, elementary_school, elementary_school_date, high_school, high_school_date, course_code, course, prepared_by, verified_by, registrar, fields, img_path, img_path2, department, major, date_of_graduation, junior_high, senior_high, junior_high_date, senior_high_date, parents, medium_of_instruction, or, date,photo_url);
    rpt.fields.addAll(fields);
    JRViewer viewer = get_viewer(rpt, jrxml);
    JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static JasperReport compileJasper(String jrxml) {
    try {

      InputStream is = Srpt_transcript_of_records.class.getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);

      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer(Srpt_transcript_of_records to, String jrxml) {

    return JasperUtil.getJasperViewer(
            compileJasper(jrxml),
            JasperUtil.setParameter(to),
            JasperUtil.makeDatasource(to.fields));
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
        String faculty_id = rs.getString(34);
        String faculty_name = rs.getString(35);
        String room = rs.getString(36);
        String schedule = rs.getString(37);
        int room_id = rs.getInt(38);

        to_academic_offering_subjects to = new to_academic_offering_subjects(id, academic_offering_id, academic_year_id, academic_year, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, term, year_level, subject_id, subject_code, description, units, lecture_units, lab_units, amount, is_lab, max_students, prerequisite_subject_ids, subject_group, subject_group_id, created_at, updated_at, created_by, updated_by, status, is_uploaded, FitIn.toInt(faculty_id), faculty_name, room, schedule, room_id, false);
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

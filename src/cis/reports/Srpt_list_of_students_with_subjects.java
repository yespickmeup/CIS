/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import static cis.reports.Srpt_enrollment_assessment.get_viewer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Srpt_list_of_students_with_subjects {

  public final String business_name;
  public final String address;
  public final String contact_no;
  public final String date;
  public final String printed_by;
  public final String school_year;
  public final String semester;

  public final List<field> fields;

  public Srpt_list_of_students_with_subjects(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester) {
    this.business_name = business_name;
    this.address = address;
    this.contact_no = contact_no;
    this.date = date;
    this.printed_by = printed_by;
    this.school_year = school_year;
    this.semester = semester;
    this.fields = new ArrayList();
  }

  public static class field {

    String enrollment_id;
    String student_no;
    String name;
    String course;
    int no;
    String subject_code;
    String description;
    double lec_units;
    double lab_units;
    String section;
    String fg;

    public field() {
    }

    public field(String enrollment_id, String student_no, String name, String course, int no, String subject_code, String description, double lec_units, double lab_units, String section, String fg) {
      this.enrollment_id = enrollment_id;
      this.student_no = student_no;
      this.name = name;
      this.course = course;
      this.no = no;
      this.subject_code = subject_code;
      this.description = description;
      this.lec_units = lec_units;
      this.lab_units = lab_units;
      this.section = section;
      this.fg = fg;
    }

    public String getSection() {
      return section;
    }

    public void setSection(String section) {
      this.section = section;
    }

    public String getFg() {
      return fg;
    }

    public void setFg(String fg) {
      this.fg = fg;
    }

    public String getEnrollment_id() {
      return enrollment_id;
    }

    public void setEnrollment_id(String enrollment_id) {
      this.enrollment_id = enrollment_id;
    }

    public String getStudent_no() {
      return student_no;
    }

    public void setStudent_no(String student_no) {
      this.student_no = student_no;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCourse() {
      return course;
    }

    public void setCourse(String course) {
      this.course = course;
    }

    public int getNo() {
      return no;
    }

    public void setNo(int no) {
      this.no = no;
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

    public double getLec_units() {
      return lec_units;
    }

    public void setLec_units(double lec_units) {
      this.lec_units = lec_units;
    }

    public double getLab_units() {
      return lab_units;
    }

    public void setLab_units(double lab_units) {
      this.lab_units = lab_units;
    }

  }

  public static void main(String[] args) {
    String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
    String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
    String date = DateType.slash.format(new Date());
    String contact_no = System.getProperty("contact_no", "(035) 225 4831");
    String printed_by = "Administrator";
    String school_year = "2020 - 2021";
    String semester = "First Semester";
    List<field> fields = new ArrayList();
    for (int i = 0; i < 20; i++) {
      String student_no = "2020000" + i;
      String name = "Juan Dela Cruz";
      String course = "BSIT-1";
      double no_of_units = i;
      String enrollment_id = "";
      int no = i;
      String subject_code = "";
      String description = "";
      double lec_units = 0;
      double lab_units = 0;
      field f = new field(enrollment_id, student_no, name, course, no, subject_code, description, lec_units, lab_units,"","");
      fields.add(f);
    }
    String jrxml = "rpt_list_of_students.jrxml";
    Srpt_list_of_students_with_subjects rpt = new Srpt_list_of_students_with_subjects(business_name, address, contact_no, date, printed_by, school_year, semester);
    rpt.fields.addAll(fields);
    JRViewer viewer = get_viewer(rpt, jrxml);
    JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static JasperReport compileJasper(String jrxml) {
    try {

      InputStream is = Srpt_list_of_students_with_subjects.class.getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);

      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer(Srpt_list_of_students_with_subjects to, String jrxml) {

    return JasperUtil.getJasperViewer(
            compileJasper(jrxml),
            JasperUtil.setParameter(to),
            JasperUtil.makeDatasource(to.fields));
  }
}

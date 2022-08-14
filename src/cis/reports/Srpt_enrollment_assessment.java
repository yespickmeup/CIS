/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

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
public class Srpt_enrollment_assessment {

  public final String business_name;
  public final String address;
  public final String contact_no;
  public final String date;
  public final String printed_by;
  public final String school_year;
  public final String semester;

  public final String student_no;
  public final String student_name;
  public final String student_course;
  public final String student_year_level;
  public final List<field> fields;
  public final String SUBREPORT_DIR;
  public final List<field_misc> rpt_misc;
  public final List<field_misc> rpt_fees;
  public final double total_assessment;
  public final double downpayment;
  public final double payable;
  public final List<field_summary> rpt_summary;
  public final double tuition_fee;
  public final double misc_fee;
  public final List<field_add_subjects> rpt_added_subjects;
  public final List<field_add_subjects> rpt_dropped_subjects;

  public Srpt_enrollment_assessment(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String student_no, String student_name, String student_course, String student_year_level, String SUBREPORT_DIR, List<field_misc> misc, List<field_misc> rpt_fees, double total_assessment, double downpayment, double payable, List<field_summary> rpt_summary, double tuition_fee, double misc_fee, List<field_add_subjects> rpt_added_subjects, List<field_add_subjects> rpt_dropped_subjects) {
    this.business_name = business_name;
    this.address = address;
    this.contact_no = contact_no;
    this.date = date;
    this.printed_by = printed_by;
    this.school_year = school_year;
    this.semester = semester;
    this.student_no = student_no;
    this.student_name = student_name;
    this.student_course = student_course;
    this.student_year_level = student_year_level;
    this.fields = new ArrayList();
    this.SUBREPORT_DIR = SUBREPORT_DIR;
    this.rpt_misc = misc;
    this.rpt_fees = rpt_fees;
    this.total_assessment = total_assessment;
    this.downpayment = downpayment;
    this.payable = payable;
    this.rpt_summary = rpt_summary;
    this.tuition_fee = tuition_fee;
    this.misc_fee = misc_fee;
    this.rpt_added_subjects = rpt_added_subjects;
    this.rpt_dropped_subjects = rpt_dropped_subjects;
  }

  public static class field_summary {

    double total_assessment;
    double downpayment;
    double payable;
    String mode;
    String date;
    double amount;
    double paid;
    double balance;
    double tuition_fee;
    double misc_fee;
    double other_fee;
    double sub_total;
    String section;
    double total_discount;

    public field_summary() {
    }

    public field_summary(double total_assessment, double downpayment, double payable, String mode, String date, double amount, double paid, double balance, double tuition_fee, double misc_fee, double other_fee, double sub_total, String section, double total_discount) {
      this.total_assessment = total_assessment;
      this.downpayment = downpayment;
      this.payable = payable;
      this.mode = mode;
      this.date = date;
      this.amount = amount;
      this.paid = paid;
      this.balance = balance;
      this.tuition_fee = tuition_fee;
      this.misc_fee = misc_fee;
      this.other_fee = other_fee;
      this.sub_total = sub_total;
      this.section = section;
      this.total_discount = total_discount;
    }

    public double getTotal_discount() {
      return total_discount;
    }

    public void setTotal_discount(double total_discount) {
      this.total_discount = total_discount;
    }

    public String getSection() {
      return section;
    }

    public void setSection(String section) {
      this.section = section;
    }

    public double getSub_total() {
      return sub_total;
    }

    public void setSub_total(double sub_total) {
      this.sub_total = sub_total;
    }

    public double getOther_fee() {
      return other_fee;
    }

    public void setOther_fee(double other_fee) {
      this.other_fee = other_fee;
    }

    public double getMisc_fee() {
      return misc_fee;
    }

    public void setMisc_fee(double misc_fee) {
      this.misc_fee = misc_fee;
    }

    public double getTuition_fee() {
      return tuition_fee;
    }

    public void setTuition_fee(double tuition_fee) {
      this.tuition_fee = tuition_fee;
    }

    public String getMode() {
      return mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

    public double getPaid() {
      return paid;
    }

    public void setPaid(double paid) {
      this.paid = paid;
    }

    public double getBalance() {
      return balance;
    }

    public void setBalance(double balance) {
      this.balance = balance;
    }

    public double getTotal_assessment() {
      return total_assessment;
    }

    public void setTotal_assessment(double total_assessment) {
      this.total_assessment = total_assessment;
    }

    public double getDownpayment() {
      return downpayment;
    }

    public void setDownpayment(double downpayment) {
      this.downpayment = downpayment;
    }

    public double getPayable() {
      return payable;
    }

    public void setPayable(double payable) {
      this.payable = payable;
    }

  }

  public static class field_add_subjects {

    String subject_code;
    String description;
    double lec_units;
    double lab_units;
    double lec_amount;
    double lab_amount;
    String room;
    String day;
    String time;
    String instructor;
    double amount;
    String section;
    String group;

    public field_add_subjects() {
    }

    public field_add_subjects(String subject_code, String description, double lec_units, double lab_units, double lec_amount, double lab_amount, String room, String day, String time, String instructor, double amount, String section, String group) {
      this.subject_code = subject_code;
      this.description = description;
      this.lec_units = lec_units;
      this.lab_units = lab_units;
      this.lec_amount = lec_amount;
      this.lab_amount = lab_amount;
      this.room = room;
      this.day = day;
      this.time = time;
      this.instructor = instructor;
      this.amount = amount;
      this.section = section;
      this.group = group;
    }

    public String getGroup() {
      return group;
    }

    public void setGroup(String group) {
      this.group = group;
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

    public double getLec_amount() {
      return lec_amount;
    }

    public void setLec_amount(double lec_amount) {
      this.lec_amount = lec_amount;
    }

    public double getLab_amount() {
      return lab_amount;
    }

    public void setLab_amount(double lab_amount) {
      this.lab_amount = lab_amount;
    }

    public String getRoom() {
      return room;
    }

    public void setRoom(String room) {
      this.room = room;
    }

    public String getDay() {
      return day;
    }

    public void setDay(String day) {
      this.day = day;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }

    public String getInstructor() {
      return instructor;
    }

    public void setInstructor(String instructor) {
      this.instructor = instructor;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

    public String getSection() {
      return section;
    }

    public void setSection(String section) {
      this.section = section;
    }

  }

  public static class field_misc {

    String misc;
    double amount;

    public field_misc() {
    }

    public field_misc(String misc, double amount) {
      this.misc = misc;
      this.amount = amount;
    }

    public String getMisc() {
      return misc;
    }

    public void setMisc(String misc) {
      this.misc = misc;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

  }

  public static class field {

    String subject_code;
    String description;
    double lec_units;
    double lab_units;
    double lec_amount;
    double lab_amount;
    String room;
    String day;
    String time;
    String instructor;
    double amount;
    String section;

    public field() {
    }

    public field(String subject_code, String description, double lec_units, double lab_units, double lec_amount, double lab_amount, String room, String day, String time, String instructor, double amount, String section) {
      this.subject_code = subject_code;
      this.description = description;
      this.lec_units = lec_units;
      this.lab_units = lab_units;
      this.lec_amount = lec_amount;
      this.lab_amount = lab_amount;
      this.room = room;
      this.day = day;
      this.time = time;
      this.instructor = instructor;
      this.amount = amount;
      this.section = section;
    }

    public String getSection() {
      return section;
    }

    public void setSection(String section) {
      this.section = section;
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

    public double getLec_amount() {
      return lec_amount;
    }

    public void setLec_amount(double lec_amount) {
      this.lec_amount = lec_amount;
    }

    public double getLab_amount() {
      return lab_amount;
    }

    public void setLab_amount(double lab_amount) {
      this.lab_amount = lab_amount;
    }

    public String getRoom() {
      return room;
    }

    public void setRoom(String room) {
      this.room = room;
    }

    public String getDay() {
      return day;
    }

    public void setDay(String day) {
      this.day = day;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }

    public String getInstructor() {
      return instructor;
    }

    public void setInstructor(String instructor) {
      this.instructor = instructor;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }
  }

  public static void main(String[] args) {

    String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
    String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
    String date = DateType.slash.format(new Date());
    String contact_no = System.getProperty("contact_no", "(035) 225 4831");

    String home = System.getProperty("user.home");
    String SUBREPORT_DIR = home + "\\cis\\";

    String printed_by = "Administrator";
    String school_year = "2020 - 2021";
    String semester = "First Semester";

    String student_no = "2020001";
    String student_name = "Ronald Pascua";
    String student_course = "Bachelor of Science in Information Technology";
    String student_year_level = "First Year";
    List<  Srpt_enrollment_assessment.field> fields = new ArrayList();
    for (int i = 0; i < 10; i++) {
      String subject_code = "BA0" + i;
      String description = "Physical Education";
      double lec_units = 3;
      double lab_units = 0;
      double lec_amount = 385;
      double lab_amount = 500;
      String room = "Room1";
      String day = "MWF";
      String time = "8:00am - 9:00am";
      String instructor = "Juan Dela Cruz";
      double amount = 2000;
      String section = "A";
      Srpt_enrollment_assessment.field f = new field(subject_code, description, lec_units, lab_units, lec_amount, lab_amount, room, day, time, instructor, amount, section);
      fields.add(f);
    }
    List<field_misc> misc = new ArrayList();
    List<field_misc> rpt_fees = new ArrayList();
    for (int i = 0; i < 10; i++) {
      field_misc f = new field_misc("Miscelleneous", 200);
      misc.add(f);
    }
    for (int i = 0; i < 14; i++) {
      field_misc f = new field_misc("Other Fees", 100);
      rpt_fees.add(f);
    }
    List<field_summary> rpt_summary = new ArrayList();

    double total_assessment = 1000;
    double downpayment = 500;
    double payable = 500;
    double tuition_fee = 100;
    double misc_fee = 0;
    double other_fee = 0;
    double sub_total = 0;
    String section = "";
    field_summary f2 = new field_summary(total_assessment, downpayment, payable, "", "", 0, 0, 0, tuition_fee, misc_fee, other_fee, sub_total, section, 0);
    rpt_summary.add(f2);

    List<field_add_subjects> rpt_added_subjects = new ArrayList();
    List<field_add_subjects> rpt_dropped_subjects = new ArrayList();
    String jrxml = "rpt_enrollment_assessment.jrxml";
    Srpt_enrollment_assessment rpt = new Srpt_enrollment_assessment(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, student_course, student_year_level, SUBREPORT_DIR, misc, rpt_fees, total_assessment, downpayment, payable, rpt_summary, tuition_fee, misc_fee, rpt_added_subjects, rpt_dropped_subjects);
    rpt.fields.addAll(fields);
    JRViewer viewer = get_viewer(rpt, jrxml);
    JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static JasperReport compileJasper(String jrxml) {
    try {

      InputStream is = Srpt_enrollment_assessment.class.getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);

      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer(Srpt_enrollment_assessment to, String jrxml) {

    return JasperUtil.getJasperViewer(
            compileJasper(jrxml),
            JasperUtil.setParameter(to),
            JasperUtil.makeDatasource(to.fields));
  }

}

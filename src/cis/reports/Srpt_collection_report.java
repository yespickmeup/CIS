/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.utils.DateType;
import cis.utils.MyConnection;
import java.io.InputStream;
import static java.lang.ProcessBuilder.Redirect.to;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

/**
 *
 * @author USER
 */
public class Srpt_collection_report {

  public final String business_name;
  public final String address;
  public final String contact_no;
  public final String school_year;
  public final String semester;
  public final String department;
  public final String college;
  public final String year_level;
  public final String user;
  public final String date;
  public final String printed_by;
  public final List<field> fields;

  public Srpt_collection_report(String business_name, String address, String contact_no, String school_year, String semester, String department, String college, String year_level, String user, String date, String printed_by) {
    this.business_name = business_name;
    this.address = address;
    this.contact_no = contact_no;
    this.school_year = school_year;
    this.semester = semester;
    this.department = department;
    this.college = college;
    this.year_level = year_level;
    this.user = user;
    this.date = date;
    this.printed_by = printed_by;
    this.fields = new ArrayList();
  }

  public static class field {

    int id;
    String transaction_no;
    String or_no;
    String student_name;
    String particular;
    String course;
    String year_level;
    double cash;
    double credit_card;
    double gc;
    double check;
    double online;
    String or_date;

    public field() {
    }

    public field(int id, String transaction_no, String or_no, String student_name, String particular, String course, String year_level, double cash, double credit_card, double gc, double check, double online, String or_date) {
      this.id = id;
      this.transaction_no = transaction_no;
      this.or_no = or_no;
      this.student_name = student_name;
      this.particular = particular;
      this.course = course;
      this.year_level = year_level;
      this.cash = cash;
      this.credit_card = credit_card;
      this.gc = gc;
      this.check = check;
      this.online = online;
      this.or_date = or_date;
    }

    public String getOr_date() {
      return or_date;
    }

    public void setOr_date(String or_date) {
      this.or_date = or_date;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTransaction_no() {
      return transaction_no;
    }

    public void setTransaction_no(String transaction_no) {
      this.transaction_no = transaction_no;
    }

    public String getOr_no() {
      return or_no;
    }

    public void setOr_no(String or_no) {
      this.or_no = or_no;
    }

    public String getStudent_name() {
      return student_name;
    }

    public void setStudent_name(String student_name) {
      this.student_name = student_name;
    }

    public String getParticular() {
      return particular;
    }

    public void setParticular(String particular) {
      this.particular = particular;
    }

    public String getCourse() {
      return course;
    }

    public void setCourse(String course) {
      this.course = course;
    }

    public String getYear_level() {
      return year_level;
    }

    public void setYear_level(String year_level) {
      this.year_level = year_level;
    }

    public double getCash() {
      return cash;
    }

    public void setCash(double cash) {
      this.cash = cash;
    }

    public double getCredit_card() {
      return credit_card;
    }

    public void setCredit_card(double credit_card) {
      this.credit_card = credit_card;
    }

    public double getGc() {
      return gc;
    }

    public void setGc(double gc) {
      this.gc = gc;
    }

    public double getCheck() {
      return check;
    }

    public void setCheck(double check) {
      this.check = check;
    }

    public double getOnline() {
      return online;
    }

    public void setOnline(double online) {
      this.online = online;
    }

  }

  public static void main(String[] args) {
    System.setProperty("pool_db", "db_cis_cosca");
    System.setProperty("pool_password", "password");

    String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
    String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");

    String contact_no = System.getProperty("contact_no", "(035) 225 4831");

    String school_year = "2020 - 2021";
    String semester = "First Semester";

    String department = "Department";
    String college = "College";
    String year_level = "Year Level";

    String user = "User";
    String date = DateType.slash.format(new Date());
    String printed_by = "Administrator";

    String jrxml = "rpt_collection_report.jrxml";

    String where = "";

    List<Srpt_collection_report.field> datas = Srpt_collection_report.ret_data(where);

    Srpt_collection_report rpt = new Srpt_collection_report(business_name, address, contact_no, school_year, semester, department, college, year_level, user, date, printed_by);

    rpt.fields.addAll(datas);
    JRViewer viewer = get_viewer(rpt, jrxml);
    JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public static JasperReport compileJasper(String jrxml) {
    try {

      InputStream is = Srpt_collection_report.class.getResourceAsStream(jrxml);
      JasperReport jasper = JasperCompileManager.compileReport(is);

      return jasper;
    } catch (JRException e) {
      throw new RuntimeException(e);
    }
  }

  public static JRViewer get_viewer(Srpt_collection_report to, String jrxml) {

    return JasperUtil.getJasperViewer(
            compileJasper(jrxml),
            JasperUtil.setParameter(to),
            JasperUtil.makeDatasource(to.fields));
  }

  public static List<field> ret_data(String where) {
    List<field> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
              + ",collection_no"
              + ",or_no"
              + ",payment_type"
              + ",amount_paid"
              + ",cash"
              + ",discount_name"
              + ",discount_rate"
              + ",discount_amount"
              + ",discount_customer_name"
              + ",discount_customer_id"
              + ",check_amount"
              + ",check_bank"
              + ",check_no"
              + ",check_holder"
              + ",check_date"
              + ",credit_card_type"
              + ",credit_card_rate"
              + ",credit_card_amount"
              + ",credit_card_no"
              + ",gift_certificate_from"
              + ",gift_certificate_description"
              + ",gift_certificate_no"
              + ",gift_certificate_amount"
              + ",online_bank"
              + ",online_reference_no"
              + ",online_amount"
              + ",online_holder"
              + ",online_date"
              + ",created_at"
              + ",updated_at"
              + ",created_by"
              + ",updated_by"
              + ",status"
              + ",is_uploaded"
              + ",ref_id"
              + ",school_year"
              + ",period"
              + ",year_level"
              + ",department_id"
              + ",department"
              + ",college_id"
              + ",college"
              + ",course_id"
              + ",course"
              + ",student_id"
              + ",student_no"
              + ",student_name"
              + " from collections"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      int count = 1;
      while (rs.next()) {
        int id = rs.getInt(1);
        String collection_no = rs.getString(2);
        String or_no = rs.getString(3);
        String payment_type = rs.getString(4);
        double amount_paid = rs.getDouble(5);
        double cash = rs.getDouble(6);
        String discount_name = rs.getString(7);
        double discount_rate = rs.getDouble(8);
        double discount_amount = rs.getDouble(9);
        String discount_customer_name = rs.getString(10);
        String discount_customer_id = rs.getString(11);
        double check_amount = rs.getDouble(12);
        String check_bank = rs.getString(13);
        String check_no = rs.getString(14);
        String check_holder = rs.getString(15);
        String check_date = rs.getString(16);
        String credit_card_type = rs.getString(17);
        double credit_card_rate = rs.getDouble(18);
        double credit_card_amount = rs.getDouble(19);
        String credit_card_no = rs.getString(20);
        String gift_certificate_from = rs.getString(21);
        String gift_certificate_description = rs.getString(22);
        String gift_certificate_no = rs.getString(23);
        double gift_certificate_amount = rs.getDouble(24);
        String online_bank = rs.getString(25);
        String online_reference_no = rs.getString(26);
        double online_amount = rs.getDouble(27);
        String online_holder = rs.getString(28);
        String online_date = rs.getString(29);
        String created_at = rs.getString(30);
        String updated_at = rs.getString(31);
        created_at = updated_at;
        String created_by = rs.getString(32);
        String updated_by = rs.getString(33);
        int status = rs.getInt(34);
        int is_uploaded = rs.getInt(35);
        int ref_id = rs.getInt(36);
        String school_year = rs.getString(37);
        String period = rs.getString(38);
        String year_level = rs.getString(39);
        String department_id = rs.getString(40);
        String department = rs.getString(41);
        String college_id = rs.getString(42);
        String college = rs.getString(43);
        String course_id = rs.getString(44);
        String course = rs.getString(45);
        String student_id = rs.getString(46);
        String student_no = rs.getString(47);
        String student_name = rs.getString(48);
        int id1 = count;
        String transaction_no = collection_no;
        String particular = payment_type;
        double credit_card = credit_card_amount;
        double gc = gift_certificate_amount;
        double check = check_amount;
        double online = online_amount;
        String or_date = DateType.convert_slash_datetime3(created_at);
        if (status < 2) {
          field f = new field(id1, transaction_no, or_no, student_name, particular, course, year_level, cash, credit_card, gc, check, online, or_date);
          datas.add(f);
          count++;
        }
//        System.out.println("or_no: " + or_no);

      }
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

}

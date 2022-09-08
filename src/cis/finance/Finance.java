/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.students.Students;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Finance {

  public static class fees {

    public final int id;
    public final String title;
    public final String date;
    public final String deadline;
    public final double amount;
    public final double interest;
    public final double paid;
    public final double balance;
    public boolean selected;
    public final int trans_type;
    public double new_payment;
    public final String mode;
    public final String year;
    public final String term;
    public final String or_no;
    public final double discount;

    public fees(int id, String title, String date, String deadline, double amount, double interest, double paid, double balance, boolean selected, int trans_type, double new_payment, String mode, String year, String term, String or_no, double discount) {
      this.id = id;
      this.title = title;
      this.date = date;
      this.deadline = deadline;
      this.amount = amount;
      this.interest = interest;
      this.paid = paid;
      this.balance = balance;
      this.selected = selected;
      this.trans_type = trans_type;
      this.new_payment = new_payment;
      this.mode = mode;
      this.year = year;
      this.term = term;
      this.or_no = or_no;
      this.discount = discount;
    }

    public double getNew_payment() {
      return new_payment;
    }

    public void setNew_payment(double new_payment) {
      this.new_payment = new_payment;
    }

    public boolean isSelected() {
      return selected;
    }

    public void setSelected(boolean selected) {
      this.selected = selected;
    }
  }

  public static class transactions implements Comparable<transactions> {

    public final int id;
    public final String date;
    public final String trans_type;
    public final double amount;
    public Date created;
    public final String mode;
    public final String year_level;
    public final String term;
    public final String academic_year;
    public final double debit;
    public final double credit;
    public final double balance;
    public final String or_no;

    public transactions(int id, String date, String trans_type, double amount, Date created, String mode, String year_level, String term, String academic_year, double debit, double credit, double balance, String or_no) {
      this.id = id;
      this.date = date;
      this.trans_type = trans_type;
      this.amount = amount;
      this.created = created;
      this.mode = mode;
      this.year_level = year_level;
      this.term = term;
      this.academic_year = academic_year;
      this.debit = debit;
      this.credit = credit;
      this.balance = balance;
      this.or_no = or_no;
    }

    public Date getCreated() {
      return created;
    }

    public void setCreated(Date created) {
      this.created = created;
    }

    @Override
    public int compareTo(transactions o) {
      return getCreated().compareTo(o.getCreated());
    }
  }

  public static List<fees> ret_data(Students.to_students stud, double fee_amount, int is_per_unit, double per_unit, double lab_unit_amount) {
    List<fees> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "ea.id"
              + ",ea.enrollment_assessment_id"
              + ",ea.enrollment_id"
              + ",ea.enrollment_no"
              + ",ea.mode"
              + ",ea.to_pay"
              + ",ea.amount"
              + ",ea.paid"
              + ",ea.created_at"
              + ",e.term"
              + ",e.year_level"
              + ",(select ee.period from enrollments ee where id=ea.enrollment_id limit 1) "
              + " from enrollment_assessment_payment_modes ea "
              + " left join enrollment_assessments e "
              + " on ea.enrollment_assessment_id = e.id "
              + " where e.student_id='" + stud.id + "' "
              + " and (ea.amount-ea.paid) >0 ";

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);

      while (rs.next()) {
        int id = rs.getInt(1);
        int enrollment_assessment_id = rs.getInt(2);
        int enrollment_id = rs.getInt(3);
        String enrollment_no = rs.getString(4);
        String mode = rs.getString(5);
        String to_pay = rs.getString(6);
        double amount = rs.getDouble(7);
        double paid = rs.getDouble(8);
        String created_at = rs.getString(9);
        String term = rs.getString(10);
        String year_level = rs.getString(11);
        String period = rs.getString(12);
        if (term.isEmpty() || year_level.isEmpty()) {
          String s5 = "select period,year_level from enrollments where id='" + enrollment_id + "' limit 1";
          Statement stmt5 = conn.createStatement();
          ResultSet rs5 = stmt5.executeQuery(s5);
          if (rs5.next()) {
            year_level = rs5.getString(2);
            term = rs5.getString(1);
          }
        }

        String title
                = "<html><body>"
                + "&nbsp <font color=\"black\";size=\"4\"><b>" + year_level + "</b> - " + period + "</font><br>"
                + "&nbsp <font size=\"2\"> " + mode + " </font><br>"
                + "</body>"
                + "</html>";

        String date = DateType.convert_slash_datetime(created_at);
        String deadline = DateType.convert_slash_datetime2(to_pay);
        double amount2 = amount;
        double interest = 0;
        double paid2 = paid;
        double balance = amount2 - paid2;
        boolean selected = false;

        String s10 = "select "
                + "paid"
                + " from enrollment_assessment_payment_details"
                + " where enrollment_assessment_id='" + enrollment_assessment_id + "' "
                + " and mode like '" + mode + "' and mode_order=100 and status=0 ";

        Statement stmt10 = conn.createStatement();
        ResultSet rs10 = stmt10.executeQuery(s10);
        double payment = 0;
        while (rs10.next()) {
          payment += rs10.getDouble(1);
        }
        paid2 = paid2 + payment;
        balance = balance - payment;
//        System.out.println("Amount: "+amount);
        String s_discount = "select total_discount from enrollment_assessment_discounts where status= 1 and enrollment_assessment_id = '" + enrollment_assessment_id + "' ";
        Statement stmt11 = conn.createStatement();
        ResultSet rs11 = stmt11.executeQuery(s_discount);

        double discount2 = 0;
        while (rs11.next()) {
          double disc = rs11.getInt(1);
          discount2 += disc;
        }
        fees f = new fees(id, title, date, deadline, amount, interest, paid2, balance, selected, 1, 0, mode, year_level, term, "", discount2);
        if (balance > 0) {
          datas.add(f);
        }

      }

      //<editor-fold defaultstate="collapsed" desc=" Search Academic Year feess ">
      //</editor-fold>
      int no_of_units_lec = 0;
      int no_of_units_lab = 0;
      //<editor-fold defaultstate="collapsed" desc=" loaded subjects ">
      String s2 = "select "
              + "subject_code"
              + ",lecture_units"
              + ",lab_units"
              + ",created_at"
              + ",id"
              + ",term"
              + ",year_level"
              + " from enrollment_student_loaded_subjects"
              + " where student_id='" + stud.id + "' and status=0 ";

      String year_level = "";
      String term = "";
      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(s2);
      String subject_codes = "";
      int added_subjects = 0;
      String added_subjects_date = "";
      while (rs2.next()) {
        String subject_code = rs2.getString(1);
        int lecture_units = rs2.getInt(2);
        int lab_units = rs2.getInt(3);
        String created_at = rs2.getString(4);
        int idd = rs2.getInt(5);
        term = rs2.getString(6);
        year_level = rs2.getString(7);
        String s3 = "select "
                + " espd.id"
                + " from enrollment_sls_payment_details espd"
                + " where espd.enrollment_sls_id = '" + idd + "'  and espd.status=1 and espd.trans_type=1 limit 1";

        Statement stmt3 = conn.createStatement();
        ResultSet rs3 = stmt3.executeQuery(s3);

        int is_paid = 0;
        if (rs3.next()) {
          is_paid = 1;
        }
        if (is_paid == 0) {
          if (added_subjects == 0) {
            subject_codes = subject_code;
          } else {
            subject_codes = subject_codes + ", " + subject_code;
          }

          added_subjects_date = DateType.convert_slash_datetime(created_at);
          no_of_units_lec += lecture_units;
          no_of_units_lab += lab_units;
          added_subjects++;
        }

      }
      double amount2 = 0;

      if (is_per_unit == 1) {
        double total_lec_amount = per_unit * no_of_units_lec;
        double total_lab_amount = lab_unit_amount * no_of_units_lab;
        amount2 = total_lec_amount + total_lab_amount;
      } else {
        amount2 = fee_amount;
      }
      double total_units = no_of_units_lec + no_of_units_lab;
      String title
              = "<html><body>"
              + "&nbsp <font color=\"black\";size=\"4\"><b>" + "Add Subject Requests" + "</b> - " + total_units + " units </font><br>"
              + "&nbsp <font size=\"2\"> " + "Subject/s: " + " (" + subject_codes + ")</font><br>"
              + "</body>"
              + "</html>";

      String date = added_subjects_date;
      String deadline = "";
      double interest = 0;
      double paid2 = 0;
      double balance = amount2 - paid2;
      boolean selected = false;

      if (added_subjects != 0) {
        double discount = 0;
        fees f = new fees(0, title, date, deadline, amount2, interest, paid2, balance, selected, 2, 0, "Add Subject", year_level, term, "", discount);
        datas.add(f);
      }
      //</editor-fold>
      //<editor-fold defaultstate="collapsed" desc=" Drop subjects ">
      String s4 = "select "
              + "subject_code"
              + ",lecture_units"
              + ",lab_units"
              + ",created_at"
              + ",id"
              + ",year_level"
              + ",term"
              + " from enrollment_student_loaded_subjects_drop_requests"
              + " where student_id='" + stud.id + "' and status=0 ";

      Statement stmt4 = conn.createStatement();
      ResultSet rs4 = stmt4.executeQuery(s4);
      String subject_codes2 = "";
      int dropped_subjects2 = 0;
      String added_subjects_date2 = "";
      double no_of_units_lec2 = 0;
      double no_of_units_lab2 = 0;
      while (rs4.next()) {
        String subject_code = rs4.getString(1);
        int lecture_units = rs4.getInt(2);
        int lab_units = rs4.getInt(3);
        String created_at = rs4.getString(4);
        int idd = rs4.getInt(5);
        term = rs4.getString(6);
        String s3 = "select "
                + " id"
                + " from enrollment_sls_payment_details "
                + " where enrollment_sls_id = '" + idd + "'  and status=1 and trans_type=2 limit 1";

        Statement stmt3 = conn.createStatement();
        ResultSet rs3 = stmt3.executeQuery(s3);

        int is_paid = 0;
        if (rs3.next()) {
          is_paid = 1;
        }

        if (is_paid == 0) {
          if (dropped_subjects2 == 0) {
            subject_codes2 = subject_code;
          } else {
            subject_codes2 = subject_codes2 + ", " + subject_code;
          }

          added_subjects_date2 = DateType.convert_slash_datetime(created_at);
          no_of_units_lec2 += lecture_units;
          no_of_units_lab2 += lab_units;
          dropped_subjects2++;
        }

      }
      double amount3 = 0;

      if (is_per_unit == 1) {
        double total_lec_amount = per_unit * no_of_units_lec2;
        double total_lab_amount = lab_unit_amount * no_of_units_lab2;
        amount3 = total_lec_amount + total_lab_amount;
      } else {
        amount3 = fee_amount;
      }
      double total_units2 = no_of_units_lec2 + no_of_units_lab2;
      String title2
              = "<html><body>"
              + "&nbsp <font color=\"black\";size=\"4\"><b>" + "Drop Subject Requests" + "</b> - " + total_units2 + " units </font><br>"
              + "&nbsp <font size=\"2\"> " + "Subject/s: " + " (" + subject_codes2 + ")</font><br>"
              + "</body>"
              + "</html>";

      String date2 = added_subjects_date2;
      String deadline2 = "";
      double interest2 = 0;
      double paid3 = 0;
      double balance2 = amount3 - paid3;
      boolean selected2 = false;

      if (dropped_subjects2 != 0) {
        double discount = 0;
        fees f = new fees(0, title2, date2, deadline2, amount3, interest2, paid3, balance2, selected2, 3, 0, "Drop Subject", year_level, term, "", discount);
        datas.add(f);
      }
      //</editor-fold>

      //<editor-fold defaultstate="collapsed" desc=" Adjustments ">
      String s5 = "select "
              + "id"
              + ",year_level"
              + ",term"
              + ",adjustment_amount"
              + ",paid"
              + ",remarks"
              + ",created_at"
              + ",is_payable"
              + ",particular"
              + " from student_balance_adjustments"
              + " where student_id='" + stud.id + "' ";

      Statement stmt5 = conn.createStatement();
      ResultSet rs5 = stmt5.executeQuery(s5);
      while (rs5.next()) {
        int id = rs5.getInt(1);
        String year_level3 = rs5.getString(2);
        String term3 = rs5.getString(3);
        double adjustment_amount = rs5.getDouble(4);
        double paid = rs5.getDouble(5);
        String remarks = rs5.getString(6);
        String created_at = rs5.getString(7);
        int is_payable = rs5.getInt(8);
        String particular = rs5.getString(9);
        double balance3 = adjustment_amount - paid;
        if (balance3 > 0 && is_payable == 1) {
          double discount = 0;
          String title3
                  = "<html><body>"
                  + "&nbsp <font color=\"black\";size=\"4\"><b>" + "" + particular + "</b> ( " + DateType.convert_slash_datetime(created_at) + ")  </font><br>"
                  + "&nbsp <font size=\"2\"> " + "Remarks: " + " (" + remarks + ")</font><br>"
                  + "</body>"
                  + "</html>";
          fees f2 = new fees(id, title3, DateType.convert_slash_datetime(created_at), deadline2, adjustment_amount, 0, paid, balance3, selected2, 5, 0, "Adjustment - Balance", year_level3, term3, "", discount);
          datas.add(f2);
        }
      }
      //</editor-fold>

      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<Finance.transactions> ret_transactions(Students.to_students student) {
    List<Finance.transactions> datas = new ArrayList();
    double balance = 0;
    try {
      Connection conn = MyConnection.connect();

      String s4 = "select "
              + "ea.id"
              + ",ea.created_at"
              + ",ea.year_level"
              + ",ea.academic_year"
              + ",(select e.period from enrollments e where e.enrollment_no=ea.enrollment_no limit 1)"
              + ",ea.enrollment_id"
              + " from enrollment_assessments ea"
              + " where ea.student_id='" + student.id + "' and ea.academic_year_id >= 12";
      String period = "";
      Statement stmt4 = conn.createStatement();
      ResultSet rs4 = stmt4.executeQuery(s4);
      while (rs4.next()) {
        int id = rs4.getInt(1);
        String created_at = rs4.getString(2);
        String year_level = rs4.getString(3);
        String academic_year = rs4.getString(4);
        period = rs4.getString(5);
        String enrollment_id = rs4.getString(6);
        String s5 = "select "
                + " amount"
                + " from enrollment_assessment_payment_modes"
                + " where enrollment_assessment_id='" + id + "' ";

        Statement stmt5 = conn.createStatement();
        ResultSet rs5 = stmt5.executeQuery(s5);
        double amount = 0;
        while (rs5.next()) {
          amount += rs5.getDouble(1);
        }
        Date d = new Date();
        String mode = "Assessment - " + year_level + " (" + period + ")";

        double debit = amount;
        double credit = 0;
        balance += debit;

        try {
          // 2020-07-15 10:28:47
          d = DateType.datetime.parse(created_at);
          int hour = d.getHours();
          String sf = DateType.sf.format(d);
          String date = sf + " " + "00" + ":00:01";
          d = DateType.datetime.parse(date);
        } catch (ParseException ex) {

          d = new Date();
        }
        Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, amount, d, mode, year_level, period, academic_year, debit, credit, balance, "");
        datas.add(to);

        String s100 = "select "
                + "p.amount"
                + ",(select c.or_no from collections c where p.collection_id=c.id limit 1)"
                + " from downpayments p"
                + " where enrollment_id='" + enrollment_id + "' limit 1";
        System.out.println(s100);
        Statement stmt100 = conn.createStatement();
        ResultSet rs100 = stmt100.executeQuery(s100);
        if (rs100.next()) {
          double down = rs100.getDouble(1);
          String or_no = rs100.getString(2);
          double debit1 = 0;
          double credit1 = down;
          balance -= credit1;
//        System.out.println(balance);
          String mode100 = "Downpayment - " + year_level + " (" + period + ")";
          Finance.transactions to100 = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode100, amount, d, mode100, year_level, period, academic_year, debit1, credit1, balance, or_no);
          datas.add(to100);
        }
      }

      String s0 = "select "
              + " eap.id"
              + ",eap.amount_paid"
              + ",eap.created_at"
              + ",ea.year_level"
              + ",(select e.period from enrollments e where e.enrollment_no=ea.enrollment_no limit 1)"
              + ",ea.academic_year"
              + ",(select c.or_no from collections c where eap.collection_id=c.id limit 1)"
              + " from enrollment_assessment_payments eap "
              + " right join enrollment_assessments ea "
              + " on eap.enrollment_assessment_id = ea.id "
              + " where ea.student_id='" + student.id + "'  and eap.status=0 and eap.academic_year_id >= 12 "
              + " order by eap.created_at asc ";
//      System.out.println(s0);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);

      String year_level = "";
      String term = "";
      String academic_year = "";
      double debit = 0;
      double credit = 0;

      while (rs.next()) {
        int id = rs.getInt(1);
        double amount_paid = rs.getDouble(2);
        String created_at = rs.getString(3);
        year_level = rs.getString(4);
        term = rs.getString(5);
        academic_year = rs.getString(6);
        String or_no = rs.getString(7);
        Date d = new Date();
        try {
          d = DateType.datetime.parse(created_at);
        } catch (ParseException ex) {
          d = new Date();
        }
//        System.out.println("id: " + id + " = " + amount_paid);
        if (amount_paid > 0) {
          credit = amount_paid;
          balance -= credit;
//        System.out.println(balance);
          String mode = "Assessment Payment - " + year_level + " (" + term + ")";
          Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, amount_paid, d, mode, year_level, term, academic_year, debit, credit, balance, or_no);
          datas.add(to);
        }

      }
//      System.out.println("credit: " + credit);
      String s2 = "select "
              + " ea.id"
              + ",ea.trans_type"
              + ",ea.amount_paid"
              + ",ea.created_at"
              + ",ea.academic_year"
              + ",(select e.year_level from enrollments e where e.enrollment_no=ea.enrollment_no limit 1)"
              + ",(select e.period from enrollments e where e.enrollment_no=ea.enrollment_no limit 1)"
              + ",ea.discount_amount"
              + ",(select c.or_no from collections c where c.id=ea.collection_id limit 1)"
              + " from enrollment_sls_payments ea "
              + " where ea.student_id='" + student.id + "' and ea.academic_year_id >= 12";

      Statement stmt2 = conn.createStatement();
      ResultSet rs2 = stmt2.executeQuery(s2);
      String year_level2 = "";
      String term2 = "";
      String academic_year2 = "";
      double debit2 = 0;
      double credit2 = 0;

      while (rs2.next()) {
        int id = rs2.getInt(1);
        int trans_type = rs2.getInt(2);
        double amount_paid = rs2.getDouble(3);
        String created_at = rs2.getString(4);
        year_level2 = rs2.getString(6);
        term2 = rs2.getString(7);
        academic_year2 = rs2.getString(5);
        double discount_amount = rs2.getDouble(8);
        String or_no = rs2.getString(9);
        Date d = new Date();

        try {
          d = DateType.datetime.parse(created_at);
        } catch (ParseException ex) {
          d = new Date();
        }
        amount_paid = amount_paid - discount_amount;
        if (trans_type == 1) {
          credit2 = 0;
          debit2 = amount_paid;
          balance += debit2;
          Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), "Add Subject", amount_paid, d, "Add Subject", year_level2, term2, academic_year2, debit2, credit2, balance, or_no);
          datas.add(to);
        }
        if (trans_type == 2) {
          debit2 = 0;
          credit2 = amount_paid;
          balance -= credit2;
          Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), "Drop Subject", amount_paid, d, "Drop Subject", year_level2, term2, academic_year2, debit2, credit2, balance, or_no);
          datas.add(to);
        }

      }

      //<editor-fold defaultstate="collapsed" desc=" Adjustments ">
      String s5 = "select "
              + "id"
              + ",adjustment_amount"
              + ",created_at"
              + ",is_payable"
              + ",particular"
              + ",is_add"
              + " from student_balance_adjustments"
              + " where student_id='" + student.id + "' and academic_year_id >= 12 ";

      Statement stmt5 = conn.createStatement();
      ResultSet rs5 = stmt5.executeQuery(s5);
      while (rs5.next()) {
        int id = rs5.getInt(1);
        double adjustment_amount = rs5.getDouble(2);
        String created_at = rs5.getString(3);
        int is_payable = rs5.getInt(4);
        String particular = rs5.getString(5);
        int is_add = rs5.getInt(6);
        String mode = "" + particular;
        Date d = new Date();
        try {
          d = DateType.datetime.parse(created_at);
        } catch (ParseException ex) {
          d = new Date();
        }
        double debit1 = adjustment_amount;
        double credit1 = 0;

        if (is_payable == 1) {
          balance += debit1;
          Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, adjustment_amount, d, mode, year_level, "", academic_year, debit1, credit1, balance, "");
          datas.add(to);
        } else {
//          System.out.println("is_payable2: " + is_payable);
          if (is_add == 1) {
            mode = "Adjustment - Add";
            balance += debit1;
            Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, adjustment_amount, d, mode, year_level, "", academic_year, debit1, credit1, balance, "");
            datas.add(to);
          } else {
            debit1 = 0;
            credit1 = adjustment_amount;
            mode = "Adjustment - Deduct";
            balance -= credit1;
            Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, adjustment_amount, d, mode, year_level, "", academic_year, debit1, credit1, balance, "");
            datas.add(to);
          }
        }

      }
      //</editor-fold>

      //<editor-fold defaultstate="collapsed" desc=" Adjustment Payments ">
      String s6 = "select "
              + "id"
              + ",adjustment_amount"
              + ",paid"
              + ",created_at"
              + ",particular"
              + " from student_balance_adjustment_payments"
              + " where student_id='" + student.id + "'  ";

      Statement stmt6 = conn.createStatement();
      ResultSet rs6 = stmt6.executeQuery(s6);
      while (rs6.next()) {
        int id = rs6.getInt(1);
        double adjustment_amount = rs6.getDouble(2);
        double paid = rs6.getDouble(3);
        String created_at = rs6.getString(4);
        String particular = rs6.getString(5);
        String mode = "Adjustment - Add";
        double debit1 = 0;
        double credit1 = paid;
        mode = particular + " - Payment";
        Date d = new Date();
        try {
          d = DateType.datetime.parse(created_at);
        } catch (ParseException ex) {
          d = new Date();
        }
        balance -= credit1;
        Finance.transactions to = new Finance.transactions(id, DateType.convert_slash_datetime3(created_at), mode, adjustment_amount, d, mode, year_level, "", academic_year, debit1, credit1, balance, "");
        datas.add(to);
      }

      //</editor-fold>
      Collections.sort(datas, new Comparator<Finance.transactions>() {
                 public int compare(Finance.transactions o1, Finance.transactions o2) {
                   return o1.getCreated().compareTo(o2.getCreated());
                 }
               });
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.collections;

import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author USER
 */
public class Collection {

  public static class to_collections {

    public final int id;
    public final String collection_no;
    public final String or_no;
    public final String payment_type;
    public final double amount_paid;
    public final double cash;
    public final String discount_name;
    public final double discount_rate;
    public final double discount_amount;
    public final String discount_customer_name;
    public final String discount_customer_id;
    public final double check_amount;
    public final String check_bank;
    public final String check_no;
    public final String check_holder;
    public final String check_date;
    public final String credit_card_type;
    public final double credit_card_rate;
    public final double credit_card_amount;
    public final String credit_card_no;
    public final String gift_certificate_from;
    public final String gift_certificate_description;
    public final String gift_certificate_no;
    public final double gift_certificate_amount;
    public final String online_bank;
    public final String online_reference_no;
    public final double online_amount;
    public final String online_holder;
    public final String online_date;
    public final String created_at;
    public final String updated_at;
    public final String created_by;
    public final String updated_by;
    public final int status;
    public final int is_uploaded;
    public final int ref_id;
    public final String school_year;
    public final String period;
    public final String year_level;
    public final String department_id;
    public final String department;
    public final String college_id;
    public final String college;
    public final String course_id;
    public final String course;
    public final String student_id;
    public final String student_no;
    public final String student_name;

    public to_collections(int id, String collection_no, String or_no, String payment_type, double amount_paid, double cash, String discount_name, double discount_rate, double discount_amount, String discount_customer_name, String discount_customer_id, double check_amount, String check_bank, String check_no, String check_holder, String check_date, String credit_card_type, double credit_card_rate, double credit_card_amount, String credit_card_no, String gift_certificate_from, String gift_certificate_description, String gift_certificate_no, double gift_certificate_amount, String online_bank, String online_reference_no, double online_amount, String online_holder, String online_date, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int ref_id, String school_year, String period, String year_level, String department_id, String department, String college_id, String college, String course_id, String course, String student_id, String student_no, String student_name) {
      this.id = id;
      this.collection_no = collection_no;
      this.or_no = or_no;
      this.payment_type = payment_type;
      this.amount_paid = amount_paid;
      this.cash = cash;
      this.discount_name = discount_name;
      this.discount_rate = discount_rate;
      this.discount_amount = discount_amount;
      this.discount_customer_name = discount_customer_name;
      this.discount_customer_id = discount_customer_id;
      this.check_amount = check_amount;
      this.check_bank = check_bank;
      this.check_no = check_no;
      this.check_holder = check_holder;
      this.check_date = check_date;
      this.credit_card_type = credit_card_type;
      this.credit_card_rate = credit_card_rate;
      this.credit_card_amount = credit_card_amount;
      this.credit_card_no = credit_card_no;
      this.gift_certificate_from = gift_certificate_from;
      this.gift_certificate_description = gift_certificate_description;
      this.gift_certificate_no = gift_certificate_no;
      this.gift_certificate_amount = gift_certificate_amount;
      this.online_bank = online_bank;
      this.online_reference_no = online_reference_no;
      this.online_amount = online_amount;
      this.online_holder = online_holder;
      this.online_date = online_date;
      this.created_at = created_at;
      this.updated_at = updated_at;
      this.created_by = created_by;
      this.updated_by = updated_by;
      this.status = status;
      this.is_uploaded = is_uploaded;
      this.ref_id = ref_id;
      this.school_year = school_year;
      this.period = period;
      this.year_level = year_level;
      this.department_id = department_id;
      this.department = department;
      this.college_id = college_id;
      this.college = college;
      this.course_id = course_id;
      this.course = course;
      this.student_id = student_id;
      this.student_no = student_no;
      this.student_name = student_name;
    }
  }

  public static void add_data(to_collections to_collections) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into collections("
              + "collection_no"
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
              + ")values("
              + ":collection_no"
              + ",:or_no"
              + ",:payment_type"
              + ",:amount_paid"
              + ",:cash"
              + ",:discount_name"
              + ",:discount_rate"
              + ",:discount_amount"
              + ",:discount_customer_name"
              + ",:discount_customer_id"
              + ",:check_amount"
              + ",:check_bank"
              + ",:check_no"
              + ",:check_holder"
              + ",:check_date"
              + ",:credit_card_type"
              + ",:credit_card_rate"
              + ",:credit_card_amount"
              + ",:credit_card_no"
              + ",:gift_certificate_from"
              + ",:gift_certificate_description"
              + ",:gift_certificate_no"
              + ",:gift_certificate_amount"
              + ",:online_bank"
              + ",:online_reference_no"
              + ",:online_amount"
              + ",:online_holder"
              + ",:online_date"
              + ",:created_at"
              + ",:updated_at"
              + ",:created_by"
              + ",:updated_by"
              + ",:status"
              + ",:is_uploaded"
              + ",:ref_id"
              + ",:school_year"
              + ",:period"
              + ",:year_level"
              + ",:department_id"
              + ",:department"
              + ",:college_id"
              + ",:college"
              + ",:course_id"
              + ",:course"
              + ",:student_id"
              + ",:student_no"
              + ",:student_name"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setString("collection_no", to_collections.collection_no)
              .setString("or_no", to_collections.or_no)
              .setString("payment_type", to_collections.payment_type)
              .setNumber("amount_paid", to_collections.amount_paid)
              .setNumber("cash", to_collections.cash)
              .setString("discount_name", to_collections.discount_name)
              .setNumber("discount_rate", to_collections.discount_rate)
              .setNumber("discount_amount", to_collections.discount_amount)
              .setString("discount_customer_name", to_collections.discount_customer_name)
              .setString("discount_customer_id", to_collections.discount_customer_id)
              .setNumber("check_amount", to_collections.check_amount)
              .setString("check_bank", to_collections.check_bank)
              .setString("check_no", to_collections.check_no)
              .setString("check_holder", to_collections.check_holder)
              .setString("check_date", to_collections.check_date)
              .setString("credit_card_type", to_collections.credit_card_type)
              .setNumber("credit_card_rate", to_collections.credit_card_rate)
              .setNumber("credit_card_amount", to_collections.credit_card_amount)
              .setString("credit_card_no", to_collections.credit_card_no)
              .setString("gift_certificate_from", to_collections.gift_certificate_from)
              .setString("gift_certificate_description", to_collections.gift_certificate_description)
              .setString("gift_certificate_no", to_collections.gift_certificate_no)
              .setNumber("gift_certificate_amount", to_collections.gift_certificate_amount)
              .setString("online_bank", to_collections.online_bank)
              .setString("online_reference_no", to_collections.online_reference_no)
              .setNumber("online_amount", to_collections.online_amount)
              .setString("online_holder", to_collections.online_holder)
              .setString("online_date", to_collections.online_date)
              .setString("created_at", to_collections.created_at)
              .setString("updated_at", to_collections.updated_at)
              .setString("created_by", to_collections.created_by)
              .setString("updated_by", to_collections.updated_by)
              .setNumber("status", to_collections.status)
              .setNumber("is_uploaded", to_collections.is_uploaded)
              .setNumber("ref_id", to_collections.ref_id)
              .setString("school_year", to_collections.school_year)
              .setString("period", to_collections.period)
              .setString("year_level", to_collections.year_level)
              .setString("department_id", to_collections.department_id)
              .setString("department", to_collections.department)
              .setString("college_id", to_collections.college_id)
              .setString("college", to_collections.college)
              .setString("course_id", to_collections.course_id)
              .setString("course", to_collections.course)
              .setString("student_id", to_collections.student_id)
              .setString("student_no", to_collections.student_no)
              .setString("student_name", to_collections.student_name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_collections to_collections) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update collections set "
              + "collection_no= :collection_no "
              + ",or_no= :or_no "
              + ",payment_type= :payment_type "
              + ",amount_paid= :amount_paid "
              + ",cash= :cash "
              + ",discount_name= :discount_name "
              + ",discount_rate= :discount_rate "
              + ",discount_amount= :discount_amount "
              + ",discount_customer_name= :discount_customer_name "
              + ",discount_customer_id= :discount_customer_id "
              + ",check_amount= :check_amount "
              + ",check_bank= :check_bank "
              + ",check_no= :check_no "
              + ",check_holder= :check_holder "
              + ",check_date= :check_date "
              + ",credit_card_type= :credit_card_type "
              + ",credit_card_rate= :credit_card_rate "
              + ",credit_card_amount= :credit_card_amount "
              + ",credit_card_no= :credit_card_no "
              + ",gift_certificate_from= :gift_certificate_from "
              + ",gift_certificate_description= :gift_certificate_description "
              + ",gift_certificate_no= :gift_certificate_no "
              + ",gift_certificate_amount= :gift_certificate_amount "
              + ",online_bank= :online_bank "
              + ",online_reference_no= :online_reference_no "
              + ",online_amount= :online_amount "
              + ",online_holder= :online_holder "
              + ",online_date= :online_date "
              + ",created_at= :created_at "
              + ",updated_at= :updated_at "
              + ",created_by= :created_by "
              + ",updated_by= :updated_by "
              + ",status= :status "
              + ",is_uploaded= :is_uploaded "
              + ",ref_id= :ref_id "
              + ",school_year= :school_year "
              + ",period= :period "
              + ",year_level= :year_level "
              + ",department_id= :department_id "
              + ",department= :department "
              + ",college_id= :college_id "
              + ",college= :college "
              + ",course_id= :course_id "
              + ",course= :course "
              + ",student_id= :student_id "
              + ",student_no= :student_no "
              + ",student_name= :student_name "
              + " where id='" + to_collections.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setString("collection_no", to_collections.collection_no)
              .setString("or_no", to_collections.or_no)
              .setString("payment_type", to_collections.payment_type)
              .setNumber("amount_paid", to_collections.amount_paid)
              .setNumber("cash", to_collections.cash)
              .setString("discount_name", to_collections.discount_name)
              .setNumber("discount_rate", to_collections.discount_rate)
              .setNumber("discount_amount", to_collections.discount_amount)
              .setString("discount_customer_name", to_collections.discount_customer_name)
              .setString("discount_customer_id", to_collections.discount_customer_id)
              .setNumber("check_amount", to_collections.check_amount)
              .setString("check_bank", to_collections.check_bank)
              .setString("check_no", to_collections.check_no)
              .setString("check_holder", to_collections.check_holder)
              .setString("check_date", to_collections.check_date)
              .setString("credit_card_type", to_collections.credit_card_type)
              .setNumber("credit_card_rate", to_collections.credit_card_rate)
              .setNumber("credit_card_amount", to_collections.credit_card_amount)
              .setString("credit_card_no", to_collections.credit_card_no)
              .setString("gift_certificate_from", to_collections.gift_certificate_from)
              .setString("gift_certificate_description", to_collections.gift_certificate_description)
              .setString("gift_certificate_no", to_collections.gift_certificate_no)
              .setNumber("gift_certificate_amount", to_collections.gift_certificate_amount)
              .setString("online_bank", to_collections.online_bank)
              .setString("online_reference_no", to_collections.online_reference_no)
              .setNumber("online_amount", to_collections.online_amount)
              .setString("online_holder", to_collections.online_holder)
              .setString("online_date", to_collections.online_date)
              .setString("created_at", to_collections.created_at)
              .setString("updated_at", to_collections.updated_at)
              .setString("created_by", to_collections.created_by)
              .setString("updated_by", to_collections.updated_by)
              .setNumber("status", to_collections.status)
              .setNumber("is_uploaded", to_collections.is_uploaded)
              .setNumber("ref_id", to_collections.ref_id)
              .setString("school_year", to_collections.school_year)
              .setString("period", to_collections.period)
              .setString("year_level", to_collections.year_level)
              .setString("department_id", to_collections.department_id)
              .setString("department", to_collections.department)
              .setString("college_id", to_collections.college_id)
              .setString("college", to_collections.college)
              .setString("course_id", to_collections.course_id)
              .setString("course", to_collections.course)
              .setString("student_id", to_collections.student_id)
              .setString("student_no", to_collections.student_no)
              .setString("student_name", to_collections.student_name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_name(to_collections to_collections, String new_name) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update collections set "
              + "student_name= :student_name "
              + " where id='" + to_collections.id + "' "
              + " ";
      s0 = SqlStringUtil.parse(s0)
              .setString("student_name", new_name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_payment_type(to_collections to_collections, String new_name) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update collections set "
              + "payment_type= :payment_type "
              + " where id='" + to_collections.id + "' "
              + " ";
      s0 = SqlStringUtil.parse(s0)
              .setString("payment_type", new_name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_or_date(to_collections to_collections, String date) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update collections set "
              + "created_at= :created_at "
              + " where id='" + to_collections.id + "' "
              + " ";
      s0 = SqlStringUtil.parse(s0)
              .setString("created_at", date)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_or_no(to_collections to_collections, String or_no) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update collections set "
              + "or_no= :or_no "
              + " where id='" + to_collections.id + "' "
              + " ";
      s0 = SqlStringUtil.parse(s0)
              .setString("or_no", or_no)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_collections to_collections) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from collections  "
              + " where id='" + to_collections.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Collection.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_collections> ret_data(String where) {
    List<to_collections> datas = new ArrayList();

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

        to_collections to = new to_collections(id, collection_no, or_no, payment_type, amount_paid, cash, discount_name, discount_rate, discount_amount, discount_customer_name, discount_customer_id, check_amount, check_bank, check_no, check_holder, check_date, credit_card_type, credit_card_rate, credit_card_amount, credit_card_no, gift_certificate_from, gift_certificate_description, gift_certificate_no, gift_certificate_amount, online_bank, online_reference_no, online_amount, online_holder, online_date, created_at, updated_at, created_by, updated_by, status, is_uploaded, ref_id, school_year, period, year_level, department_id, department, college_id, college, course_id, course, student_id, student_no, student_name);
        datas.add(to);
      }
      return datas;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static String increment_id() {

    String collection_no = "000000000000";
    try {
      Connection conn = MyConnection.connect();
      String s0 = "select max(id) from collections";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      if (rs.next()) {
        collection_no = rs.getString(1);

        String s2 = "select collection_no from collections where id='" + collection_no + "'";
        Statement stmt2 = conn.createStatement();
        ResultSet rs2 = stmt2.executeQuery(s2);
        if (rs2.next()) {
          collection_no = rs2.getString(1);
        }
      }
      if (collection_no == null) {
        collection_no = "000000000000";

      }
      collection_no = ReceiptIncrementor.increment(collection_no);

      return collection_no;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.downpayments;

import cis.collections.Collection;
import cis.other_payments.Other_payments;
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
 * @author USER
 */
public class Downpayments {

  public static class to_downpayments {

    public final int id;
    public final int enrollment_id;
    public final String enrollment_no;
    public final int academic_year_id;
    public final String academic_year;
    public final String student_id;
    public final String student_no;
    public final String student_name;
    public final double amount;
    public final String created_by;
    public final String updated_by;
    public final String created_at;
    public final String updated_at;
    public final int status;
    public final int collection_id;
    public final String collection_no;

    public to_downpayments(int id, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, String student_id, String student_no, String student_name, double amount, String created_by, String updated_by, String created_at, String updated_at, int status, int collection_id, String collection_no) {
      this.id = id;
      this.enrollment_id = enrollment_id;
      this.enrollment_no = enrollment_no;
      this.academic_year_id = academic_year_id;
      this.academic_year = academic_year;
      this.student_id = student_id;
      this.student_no = student_no;
      this.student_name = student_name;
      this.amount = amount;
      this.created_by = created_by;
      this.updated_by = updated_by;
      this.created_at = created_at;
      this.updated_at = updated_at;
      this.status = status;
      this.collection_id = collection_id;
      this.collection_no = collection_no;
    }
  }

  public static void add_data(to_downpayments to_downpayments) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into downpayments("
              + "enrollment_id"
              + ",enrollment_no"
              + ",academic_year_id"
              + ",academic_year"
              + ",student_id"
              + ",student_no"
              + ",student_name"
              + ",amount"
              + ",created_by"
              + ",updated_by"
              + ",created_at"
              + ",updated_at"
              + ",status"
              + ",collection_id"
              + ",collection_no"
              + ")values("
              + ":enrollment_id"
              + ",:enrollment_no"
              + ",:academic_year_id"
              + ",:academic_year"
              + ",:student_id"
              + ",:student_no"
              + ",:student_name"
              + ",:amount"
              + ",:created_by"
              + ",:updated_by"
              + ",:created_at"
              + ",:updated_at"
              + ",:status"
              + ",:collection_id"
              + ",:collection_no"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("enrollment_id", to_downpayments.enrollment_id)
              .setString("enrollment_no", to_downpayments.enrollment_no)
              .setNumber("academic_year_id", to_downpayments.academic_year_id)
              .setString("academic_year", to_downpayments.academic_year)
              .setString("student_id", to_downpayments.student_id)
              .setString("student_no", to_downpayments.student_no)
              .setString("student_name", to_downpayments.student_name)
              .setNumber("amount", to_downpayments.amount)
              .setString("created_by", to_downpayments.created_by)
              .setString("updated_by", to_downpayments.updated_by)
              .setString("created_at", to_downpayments.created_at)
              .setString("updated_at", to_downpayments.updated_at)
              .setNumber("status", to_downpayments.status)
              .setNumber("collection_id", to_downpayments.collection_id)
              .setString("collection_no", to_downpayments.collection_no)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Downpayments.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_downpayments to_downpayments) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update downpayments set "
              + "enrollment_id= :enrollment_id "
              + ",enrollment_no= :enrollment_no "
              + ",academic_year_id= :academic_year_id "
              + ",academic_year= :academic_year "
              + ",student_id= :student_id "
              + ",student_no= :student_no "
              + ",student_name= :student_name "
              + ",amount= :amount "
              + ",created_by= :created_by "
              + ",updated_by= :updated_by "
              + ",created_at= :created_at "
              + ",updated_at= :updated_at "
              + ",status= :status "
              + ",collection_id= :collection_id "
              + ",collection_no= :collection_no "
              + " where id='" + to_downpayments.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("enrollment_id", to_downpayments.enrollment_id)
              .setString("enrollment_no", to_downpayments.enrollment_no)
              .setNumber("academic_year_id", to_downpayments.academic_year_id)
              .setString("academic_year", to_downpayments.academic_year)
              .setString("student_id", to_downpayments.student_id)
              .setString("student_no", to_downpayments.student_no)
              .setString("student_name", to_downpayments.student_name)
              .setNumber("amount", to_downpayments.amount)
              .setString("created_by", to_downpayments.created_by)
              .setString("updated_by", to_downpayments.updated_by)
              .setString("created_at", to_downpayments.created_at)
              .setString("updated_at", to_downpayments.updated_at)
              .setNumber("status", to_downpayments.status)
              .setNumber("collection_id", to_downpayments.collection_id)
              .setString("collection_no", to_downpayments.collection_no)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Downpayments.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_downpayments to_downpayments) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from downpayments  "
              + " where id='" + to_downpayments.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Downpayments.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static String pay(to_downpayments to_downpayments, Collection.to_collections to_collections) {

    try {
      Connection conn = MyConnection.connect();
      conn.setAutoCommit(false);

      String collection_or_no = "";
      int collection_id = 0;

      collection_or_no = Collection.increment_id();

      String s2 = "insert into collections("
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

      s2 = SqlStringUtil.parse(s2)
              .setString("collection_no", collection_or_no)
              .setString("or_no", to_collections.or_no)
              .setString("payment_type", to_collections.payment_type)
              .setNumber("amount_paid", to_downpayments.amount)
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

      PreparedStatement stmt5 = conn.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
      stmt5.addBatch(s2);
      stmt5.executeBatch();

      ResultSet rs = stmt5.getGeneratedKeys();
      if (rs.next()) {
        int last_inserted_id = rs.getInt(1);
        collection_id = last_inserted_id;
      }

      String s0 = "insert into downpayments("
              + "enrollment_id"
              + ",enrollment_no"
              + ",academic_year_id"
              + ",academic_year"
              + ",student_id"
              + ",student_no"
              + ",student_name"
              + ",amount"
              + ",created_by"
              + ",updated_by"
              + ",created_at"
              + ",updated_at"
              + ",status"
              + ",collection_id"
              + ",collection_no"
              + ")values("
              + ":enrollment_id"
              + ",:enrollment_no"
              + ",:academic_year_id"
              + ",:academic_year"
              + ",:student_id"
              + ",:student_no"
              + ",:student_name"
              + ",:amount"
              + ",:created_by"
              + ",:updated_by"
              + ",:created_at"
              + ",:updated_at"
              + ",:status"
              + ",:collection_id"
              + ",:collection_no"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("enrollment_id", to_downpayments.enrollment_id)
              .setString("enrollment_no", to_downpayments.enrollment_no)
              .setNumber("academic_year_id", to_downpayments.academic_year_id)
              .setString("academic_year", to_downpayments.academic_year)
              .setString("student_id", to_downpayments.student_id)
              .setString("student_no", to_downpayments.student_no)
              .setString("student_name", to_downpayments.student_name)
              .setNumber("amount", to_downpayments.amount)
              .setString("created_by", to_downpayments.created_by)
              .setString("updated_by", to_downpayments.updated_by)
              .setString("created_at", to_downpayments.created_at)
              .setString("updated_at", to_downpayments.updated_at)
              .setNumber("status", to_downpayments.status)
              .setNumber("collection_id", collection_id)
              .setString("collection_no", collection_or_no)
              .ok();

      PreparedStatement stmt2 = conn.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
      stmt2.addBatch(s0);
      stmt2.executeBatch();

      int downpayment_id = 0;
      ResultSet rs2 = stmt2.getGeneratedKeys();
      if (rs2.next()) {
        int last_inserted_id = rs2.getInt(1);
        downpayment_id = last_inserted_id;
      }
      
      String s3 = " update collections set ref_id='" + downpayment_id + "' where id='" + collection_id + "'";
      PreparedStatement stmt3 = conn.prepareStatement("");
      stmt3.addBatch(s3);
      stmt3.executeBatch();

      conn.commit();
      Lg.s(Downpayments.class, "Successfully Added");

      return collection_or_no;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_downpayments> ret_data(String where) {
    List<to_downpayments> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
              + ",enrollment_id"
              + ",enrollment_no"
              + ",academic_year_id"
              + ",academic_year"
              + ",student_id"
              + ",student_no"
              + ",student_name"
              + ",amount"
              + ",created_by"
              + ",updated_by"
              + ",created_at"
              + ",updated_at"
              + ",status"
              + ",collection_id"
              + ",collection_no"
              + " from downpayments"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        System.out.println("id: "+id);
        int enrollment_id = rs.getInt(2);
        String enrollment_no = rs.getString(3);
        int academic_year_id = rs.getInt(4);
        String academic_year = rs.getString(5);
        String student_id = rs.getString(6);
        String student_no = rs.getString(7);
        String student_name = rs.getString(8);
        double amount = rs.getDouble(9);
        String created_by = rs.getString(10);
        String updated_by = rs.getString(11);
        String created_at = rs.getString(12);
        String updated_at = rs.getString(13);
        int status = rs.getInt(14);
        int collection_id = rs.getInt(15);
        String collection_no = rs.getString(16);

        to_downpayments to = new to_downpayments(id, enrollment_id, enrollment_no, academic_year_id, academic_year, student_id, student_no, student_name, amount, created_by, updated_by, created_at, updated_at, status, collection_id, collection_no);
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

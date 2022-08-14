/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

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
public class Enrollment_assessment_discounts {

  public static class to_enrollment_assessment_discounts {

    public final int id;
    public final int enrollment_assessment_id;
    public final String enrollment_assessment_no;
    public final int enrollment_id;
    public final String enrollment_no;
    public final int academic_year_id;
    public final String academic_year;
    public final String discount_name;
    public final int is_tution;
    public final int is_tuition_percent;
    public final double tuition_rate;
    public final double tuition_amount;
    public final int is_misc;
    public final int is_misc_percent;
    public final double misc_rate;
    public final double misc_amount;
    public final int is_total;
    public final int is_total_percent;
    public final double total_rate;
    public final double total_amount;
    public final String created_at;
    public final String updated_at;
    public final String created_by;
    public final String updated_by;
    public final int status;

    public to_enrollment_assessment_discounts(int id, int enrollment_assessment_id, String enrollment_assessment_no, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, String discount_name, int is_tution, int is_tuition_percent, double tuition_rate, double tuition_amount, int is_misc, int is_misc_percent, double misc_rate, double misc_amount, int is_total, int is_total_percent, double total_rate, double total_amount, String created_at, String updated_at, String created_by, String updated_by, int status) {
      this.id = id;
      this.enrollment_assessment_id = enrollment_assessment_id;
      this.enrollment_assessment_no = enrollment_assessment_no;
      this.enrollment_id = enrollment_id;
      this.enrollment_no = enrollment_no;
      this.academic_year_id = academic_year_id;
      this.academic_year = academic_year;
      this.discount_name = discount_name;
      this.is_tution = is_tution;
      this.is_tuition_percent = is_tuition_percent;
      this.tuition_rate = tuition_rate;
      this.tuition_amount = tuition_amount;
      this.is_misc = is_misc;
      this.is_misc_percent = is_misc_percent;
      this.misc_rate = misc_rate;
      this.misc_amount = misc_amount;
      this.is_total = is_total;
      this.is_total_percent = is_total_percent;
      this.total_rate = total_rate;
      this.total_amount = total_amount;
      this.created_at = created_at;
      this.updated_at = updated_at;
      this.created_by = created_by;
      this.updated_by = updated_by;
      this.status = status;
    }
  }

  public static void add_data(to_enrollment_assessment_discounts to_enrollment_assessment_discounts) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into enrollment_assessment_discounts("
              + "enrollment_assessment_id"
              + ",enrollment_assessment_no"
              + ",enrollment_id"
              + ",enrollment_no"
              + ",academic_year_id"
              + ",academic_year"
              + ",discount_name"
              + ",is_tution"
              + ",is_tuition_percent"
              + ",tuition_rate"
              + ",tuition_amount"
              + ",is_misc"
              + ",is_misc_percent"
              + ",misc_rate"
              + ",misc_amount"
              + ",is_total"
              + ",is_total_percent"
              + ",total_rate"
              + ",total_amount"
              + ",created_at"
              + ",updated_at"
              + ",created_by"
              + ",updated_by"
              + ",status"
              + ")values("
              + ":enrollment_assessment_id"
              + ",:enrollment_assessment_no"
              + ",:enrollment_id"
              + ",:enrollment_no"
              + ",:academic_year_id"
              + ",:academic_year"
              + ",:discount_name"
              + ",:is_tution"
              + ",:is_tuition_percent"
              + ",:tuition_rate"
              + ",:tuition_amount"
              + ",:is_misc"
              + ",:is_misc_percent"
              + ",:misc_rate"
              + ",:misc_amount"
              + ",:is_total"
              + ",:is_total_percent"
              + ",:total_rate"
              + ",:total_amount"
              + ",:created_at"
              + ",:updated_at"
              + ",:created_by"
              + ",:updated_by"
              + ",:status"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("enrollment_assessment_id", to_enrollment_assessment_discounts.enrollment_assessment_id)
              .setString("enrollment_assessment_no", to_enrollment_assessment_discounts.enrollment_assessment_no)
              .setNumber("enrollment_id", to_enrollment_assessment_discounts.enrollment_id)
              .setString("enrollment_no", to_enrollment_assessment_discounts.enrollment_no)
              .setNumber("academic_year_id", to_enrollment_assessment_discounts.academic_year_id)
              .setString("academic_year", to_enrollment_assessment_discounts.academic_year)
              .setString("discount_name", to_enrollment_assessment_discounts.discount_name)
              .setNumber("is_tution", to_enrollment_assessment_discounts.is_tution)
              .setNumber("is_tuition_percent", to_enrollment_assessment_discounts.is_tuition_percent)
              .setNumber("tuition_rate", to_enrollment_assessment_discounts.tuition_rate)
              .setNumber("tuition_amount", to_enrollment_assessment_discounts.tuition_amount)
              .setNumber("is_misc", to_enrollment_assessment_discounts.is_misc)
              .setNumber("is_misc_percent", to_enrollment_assessment_discounts.is_misc_percent)
              .setNumber("misc_rate", to_enrollment_assessment_discounts.misc_rate)
              .setNumber("misc_amount", to_enrollment_assessment_discounts.misc_amount)
              .setNumber("is_total", to_enrollment_assessment_discounts.is_total)
              .setNumber("is_total_percent", to_enrollment_assessment_discounts.is_total_percent)
              .setNumber("total_rate", to_enrollment_assessment_discounts.total_rate)
              .setNumber("total_amount", to_enrollment_assessment_discounts.total_amount)
              .setString("created_at", to_enrollment_assessment_discounts.created_at)
              .setString("updated_at", to_enrollment_assessment_discounts.updated_at)
              .setString("created_by", to_enrollment_assessment_discounts.created_by)
              .setString("updated_by", to_enrollment_assessment_discounts.updated_by)
              .setNumber("status", to_enrollment_assessment_discounts.status)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_assessment_discounts.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_enrollment_assessment_discounts to_enrollment_assessment_discounts) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update enrollment_assessment_discounts set "
              + "enrollment_assessment_id= :enrollment_assessment_id "
              + ",enrollment_assessment_no= :enrollment_assessment_no "
              + ",enrollment_id= :enrollment_id "
              + ",enrollment_no= :enrollment_no "
              + ",academic_year_id= :academic_year_id "
              + ",academic_year= :academic_year "
              + ",discount_name= :discount_name "
              + ",is_tution= :is_tution "
              + ",is_tuition_percent= :is_tuition_percent "
              + ",tuition_rate= :tuition_rate "
              + ",tuition_amount= :tuition_amount "
              + ",is_misc= :is_misc "
              + ",is_misc_percent= :is_misc_percent "
              + ",misc_rate= :misc_rate "
              + ",misc_amount= :misc_amount "
              + ",is_total= :is_total "
              + ",is_total_percent= :is_total_percent "
              + ",total_rate= :total_rate "
              + ",total_amount= :total_amount "
              + ",created_at= :created_at "
              + ",updated_at= :updated_at "
              + ",created_by= :created_by "
              + ",updated_by= :updated_by "
              + ",status= :status "
              + " where id='" + to_enrollment_assessment_discounts.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("enrollment_assessment_id", to_enrollment_assessment_discounts.enrollment_assessment_id)
              .setString("enrollment_assessment_no", to_enrollment_assessment_discounts.enrollment_assessment_no)
              .setNumber("enrollment_id", to_enrollment_assessment_discounts.enrollment_id)
              .setString("enrollment_no", to_enrollment_assessment_discounts.enrollment_no)
              .setNumber("academic_year_id", to_enrollment_assessment_discounts.academic_year_id)
              .setString("academic_year", to_enrollment_assessment_discounts.academic_year)
              .setString("discount_name", to_enrollment_assessment_discounts.discount_name)
              .setNumber("is_tution", to_enrollment_assessment_discounts.is_tution)
              .setNumber("is_tuition_percent", to_enrollment_assessment_discounts.is_tuition_percent)
              .setNumber("tuition_rate", to_enrollment_assessment_discounts.tuition_rate)
              .setNumber("tuition_amount", to_enrollment_assessment_discounts.tuition_amount)
              .setNumber("is_misc", to_enrollment_assessment_discounts.is_misc)
              .setNumber("is_misc_percent", to_enrollment_assessment_discounts.is_misc_percent)
              .setNumber("misc_rate", to_enrollment_assessment_discounts.misc_rate)
              .setNumber("misc_amount", to_enrollment_assessment_discounts.misc_amount)
              .setNumber("is_total", to_enrollment_assessment_discounts.is_total)
              .setNumber("is_total_percent", to_enrollment_assessment_discounts.is_total_percent)
              .setNumber("total_rate", to_enrollment_assessment_discounts.total_rate)
              .setNumber("total_amount", to_enrollment_assessment_discounts.total_amount)
              .setString("created_at", to_enrollment_assessment_discounts.created_at)
              .setString("updated_at", to_enrollment_assessment_discounts.updated_at)
              .setString("created_by", to_enrollment_assessment_discounts.created_by)
              .setString("updated_by", to_enrollment_assessment_discounts.updated_by)
              .setNumber("status", to_enrollment_assessment_discounts.status)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_assessment_discounts.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_enrollment_assessment_discounts to_enrollment_assessment_discounts) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from enrollment_assessment_discounts  "
              + " where id='" + to_enrollment_assessment_discounts.id + "' "
              + " ";
      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_assessment_discounts.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_enrollment_assessment_discounts> ret_data(String where) {
    List<to_enrollment_assessment_discounts> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
              + ",enrollment_assessment_id"
              + ",enrollment_assessment_no"
              + ",enrollment_id"
              + ",enrollment_no"
              + ",academic_year_id"
              + ",academic_year"
              + ",discount_name"
              + ",is_tution"
              + ",is_tuition_percent"
              + ",tuition_rate"
              + ",tuition_amount"
              + ",is_misc"
              + ",is_misc_percent"
              + ",misc_rate"
              + ",misc_amount"
              + ",is_total"
              + ",is_total_percent"
              + ",total_rate"
              + ",total_amount"
              + ",created_at"
              + ",updated_at"
              + ",created_by"
              + ",updated_by"
              + ",status"
              + " from enrollment_assessment_discounts"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        int enrollment_assessment_id = rs.getInt(2);
        String enrollment_assessment_no = rs.getString(3);
        int enrollment_id = rs.getInt(4);
        String enrollment_no = rs.getString(5);
        int academic_year_id = rs.getInt(6);
        String academic_year = rs.getString(7);
        String discount_name = rs.getString(8);
        int is_tution = rs.getInt(9);
        int is_tuition_percent = rs.getInt(10);
        double tuition_rate = rs.getDouble(11);
        double tuition_amount = rs.getDouble(12);
        int is_misc = rs.getInt(13);
        int is_misc_percent = rs.getInt(14);
        double misc_rate = rs.getDouble(15);
        double misc_amount = rs.getDouble(16);
        int is_total = rs.getInt(17);
        int is_total_percent = rs.getInt(18);
        double total_rate = rs.getDouble(19);
        double total_amount = rs.getDouble(20);
        String created_at = rs.getString(21);
        String updated_at = rs.getString(22);
        String created_by = rs.getString(23);
        String updated_by = rs.getString(24);
        int status = rs.getInt(25);

        to_enrollment_assessment_discounts to = new to_enrollment_assessment_discounts(id, enrollment_assessment_id, enrollment_assessment_no, enrollment_id, enrollment_no, academic_year_id, academic_year, discount_name, is_tution, is_tuition_percent, tuition_rate, tuition_amount, is_misc, is_misc_percent, misc_rate, misc_amount, is_total, is_total_percent, total_rate, total_amount, created_at, updated_at, created_by, updated_by, status);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.discount_types;

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
public class Discount_types {

  public static class to_discount_types {

    public final int id;
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
    public final int created_by;

    public to_discount_types(int id, String discount_name, int is_tution, int is_tuition_percent, double tuition_rate, double tuition_amount, int is_misc, int is_misc_percent, double misc_rate, double misc_amount, int is_total, int is_total_percent, double total_rate, double total_amount, String created_at, int created_by) {
      this.id = id;
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
      this.created_by = created_by;
    }
  }

  public static void add_data(to_discount_types to_discount_types) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into discount_types("
              + "discount_name"
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
              + ",created_by"
              + ")values("
              + ":discount_name"
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
              + ",:created_by"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setString("discount_name", to_discount_types.discount_name)
              .setNumber("is_tution", to_discount_types.is_tution)
              .setNumber("is_tuition_percent", to_discount_types.is_tuition_percent)
              .setNumber("tuition_rate", to_discount_types.tuition_rate)
              .setNumber("tuition_amount", to_discount_types.tuition_amount)
              .setNumber("is_misc", to_discount_types.is_misc)
              .setNumber("is_misc_percent", to_discount_types.is_misc_percent)
              .setNumber("misc_rate", to_discount_types.misc_rate)
              .setNumber("misc_amount", to_discount_types.misc_amount)
              .setNumber("is_total", to_discount_types.is_total)
              .setNumber("is_total_percent", to_discount_types.is_total_percent)
              .setNumber("total_rate", to_discount_types.total_rate)
              .setNumber("total_amount", to_discount_types.total_amount)
              .setString("created_at", to_discount_types.created_at)
              .setNumber("created_by", to_discount_types.created_by)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Discount_types.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_discount_types to_discount_types) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update discount_types set "
              + "discount_name= :discount_name "
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
              + ",created_by= :created_by "
              + " where id='" + to_discount_types.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setString("discount_name", to_discount_types.discount_name)
              .setNumber("is_tution", to_discount_types.is_tution)
              .setNumber("is_tuition_percent", to_discount_types.is_tuition_percent)
              .setNumber("tuition_rate", to_discount_types.tuition_rate)
              .setNumber("tuition_amount", to_discount_types.tuition_amount)
              .setNumber("is_misc", to_discount_types.is_misc)
              .setNumber("is_misc_percent", to_discount_types.is_misc_percent)
              .setNumber("misc_rate", to_discount_types.misc_rate)
              .setNumber("misc_amount", to_discount_types.misc_amount)
              .setNumber("is_total", to_discount_types.is_total)
              .setNumber("is_total_percent", to_discount_types.is_total_percent)
              .setNumber("total_rate", to_discount_types.total_rate)
              .setNumber("total_amount", to_discount_types.total_amount)
              .setString("created_at", to_discount_types.created_at)
              .setNumber("created_by", to_discount_types.created_by)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Discount_types.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_discount_types to_discount_types) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from discount_types  "
              + " where id='" + to_discount_types.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Discount_types.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_discount_types> ret_data(String where) {
    List<to_discount_types> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
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
              + ",created_by"
              + " from discount_types"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        String discount_name = rs.getString(2);
        int is_tution = rs.getInt(3);
        int is_tuition_percent = rs.getInt(4);
        double tuition_rate = rs.getDouble(5);
        double tuition_amount = rs.getDouble(6);
        int is_misc = rs.getInt(7);
        int is_misc_percent = rs.getInt(8);
        double misc_rate = rs.getDouble(9);
        double misc_amount = rs.getDouble(10);
        int is_total = rs.getInt(11);
        int is_total_percent = rs.getInt(12);
        double total_rate = rs.getDouble(13);
        double total_amount = rs.getDouble(14);
        String created_at = rs.getString(15);
        int created_by = rs.getInt(16);

        to_discount_types to = new to_discount_types(id, discount_name, is_tution, is_tuition_percent, tuition_rate, tuition_amount, is_misc, is_misc_percent, misc_rate, misc_amount, is_total, is_total_percent, total_rate, total_amount, created_at, created_by);
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

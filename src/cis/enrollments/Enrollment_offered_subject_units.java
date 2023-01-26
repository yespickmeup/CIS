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
public class Enrollment_offered_subject_units {

  public static class to_enrollment_offered_subject_units {

    public final int id;
    public final int eos_id;
    public final double lec;
    public final double lab;
    public final String created_at;
    public final int created_by;
    public final String updated_at;
    public final int updated_by;

    public to_enrollment_offered_subject_units(int id, int eos_id, double lec, double lab, String created_at, int created_by, String updated_at, int updated_by) {
      this.id = id;
      this.eos_id = eos_id;
      this.lec = lec;
      this.lab = lab;
      this.created_at = created_at;
      this.created_by = created_by;
      this.updated_at = updated_at;
      this.updated_by = updated_by;
    }
  }

  public static void add_data(to_enrollment_offered_subject_units to_enrollment_offered_subject_units) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into enrollment_offered_subject_units("
              + "eos_id"
              + ",lec"
              + ",lab"
              + ",created_at"
              + ",created_by"
              + ",updated_at"
              + ",updated_by"
              + ")values("
              + ":eos_id"
              + ",:lec"
              + ",:lab"
              + ",:created_at"
              + ",:created_by"
              + ",:updated_at"
              + ",:updated_by"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("eos_id", to_enrollment_offered_subject_units.eos_id)
              .setNumber("lec", to_enrollment_offered_subject_units.lec)
              .setNumber("lab", to_enrollment_offered_subject_units.lab)
              .setString("created_at", to_enrollment_offered_subject_units.created_at)
              .setNumber("created_by", to_enrollment_offered_subject_units.created_by)
              .setString("updated_at", to_enrollment_offered_subject_units.updated_at)
              .setNumber("updated_by", to_enrollment_offered_subject_units.updated_by)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_offered_subject_units.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_enrollment_offered_subject_units to_enrollment_offered_subject_units) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update enrollment_offered_subject_units set "
              + "eos_id= :eos_id "
              + ",lec= :lec "
              + ",lab= :lab "
              + ",created_at= :created_at "
              + ",created_by= :created_by "
              + ",updated_at= :updated_at "
              + ",updated_by= :updated_by "
              + " where id='" + to_enrollment_offered_subject_units.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setNumber("eos_id", to_enrollment_offered_subject_units.eos_id)
              .setNumber("lec", to_enrollment_offered_subject_units.lec)
              .setNumber("lab", to_enrollment_offered_subject_units.lab)
              .setString("created_at", to_enrollment_offered_subject_units.created_at)
              .setNumber("created_by", to_enrollment_offered_subject_units.created_by)
              .setString("updated_at", to_enrollment_offered_subject_units.updated_at)
              .setNumber("updated_by", to_enrollment_offered_subject_units.updated_by)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_offered_subject_units.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_enrollment_offered_subject_units to_enrollment_offered_subject_units) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from enrollment_offered_subject_units  "
              + " where id='" + to_enrollment_offered_subject_units.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Enrollment_offered_subject_units.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_enrollment_offered_subject_units> ret_data(String where) {
    List<to_enrollment_offered_subject_units> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
              + ",eos_id"
              + ",lec"
              + ",lab"
              + ",created_at"
              + ",created_by"
              + ",updated_at"
              + ",updated_by"
              + " from enrollment_offered_subject_units"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        int eos_id = rs.getInt(2);
        double lec = rs.getDouble(3);
        double lab = rs.getDouble(4);
        String created_at = rs.getString(5);
        int created_by = rs.getInt(6);
        String updated_at = rs.getString(7);
        int updated_by = rs.getInt(8);
        to_enrollment_offered_subject_units to = new to_enrollment_offered_subject_units(id, eos_id, lec, lab, created_at, created_by, updated_at, updated_by);
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

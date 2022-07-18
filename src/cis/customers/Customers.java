/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.customers;

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
public class Customers {

  public static class to_customers {

    public final int id;
    public final String name;

    public to_customers(int id, String name) {
      this.id = id;
      this.name = name;
    }
  }

  public static void add_data(to_customers to_customers) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "insert into customers("
              + "name"
              + ")values("
              + ":name"
              + ")";

      s0 = SqlStringUtil.parse(s0)
              .setString("name", to_customers.name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Customers.class, "Successfully Added");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void update_data(to_customers to_customers) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "update customers set "
              + "name= :name "
              + " where id='" + to_customers.id + "' "
              + " ";

      s0 = SqlStringUtil.parse(s0)
              .setString("name", to_customers.name)
              .ok();

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Customers.class, "Successfully Updated");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static void delete_data(to_customers to_customers) {
    try {
      Connection conn = MyConnection.connect();
      String s0 = "delete from customers  "
              + " where id='" + to_customers.id + "' "
              + " ";

      PreparedStatement stmt = conn.prepareStatement(s0);
      stmt.execute();
      Lg.s(Customers.class, "Successfully Deleted");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      MyConnection.close();
    }
  }

  public static List<to_customers> ret_data(String where) {
    List<to_customers> datas = new ArrayList();

    try {
      Connection conn = MyConnection.connect();
      String s0 = "select "
              + "id"
              + ",name"
              + " from customers"
              + " " + where;

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(s0);
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);

        to_customers to = new to_customers(id, name);
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

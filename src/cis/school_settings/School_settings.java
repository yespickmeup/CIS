/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.school_settings;

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
 * @author User
 */
public class School_settings {

    public static class to_school_settings {

        public final int id;
        public final String name;
        public final String remarks;
        public final double amount;
        public final double amount2;

        public to_school_settings(int id, String name, String remarks, double amount, double amount2) {
            this.id = id;
            this.name = name;
            this.remarks = remarks;
            this.amount = amount;
            this.amount2 = amount2;
        }
    }

    public static void add_data(to_school_settings to_school_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into school_settings("
                    + "name"
                    + ",remarks"
                    + ",amount"
                    + ",amount2"
                    + ")values("
                    + ":name"
                    + ",:remarks"
                    + ",:amount"
                    + ",:amount2"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("name", to_school_settings.name)
                    .setString("remarks", to_school_settings.remarks)
                    .setNumber("amount", to_school_settings.amount)
                    .setNumber("amount2", to_school_settings.amount2)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_settings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_school_settings to_school_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update school_settings set "
                    + "name= :name "
                    + ",remarks= :remarks "
                    + ",amount= :amount "
                    + ",amount2= :amount2"
                    + " where id='" + to_school_settings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("name", to_school_settings.name)
                    .setString("remarks", to_school_settings.remarks)
                    .setNumber("amount", to_school_settings.amount)
                    .setNumber("amount2", to_school_settings.amount2)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_school_settings to_school_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from school_settings  "
                    + " where id='" + to_school_settings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_settings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_school_settings> ret_data(String where) {
        List<to_school_settings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",name"
                    + ",remarks"
                    + ",amount"
                    + ",amount2"
                    + " from school_settings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String remarks = rs.getString(3);
                double amount = rs.getDouble(4);
                double amount2 = rs.getDouble(5);
                to_school_settings to = new to_school_settings(id, name, remarks, amount, amount2);
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

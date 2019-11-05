/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.users;

import cis.users.Users.to_users;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guinness
 */
public class MyUser {

    public static String user_id;
    public static String user_name;
    public static String user_screen_name;
    public static String branch;
    public static String branch_id;
    public static String location;
    public static String location_id;

    public MyUser() {
    }

    public static String getBranch() {
        if (branch == null) {
            return "";
        }
        return branch;
    }

    public static void setBranch(String branch) {
        MyUser.branch = branch;
    }

    public static String getBranch_id() {
        if (branch_id == null) {
            return "";

        }
        return branch_id;
    }

    public static void setBranch_id(String branch_id) {
        MyUser.branch_id = branch_id;
    }

    public static String getLocation() {
        if (location == null) {
            return "";
        }
        return location;
    }

    public static void setLocation(String location) {
        MyUser.location = location;
    }

    public static String getLocation_id() {
        if (location_id == null) {
            return "";
        }
        return location_id;
    }

    public static void setLocation_id(String location_id) {
        MyUser.location_id = location_id;
    }

    public static String getUser_id() {
        if (user_id == null) {
            return "";
        }
        return user_id;
    }

    public static void setUser_id(String user_id) {
        MyUser.user_id = user_id;
    }

    public static String getUser_name() {
        if (user_name == null) {
            return "";
        }
        return user_name;
    }

    public void setUser_name(String user_name) {
        MyUser.user_name = user_name;
    }

    public static String getUser_screen_name() {
        if (user_screen_name == null) {
            return "";
        }
        return user_screen_name;
    }

    public void setUser_screen_name(String user_screen_name) {
        MyUser.user_screen_name = user_screen_name;
    }

    public static List<to_users> ret_data(String where) {
        List<to_users> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_screen_name"
                    + ",user_name"
                    + ",password"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + " from users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String user_screen_name1 = rs.getString(2);
                String user_name1 = rs.getString(3);
                String password = rs.getString(4);
                String date_added = rs.getString(5);
                String date_updated = rs.getString(6);
                String added_by_id = rs.getString(7);
                String update_by_id = rs.getString(8);
                int status = rs.getInt(9);

                to_users to = new to_users(id, user_screen_name1, user_name1, password, date_added, date_updated, added_by_id, update_by_id, status);
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

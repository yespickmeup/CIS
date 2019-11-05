/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.users;

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
 * @author Guinness
 */
public class Users {

    public static class to_users {

        public final int id;
        public final String user_screen_name;
        public final String user_name;
        public final String password;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;

        public to_users(int id, String user_screen_name, String user_name, String password, String date_added, String date_updated, String added_by_id, String update_by_id, int status) {
            this.id = id;
            this.user_screen_name = user_screen_name;
            this.user_name = user_name;
            this.password = password;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
        }
    }

    public static void add_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into users("
                    + "user_screen_name"
                    + ",user_name"
                    + ",password"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ")values("
                    + ":user_screen_name"
                    + ",:user_name"
                    + ",:password"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_screen_name", to_users.user_screen_name)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setString("date_added", to_users.date_added)
                    .setString("date_updated", to_users.date_updated)
                    .setString("added_by_id", to_users.added_by_id)
                    .setString("update_by_id", to_users.update_by_id)
                    .setNumber("status", to_users.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update users set "
                    + "user_screen_name= :user_screen_name "
                    + ",user_name= :user_name "
                    + ",password= :password "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + " where id='" + to_users.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_screen_name", to_users.user_screen_name)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setString("date_added", to_users.date_added)
                    .setString("date_updated", to_users.date_updated)
                    .setString("added_by_id", to_users.added_by_id)
                    .setString("update_by_id", to_users.update_by_id)
                    .setNumber("status", to_users.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from users  "
                    + " where id='" + to_users.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
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
                String user_screen_name = rs.getString(2);
                String user_name = rs.getString(3);
                String password = rs.getString(4);
                String date_added = rs.getString(5);
                String date_updated = rs.getString(6);
                String added_by_id = rs.getString(7);
                String update_by_id = rs.getString(8);
                int status = rs.getInt(9);

                to_users to = new to_users(id, user_screen_name, user_name, password, date_added, date_updated, added_by_id, update_by_id, status);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static to_users ret_data_autho(String where) {
        to_users to = null;

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
            if (rs.next()) {
                int id = rs.getInt(1);
                String user_screen_name = rs.getString(2);
                String user_name = rs.getString(3);
                String password = rs.getString(4);
                String date_added = rs.getString(5);
                String date_updated = rs.getString(6);
                String added_by_id = rs.getString(7);
                String update_by_id = rs.getString(8);
                int status = rs.getInt(9);

                to = new to_users(id, user_screen_name, user_name, password, date_added, date_updated, added_by_id, update_by_id, status);
            }
            return to;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

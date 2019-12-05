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
 * @author Ronald
 */
public class User_previleges {

    public static class to_user_privileges {

        public final int id;
        public final String user_id;
        public final String account;
        public final String privilege_id;
        public final String privilege;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;

        public to_user_privileges(int id, String user_id, String account, String privilege_id, String privilege, String date_added, String date_updated, String added_by_id, String update_by_id) {
            this.id = id;
            this.user_id = user_id;
            this.account = account;
            this.privilege_id = privilege_id;
            this.privilege = privilege;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
        }
    }

    public static void add_data(to_user_privileges to_user_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_privileges("
                    + "user_id"
                    + ",account"
                    + ",privilege_id"
                    + ",privilege"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":user_id"
                    + ",:account"
                    + ",:privilege_id"
                    + ",:privilege"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_id", to_user_privileges.user_id)
                    .setString("account", to_user_privileges.account)
                    .setString("privilege_id", to_user_privileges.privilege_id)
                    .setString("privilege", to_user_privileges.privilege)
                    .setString("date_added", to_user_privileges.date_added)
                    .setString("date_updated", to_user_privileges.date_updated)
                    .setString("added_by_id", to_user_privileges.added_by_id)
                    .setString("update_by_id", to_user_privileges.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_user_privileges to_user_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_privileges set "
                    + "user_id= :user_id "
                    + ",account= :account "
                    + ",privilege_id= :privilege_id "
                    + ",privilege= :privilege "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_user_privileges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_id", to_user_privileges.user_id)
                    .setString("account", to_user_privileges.account)
                    .setString("privilege_id", to_user_privileges.privilege_id)
                    .setString("privilege", to_user_privileges.privilege)
                    .setString("date_added", to_user_privileges.date_added)
                    .setString("date_updated", to_user_privileges.date_updated)
                    .setString("added_by_id", to_user_privileges.added_by_id)
                    .setString("update_by_id", to_user_privileges.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_user_privileges to_user_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_privileges  "
                    + " where id='" + to_user_privileges.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data_where(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_privileges  "
                    + " " + where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_privileges> ret_data(String where) {
        List<to_user_privileges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_id"
                    + ",account"
                    + ",privilege_id"
                    + ",privilege"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + " from user_privileges"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String user_id = rs.getString(2);
                String account = rs.getString(3);
                String privilege_id = rs.getString(4);
                String privilege = rs.getString(5);
                String date_added = rs.getString(6);
                String date_updated = rs.getString(7);
                String added_by_id = rs.getString(8);
                String update_by_id = rs.getString(9);

                to_user_privileges to = new to_user_privileges(id, user_id, account, privilege_id, privilege, date_added, date_updated, added_by_id, update_by_id);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_user_previleges(List<to_user_privileges> to_user_previleges1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_user_privileges to_user_previleges : to_user_previleges1) {
                String s0 = "insert into user_privileges("
                        + "user_id"
                        + ",account"
                        + ",privilege_id"
                        + ",privilege"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ")values("
                        + ":user_id"
                        + ",:account"
                        + ",:privilege_id"
                        + ",:privilege"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("user_id", to_user_previleges.user_id)
                        .setString("account", to_user_previleges.account)
                        .setString("privilege_id", to_user_previleges.privilege_id)
                        .setString("privilege", to_user_previleges.privilege)
                        .setString("date_added", to_user_previleges.date_added)
                        .setString("date_updated", to_user_previleges.date_updated)
                        .setString("added_by_id", to_user_previleges.added_by_id)
                        .setString("update_by_id", to_user_previleges.update_by_id)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(User_previleges.class, "Successfully Added");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

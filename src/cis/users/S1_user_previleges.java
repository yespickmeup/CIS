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
public class S1_user_previleges {

    public static class to_user_previleges {

        public final int id;
        public final String account;
        public final String previledge;
        public final int status;
        public final String user_id;
        public final String user_name;

        public to_user_previleges(int id, String account, String previledge, int status, String user_id, String user_name) {
            this.id = id;
            this.account = account;
            this.previledge = previledge;
            this.status = status;
            this.user_id = user_id;
            this.user_name = user_name;
        }
    }

    public static void add_user_previleges(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_privileges("
                    + "account"
                    + ",privilege"
                    + ",status"
                    + ",user_id"
                    + ",user_name"
                    + ")values("
                    + ":account"
                    + ",:privilege"
                    + ",:status"
                    + ",:user_id"
                    + ",:user_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_previleges.account)
                    .setString("privilege", to_user_previleges.previledge)
                    .setNumber("status", to_user_previleges.status)
                    .setString("user_id", to_user_previleges.user_id)
                    .setString("user_name", to_user_previleges.user_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_user_previleges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_user_previleges(List<to_user_previleges> to_user_previleges1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_user_previleges to_user_previleges : to_user_previleges1) {
                String s0 = "insert into user_privileges("
                        + "account"
                        + ",privilege"
                        + ",status"
                        + ",user_id"
                        + ",user_name"
                        + ")values("
                        + ":account"
                        + ",:privilege"
                        + ",:status"
                        + ",:user_id"
                        + ",:user_name"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("account", to_user_previleges.account)
                        .setString("privilege", to_user_previleges.previledge)
                        .setNumber("status", to_user_previleges.status)
                        .setString("user_id", to_user_previleges.user_id)
                        .setString("user_name", to_user_previleges.user_name)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_user_previleges.class, "Successfully Added");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_user_previleges_others(List<User_previlege_others.to_user_previlege_others> to_user_previleges1) {
        try {
            Connection conn = MyConnection.connect();
            for (User_previlege_others.to_user_previlege_others to_user_previleges : to_user_previleges1) {
                String s0 = "insert into user_previlege_others("
                        + "account"
                        + ",account_name"
                        + ",name"
                        + ",user_id"
                        + ",user_name"
                        + ")values("
                        + ":account"
                        + ",:account_name"
                        + ",:name"
                        + ",:user_id"
                        + ",:user_name"
                        + ")";
                s0 = SqlStringUtil.parse(s0)
                        .setString("account", to_user_previleges.account)
                        .setString("account_name", to_user_previleges.account_name)
                        .setString("name", to_user_previleges.name)
                        .setString("user_id", to_user_previleges.user_id)
                        .setString("user_name", to_user_previleges.user_name)
                        .ok();
                System.out.println(s0);
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_user_previleges.class, "Successfully Added");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_user_previleges(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_privileges set "
                    + "account= :account"
                    + ",privilege= :privilege"
                    + ",status= :status"
                    + ",user_id= :user_id"
                    + ",user_name= :user_name"
                    + " where "
                    + " id ='" + to_user_previleges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_previleges.account)
                    .setString("privilege", to_user_previleges.previledge)
                    .setNumber("status", to_user_previleges.status)
                    .setString("user_id", to_user_previleges.user_id)
                    .setString("user_name", to_user_previleges.user_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_user_previleges.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_user_previleges(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_previleges where "
                    + " id ='" + to_user_previleges.id + "' "
                    + " ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_user_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_user_previleges_where(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_previleges  "
                    + " " + where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_user_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_user_previleges_others_where(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_previlege_others  "
                    + " " + where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_user_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_previleges> ret_data(String where) {
        List<to_user_previleges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",account"
                    + ",privilege"
                    + ",id"
                    + ",user_id"
                    + ",user_id"
                    + " from user_privileges  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                String previledge = rs.getString(3);
                int status = rs.getInt(1);
                String user_id = rs.getString(5);
                String user_name = rs.getString(6);
                to_user_previleges to = new to_user_previleges(id, account, previledge, status, user_id, user_name);
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

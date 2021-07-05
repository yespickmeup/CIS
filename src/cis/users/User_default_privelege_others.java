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
public class User_default_privelege_others {

     public static class to_user_default_priveleges {

        public final int id;
        public final String account;
        public final String account_name;
        public final String name;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;
        public final boolean view;
        public final boolean add;
        public final boolean edit;
        public final boolean delete;
        public final boolean finalize;
        public final boolean report;

        public to_user_default_priveleges(int id, String account, String account_name, String name, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded, boolean view, boolean add, boolean edit, boolean delete, boolean finalize, boolean report) {
            this.id = id;
            this.account = account;
            this.account_name = account_name;
            this.name = name;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.view = view;
            this.add = add;
            this.edit = edit;
            this.delete = delete;
            this.finalize = finalize;
            this.report = report;
        }
    }

    public static void add_data(to_user_default_priveleges to_user_default_priveleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_default_privelege_others("
                    + "account"
                    + ",account_name"
                    + ",name"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":account"
                    + ",:account_name"
                    + ",:name"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_default_priveleges.account)
                    .setString("account_name", to_user_default_priveleges.account_name)
                    .setString("name", to_user_default_priveleges.name)
                    .setString("created_by", to_user_default_priveleges.created_by)
                    .setString("updated_by", to_user_default_priveleges.updated_by)
                    .setString("created_at", to_user_default_priveleges.created_at)
                    .setString("updated_at", to_user_default_priveleges.updated_at)
                    .setNumber("status", to_user_default_priveleges.status)
                    .setNumber("is_uploaded", to_user_default_priveleges.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privelege_others.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_user_default_priveleges to_user_default_priveleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_default_priveleges set "
                    + "account= :account "
                    + ",account_name= :account_name"
                    + ",name= :name "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_user_default_priveleges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_default_priveleges.account)
                    .setString("account_name", to_user_default_priveleges.account_name)
                    .setString("name", to_user_default_priveleges.name)
                    .setString("created_by", to_user_default_priveleges.created_by)
                    .setString("updated_by", to_user_default_priveleges.updated_by)
                    .setString("created_at", to_user_default_priveleges.created_at)
                    .setString("updated_at", to_user_default_priveleges.updated_at)
                    .setNumber("status", to_user_default_priveleges.status)
                    .setNumber("is_uploaded", to_user_default_priveleges.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privelege_others.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_user_default_priveleges to_user_default_priveleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_default_priveleges  "
                    + " where id='" + to_user_default_priveleges.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privelege_others.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_default_priveleges> ret_data(String where, String where2) {
        List<to_user_default_priveleges> datas = new ArrayList();
        List<User_previlege_others.to_user_previlege_others> priveleges = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s2 = "select "
                    + "id"
                    + ",account"
                    + ",account_name"
                    + ",name"
                    + ",user_id"
                    + ",user_name"
                    + " from user_previlege_others"
                    + " " + where;

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            while (rs2.next()) {
                int id = rs2.getInt(1);
                String account = rs2.getString(2);
                 String account_name = rs2.getString(3);
                String name = rs2.getString(4);
                String user_id = rs2.getString(5);
                String user_name = rs2.getString(6);
                User_previlege_others.to_user_previlege_others to = new User_previlege_others.to_user_previlege_others(id, account,account_name, name,  user_id, user_name);
                priveleges.add(to);
            }

            String s0 = "select "
                    + "id"
                    + ",account"
                    + ",account_name"
                    + ",name"
                    + ",name"
                    + ",name"
                    + ",name"
                    + ",name"
                    + ",name"
                    + " from  user_default_previlege_others " + where2 + " order by name asc "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                String account_name = rs.getString(3);
                String name = rs.getString(4);
                String updated_by = rs.getString(5);
                String created_at = rs.getString(6);
                String updated_at = rs.getString(7);
                int status = 0;
                int is_uploaded = 0;

                boolean view = false;
                boolean add = false;
                boolean edit = false;
                boolean delete = false;
                boolean finalize = false;
                boolean report = false;
                for (User_previlege_others.to_user_previlege_others priv : priveleges) {
                    if (priv.name.equalsIgnoreCase(name + " - (View)")) {
                        view = true;
                    }
                    if (priv.name.equalsIgnoreCase(name + " - (Add)")) {
                        add = true;
                    }
                    if (priv.name.equalsIgnoreCase(name + " - (Edit)")) {
                        edit = true;
                    }
                    if (priv.name.equalsIgnoreCase(name + " - (Delete)")) {
                        delete = true;
                    }
                    if (priv.name.equalsIgnoreCase(name + " - (Finalize)")) {
                        finalize = true;
                    }
                    if (priv.name.equalsIgnoreCase(name + " - (Report)")) {
                        report = true;
                    }
                }
                to_user_default_priveleges to = new to_user_default_priveleges(id, account, account_name, name, name, updated_by, created_at, updated_at, status, is_uploaded,
                        view, add, edit, delete, finalize, report);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.users;

import cis.utils.DateType;
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
public class User_default_privileges {

    public static class to_user_default_privileges {

        public final int id;
        public final String account;
        public final String privilege;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final boolean view;
        public final boolean add;
        public final boolean edit;
        public final boolean delete;
        public final boolean finalize;
        public final boolean report;

        public to_user_default_privileges(int id, String account, String privilege, String date_added, String date_updated, String added_by_id, String update_by_id, boolean view, boolean add, boolean edit, boolean delete, boolean finalize, boolean report) {
            this.id = id;
            this.account = account;
            this.privilege = privilege;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.view = view;
            this.add = add;
            this.edit = edit;
            this.delete = delete;
            this.finalize = finalize;
            this.report = report;
        }

    }

    public static void add_data(to_user_default_privileges to_user_default_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_default_privileges("
                    + "account"
                    + ",privilege"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":account"
                    + ",:privilege"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_default_privileges.account)
                    .setString("privilege", to_user_default_privileges.privilege)
                    .setString("date_added", to_user_default_privileges.date_added)
                    .setString("date_updated", to_user_default_privileges.date_updated)
                    .setString("added_by_id", to_user_default_privileges.added_by_id)
                    .setString("update_by_id", to_user_default_privileges.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privileges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_user_default_privileges to_user_default_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_default_privileges set "
                    + "account= :account "
                    + ",privilege= :privilege "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_user_default_privileges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_user_default_privileges.account)
                    .setString("privilege", to_user_default_privileges.privilege)
                    .setString("date_added", to_user_default_privileges.date_added)
                    .setString("date_updated", to_user_default_privileges.date_updated)
                    .setString("added_by_id", to_user_default_privileges.added_by_id)
                    .setString("update_by_id", to_user_default_privileges.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privileges.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_user_default_privileges to_user_default_privileges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_default_privileges  "
                    + " where id='" + to_user_default_privileges.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_default_privileges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_default_privileges> ret_data(String where) {
        List<to_user_default_privileges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",account"
                    + ",privilege"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + " from user_default_privileges"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                String privilege = rs.getString(3);
                String date_added = rs.getString(4);
                String date_updated = rs.getString(5);
                String added_by_id = rs.getString(6);
                String update_by_id = rs.getString(7);

                to_user_default_privileges to = new to_user_default_privileges(id, account, privilege, date_added, date_updated, added_by_id, update_by_id, false, false, false, false, false, false);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<User_default_privileges.to_user_default_privileges> ret_data(String where, String where2) {
        List<to_user_default_privileges> datas = new ArrayList();
        List<User_previleges.to_user_privileges> priveleges = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s2 = "select "
                    + "id"
                    + ",account"
                    + ",privilege"
                    + ",user_id"
//                    + ",user_name"
                    + " from user_privileges"
                    + " " + where;

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            String date_added = DateType.now();
            String date_updated = DateType.now();
            String added_by_id = MyUser.getUser_id();
            String update_by_id = MyUser.getUser_id();
            while (rs2.next()) {
                int id = rs2.getInt(1);
                String account = rs2.getString(2);
                String privelege = rs2.getString(3);
                String user_id = rs2.getString(4);
//                String user_name = rs2.getString(5);

                String privilege = privelege;
                int status = 0;

                String privilege_id = "" + id;
                String privilege1 = privelege;

                User_previleges.to_user_privileges to = new User_previleges.to_user_privileges(id, user_id, account, privilege_id, privilege1, date_added, date_updated, added_by_id, update_by_id);

                priveleges.add(to);
            }

            String s0 = "select "
                    + "id"
                    + ",account"
                    + ",privilege"
                    + ",privilege"
                    + ",privilege"
                    + ",privilege"
                    + ",privilege"
                    + ",privilege"
                    + ",privilege"
                    + " from user_default_privileges " + where2 + " order by privilege asc "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                String name = rs.getString(3);
                String created_by = rs.getString(4);
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
                for (User_previleges.to_user_privileges priv : priveleges) {
                    if (priv.privilege.equalsIgnoreCase(name + " - (View)")) {
                        view = true;
                    }
                    if (priv.privilege.equalsIgnoreCase(name + " - (Add)")) {
                        add = true;
                    }
                    if (priv.privilege.equalsIgnoreCase(name + " - (Edit)")) {
                        edit = true;
                    }
                    if (priv.privilege.equalsIgnoreCase(name + " - (Delete)")) {
                        delete = true;
                    }
                    if (priv.privilege.equalsIgnoreCase(name + " - (Finalize)")) {
                        finalize = true;
                    }
                    if (priv.privilege.equalsIgnoreCase(name + " - (Report)")) {
                        report = true;
                    }
                }
                
                   
         String privilege=name;
        
        
                User_default_privileges.to_user_default_privileges to = new to_user_default_privileges(id, account, privilege, date_added, date_updated, added_by_id, update_by_id, view, add, edit, delete, finalize, report);
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

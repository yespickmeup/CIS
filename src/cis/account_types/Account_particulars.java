/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.account_types;

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
public class Account_particulars {

    public static class to_account_particulars {

        public final int id;
        public final String particular;
        public final int particular_type;
        public final int account_type_id;
        public final String account_type;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;

        public to_account_particulars(int id, String particular, int particular_type, int account_type_id, String account_type, String created_by, String updated_by, String created_at, String updated_at, int status) {
            this.id = id;
            this.particular = particular;
            this.particular_type = particular_type;
            this.account_type_id = account_type_id;
            this.account_type = account_type;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
        }
    }

    public static void add_data(to_account_particulars to_account_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_particulars("
                    + "particular"
                    + ",particular_type"
                    + ",account_type_id"
                    + ",account_type"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ")values("
                    + ":particular"
                    + ",:particular_type"
                    + ",:account_type_id"
                    + ",:account_type"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("particular", to_account_particulars.particular)
                    .setNumber("particular_type", to_account_particulars.particular_type)
                    .setNumber("account_type_id", to_account_particulars.account_type_id)
                    .setString("account_type", to_account_particulars.account_type)
                    .setString("created_by", to_account_particulars.created_by)
                    .setString("updated_by", to_account_particulars.updated_by)
                    .setString("created_at", to_account_particulars.created_at)
                    .setString("updated_at", to_account_particulars.updated_at)
                    .setNumber("status", to_account_particulars.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Account_particulars.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_account_particulars to_account_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_particulars set "
                    + "particular= :particular "
                    + ",particular_type= :particular_type "
                    + ",account_type_id= :account_type_id "
                    + ",account_type= :account_type "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + " where id='" + to_account_particulars.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("particular", to_account_particulars.particular)
                    .setNumber("particular_type", to_account_particulars.particular_type)
                    .setNumber("account_type_id", to_account_particulars.account_type_id)
                    .setString("account_type", to_account_particulars.account_type)
                    .setString("created_by", to_account_particulars.created_by)
                    .setString("updated_by", to_account_particulars.updated_by)
                    .setString("created_at", to_account_particulars.created_at)
                    .setString("updated_at", to_account_particulars.updated_at)
                    .setNumber("status", to_account_particulars.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Account_particulars.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_account_particulars to_account_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_particulars  "
                    + " where id='" + to_account_particulars.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Account_particulars.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_particulars> ret_data(String where) {
        List<to_account_particulars> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",particular_type"
                    + ",account_type_id"
                    + ",account_type"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + " from account_particulars"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String particular = rs.getString(2);
                int particular_type = rs.getInt(3);
                int account_type_id = rs.getInt(4);
                String account_type = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                int status = rs.getInt(10);

                to_account_particulars to = new to_account_particulars(id, particular, particular_type, account_type_id, account_type, created_by, updated_by, created_at, updated_at, status);
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

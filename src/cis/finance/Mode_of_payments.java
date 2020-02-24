/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

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
 * @author Ronescape
 */
public class Mode_of_payments {

    public static class to_mode_of_payments {

        public final int id;
        public final String mode;
        public final int nos;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_mode_of_payments(int id, String mode, int nos, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.mode = mode;
            this.nos = nos;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_mode_of_payments to_mode_of_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into mode_of_payments("
                    + "mode"
                    + ",nos"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":mode"
                    + ",:nos"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("mode", to_mode_of_payments.mode)
                    .setNumber("nos", to_mode_of_payments.nos)
                    .setString("created_at", to_mode_of_payments.created_at)
                    .setString("updated_at", to_mode_of_payments.updated_at)
                    .setString("created_by", to_mode_of_payments.created_by)
                    .setString("updated_by", to_mode_of_payments.updated_by)
                    .setNumber("status", to_mode_of_payments.status)
                    .setNumber("is_uploaded", to_mode_of_payments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mode_of_payments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_mode_of_payments to_mode_of_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update mode_of_payments set "
                    + "mode= :mode "
                    + ",nos= :nos "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_mode_of_payments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("mode", to_mode_of_payments.mode)
                    .setNumber("nos", to_mode_of_payments.nos)
                    .setString("created_at", to_mode_of_payments.created_at)
                    .setString("updated_at", to_mode_of_payments.updated_at)
                    .setString("created_by", to_mode_of_payments.created_by)
                    .setString("updated_by", to_mode_of_payments.updated_by)
                    .setNumber("status", to_mode_of_payments.status)
                    .setNumber("is_uploaded", to_mode_of_payments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mode_of_payments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_mode_of_payments to_mode_of_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from mode_of_payments  "
                    + " where id='" + to_mode_of_payments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mode_of_payments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_mode_of_payments> ret_data(String where) {
        List<to_mode_of_payments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",mode"
                    + ",nos"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from mode_of_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String mode = rs.getString(2);
                int nos = rs.getInt(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                to_mode_of_payments to = new to_mode_of_payments(id, mode, nos, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

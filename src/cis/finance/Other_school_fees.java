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
public class Other_school_fees {

    public static class to_other_school_fees {

        public final int id;
        public final String fee;
        public final double amount;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_other_school_fees(int id, String fee, double amount, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.fee = fee;
            this.amount = amount;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_other_school_fees to_other_school_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into other_school_fees("
                    + "fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":fee"
                    + ",:amount"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fee", to_other_school_fees.fee)
                    .setNumber("amount", to_other_school_fees.amount)
                    .setString("created_at", to_other_school_fees.created_at)
                    .setString("updated_at", to_other_school_fees.updated_at)
                    .setString("created_by", to_other_school_fees.created_by)
                    .setString("updated_by", to_other_school_fees.updated_by)
                    .setNumber("status", to_other_school_fees.status)
                    .setNumber("is_uploaded", to_other_school_fees.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Other_school_fees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_other_school_fees to_other_school_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update other_school_fees set "
                    + "fee= :fee "
                    + ",amount= :amount "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_other_school_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fee", to_other_school_fees.fee)
                    .setNumber("amount", to_other_school_fees.amount)
                    .setString("created_at", to_other_school_fees.created_at)
                    .setString("updated_at", to_other_school_fees.updated_at)
                    .setString("created_by", to_other_school_fees.created_by)
                    .setString("updated_by", to_other_school_fees.updated_by)
                    .setNumber("status", to_other_school_fees.status)
                    .setNumber("is_uploaded", to_other_school_fees.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Other_school_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_other_school_fees> ret_data(String where) {
        List<to_other_school_fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from other_school_fees"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fee = rs.getString(2);
                double amount = rs.getDouble(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                to_other_school_fees to = new to_other_school_fees(id, fee, amount, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

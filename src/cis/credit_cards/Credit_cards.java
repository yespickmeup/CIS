/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.credit_cards;

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
public class Credit_cards {

    public static class to_credit_cards {

        public final int id;
        public final String card;
        public final double amount;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_credit_cards(int id, String card, double amount, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.card = card;
            this.amount = amount;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_credit_cards to_credit_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into credit_cards("
                    + "card"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":card"
                    + ",:amount"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("card", to_credit_cards.card)
                    .setNumber("amount", to_credit_cards.amount)
                    .setString("created_at", to_credit_cards.created_at)
                    .setString("updated_at", to_credit_cards.updated_at)
                    .setString("created_by", to_credit_cards.created_by)
                    .setString("updated_by", to_credit_cards.updated_by)
                    .setNumber("status", to_credit_cards.status)
                    .setNumber("is_uploaded", to_credit_cards.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Credit_cards.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_credit_cards to_credit_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update credit_cards set "
                    + "card= :card "
                    + ",amount= :amount "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_credit_cards.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("card", to_credit_cards.card)
                    .setNumber("amount", to_credit_cards.amount)
                    .setString("created_at", to_credit_cards.created_at)
                    .setString("updated_at", to_credit_cards.updated_at)
                    .setString("created_by", to_credit_cards.created_by)
                    .setString("updated_by", to_credit_cards.updated_by)
                    .setNumber("status", to_credit_cards.status)
                    .setNumber("is_uploaded", to_credit_cards.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Credit_cards.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_credit_cards to_credit_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from credit_cards  "
                    + " where id='" + to_credit_cards.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Credit_cards.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_credit_cards> ret_data(String where) {
        List<to_credit_cards> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",card"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from credit_cards"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String card = rs.getString(2);
                double amount = rs.getDouble(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                to_credit_cards to = new to_credit_cards(id, card, amount, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

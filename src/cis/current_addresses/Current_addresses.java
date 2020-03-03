/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.current_addresses;

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
public class Current_addresses {

    public static class to_current_addresses {

        public final int id;
        public final String address;

        public to_current_addresses(int id, String address) {
            this.id = id;
            this.address = address;
        }
    }

    public static void add_data(to_current_addresses to_current_addresses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into current_addresses("
                    + "address"
                    + ")values("
                    + ":address"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("address", to_current_addresses.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Current_addresses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_current_addresses to_current_addresses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update current_addresses set "
                    + "address= :address "
                    + " where id='" + to_current_addresses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("address", to_current_addresses.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Current_addresses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_current_addresses to_current_addresses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from current_addresses  "
                    + " where id='" + to_current_addresses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Current_addresses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_current_addresses> ret_data(String where) {
        List<to_current_addresses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",address"
                    + " from current_addresses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String address = rs.getString(2);

                to_current_addresses to = new to_current_addresses(id, address);
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

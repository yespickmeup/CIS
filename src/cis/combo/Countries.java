/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.combo;

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
public class Countries {

    public static class to_countries {

        public final int num_code;
        public final String alpha_2_code;
        public final String alpha_3_code;
        public final String en_short_name;
        public final String nationality;

        public to_countries(int num_code, String alpha_2_code, String alpha_3_code, String en_short_name, String nationality) {
            this.num_code = num_code;
            this.alpha_2_code = alpha_2_code;
            this.alpha_3_code = alpha_3_code;
            this.en_short_name = en_short_name;
            this.nationality = nationality;
        }
    }

    public static void add_data(to_countries to_countries) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into countries("
                    + "alpha_2_code"
                    + ",alpha_3_code"
                    + ",en_short_name"
                    + ",nationality"
                    + ")values("
                    + ":alpha_2_code"
                    + ",:alpha_3_code"
                    + ",:en_short_name"
                    + ",:nationality"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("alpha_2_code", to_countries.alpha_2_code)
                    .setString("alpha_3_code", to_countries.alpha_3_code)
                    .setString("en_short_name", to_countries.en_short_name)
                    .setString("nationality", to_countries.nationality)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Countries.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_countries to_countries) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update countries set "
                    + "alpha_2_code= :alpha_2_code "
                    + ",alpha_3_code= :alpha_3_code "
                    + ",en_short_name= :en_short_name "
                    + ",nationality= :nationality "
                    + " where num_code='" + to_countries.num_code + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("alpha_2_code", to_countries.alpha_2_code)
                    .setString("alpha_3_code", to_countries.alpha_3_code)
                    .setString("en_short_name", to_countries.en_short_name)
                    .setString("nationality", to_countries.nationality)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Countries.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_countries to_countries) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from countries  "
                    + " where num_code='" + to_countries.num_code + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Countries.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_countries> ret_data(String where) {
        List<to_countries> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "num_code"
                    + ",alpha_2_code"
                    + ",alpha_3_code"
                    + ",en_short_name"
                    + ",nationality"
                    + " from countries"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int num_code = rs.getInt(1);
                String alpha_2_code = rs.getString(2);
                String alpha_3_code = rs.getString(3);
                String en_short_name = rs.getString(4);
                String nationality = rs.getString(5);

                to_countries to = new to_countries(num_code, alpha_2_code, alpha_3_code, en_short_name, nationality);
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

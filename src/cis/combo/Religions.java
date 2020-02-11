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
public class Religions {

    public static class to_religions {

        public final int id;
        public final String religion;

        public to_religions(int id, String religion) {
            this.id = id;
            this.religion = religion;
        }
    }

    public static void add_data(to_religions to_religions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into religions("
                    + "religion"
                    + ")values("
                    + ":religion"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("religion", to_religions.religion)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Religions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_religions to_religions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update religions set "
                    + "religion= :religion "
                    + " where id='" + to_religions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("religion", to_religions.religion)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Religions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_religions to_religions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from religions  "
                    + " where id='" + to_religions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Religions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_religions> ret_data(String where) {
        List<to_religions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",religion"
                    + " from religions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String religion = rs.getString(2);

                to_religions to = new to_religions(id, religion);
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

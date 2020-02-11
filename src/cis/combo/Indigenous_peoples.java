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
public class Indigenous_peoples {

    public static class to_indigenous_peoples {

        public final int id;
        public final String name;

        public to_indigenous_peoples(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void add_data(to_indigenous_peoples to_indigenous_peoples) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into indigenous_peoples("
                    + "name"
                    + ")values("
                    + ":name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("name", to_indigenous_peoples.name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Indigenous_peoples.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_indigenous_peoples to_indigenous_peoples) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update indigenous_peoples set "
                    + "name= :name "
                    + " where id='" + to_indigenous_peoples.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("name", to_indigenous_peoples.name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Indigenous_peoples.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_indigenous_peoples to_indigenous_peoples) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from indigenous_peoples  "
                    + " where id='" + to_indigenous_peoples.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Indigenous_peoples.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_indigenous_peoples> ret_data(String where) {
        List<to_indigenous_peoples> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",name"
                    + " from indigenous_peoples"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);

                to_indigenous_peoples to = new to_indigenous_peoples(id, name);
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

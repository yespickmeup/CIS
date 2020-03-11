/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.migration;

import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class College {

    public static class to_college {

        public final int Collcode;
        public final String CollDept;
        public final String CollName;
        public final String DeptHead;

        public to_college(int Collcode, String CollDept, String CollName, String DeptHead) {
            this.Collcode = Collcode;
            this.CollDept = CollDept;
            this.CollName = CollName;
            this.DeptHead = DeptHead;
        }

    }

    public static List<to_college> ret_data(String where) {
        List<to_college> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "Collcode"
                    + ",CollDept"
                    + ",CollName"
                    + ",DeptHead"
                    + " from College"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int Collcode = rs.getInt(1);
                String CollDept = rs.getString(2);
                String CollName = rs.getString(3);
                String DeptHead = rs.getString(4);

                College.to_college to = new to_college(Collcode, CollDept, CollName, DeptHead);
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

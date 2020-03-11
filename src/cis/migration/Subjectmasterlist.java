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
public class Subjectmasterlist {

    public static class to_subjectmasterlist {

        public final int row_id;
        public final String subcode;
        public final String subname;
        public final String subdesc;
        public final double units;
        public final int lab;

        public to_subjectmasterlist(int row_id, String subcode, String subname, String subdesc, double units, int lab) {
            this.row_id = row_id;
            this.subcode = subcode;
            this.subname = subname;
            this.subdesc = subdesc;
            this.units = units;
            this.lab = lab;
        }

    }

    public static List<to_subjectmasterlist> ret_data(String where) {
        List<to_subjectmasterlist> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "row_id"
                    + ",subcode"
                    + ",subname"
                    + ",subdesc"
                    + ",units"
                    + ",lab"
                    + " from subjectmasterlist"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int row_id = rs.getInt(1);
                String subcode = rs.getString(2);
                String subname = rs.getString(3);
                String subdesc = rs.getString(4);
                double units = rs.getDouble(5);
                int lab = rs.getInt(6);

                to_subjectmasterlist to = new to_subjectmasterlist(row_id, subcode, subname, subdesc, units, lab);
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

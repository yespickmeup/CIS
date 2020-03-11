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
public class CoursesM {

    public static class to_courses {

        public final int ID;
        public final String Collcode;
        public final String course;
        public final String CourseID;
        public final String CourseName;
        public final String CourseDescription;
        public final int Yrs;
        public final int TotalUnits;

        public to_courses(int ID, String Collcode, String course, String CourseID, String CourseName, String CourseDescription, int Yrs, int TotalUnits) {
            this.ID = ID;
            this.Collcode = Collcode;
            this.course = course;
            this.CourseID = CourseID;
            this.CourseName = CourseName;
            this.CourseDescription = CourseDescription;
            this.Yrs = Yrs;
            this.TotalUnits = TotalUnits;
        }

    }

    public static List<to_courses> ret_data(String where) {
        List<to_courses> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " ID"
                    + ",Collcode"
                    + ",course"
                    + ",CourseID"
                    + ",CourseName"
                    + ",CourseDescription"
                    + ",Yrs"
                    + ",TotalUnits"
                    + ",details"
                    + " from courses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int ID = rs.getInt(1);
                String Collcode = rs.getString(2);
                String course = rs.getString(3);
                String CourseID = rs.getString(4);
                String CourseName = rs.getString(5);
                String CourseDescription = rs.getString(6);

                int Yrs = rs.getInt(7);
                int TotalUnits = rs.getInt(8);
                String details = rs.getString(9);
                CoursesM.to_courses to = new to_courses(ID, Collcode, course, CourseID, CourseName, CourseDescription, Yrs, TotalUnits);
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

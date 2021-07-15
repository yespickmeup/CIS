/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.users;

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
 * @author User
 */
public class User_departments {

    public static class to_user_departments {

        public final int id;
        public final int user_id;
        public final String user_screen_name;
        public final String department;
        public final int department_id;
        public final String college;
        public final String college_id;
        public final String created_at;
        public final String updated_at;
        public final int created_by;
        public final int updated_by;
        public final int status;

        public to_user_departments(int id, int user_id, String user_screen_name, String department, int department_id, String college, String college_id, String created_at, String updated_at, int created_by, int updated_by, int status) {
            this.id = id;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
            this.department = department;
            this.department_id = department_id;
            this.college = college;
            this.college_id = college_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_user_departments to_user_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_departments("
                    + "user_id"
                    + ",user_screen_name"
                    + ",department"
                    + ",department_id"
                    + ",college"
                    + ",college_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":user_id"
                    + ",:user_screen_name"
                    + ",:department"
                    + ",:department_id"
                    + ",:college"
                    + ",:college_id"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("user_id", to_user_departments.user_id)
                    .setString("user_screen_name", to_user_departments.user_screen_name)
                    .setString("department", to_user_departments.department)
                    .setNumber("department_id", to_user_departments.department_id)
                    .setString("college", to_user_departments.college)
                    .setString("college_id", to_user_departments.college_id)
                    .setString("created_at", to_user_departments.created_at)
                    .setString("updated_at", to_user_departments.updated_at)
                    .setNumber("created_by", to_user_departments.created_by)
                    .setNumber("updated_by", to_user_departments.updated_by)
                    .setNumber("status", to_user_departments.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_departments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_user_departments to_user_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_departments set "
                    + "user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + ",department= :department "
                    + ",department_id= :department_id "
                    + ",college= :college "
                    + ",college_id= :college_id "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_user_departments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("user_id", to_user_departments.user_id)
                    .setString("user_screen_name", to_user_departments.user_screen_name)
                    .setString("department", to_user_departments.department)
                    .setNumber("department_id", to_user_departments.department_id)
                    .setString("college", to_user_departments.college)
                    .setString("college_id", to_user_departments.college_id)
                    .setString("created_at", to_user_departments.created_at)
                    .setString("updated_at", to_user_departments.updated_at)
                    .setNumber("created_by", to_user_departments.created_by)
                    .setNumber("updated_by", to_user_departments.updated_by)
                    .setNumber("status", to_user_departments.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_departments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_user_departments to_user_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_departments  "
                    + " where id='" + to_user_departments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_departments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_departments> ret_data(String where) {
        List<to_user_departments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_id"
                    + ",user_screen_name"
                    + ",department"
                    + ",department_id"
                    + ",college"
                    + ",college_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + " from user_departments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int user_id = rs.getInt(2);
                String user_screen_name = rs.getString(3);
                String department = rs.getString(4);
                int department_id = rs.getInt(5);
                String college = rs.getString(6);
                String college_id = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                int created_by = rs.getInt(10);
                int updated_by = rs.getInt(11);
                int status = rs.getInt(12);

                to_user_departments to = new to_user_departments(id, user_id, user_screen_name, department, department_id, college, college_id, created_at, updated_at, created_by, updated_by, status);
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

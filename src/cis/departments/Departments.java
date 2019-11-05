/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.departments;

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
public class Departments {

    public static class to_departments {

        public final int id;
        public final String department_name;
        public final int college_id;
        public final int department_admin_id;
        public final String department_admin_name;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_departments(int id, String department_name, int college_id, int department_admin_id, String department_admin_name, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.department_name = department_name;
            this.college_id = college_id;
            this.department_admin_id = department_admin_id;
            this.department_admin_name = department_admin_name;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into departments("
                    + "department_name"
                    + ",college_id"
                    + ",department_admin_id"
                    + ",department_admin_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":department_name"
                    + ",:college_id"
                    + ",:department_admin_id"
                    + ",:department_admin_name"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department_name", to_departments.department_name)
                    .setNumber("college_id", to_departments.college_id)
                    .setNumber("department_admin_id", to_departments.department_admin_id)
                    .setString("department_admin_name", to_departments.department_admin_name)
                    .setString("created_at", to_departments.created_at)
                    .setString("updated_at", to_departments.updated_at)
                    .setString("created_by", to_departments.created_by)
                    .setString("updated_by", to_departments.updated_by)
                    .setNumber("status", to_departments.status)
                    .setNumber("is_uploaded", to_departments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update departments set "
                    + "department_name= :department_name "
                    + ",college_id= :college_id "
                    + ",department_admin_id= :department_admin_id "
                    + ",department_admin_name= :department_admin_name "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_departments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department_name", to_departments.department_name)
                    .setNumber("college_id", to_departments.college_id)
                    .setNumber("department_admin_id", to_departments.department_admin_id)
                    .setString("department_admin_name", to_departments.department_admin_name)
                    .setString("created_at", to_departments.created_at)
                    .setString("updated_at", to_departments.updated_at)
                    .setString("created_by", to_departments.created_by)
                    .setString("updated_by", to_departments.updated_by)
                    .setNumber("status", to_departments.status)
                    .setNumber("is_uploaded", to_departments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from departments  "
                    + " where id='" + to_departments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_departments> ret_data(String where) {
        List<to_departments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",department_name"
                    + ",college_id"
                    + ",department_admin_id"
                    + ",department_admin_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from departments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String department_name = rs.getString(2);
                int college_id = rs.getInt(3);
                int department_admin_id = rs.getInt(4);
                String department_admin_name = rs.getString(5);
                String created_at = rs.getString(6);
                String updated_at = rs.getString(7);
                String created_by = rs.getString(8);
                String updated_by = rs.getString(9);
                int status = rs.getInt(10);
                int is_uploaded = rs.getInt(11);

                to_departments to = new to_departments(id, department_name, college_id, department_admin_id, department_admin_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

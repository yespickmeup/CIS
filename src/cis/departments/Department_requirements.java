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
public class Department_requirements {

    public static class to_department_requirements {

        public final int id;
        public final int academic_year_id;
        public final String academic_year;
        public final int department_id;
        public final String department;
        public final String requirements;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_department_requirements(int id, int academic_year_id, String academic_year, int department_id, String department, String requirements, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.department_id = department_id;
            this.department = department;
            this.requirements = requirements;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_department_requirements to_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into department_requirements("
                    + "academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",requirements"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":academic_year_id"
                    + ",:academic_year"
                    + ",:department_id"
                    + ",:department"
                    + ",:requirements"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_department_requirements.academic_year_id)
                    .setString("academic_year", to_department_requirements.academic_year)
                    .setNumber("department_id", to_department_requirements.department_id)
                    .setString("department", to_department_requirements.department)
                    .setString("requirements", to_department_requirements.requirements)
                    .setString("created_at", to_department_requirements.created_at)
                    .setString("updated_at", to_department_requirements.updated_at)
                    .setString("created_by", to_department_requirements.created_by)
                    .setString("updated_by", to_department_requirements.updated_by)
                    .setNumber("status", to_department_requirements.status)
                    .setNumber("is_uploaded", to_department_requirements.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Department_requirements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_department_requirements to_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update department_requirements set "
                    + "academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",requirements= :requirements "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_department_requirements.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_department_requirements.academic_year_id)
                    .setString("academic_year", to_department_requirements.academic_year)
                    .setNumber("department_id", to_department_requirements.department_id)
                    .setString("department", to_department_requirements.department)
                    .setString("requirements", to_department_requirements.requirements)
                    .setString("created_at", to_department_requirements.created_at)
                    .setString("updated_at", to_department_requirements.updated_at)
                    .setString("created_by", to_department_requirements.created_by)
                    .setString("updated_by", to_department_requirements.updated_by)
                    .setNumber("status", to_department_requirements.status)
                    .setNumber("is_uploaded", to_department_requirements.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Department_requirements.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_department_requirements to_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from department_requirements  "
                    + " where id='" + to_department_requirements.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Department_requirements.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_department_requirements> ret_data(String where) {
        List<to_department_requirements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",requirements"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from department_requirements"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                String academic_year = rs.getString(3);
                int department_id = rs.getInt(4);
                String department = rs.getString(5);
                String requirements = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                String created_by = rs.getString(9);
                String updated_by = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);

                to_department_requirements to = new to_department_requirements(id, academic_year_id, academic_year, department_id, department, requirements, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

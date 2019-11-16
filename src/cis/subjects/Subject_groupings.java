/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.subjects;

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
public class Subject_groupings {

    public static class to_subject_groupings {

        public final int id;
        public final String description;
        public final int department_id;
        public final String department;
        public final int college_id;
        public final String college;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_subject_groupings(int id, String description, int department_id, String department, int college_id, String college, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.description = description;
            this.department_id = department_id;
            this.department = department;
            this.college_id = college_id;
            this.college = college;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_subject_groupings to_subject_groupings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into subject_groupings("
                    + "description"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":description"
                    + ",:department_id"
                    + ",:department"
                    + ",:college_id"
                    + ",:college"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("description", to_subject_groupings.description)
                    .setNumber("department_id", to_subject_groupings.department_id)
                    .setString("department", to_subject_groupings.department)
                    .setNumber("college_id", to_subject_groupings.college_id)
                    .setString("college", to_subject_groupings.college)
                    .setString("created_at", to_subject_groupings.created_at)
                    .setString("updated_at", to_subject_groupings.updated_at)
                    .setString("created_by", to_subject_groupings.created_by)
                    .setString("updated_by", to_subject_groupings.updated_by)
                    .setNumber("status", to_subject_groupings.status)
                    .setNumber("is_uploaded", to_subject_groupings.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_groupings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_subject_groupings to_subject_groupings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update subject_groupings set "
                    + "description= :description "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_subject_groupings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("description", to_subject_groupings.description)
                    .setNumber("department_id", to_subject_groupings.department_id)
                    .setString("department", to_subject_groupings.department)
                    .setNumber("college_id", to_subject_groupings.college_id)
                    .setString("college", to_subject_groupings.college)
                    .setString("created_at", to_subject_groupings.created_at)
                    .setString("updated_at", to_subject_groupings.updated_at)
                    .setString("created_by", to_subject_groupings.created_by)
                    .setString("updated_by", to_subject_groupings.updated_by)
                    .setNumber("status", to_subject_groupings.status)
                    .setNumber("is_uploaded", to_subject_groupings.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_groupings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_subject_groupings to_subject_groupings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from subject_groupings  "
                    + " where id='" + to_subject_groupings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_groupings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_subject_groupings> ret_data(String where) {
        List<to_subject_groupings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",description"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from subject_groupings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String description = rs.getString(2);
                int department_id = rs.getInt(3);
                String department = rs.getString(4);
                int college_id = rs.getInt(5);
                String college = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                String created_by = rs.getString(9);
                String updated_by = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);

                to_subject_groupings to = new to_subject_groupings(id, description, department_id, department, college_id, college, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

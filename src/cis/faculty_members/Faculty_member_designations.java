/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.faculty_members;

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
public class Faculty_member_designations {

    public static class to_faculty_member_designations {

        public final int id;
        public final int group_id;
        public final String group_name;
        public final String designation;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_faculty_member_designations(int id, int group_id, String group_name, String designation, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.group_id = group_id;
            this.group_name = group_name;
            this.designation = designation;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_faculty_member_designations to_faculty_member_designations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into faculty_member_designations("
                    + "group_id"
                    + ",group_name"
                    + ",designation"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":group_id"
                    + ",:group_name"
                    + ",:designation"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("group_id", to_faculty_member_designations.group_id)
                    .setString("group_name", to_faculty_member_designations.group_name)
                    .setString("designation", to_faculty_member_designations.designation)
                    .setString("created_at", to_faculty_member_designations.created_at)
                    .setString("updated_at", to_faculty_member_designations.updated_at)
                    .setString("created_by", to_faculty_member_designations.created_by)
                    .setString("updated_by", to_faculty_member_designations.updated_by)
                    .setNumber("status", to_faculty_member_designations.status)
                    .setNumber("is_uploaded", to_faculty_member_designations.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designations.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_faculty_member_designations to_faculty_member_designations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update faculty_member_designations set "
                    + "group_id= :group_id "
                    + ",group_name= :group_name "
                    + ",designation= :designation "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_faculty_member_designations.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("group_id", to_faculty_member_designations.group_id)
                    .setString("group_name", to_faculty_member_designations.group_name)
                    .setString("designation", to_faculty_member_designations.designation)
                    .setString("created_at", to_faculty_member_designations.created_at)
                    .setString("updated_at", to_faculty_member_designations.updated_at)
                    .setString("created_by", to_faculty_member_designations.created_by)
                    .setString("updated_by", to_faculty_member_designations.updated_by)
                    .setNumber("status", to_faculty_member_designations.status)
                    .setNumber("is_uploaded", to_faculty_member_designations.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designations.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_faculty_member_designations to_faculty_member_designations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from faculty_member_designations  "
                    + " where id='" + to_faculty_member_designations.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designations.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_faculty_member_designations> ret_data(String where) {
        List<to_faculty_member_designations> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",group_id"
                    + ",group_name"
                    + ",designation"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from faculty_member_designations"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int group_id = rs.getInt(2);
                String group_name = rs.getString(3);
                String designation = rs.getString(4);
                String created_at = rs.getString(5);
                String updated_at = rs.getString(6);
                String created_by = rs.getString(7);
                String updated_by = rs.getString(8);
                int status = rs.getInt(9);
                int is_uploaded = rs.getInt(10);

                to_faculty_member_designations to = new to_faculty_member_designations(id, group_id, group_name, designation, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

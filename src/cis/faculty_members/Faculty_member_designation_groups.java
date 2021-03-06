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
public class Faculty_member_designation_groups {

    public static class to_faculty_member_designation_groups {

        public final int id;
        public final String group_name;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_faculty_member_designation_groups(int id, String group_name, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.group_name = group_name;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_faculty_member_designation_groups to_faculty_member_designation_groups) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into faculty_member_designation_groups("
                    + "group_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":group_name"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("group_name", to_faculty_member_designation_groups.group_name)
                    .setString("created_at", to_faculty_member_designation_groups.created_at)
                    .setString("updated_at", to_faculty_member_designation_groups.updated_at)
                    .setString("created_by", to_faculty_member_designation_groups.created_by)
                    .setString("updated_by", to_faculty_member_designation_groups.updated_by)
                    .setNumber("status", to_faculty_member_designation_groups.status)
                    .setNumber("is_uploaded", to_faculty_member_designation_groups.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designation_groups.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_faculty_member_designation_groups to_faculty_member_designation_groups) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update faculty_member_designation_groups set "
                    + "group_name= :group_name "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_faculty_member_designation_groups.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("group_name", to_faculty_member_designation_groups.group_name)
                    .setString("created_at", to_faculty_member_designation_groups.created_at)
                    .setString("updated_at", to_faculty_member_designation_groups.updated_at)
                    .setString("created_by", to_faculty_member_designation_groups.created_by)
                    .setString("updated_by", to_faculty_member_designation_groups.updated_by)
                    .setNumber("status", to_faculty_member_designation_groups.status)
                    .setNumber("is_uploaded", to_faculty_member_designation_groups.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designation_groups.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_faculty_member_designation_groups to_faculty_member_designation_groups) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from faculty_member_designation_groups  "
                    + " where id='" + to_faculty_member_designation_groups.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_member_designation_groups.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_faculty_member_designation_groups> ret_data(String where) {
        List<to_faculty_member_designation_groups> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",group_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from faculty_member_designation_groups"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String group_name = rs.getString(2);
                String created_at = rs.getString(3);
                String updated_at = rs.getString(4);
                String created_by = rs.getString(5);
                String updated_by = rs.getString(6);
                int status = rs.getInt(7);
                int is_uploaded = rs.getInt(8);

                to_faculty_member_designation_groups to = new to_faculty_member_designation_groups(id, group_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

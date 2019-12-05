/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.faculty_members;

import cis.users.Users;
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
public class Faculty_members {

    public static class to_faculty_members {

        public final int id;
        public final String fname;
        public final String lname;
        public final String mi;
        public final int level_id;
        public final String level;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department;
        public final int group_id;
        public final String group_name;
        public final int designation_id;
        public final String designation;
        public final int is_fulltime;
        public final int is_acad;
        public final int dean_college_id;
        public final String dean_college_name;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_faculty_members(int id, String fname, String lname, String mi, int level_id, String level, int college_id, String college, int department_id, String department, int group_id, String group_name, int designation_id, String designation, int is_fulltime, int is_acad, int dean_college_id, String dean_college_name, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
            this.mi = mi;
            this.level_id = level_id;
            this.level = level;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.group_id = group_id;
            this.group_name = group_name;
            this.designation_id = designation_id;
            this.designation = designation;
            this.is_fulltime = is_fulltime;
            this.is_acad = is_acad;
            this.dean_college_id = dean_college_id;
            this.dean_college_name = dean_college_name;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_faculty_members to_faculty_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into faculty_members("
                    + "fname"
                    + ",lname"
                    + ",mi"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",group_id"
                    + ",group_name"
                    + ",designation_id"
                    + ",designation"
                    + ",is_fulltime"
                    + ",is_acad"
                    + ",dean_college_id"
                    + ",dean_college_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":fname"
                    + ",:lname"
                    + ",:mi"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:group_id"
                    + ",:group_name"
                    + ",:designation_id"
                    + ",:designation"
                    + ",:is_fulltime"
                    + ",:is_acad"
                    + ",:dean_college_id"
                    + ",:dean_college_name"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_faculty_members.fname)
                    .setString("lname", to_faculty_members.lname)
                    .setString("mi", to_faculty_members.mi)
                    .setNumber("level_id", to_faculty_members.level_id)
                    .setString("level", to_faculty_members.level)
                    .setNumber("college_id", to_faculty_members.college_id)
                    .setString("college", to_faculty_members.college)
                    .setNumber("department_id", to_faculty_members.department_id)
                    .setString("department", to_faculty_members.department)
                    .setNumber("group_id", to_faculty_members.group_id)
                    .setString("group_name", to_faculty_members.group_name)
                    .setNumber("designation_id", to_faculty_members.designation_id)
                    .setString("designation", to_faculty_members.designation)
                    .setNumber("is_fulltime", to_faculty_members.is_fulltime)
                    .setNumber("is_acad", to_faculty_members.is_acad)
                    .setNumber("dean_college_id", to_faculty_members.dean_college_id)
                    .setString("dean_college_name", to_faculty_members.dean_college_name)
                    .setString("created_at", to_faculty_members.created_at)
                    .setString("updated_at", to_faculty_members.updated_at)
                    .setString("created_by", to_faculty_members.created_by)
                    .setString("updated_by", to_faculty_members.updated_by)
                    .setNumber("status", to_faculty_members.status)
                    .setNumber("is_uploaded", to_faculty_members.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_members.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_faculty_members to_faculty_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update faculty_members set "
                    + "fname= :fname "
                    + ",lname= :lname "
                    + ",mi= :mi "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",group_id= :group_id "
                    + ",group_name= :group_name "
                    + ",designation_id= :designation_id "
                    + ",designation= :designation "
                    + ",is_fulltime= :is_fulltime "
                    + ",is_acad= :is_acad "
                    + ",dean_college_id= :dean_college_id "
                    + ",dean_college_name= :dean_college_name "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_faculty_members.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_faculty_members.fname)
                    .setString("lname", to_faculty_members.lname)
                    .setString("mi", to_faculty_members.mi)
                    .setNumber("level_id", to_faculty_members.level_id)
                    .setString("level", to_faculty_members.level)
                    .setNumber("college_id", to_faculty_members.college_id)
                    .setString("college", to_faculty_members.college)
                    .setNumber("department_id", to_faculty_members.department_id)
                    .setString("department", to_faculty_members.department)
                    .setNumber("group_id", to_faculty_members.group_id)
                    .setString("group_name", to_faculty_members.group_name)
                    .setNumber("designation_id", to_faculty_members.designation_id)
                    .setString("designation", to_faculty_members.designation)
                    .setNumber("is_fulltime", to_faculty_members.is_fulltime)
                    .setNumber("is_acad", to_faculty_members.is_acad)
                    .setNumber("dean_college_id", to_faculty_members.dean_college_id)
                    .setString("dean_college_name", to_faculty_members.dean_college_name)
                    .setString("created_at", to_faculty_members.created_at)
                    .setString("updated_at", to_faculty_members.updated_at)
                    .setString("created_by", to_faculty_members.created_by)
                    .setString("updated_by", to_faculty_members.updated_by)
                    .setNumber("status", to_faculty_members.status)
                    .setNumber("is_uploaded", to_faculty_members.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_members.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_faculty_members to_faculty_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from faculty_members  "
                    + " where id='" + to_faculty_members.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Faculty_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_faculty_members> ret_data(String where) {
        List<to_faculty_members> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fname"
                    + ",lname"
                    + ",mi"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",group_id"
                    + ",group_name"
                    + ",designation_id"
                    + ",designation"
                    + ",is_fulltime"
                    + ",is_acad"
                    + ",dean_college_id"
                    + ",dean_college_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from faculty_members"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String mi = rs.getString(4);
                int level_id = rs.getInt(5);
                String level = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department = rs.getString(10);
                int group_id = rs.getInt(11);
                String group_name = rs.getString(12);
                int designation_id = rs.getInt(13);
                String designation = rs.getString(14);
                int is_fulltime = rs.getInt(15);
                int is_acad = rs.getInt(16);
                int dean_college_id = rs.getInt(17);
                String dean_college_name = rs.getString(18);
                String created_at = rs.getString(19);
                String updated_at = rs.getString(20);
                String created_by = rs.getString(21);
                String updated_by = rs.getString(22);
                int status = rs.getInt(23);
                int is_uploaded = rs.getInt(24);

                to_faculty_members to = new to_faculty_members(id, fname, lname, mi, level_id, level, college_id, college, department_id, department, group_id, group_name, designation_id, designation, is_fulltime, is_acad, dean_college_id, dean_college_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_faculty_members> ret_data_with_account(String where) {
        List<to_faculty_members> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fname"
                    + ",lname"
                    + ",mi"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",group_id"
                    + ",group_name"
                    + ",designation_id"
                    + ",designation"
                    + ",is_fulltime"
                    + ",is_acad"
                    + ",dean_college_id"
                    + ",dean_college_name"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from faculty_members"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String mi = rs.getString(4);
                int level_id = rs.getInt(5);
                String level = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department = rs.getString(10);
                int group_id = rs.getInt(11);
                String group_name = rs.getString(12);
                int designation_id = rs.getInt(13);
                String designation = rs.getString(14);
                int is_fulltime = rs.getInt(15);
                int is_acad = rs.getInt(16);
                int dean_college_id = rs.getInt(17);
                String dean_college_name = rs.getString(18);
                String created_at = rs.getString(19);
                String updated_at = rs.getString(20);
                String created_by = rs.getString(21);
                String updated_by = "";// rs.getString(22);
                int status = rs.getInt(23);
                int is_uploaded = rs.getInt(24);

                String s2 = "select "
                        + "id"
                        + ",user_screen_name"
                        + ",user_name"
                        + ",password"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",status"
                        + ",faculty_id"
                        + " from users"
                        + " where faculty_id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    updated_by = rs2.getString(1);
                }

                to_faculty_members to = new to_faculty_members(id, fname, lname, mi, level_id, level, college_id, college, department_id, department, group_id, group_name, designation_id, designation, is_fulltime, is_acad, dean_college_id, dean_college_name, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

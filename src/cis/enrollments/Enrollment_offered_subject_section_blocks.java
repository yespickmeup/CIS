/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

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
public class Enrollment_offered_subject_section_blocks {

    public static class to_enrollment_offered_subject_section_blocks {

        public final int id;
        public final int eoss_id;
        public final int course_id;
        public final String course_code;
        public final String created_at;
        public final String updated_at;
        public final int created_by;
        public final int updated_by;
        public final int status;

        public to_enrollment_offered_subject_section_blocks(int id, int eoss_id, int course_id, String course_code, String created_at, String updated_at, int created_by, int updated_by, int status) {
            this.id = id;
            this.eoss_id = eoss_id;
            this.course_id = course_id;
            this.course_code = course_code;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_enrollment_offered_subject_section_blocks to_enrollment_offered_subject_section_blocks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_offered_subject_section_blocks("
                    + "eoss_id"
                    + ",course_id"
                    + ",course_code"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":eoss_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("eoss_id", to_enrollment_offered_subject_section_blocks.eoss_id)
                    .setNumber("course_id", to_enrollment_offered_subject_section_blocks.course_id)
                    .setString("course_code", to_enrollment_offered_subject_section_blocks.course_code)
                    .setString("created_at", to_enrollment_offered_subject_section_blocks.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_section_blocks.updated_at)
                    .setNumber("created_by", to_enrollment_offered_subject_section_blocks.created_by)
                    .setNumber("updated_by", to_enrollment_offered_subject_section_blocks.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_section_blocks.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_blocks.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_offered_subject_section_blocks to_enrollment_offered_subject_section_blocks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_offered_subject_section_blocks set "
                    + "eoss_id= :eoss_id "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_enrollment_offered_subject_section_blocks.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("eoss_id", to_enrollment_offered_subject_section_blocks.eoss_id)
                    .setNumber("course_id", to_enrollment_offered_subject_section_blocks.course_id)
                    .setString("course_code", to_enrollment_offered_subject_section_blocks.course_code)
                    .setString("created_at", to_enrollment_offered_subject_section_blocks.created_at)
                    .setString("updated_at", to_enrollment_offered_subject_section_blocks.updated_at)
                    .setNumber("created_by", to_enrollment_offered_subject_section_blocks.created_by)
                    .setNumber("updated_by", to_enrollment_offered_subject_section_blocks.updated_by)
                    .setNumber("status", to_enrollment_offered_subject_section_blocks.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_blocks.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_offered_subject_section_blocks to_enrollment_offered_subject_section_blocks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_offered_subject_section_blocks  "
                    + " where id='" + to_enrollment_offered_subject_section_blocks.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_offered_subject_section_blocks.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_offered_subject_section_blocks> ret_data(String where) {
        List<to_enrollment_offered_subject_section_blocks> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",eoss_id"
                    + ",course_id"
                    + ",course_code"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + " from enrollment_offered_subject_section_blocks"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int eoss_id = rs.getInt(2);
                int course_id = rs.getInt(3);
                String course_code = rs.getString(4);
                String created_at = rs.getString(5);
                String updated_at = rs.getString(6);
                int created_by = rs.getInt(7);
                int updated_by = rs.getInt(8);
                int status = rs.getInt(9);

                to_enrollment_offered_subject_section_blocks to = new to_enrollment_offered_subject_section_blocks(id, eoss_id, course_id, course_code, created_at, updated_at, created_by, updated_by, status);
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

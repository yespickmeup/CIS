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
public class Subject_prerequisites {

    public static class to_subject_prerequisites {

        public final int id;
        public final int subject_id;
        public final String subject_code;
        public final String description;
        public final double lecture_units;
        public final double lab_units;
        public String remarks;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_subject_prerequisites(int id, int subject_id, String subject_code, String description, double lecture_units, double lab_units, String remarks, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.subject_id = subject_id;
            this.subject_code = subject_code;
            this.description = description;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.remarks = remarks;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

    }

    public static void add_data(to_subject_prerequisites to_subject_prerequisites) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into subject_prerequisites("
                    + "subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",remarks"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":subject_id"
                    + ",:subject_code"
                    + ",:description"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:remarks"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("subject_id", to_subject_prerequisites.subject_id)
                    .setString("subject_code", to_subject_prerequisites.subject_code)
                    .setString("description", to_subject_prerequisites.description)
                    .setNumber("lecture_units", to_subject_prerequisites.lecture_units)
                    .setNumber("lab_units", to_subject_prerequisites.lab_units)
                    .setString("remarks", to_subject_prerequisites.remarks)
                    .setString("created_at", to_subject_prerequisites.created_at)
                    .setString("updated_at", to_subject_prerequisites.updated_at)
                    .setString("created_by", to_subject_prerequisites.created_by)
                    .setString("updated_by", to_subject_prerequisites.updated_by)
                    .setNumber("status", to_subject_prerequisites.status)
                    .setNumber("is_uploaded", to_subject_prerequisites.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_prerequisites.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_subject_prerequisites to_subject_prerequisites) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update subject_prerequisites set "
                    + "subject_id= :subject_id "
                    + ",subject_code= :subject_code "
                    + ",description= :description "
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
                    + ",remarks= :remarks "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_subject_prerequisites.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("subject_id", to_subject_prerequisites.subject_id)
                    .setString("subject_code", to_subject_prerequisites.subject_code)
                    .setString("description", to_subject_prerequisites.description)
                    .setNumber("lecture_units", to_subject_prerequisites.lecture_units)
                    .setNumber("lab_units", to_subject_prerequisites.lab_units)
                    .setString("remarks", to_subject_prerequisites.remarks)
                    .setString("created_at", to_subject_prerequisites.created_at)
                    .setString("updated_at", to_subject_prerequisites.updated_at)
                    .setString("created_by", to_subject_prerequisites.created_by)
                    .setString("updated_by", to_subject_prerequisites.updated_by)
                    .setNumber("status", to_subject_prerequisites.status)
                    .setNumber("is_uploaded", to_subject_prerequisites.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_prerequisites.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_subject_prerequisites to_subject_prerequisites) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from subject_prerequisites  "
                    + " where id='" + to_subject_prerequisites.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Subject_prerequisites.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_subject_prerequisites> ret_data(String where) {
        List<to_subject_prerequisites> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",remarks"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from subject_prerequisites"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int subject_id = rs.getInt(2);
                String subject_code = rs.getString(3);
                String description = rs.getString(4);
                double lecture_units = rs.getDouble(5);
                double lab_units = rs.getDouble(6);
                String remarks = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                String created_by = rs.getString(10);
                String updated_by = rs.getString(11);
                int status = rs.getInt(12);
                int is_uploaded = rs.getInt(13);

                to_subject_prerequisites to = new to_subject_prerequisites(id, subject_id, subject_code, description, lecture_units, lab_units, remarks, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

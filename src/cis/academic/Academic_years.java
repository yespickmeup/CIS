/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

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
public class Academic_years {

    public static class to_academic_years {

        public final int id;
        public final String years;
        public final String date_from;
        public final String date_to;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_academic_years(int id, String years, String date_from, String date_to, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.years = years;
            this.date_from = date_from;
            this.date_to = date_to;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_academic_years to_academic_years) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_years("
                    + "years"
                    + ",date_from"
                    + ",date_to"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":years"
                    + ",:date_from"
                    + ",:date_to"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("years", to_academic_years.years)
                    .setString("date_from", to_academic_years.date_from)
                    .setString("date_to", to_academic_years.date_to)
                    .setString("created_at", to_academic_years.created_at)
                    .setString("updated_at", to_academic_years.updated_at)
                    .setString("created_by", to_academic_years.created_by)
                    .setString("updated_by", to_academic_years.updated_by)
                    .setNumber("status", to_academic_years.status)
                    .setNumber("is_uploaded", to_academic_years.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_years.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_years to_academic_years) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_years set "
                    + "years= :years "
                    + ",date_from= :date_from "
                    + ",date_to= :date_to "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_academic_years.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("years", to_academic_years.years)
                    .setString("date_from", to_academic_years.date_from)
                    .setString("date_to", to_academic_years.date_to)
                    .setString("created_at", to_academic_years.created_at)
                    .setString("updated_at", to_academic_years.updated_at)
                    .setString("created_by", to_academic_years.created_by)
                    .setString("updated_by", to_academic_years.updated_by)
                    .setNumber("status", to_academic_years.status)
                    .setNumber("is_uploaded", to_academic_years.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_years.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void set_active_year(int id) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s0 = "update academic_years set "
                    + " status= 1 "
                    + " where id='" + id + "' "
                    + " ";
            stmt.addBatch(s0);

            String s2 = "update academic_years set "
                    + " status= 0 "
                    + " where id<>'" + id + "' "
                    + " ";
            stmt.addBatch(s2);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Academic_years.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_years to_academic_years) {
        try {
            Connection conn = MyConnection.connect();
            PreparedStatement stmt = conn.prepareStatement("");
            conn.setAutoCommit(false);
            String s0 = "delete from academic_years  "
                    + " where id='" + to_academic_years.id + "' "
                    + " ";
            String s2 = "delete from academic_year_periods  "
                    + " where academic_year_id='" + to_academic_years.id + "' "
                    + " ";
            String s3 = "delete from academic_year_period_schedules  "
                    + " where academic_year_id='" + to_academic_years.id + "' "
                    + " ";
            stmt.addBatch(s0);
            stmt.addBatch(s2);
            stmt.addBatch(s3);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Academic_years.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_years> ret_data(String where) {
        List<to_academic_years> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",years"
                    + ",date_from"
                    + ",date_to"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from academic_years"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String years = rs.getString(2);
                String date_from = rs.getString(3);
                String date_to = rs.getString(4);
                String created_at = rs.getString(5);
                String updated_at = rs.getString(6);
                String created_by = rs.getString(7);
                String updated_by = rs.getString(8);
                int status = rs.getInt(9);
                int is_uploaded = rs.getInt(10);

                to_academic_years to = new to_academic_years(id, years, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

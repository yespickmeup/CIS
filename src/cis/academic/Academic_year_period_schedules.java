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
public class Academic_year_period_schedules {

    public static class to_academic_year_period_schedules {

        public final int id;
        public final int academic_year_period_id;
        public final int academic_year_id;
        public final int department_id;
        public final String department;
        public final String years;
        public final String period;
        public final String date_from;
        public final String date_to;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final String enrollment_starts;
        public final String enrollment_ends;

        public to_academic_year_period_schedules(int id, int academic_year_period_id, int academic_year_id, int department_id, String department, String years, String period, String date_from, String date_to, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, String enrollment_starts, String enrollment_ends) {
            this.id = id;
            this.academic_year_period_id = academic_year_period_id;
            this.academic_year_id = academic_year_id;
            this.department_id = department_id;
            this.department = department;
            this.years = years;
            this.period = period;
            this.date_from = date_from;
            this.date_to = date_to;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.enrollment_starts = enrollment_starts;
            this.enrollment_ends = enrollment_ends;
        }
    }

    public static void add_data(to_academic_year_period_schedules to_academic_year_period_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_year_period_schedules("
                    + "academic_year_period_id"
                    + ",academic_year_id"
                    + ",department_id"
                    + ",department"
                    + ",years"
                    + ",period"
                    + ",date_from"
                    + ",date_to"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":academic_year_period_id"
                    + ",:academic_year_id"
                    + ",:department_id"
                    + ",:department"
                    + ",:years"
                    + ",:period"
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
                    .setNumber("academic_year_period_id", to_academic_year_period_schedules.academic_year_period_id)
                    .setNumber("academic_year_id", to_academic_year_period_schedules.academic_year_id)
                    .setNumber("department_id", to_academic_year_period_schedules.department_id)
                    .setString("department", to_academic_year_period_schedules.department)
                    .setString("years", to_academic_year_period_schedules.years)
                    .setString("period", to_academic_year_period_schedules.period)
                    .setString("date_from", to_academic_year_period_schedules.date_from)
                    .setString("date_to", to_academic_year_period_schedules.date_to)
                    .setString("created_at", to_academic_year_period_schedules.created_at)
                    .setString("updated_at", to_academic_year_period_schedules.updated_at)
                    .setString("created_by", to_academic_year_period_schedules.created_by)
                    .setString("updated_by", to_academic_year_period_schedules.updated_by)
                    .setNumber("status", to_academic_year_period_schedules.status)
                    .setNumber("is_uploaded", to_academic_year_period_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_period_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_year_period_schedules to_academic_year_period_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_period_schedules set "
                    + "academic_year_period_id= :academic_year_period_id "
                    + ",academic_year_id= :academic_year_id "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",years= :years "
                    + ",period= :period "
                    + ",date_from= :date_from "
                    + ",date_to= :date_to "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_academic_year_period_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_period_id", to_academic_year_period_schedules.academic_year_period_id)
                    .setNumber("academic_year_id", to_academic_year_period_schedules.academic_year_id)
                    .setNumber("department_id", to_academic_year_period_schedules.department_id)
                    .setString("department", to_academic_year_period_schedules.department)
                    .setString("years", to_academic_year_period_schedules.years)
                    .setString("period", to_academic_year_period_schedules.period)
                    .setString("date_from", to_academic_year_period_schedules.date_from)
                    .setString("date_to", to_academic_year_period_schedules.date_to)
                    .setString("created_at", to_academic_year_period_schedules.created_at)
                    .setString("updated_at", to_academic_year_period_schedules.updated_at)
                    .setString("created_by", to_academic_year_period_schedules.created_by)
                    .setString("updated_by", to_academic_year_period_schedules.updated_by)
                    .setNumber("status", to_academic_year_period_schedules.status)
                    .setNumber("is_uploaded", to_academic_year_period_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_period_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_date(int id, String from, String to) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_period_schedules set "
                    + " date_from= :date_from "
                    + ",date_to= :date_to "
                    + " where id='" + id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date_from", from)
                    .setString("date_to", to)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_period_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_status(int id, int status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_period_schedules set "
                    + " status= :status "
                    + " where id='" + id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("status", status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_period_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_year_period_schedules to_academic_year_period_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_year_period_schedules  "
                    + " where id='" + to_academic_year_period_schedules.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_period_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_year_period_schedules> ret_data(String where) {
        List<to_academic_year_period_schedules> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_year_period_id"
                    + ",academic_year_id"
                    + ",department_id"
                    + ",department"
                    + ",years"
                    + ",period"
                    + ",date_from"
                    + ",date_to"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",enrollment_starts"
                    + ",enrollment_ends"
                    + " from academic_year_period_schedules"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_period_id = rs.getInt(2);
                int academic_year_id = rs.getInt(3);
                int department_id = rs.getInt(4);
                String department = rs.getString(5);
                String years = rs.getString(6);
                String period = rs.getString(7);
                String date_from = rs.getString(8);
                String date_to = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                String created_by = rs.getString(12);
                String updated_by = rs.getString(13);
                int status = rs.getInt(14);
                int is_uploaded = rs.getInt(15);
                String enrollment_starts=rs.getString(16);
                String enrollment_ends=rs.getString(17);
                
                to_academic_year_period_schedules to = new to_academic_year_period_schedules(id, academic_year_period_id, academic_year_id, department_id, department, years, period, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded,enrollment_starts,enrollment_ends);
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

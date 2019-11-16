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
public class Academic_year_periods {

    public static class to_academic_year_periods {

        public final int id;
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

        public to_academic_year_periods(int id, int academic_year_id, int department_id, String department, String years, String period, String date_from, String date_to, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
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
        }
    }

    public static void add_data(to_academic_year_periods to_academic_year_periods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_year_periods("
                    + "academic_year_id"
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
                    + ":academic_year_id"
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
                    .setNumber("academic_year_id", to_academic_year_periods.academic_year_id)
                    .setNumber("department_id", to_academic_year_periods.department_id)
                    .setString("department", to_academic_year_periods.department)
                    .setString("years", to_academic_year_periods.years)
                    .setString("period", to_academic_year_periods.period)
                    .setString("date_from", to_academic_year_periods.date_from)
                    .setString("date_to", to_academic_year_periods.date_to)
                    .setString("created_at", to_academic_year_periods.created_at)
                    .setString("updated_at", to_academic_year_periods.updated_at)
                    .setString("created_by", to_academic_year_periods.created_by)
                    .setString("updated_by", to_academic_year_periods.updated_by)
                    .setNumber("status", to_academic_year_periods.status)
                    .setNumber("is_uploaded", to_academic_year_periods.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_periods.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_year_periods to_academic_year_periods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_periods set "
                    + "academic_year_id= :academic_year_id "
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
                    + " where id='" + to_academic_year_periods.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("academic_year_id", to_academic_year_periods.academic_year_id)
                    .setNumber("department_id", to_academic_year_periods.department_id)
                    .setString("department", to_academic_year_periods.department)
                    .setString("years", to_academic_year_periods.years)
                    .setString("period", to_academic_year_periods.period)
                    .setString("date_from", to_academic_year_periods.date_from)
                    .setString("date_to", to_academic_year_periods.date_to)
                    .setString("created_at", to_academic_year_periods.created_at)
                    .setString("updated_at", to_academic_year_periods.updated_at)
                    .setString("created_by", to_academic_year_periods.created_by)
                    .setString("updated_by", to_academic_year_periods.updated_by)
                    .setNumber("status", to_academic_year_periods.status)
                    .setNumber("is_uploaded", to_academic_year_periods.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_periods.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data2(to_academic_year_periods to_academic_year_periods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_year_periods set "
                    + " period= :period "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",is_uploaded= 2 "
                    + " where id='" + to_academic_year_periods.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("period", to_academic_year_periods.period)
                    .setString("updated_at", to_academic_year_periods.updated_at)
                    .setString("updated_by", to_academic_year_periods.updated_by)
                    .setNumber("is_uploaded", to_academic_year_periods.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_periods.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_year_periods to_academic_year_periods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_year_periods  "
                    + " where id='" + to_academic_year_periods.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_year_periods.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_year_periods> ret_data(String where) {
        List<to_academic_year_periods> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + " from academic_year_periods"
                    + " " + where;
//            System.out.println(where);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                int department_id = rs.getInt(3);
                String department = rs.getString(4);
                String years = rs.getString(5);
                String period = rs.getString(6);
                String date_from = rs.getString(7);
                String date_to = rs.getString(8);
                String created_at = rs.getString(9);
                String updated_at = rs.getString(10);
                String created_by = rs.getString(11);
                String updated_by = rs.getString(12);
                int status = rs.getInt(13);
                int is_uploaded = rs.getInt(14);

                to_academic_year_periods to = new to_academic_year_periods(id, academic_year_id, department_id, department, years, period, date_from, date_to, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.academic.Academic_year_fees;
import cis.academic.Academic_year_fees.to_academic_year_fees;
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
public class Miscellaneous_fees {

    public static class to_miscellaneous_fees {

        public final int id;
        public final String fee;
        public final double amount;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_miscellaneous_fees(int id, String fee, double amount, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.fee = fee;
            this.amount = amount;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_miscellaneous_fees to_miscellaneous_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into miscellaneous_fees("
                    + "fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":fee"
                    + ",:amount"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fee", to_miscellaneous_fees.fee)
                    .setNumber("amount", to_miscellaneous_fees.amount)
                    .setString("created_at", to_miscellaneous_fees.created_at)
                    .setString("updated_at", to_miscellaneous_fees.updated_at)
                    .setString("created_by", to_miscellaneous_fees.created_by)
                    .setString("updated_by", to_miscellaneous_fees.updated_by)
                    .setNumber("status", to_miscellaneous_fees.status)
                    .setNumber("is_uploaded", to_miscellaneous_fees.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Miscellaneous_fees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_miscellaneous_fees to_miscellaneous_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update miscellaneous_fees set "
                    + "fee= :fee "
                    + ",amount= :amount "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_miscellaneous_fees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fee", to_miscellaneous_fees.fee)
                    .setNumber("amount", to_miscellaneous_fees.amount)
                    .setString("created_at", to_miscellaneous_fees.created_at)
                    .setString("updated_at", to_miscellaneous_fees.updated_at)
                    .setString("created_by", to_miscellaneous_fees.created_by)
                    .setString("updated_by", to_miscellaneous_fees.updated_by)
                    .setNumber("status", to_miscellaneous_fees.status)
                    .setNumber("is_uploaded", to_miscellaneous_fees.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Miscellaneous_fees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_miscellaneous_fees to_miscellaneous_fees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from miscellaneous_fees  "
                    + " where id='" + to_miscellaneous_fees.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Miscellaneous_fees.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_miscellaneous_fees> ret_data(String where) {
        List<to_miscellaneous_fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from miscellaneous_fees"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fee = rs.getString(2);
                double amount = rs.getDouble(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                to_miscellaneous_fees to = new to_miscellaneous_fees(id, fee, amount, created_at, updated_at, created_by, updated_by, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Academic_year_fees.to_academic_year_fees> ret_data2(String where) {
        List<Academic_year_fees.to_academic_year_fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from miscellaneous_fees"
                    + " order by fee asc ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fee = rs.getString(2);
                double amount = rs.getDouble(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                int id2 = 0;
                int academic_year_id = 0;
                String academic_year = "";
                int department_id = 0;
                String department = "";
                int level_id = 0;
                String level = "";
                int course_id = 0;
                String course = "";
                String period = "";
                int group_id = 0;
                String group_name = "";
                int fee_id = id;
                int is_per_unit=0;
                double per_unit=0;
                double lab_unit_amount=0;
                String s2 = "select "
                        + "id"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",department_id"
                        + ",department"
                        + ",level_id"
                        + ",level"
                        + ",course_id"
                        + ",course"
                        + ",period"
                        + ",group_id"
                        + ",group_name"
                        + ",fee_id"
                        + ",fee"
                        + ",amount"
                        + ",is_per_unit"
                        + ",per_unit"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ",lab_unit_amount"
                        + " from academic_year_fees"
                        + " " + where + " and fee_id='" + id + "' ";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id2 = rs2.getInt(1);
                    academic_year_id = rs2.getInt(2);
                    academic_year = rs2.getString(3);
                    department_id = rs2.getInt(4);
                    department = rs2.getString(5);
                    level_id = rs2.getInt(6);
                    level = rs2.getString(7);
                    course_id = rs2.getInt(8);
                    course = rs2.getString(9);
                    period = rs2.getString(10);
                    group_id = rs2.getInt(11);
                    group_name = rs2.getString(12);
                    fee_id = rs2.getInt(13);
                    amount = rs2.getDouble(15);
                    is_per_unit=rs2.getInt(16);
                    per_unit=rs2.getDouble(17);
                    lab_unit_amount=rs2.getDouble(24);
                }
                to_academic_year_fees to = new to_academic_year_fees(id2, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course
                        , period, group_id, group_name, fee_id, fee, amount,is_per_unit,per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded,lab_unit_amount);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Academic_year_fees.to_academic_year_fees> ret_data3(String where) {
        List<Academic_year_fees.to_academic_year_fees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fee"
                    + ",amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from other_school_fees"
                    + " order by fee asc ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fee = rs.getString(2);
                double amount = rs.getDouble(3);
                String created_at = rs.getString(4);
                String updated_at = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                int status = rs.getInt(8);
                int is_uploaded = rs.getInt(9);

                int id2 = 0;
                int academic_year_id = 0;
                String academic_year = "";
                int department_id = 0;
                String department = "";
                int level_id = 0;
                String level = "";
                int course_id = 0;
                String course = "";
                String period = "";
                int group_id = 0;
                String group_name = "";
                int fee_id = id;
                int is_per_unit=0;
                double per_unit=0;
                double lab_unit_amount=0;
                String s2 = "select "
                        + "id"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",department_id"
                        + ",department"
                        + ",level_id"
                        + ",level"
                        + ",course_id"
                        + ",course"
                        + ",period"
                        + ",group_id"
                        + ",group_name"
                        + ",fee_id"
                        + ",fee"
                        + ",amount"
                        + ",is_per_unit"
                        + ",per_unit"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + ",lab_unit_amount"
                        + " from academic_year_fees"
                        + " " + where + " and fee_id='" + id + "' ";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id2 = rs2.getInt(1);
                    academic_year_id = rs2.getInt(2);
                    academic_year = rs2.getString(3);
                    department_id = rs2.getInt(4);
                    department = rs2.getString(5);
                    level_id = rs2.getInt(6);
                    level = rs2.getString(7);
                    course_id = rs2.getInt(8);
                    course = rs2.getString(9);
                    period = rs2.getString(10);
                    group_id = rs2.getInt(11);
                    group_name = rs2.getString(12);
                    fee_id = rs2.getInt(13);
                    amount = rs2.getDouble(15);
                    is_per_unit=rs2.getInt(16);
                    per_unit=rs2.getDouble(17);
                    lab_unit_amount=rs2.getDouble(24);
                }
                to_academic_year_fees to = new to_academic_year_fees(id2, academic_year_id, academic_year, department_id, department, level_id, level, course_id, course
                        , period, group_id, group_name, fee_id, fee, amount,is_per_unit,per_unit, created_at, updated_at, created_by, updated_by, status, is_uploaded,lab_unit_amount);
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

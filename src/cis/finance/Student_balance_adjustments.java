/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

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
public class Student_balance_adjustments {

    public static class to_student_balance_adjustments {

        public final int id;
        public final int student_id;
        public final String student_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final int is_transferee;
        public final String academic_year;
        public final int academic_year_id;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final String year_level;
        public final String term;
        public final int department_id;
        public final String department;
        public final int college_id;
        public final String college;
        public final double adjustment_amount;
        public final double paid;
        public final String remarks;
        public final int status;
        public final String created_at;
        public final int created_by;
        public final String updated_at;
        public final int updated_by;

        public to_student_balance_adjustments(int id, int student_id, String student_no, String fname, String mi, String lname, int is_transferee, String academic_year, int academic_year_id, int course_id, String course_code, String course_description, String year_level, String term, int department_id, String department, int college_id, String college, double adjustment_amount, double paid, String remarks, int status, String created_at, int created_by, String updated_at, int updated_by) {
            this.id = id;
            this.student_id = student_id;
            this.student_no = student_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.is_transferee = is_transferee;
            this.academic_year = academic_year;
            this.academic_year_id = academic_year_id;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.year_level = year_level;
            this.term = term;
            this.department_id = department_id;
            this.department = department;
            this.college_id = college_id;
            this.college = college;
            this.adjustment_amount = adjustment_amount;
            this.paid = paid;
            this.remarks = remarks;
            this.status = status;
            this.created_at = created_at;
            this.created_by = created_by;
            this.updated_at = updated_at;
            this.updated_by = updated_by;
        }
    }

    public static void add_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into student_balance_adjustments("
                    + "student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",is_transferee"
                    + ",academic_year"
                    + ",academic_year_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",year_level"
                    + ",term"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",adjustment_amount"
                    + ",paid"
                    + ",remarks"
                    + ",status"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ")values("
                    + ":student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:is_transferee"
                    + ",:academic_year"
                    + ",:academic_year_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:year_level"
                    + ",:term"
                    + ",:department_id"
                    + ",:department"
                    + ",:college_id"
                    + ",:college"
                    + ",:adjustment_amount"
                    + ",:paid"
                    + ",:remarks"
                    + ",:status"
                    + ",:created_at"
                    + ",:created_by"
                    + ",:updated_at"
                    + ",:updated_by"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("student_id", to_student_balance_adjustments.student_id)
                    .setString("student_no", to_student_balance_adjustments.student_no)
                    .setString("fname", to_student_balance_adjustments.fname)
                    .setString("mi", to_student_balance_adjustments.mi)
                    .setString("lname", to_student_balance_adjustments.lname)
                    .setNumber("is_transferee", to_student_balance_adjustments.is_transferee)
                    .setString("academic_year", to_student_balance_adjustments.academic_year)
                    .setNumber("academic_year_id", to_student_balance_adjustments.academic_year_id)
                    .setNumber("course_id", to_student_balance_adjustments.course_id)
                    .setString("course_code", to_student_balance_adjustments.course_code)
                    .setString("course_description", to_student_balance_adjustments.course_description)
                    .setString("year_level", to_student_balance_adjustments.year_level)
                    .setString("term", to_student_balance_adjustments.term)
                    .setNumber("department_id", to_student_balance_adjustments.department_id)
                    .setString("department", to_student_balance_adjustments.department)
                    .setNumber("college_id", to_student_balance_adjustments.college_id)
                    .setString("college", to_student_balance_adjustments.college)
                    .setNumber("adjustment_amount", to_student_balance_adjustments.adjustment_amount)
                    .setNumber("paid", to_student_balance_adjustments.paid)
                    .setString("remarks", to_student_balance_adjustments.remarks)
                    .setNumber("status", to_student_balance_adjustments.status)
                    .setString("created_at", to_student_balance_adjustments.created_at)
                    .setNumber("created_by", to_student_balance_adjustments.created_by)
                    .setString("updated_at", to_student_balance_adjustments.updated_at)
                    .setNumber("updated_by", to_student_balance_adjustments.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);
            //search/update student balance
            String s10 = "select "
                    + "id"
                    + ",balance"
                    + " from students"
                    + " where id='" + to_student_balance_adjustments.student_id + "' ";

            Statement stmt10 = conn.createStatement();
            ResultSet rs10 = stmt10.executeQuery(s10);
            double balance = 0;
            if (rs10.next()) {
                int id = rs10.getInt(1);
                balance = rs10.getDouble(2);
            }
            double new_balance = balance + to_student_balance_adjustments.adjustment_amount;
            String s11 = " update students set balance='" + new_balance + "' where id='" + to_student_balance_adjustments.student_id + "' ";
            stmt.addBatch(s11);
            // end student exe

            stmt.executeBatch();
            conn.commit();
            Lg.s(Student_balance_adjustments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update student_balance_adjustments set "
                    + "student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",is_transferee= :is_transferee "
                    + ",academic_year= :academic_year "
                    + ",academic_year_id= :academic_year_id "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",year_level= :year_level "
                    + ",term= :term "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",adjustment_amount= :adjustment_amount "
                    + ",paid= :paid "
                    + ",remarks= :remarks "
                    + ",status= :status "
                    + ",created_at= :created_at "
                    + ",created_by= :created_by "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + " where id='" + to_student_balance_adjustments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("student_id", to_student_balance_adjustments.student_id)
                    .setString("student_no", to_student_balance_adjustments.student_no)
                    .setString("fname", to_student_balance_adjustments.fname)
                    .setString("mi", to_student_balance_adjustments.mi)
                    .setString("lname", to_student_balance_adjustments.lname)
                    .setNumber("is_transferee", to_student_balance_adjustments.is_transferee)
                    .setString("academic_year", to_student_balance_adjustments.academic_year)
                    .setNumber("academic_year_id", to_student_balance_adjustments.academic_year_id)
                    .setNumber("course_id", to_student_balance_adjustments.course_id)
                    .setString("course_code", to_student_balance_adjustments.course_code)
                    .setString("course_description", to_student_balance_adjustments.course_description)
                    .setString("year_level", to_student_balance_adjustments.year_level)
                    .setString("term", to_student_balance_adjustments.term)
                    .setNumber("department_id", to_student_balance_adjustments.department_id)
                    .setString("department", to_student_balance_adjustments.department)
                    .setNumber("college_id", to_student_balance_adjustments.college_id)
                    .setString("college", to_student_balance_adjustments.college)
                    .setNumber("adjustment_amount", to_student_balance_adjustments.adjustment_amount)
                    .setNumber("paid", to_student_balance_adjustments.paid)
                    .setString("remarks", to_student_balance_adjustments.remarks)
                    .setNumber("status", to_student_balance_adjustments.status)
                    .setString("created_at", to_student_balance_adjustments.created_at)
                    .setNumber("created_by", to_student_balance_adjustments.created_by)
                    .setString("updated_at", to_student_balance_adjustments.updated_at)
                    .setNumber("updated_by", to_student_balance_adjustments.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s0);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Student_balance_adjustments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_student_balance_adjustments to_student_balance_adjustments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from student_balance_adjustments  "
                    + " where id='" + to_student_balance_adjustments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Student_balance_adjustments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_student_balance_adjustments> ret_data(String where) {
        List<to_student_balance_adjustments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",is_transferee"
                    + ",academic_year"
                    + ",academic_year_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",year_level"
                    + ",term"
                    + ",department_id"
                    + ",department"
                    + ",college_id"
                    + ",college"
                    + ",adjustment_amount"
                    + ",paid"
                    + ",remarks"
                    + ",status"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + " from student_balance_adjustments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int student_id = rs.getInt(2);
                String student_no = rs.getString(3);
                String fname = rs.getString(4);
                String mi = rs.getString(5);
                String lname = rs.getString(6);
                int is_transferee = rs.getInt(7);
                String academic_year = rs.getString(8);
                int academic_year_id = rs.getInt(9);
                int course_id = rs.getInt(10);
                String course_code = rs.getString(11);
                String course_description = rs.getString(12);
                String year_level = rs.getString(13);
                String term = rs.getString(14);
                int department_id = rs.getInt(15);
                String department = rs.getString(16);
                int college_id = rs.getInt(17);
                String college = rs.getString(18);
                double adjustment_amount = rs.getDouble(19);
                double paid = rs.getDouble(20);
                String remarks = rs.getString(21);
                int status = rs.getInt(22);
                String created_at = rs.getString(23);
                int created_by = rs.getInt(24);
                String updated_at = rs.getString(25);
                int updated_by = rs.getInt(26);

                to_student_balance_adjustments to = new to_student_balance_adjustments(id, student_id, student_no, fname, mi, lname, is_transferee, academic_year, academic_year_id, course_id, course_code, course_description, year_level, term, department_id, department, college_id, college, adjustment_amount, paid, remarks, status, created_at, created_by, updated_at, updated_by);
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

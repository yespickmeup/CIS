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
public class Enrollment_student_loaded_subject_grades {

    public static class to_enrollment_student_loaded_subject_grades {

        public final int id;
        public final int enrollment_student_loaded_subject_id;
        public final double first;
        public final double second;
        public final double third;
        public final double fourth;
        public final double fifth;
        public final double sixth;
        public final String remarks;
        public final String created_at;
        public final String created_by;
        public final String updated_at;
        public final String updated_by;
        public final int status;

        public to_enrollment_student_loaded_subject_grades(int id, int enrollment_student_loaded_subject_id, double first, double second, double third, double fourth, double fifth, double sixth, String remarks, String created_at, String created_by, String updated_at, String updated_by, int status) {
            this.id = id;
            this.enrollment_student_loaded_subject_id = enrollment_student_loaded_subject_id;
            this.first = first;
            this.second = second;
            this.third = third;
            this.fourth = fourth;
            this.fifth = fifth;
            this.sixth = sixth;
            this.remarks = remarks;
            this.created_at = created_at;
            this.created_by = created_by;
            this.updated_at = updated_at;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_enrollment_student_loaded_subject_grades to_enrollment_student_loaded_subject_grades) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s2 = "update enrollment_student_loaded_subjects set "
                    + " final_grade= :final_grade "
                    + ",final_grade_remarks= :final_grade_remarks "
                    + ",final_grade_created_at= :final_grade_created_at "
                    + ",final_grade_created_by= :final_grade_created_by "
                    + ",retake= :retake "
                    + " where id='" + to_enrollment_student_loaded_subject_grades.enrollment_student_loaded_subject_id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("final_grade", to_enrollment_student_loaded_subject_grades.sixth)
                    .setString("final_grade_remarks", to_enrollment_student_loaded_subject_grades.remarks)
                    .setString("final_grade_created_at", to_enrollment_student_loaded_subject_grades.created_at)
                    .setString("final_grade_created_by", to_enrollment_student_loaded_subject_grades.created_by)
                    .setNumber("retake", to_enrollment_student_loaded_subject_grades.fifth)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement("");
            stmt.addBatch(s2);
            String s0 = "insert into enrollment_student_loaded_subject_grades("
                    + " enrollment_student_loaded_subject_id"
                    + ",first"
                    + ",second"
                    + ",third"
                    + ",fourth"
                    + ",fifth"
                    + ",sixth"
                    + ",remarks"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":enrollment_student_loaded_subject_id"
                    + ",:first"
                    + ",:second"
                    + ",:third"
                    + ",:fourth"
                    + ",:fifth"
                    + ",:sixth"
                    + ",:remarks"
                    + ",:created_at"
                    + ",:created_by"
                    + ",:updated_at"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_student_loaded_subject_id", to_enrollment_student_loaded_subject_grades.enrollment_student_loaded_subject_id)
                    .setNumber("first", to_enrollment_student_loaded_subject_grades.first)
                    .setNumber("second", to_enrollment_student_loaded_subject_grades.second)
                    .setNumber("third", to_enrollment_student_loaded_subject_grades.third)
                    .setNumber("fourth", to_enrollment_student_loaded_subject_grades.fourth)
                    .setNumber("fifth", to_enrollment_student_loaded_subject_grades.fifth)
                    .setNumber("sixth", to_enrollment_student_loaded_subject_grades.sixth)
                    .setString("remarks", to_enrollment_student_loaded_subject_grades.remarks)
                    .setString("created_at", to_enrollment_student_loaded_subject_grades.created_at)
                    .setString("created_by", to_enrollment_student_loaded_subject_grades.created_by)
                    .setString("updated_at", to_enrollment_student_loaded_subject_grades.updated_at)
                    .setString("updated_by", to_enrollment_student_loaded_subject_grades.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subject_grades.status)
                    .ok();
            stmt.addBatch(s0);
            stmt.executeBatch();
            conn.commit();
            Lg.s(Enrollment_student_loaded_subject_grades.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_student_loaded_subject_grades to_enrollment_student_loaded_subject_grades) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_student_loaded_subject_grades set "
                    + "enrollment_student_loaded_subject_id= :enrollment_student_loaded_subject_id "
                    + ",first= :first "
                    + ",second= :second "
                    + ",third= :third "
                    + ",fourth= :fourth "
                    + ",fifth= :fifth "
                    + ",sixth= :sixth "
                    + ",remarks= :remarks "
                    + ",created_at= :created_at "
                    + ",created_by= :created_by "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_enrollment_student_loaded_subject_grades.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_student_loaded_subject_id", to_enrollment_student_loaded_subject_grades.enrollment_student_loaded_subject_id)
                    .setNumber("first", to_enrollment_student_loaded_subject_grades.first)
                    .setNumber("second", to_enrollment_student_loaded_subject_grades.second)
                    .setNumber("third", to_enrollment_student_loaded_subject_grades.third)
                    .setNumber("fourth", to_enrollment_student_loaded_subject_grades.fourth)
                    .setNumber("fifth", to_enrollment_student_loaded_subject_grades.fifth)
                    .setNumber("sixth", to_enrollment_student_loaded_subject_grades.sixth)
                    .setString("remarks", to_enrollment_student_loaded_subject_grades.remarks)
                    .setString("created_at", to_enrollment_student_loaded_subject_grades.created_at)
                    .setString("created_by", to_enrollment_student_loaded_subject_grades.created_by)
                    .setString("updated_at", to_enrollment_student_loaded_subject_grades.updated_at)
                    .setString("updated_by", to_enrollment_student_loaded_subject_grades.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subject_grades.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subject_grades.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_student_loaded_subject_grades to_enrollment_student_loaded_subject_grades) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subject_grades  "
                    + " where id='" + to_enrollment_student_loaded_subject_grades.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subject_grades.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_student_loaded_subject_grades> ret_data(String where) {
        List<to_enrollment_student_loaded_subject_grades> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_student_loaded_subject_id"
                    + ",first"
                    + ",second"
                    + ",third"
                    + ",fourth"
                    + ",fifth"
                    + ",sixth"
                    + ",remarks"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",status"
                    + " from enrollment_student_loaded_subject_grades"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_student_loaded_subject_id = rs.getInt(2);
                double first = rs.getDouble(3);
                double second = rs.getDouble(4);
                double third = rs.getDouble(5);
                double fourth = rs.getDouble(6);
                double fifth = rs.getDouble(7);
                double sixth = rs.getDouble(8);
                String remarks = rs.getString(9);
                String created_at = rs.getString(10);
                String created_by = rs.getString(11);
                String updated_at = rs.getString(12);
                String updated_by = rs.getString(13);
                int status = rs.getInt(14);

                to_enrollment_student_loaded_subject_grades to = new to_enrollment_student_loaded_subject_grades(id, enrollment_student_loaded_subject_id, first, second, third, fourth, fifth, sixth, remarks, created_at, created_by, updated_at, updated_by, status);
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

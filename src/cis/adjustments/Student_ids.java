/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.adjustments;

import cis.students.Students;
import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;

/**
 *
 * @author User
 */
public class Student_ids {

//    public static void main(String[] args) {
//
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");
//
//    }
    public static class students {

        public final String name;
        public final String ids;
        public final String student_nos;
        public final double balances;

        public students(String name, String ids, String student_nos, double balances) {
            this.name = name;
            this.ids = ids;
            this.student_nos = student_nos;
            this.balances = balances;
        }

    }

    public static List<students> ret_data(String where) {
        List<students> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " concat(last_name,space(1),first_name,space(1),middle_name) as name"
                    + ",GROUP_CONCAT(id order by id asc separator ', ') as ids"
                    + ",GROUP_CONCAT(student_no order by student_no asc separator ', ') as student_nos"
                    + ",sum(balance) as balance"
                    + " from students GROUP BY concat(last_name,space(1),first_name,space(1),middle_name) "
                    + " HAVING COUNT(concat(last_name,space(1),first_name,space(1),middle_name)) > 1"
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String ids = rs.getString(2);
                String student_nos = rs.getString(3);
                double balance = rs.getDouble(4);
                students to = new students(name, ids, student_nos, balance);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<students> ret_enrollments(String where) {
        List<students> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " concat(last_name,space(1),first_name,space(1),middle_name) as name"
                    + ",GROUP_CONCAT(student_id order by id asc separator ', ') as ids"
                    + ",GROUP_CONCAT(student_no order by student_no asc separator ', ') as student_nos"
                    + " from enrollments GROUP BY concat(last_name,space(1),first_name,space(1),middle_name),date_of_birth "
                    + " HAVING COUNT(student_no) > 1"
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String ids = rs.getString(2);
                String student_nos = rs.getString(3);
                double balance = 0;
                students to = new students(name, ids, student_nos, balance);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update() {
        List<students> datas = Student_ids.ret_data("");

        for (students to : datas) {

            String[] ids = to.ids.split(", ");
            String[] nos = to.student_nos.split(", ");
            String ids1 = ids[0];
            String ids2 = ids[1];
            String ids3 = "";
            String nos1 = nos[0];
            String nos2 = nos[1];
            String nos3 = "";
            try {
                ids3 = ids[2];
                nos3 = nos[2];
            } catch (Exception e) {
            }
            System.out.println("Name: " + to.name + " = " + nos1);
            System.out.println("ids: " + ids1 + " ," + ids2 + " ," + ids3 + " " + to.balances);

            try {
                Connection conn = MyConnection.connect();
                PreparedStatement stmt = conn.prepareStatement("");
                conn.setAutoCommit(false);

                //enrollments
                String s1 = "update enrollments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s1);
                if (!ids3.isEmpty()) {
                    String s2 = "update enrollments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s2);
                }
                //enrollment assessments
                String s3 = "update enrollment_assessments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s3);
                if (!ids3.isEmpty()) {
                    String s4 = "update enrollment_assessments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s4);
                }

                //enrollment sls payments
                String s5 = "update enrollment_sls_payments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s5);
                if (!ids3.isEmpty()) {
                    String s6 = "update enrollment_sls_payments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s6);
                }

                //enrollment sls payment details
                String s7 = "update enrollment_sls_payment_details set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s7);
                if (!ids3.isEmpty()) {
                    String s8 = "update enrollment_sls_payment_details set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s8);
                }

                //enrollment student loaded subjects
                String s9 = "update enrollment_student_loaded_subjects set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s9);
                if (!ids3.isEmpty()) {
                    String s10 = "update enrollment_student_loaded_subjects set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s10);
                }

                //enrollment student loaded subjects
                String s11 = "update enrollment_student_loaded_subjects_drop_requests set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s11);
                if (!ids3.isEmpty()) {
                    String s12 = "update enrollment_student_loaded_subjects_drop_requests set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s12);
                }
                
                String s12 = "delete from students  where id='" + ids2 + "' ";
                stmt.addBatch(s12);
                if (!ids3.isEmpty()) {
                    String s13 = "delete from students  where id='" + ids3 + "' ";
                    stmt.addBatch(s13);
                }

                stmt.executeBatch();
                conn.commit();

                Lg.s(Students.class, "Successfully updated");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                MyConnection.close();
            }

        }
        System.out.println("size: " + datas.size());
    }

    public static void update2() {
        List<students> datas = Student_ids.ret_enrollments("");

        for (students to : datas) {

            String[] ids = to.ids.split(", ");
            String[] nos = to.student_nos.split(", ");
            String ids1 = ids[0];
            String ids2 = "";
            String ids3 = "";
            String nos1 = nos[0];
            String nos2 ="";
            String nos3 = "";
            try {
                ids2 = ids[1];
                nos2 = nos[1];
                ids3 = ids[2];
                nos3 = nos[2];
            } catch (Exception e) {
            }
            System.out.println("Name: " + to.name + " = " + nos1);
            System.out.println("ids: " + ids1 + " ," + ids2 + " ," + ids3 + " " + to.balances);

            try {
                Connection conn = MyConnection.connect();
                PreparedStatement stmt = conn.prepareStatement("");
                conn.setAutoCommit(false);

                //enrollments
                String s1 = "update enrollments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s1);
                if (!ids3.isEmpty()) {
                    String s2 = "update enrollments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s2);
                }
                //enrollment assessments
                String s3 = "update enrollment_assessments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s3);
                if (!ids3.isEmpty()) {
                    String s4 = "update enrollment_assessments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s4);
                }

                //enrollment sls payments
                String s5 = "update enrollment_sls_payments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s5);
                if (!ids3.isEmpty()) {
                    String s6 = "update enrollment_sls_payments set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s6);
                }

                //enrollment sls payment details
                String s7 = "update enrollment_sls_payment_details set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s7);
                if (!ids3.isEmpty()) {
                    String s8 = "update enrollment_sls_payment_details set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s8);
                }

                //enrollment student loaded subjects
                String s9 = "update enrollment_student_loaded_subjects set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s9);
                if (!ids3.isEmpty()) {
                    String s10 = "update enrollment_student_loaded_subjects set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s10);
                }

                //enrollment student loaded subjects
                String s11 = "update enrollment_student_loaded_subjects_drop_requests set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids2 + "' ";
                stmt.addBatch(s11);
                if (!ids3.isEmpty()) {
                    String s12 = "update enrollment_student_loaded_subjects_drop_requests set student_id='" + ids1 + "',student_no='" + nos1 + "' where student_id='" + ids3 + "' ";
                    stmt.addBatch(s12);
                }

                String s12 = "delete from students  where id='" + ids2 + "' ";
                stmt.addBatch(s12);
                if (!ids3.isEmpty()) {
                    String s13 = "delete from students  where id='" + ids3 + "' ";
                    stmt.addBatch(s13);
                }

                stmt.executeBatch();
                conn.commit();

                Lg.s(Students.class, "Successfully updated");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                MyConnection.close();
            }

        }
        System.out.println("size: " + datas.size());
    }
}

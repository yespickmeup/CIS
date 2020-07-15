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
public class Enrollment_sls_payment_details {

    public static class to_enrollment_sls_payment_details {

        public final int id;
        public final int enrollment_sls_payment_id;
        public final int enrollment_sls_id;
        public final int trans_type;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int academic_year_id;
        public final String academic_year;
        public final int subject_id;
        public final String subject_code;
        public final String description;
        public final int lecture_units;
        public final int lab_units;
        public final double lec_amount;
        public final double lab_amount;
        public final double fee_amount;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public final int student_id;
        public final String student_no;
        public final String first_name;
        public final String middle_name;
        public final String last_name;

        public to_enrollment_sls_payment_details(int id, int enrollment_sls_payment_id, int enrollment_sls_id, int trans_type, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, int subject_id, String subject_code, String description, int lecture_units, int lab_units, double lec_amount, double lab_amount, double fee_amount, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, int student_id, String student_no, String first_name, String middle_name, String last_name) {
            this.id = id;
            this.enrollment_sls_payment_id = enrollment_sls_payment_id;
            this.enrollment_sls_id = enrollment_sls_id;
            this.trans_type = trans_type;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.subject_id = subject_id;
            this.subject_code = subject_code;
            this.description = description;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.lec_amount = lec_amount;
            this.lab_amount = lab_amount;
            this.fee_amount = fee_amount;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.student_id = student_id;
            this.student_no = student_no;
            this.first_name = first_name;
            this.middle_name = middle_name;
            this.last_name = last_name;
        }
    }

    public static void add_data(to_enrollment_sls_payment_details to_enrollment_sls_payment_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_sls_payment_details("
                    + "enrollment_sls_payment_id"
                    + ",enrollment_sls_id"
                    + ",trans_type"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",lec_amount"
                    + ",lab_amount"
                    + ",fee_amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",student_id"
                    + ",student_no"
                    + ",first_name"
                    + ",middle_name"
                    + ",last_name"
                    + ")values("
                    + ":enrollment_sls_payment_id"
                    + ",:enrollment_sls_id"
                    + ",:trans_type"
                    + ",:enrollment_id"
                    + ",:enrollment_no"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:subject_id"
                    + ",:subject_code"
                    + ",:description"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:lec_amount"
                    + ",:lab_amount"
                    + ",:fee_amount"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:first_name"
                    + ",:middle_name"
                    + ",:last_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_sls_payment_id", to_enrollment_sls_payment_details.enrollment_sls_payment_id)
                    .setNumber("enrollment_sls_id", to_enrollment_sls_payment_details.enrollment_sls_id)
                    .setNumber("trans_type", to_enrollment_sls_payment_details.trans_type)
                    .setNumber("enrollment_id", to_enrollment_sls_payment_details.enrollment_id)
                    .setString("enrollment_no", to_enrollment_sls_payment_details.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_sls_payment_details.academic_year_id)
                    .setString("academic_year", to_enrollment_sls_payment_details.academic_year)
                    .setNumber("subject_id", to_enrollment_sls_payment_details.subject_id)
                    .setString("subject_code", to_enrollment_sls_payment_details.subject_code)
                    .setString("description", to_enrollment_sls_payment_details.description)
                    .setNumber("lecture_units", to_enrollment_sls_payment_details.lecture_units)
                    .setNumber("lab_units", to_enrollment_sls_payment_details.lab_units)
                    .setNumber("lec_amount", to_enrollment_sls_payment_details.lec_amount)
                    .setNumber("lab_amount", to_enrollment_sls_payment_details.lab_amount)
                    .setNumber("fee_amount", to_enrollment_sls_payment_details.fee_amount)
                    .setString("created_at", to_enrollment_sls_payment_details.created_at)
                    .setString("updated_at", to_enrollment_sls_payment_details.updated_at)
                    .setString("created_by", to_enrollment_sls_payment_details.created_by)
                    .setString("updated_by", to_enrollment_sls_payment_details.updated_by)
                    .setNumber("status", to_enrollment_sls_payment_details.status)
                    .setNumber("is_uploaded", to_enrollment_sls_payment_details.is_uploaded)
                    .setNumber("student_id", to_enrollment_sls_payment_details.student_id)
                    .setString("student_no", to_enrollment_sls_payment_details.student_no)
                    .setString("first_name", to_enrollment_sls_payment_details.first_name)
                    .setString("middle_name", to_enrollment_sls_payment_details.middle_name)
                    .setString("last_name", to_enrollment_sls_payment_details.last_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_sls_payment_details.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_sls_payment_details to_enrollment_sls_payment_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_sls_payment_details set "
                    + "enrollment_sls_payment_id= :enrollment_sls_payment_id "
                    + ",enrollment_sls_id= :enrollment_sls_id "
                    + ",trans_type= :trans_type "
                    + ",enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",subject_id= :subject_id "
                    + ",subject_code= :subject_code "
                    + ",description= :description "
                    + ",lecture_units= :lecture_units "
                    + ",lab_units= :lab_units "
                    + ",lec_amount= :lec_amount "
                    + ",lab_amount= :lab_amount "
                    + ",fee_amount= :fee_amount "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + ",student_id= :student_id "
                    + ",student_no= :student_no "
                    + ",first_name= :first_name "
                    + ",middle_name= :middle_name "
                    + ",last_name= :last_name "
                    + " where id='" + to_enrollment_sls_payment_details.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_sls_payment_id", to_enrollment_sls_payment_details.enrollment_sls_payment_id)
                    .setNumber("enrollment_sls_id", to_enrollment_sls_payment_details.enrollment_sls_id)
                    .setNumber("trans_type", to_enrollment_sls_payment_details.trans_type)
                    .setNumber("enrollment_id", to_enrollment_sls_payment_details.enrollment_id)
                    .setString("enrollment_no", to_enrollment_sls_payment_details.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_sls_payment_details.academic_year_id)
                    .setString("academic_year", to_enrollment_sls_payment_details.academic_year)
                    .setNumber("subject_id", to_enrollment_sls_payment_details.subject_id)
                    .setString("subject_code", to_enrollment_sls_payment_details.subject_code)
                    .setString("description", to_enrollment_sls_payment_details.description)
                    .setNumber("lecture_units", to_enrollment_sls_payment_details.lecture_units)
                    .setNumber("lab_units", to_enrollment_sls_payment_details.lab_units)
                    .setNumber("lec_amount", to_enrollment_sls_payment_details.lec_amount)
                    .setNumber("lab_amount", to_enrollment_sls_payment_details.lab_amount)
                    .setNumber("fee_amount", to_enrollment_sls_payment_details.fee_amount)
                    .setString("created_at", to_enrollment_sls_payment_details.created_at)
                    .setString("updated_at", to_enrollment_sls_payment_details.updated_at)
                    .setString("created_by", to_enrollment_sls_payment_details.created_by)
                    .setString("updated_by", to_enrollment_sls_payment_details.updated_by)
                    .setNumber("status", to_enrollment_sls_payment_details.status)
                    .setNumber("is_uploaded", to_enrollment_sls_payment_details.is_uploaded)
                    .setNumber("student_id", to_enrollment_sls_payment_details.student_id)
                    .setString("student_no", to_enrollment_sls_payment_details.student_no)
                    .setString("first_name", to_enrollment_sls_payment_details.first_name)
                    .setString("middle_name", to_enrollment_sls_payment_details.middle_name)
                    .setString("last_name", to_enrollment_sls_payment_details.last_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_sls_payment_details.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_sls_payment_details to_enrollment_sls_payment_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_sls_payment_details  "
                    + " where id='" + to_enrollment_sls_payment_details.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_sls_payment_details.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_sls_payment_details> ret_data(String where) {
        List<to_enrollment_sls_payment_details> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_sls_payment_id"
                    + ",enrollment_sls_id"
                    + ",trans_type"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",lec_amount"
                    + ",lab_amount"
                    + ",fee_amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",student_id"
                    + ",student_no"
                    + ",first_name"
                    + ",middle_name"
                    + ",last_name"
                    + " from enrollment_sls_payment_details"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_sls_payment_id = rs.getInt(2);
                int enrollment_sls_id = rs.getInt(3);
                int trans_type = rs.getInt(4);
                int enrollment_id = rs.getInt(5);
                String enrollment_no = rs.getString(6);
                int academic_year_id = rs.getInt(7);
                String academic_year = rs.getString(8);
                int subject_id = rs.getInt(9);
                String subject_code = rs.getString(10);
                String description = rs.getString(11);
                int lecture_units = rs.getInt(12);
                int lab_units = rs.getInt(13);
                double lec_amount = rs.getDouble(14);
                double lab_amount = rs.getDouble(15);
                double fee_amount = rs.getDouble(16);
                String created_at = rs.getString(17);
                String updated_at = rs.getString(18);
                String created_by = rs.getString(19);
                String updated_by = rs.getString(20);
                int status = rs.getInt(21);
                int is_uploaded = rs.getInt(22);
                int student_id = rs.getInt(23);
                String student_no = rs.getString(24);
                String first_name = rs.getString(25);
                String middle_name = rs.getString(26);
                String last_name = rs.getString(27);

                to_enrollment_sls_payment_details to = new to_enrollment_sls_payment_details(id, enrollment_sls_payment_id, enrollment_sls_id, trans_type, enrollment_id, enrollment_no, academic_year_id, academic_year, subject_id, subject_code, description, lecture_units, lab_units, lec_amount, lab_amount, fee_amount, created_at, updated_at, created_by, updated_by, status, is_uploaded, student_id, student_no, first_name, middle_name, last_name);
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

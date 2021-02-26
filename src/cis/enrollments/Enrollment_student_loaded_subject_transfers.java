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
public class Enrollment_student_loaded_subject_transfers {

    public static class to_enrollment_student_loaded_subject_transfers {

        public final int id;
        public final int from_esls_id;
        public final int to_esls_id;
        public final String created_at;
        public final int created_by;
        public final String updated_at;
        public final int updated_by;
        public final int status;

        public to_enrollment_student_loaded_subject_transfers(int id, int from_esls_id, int to_esls_id, String created_at, int created_by, String updated_at, int updated_by, int status) {
            this.id = id;
            this.from_esls_id = from_esls_id;
            this.to_esls_id = to_esls_id;
            this.created_at = created_at;
            this.created_by = created_by;
            this.updated_at = updated_at;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_enrollment_student_loaded_subject_transfers to_enrollment_student_loaded_subject_transfers, Enrollment_student_loaded_subjects.to_enrollment_student_loaded_subjects to_enrollment_student_loaded_subjects) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into enrollment_student_loaded_subject_transfers("
                    + "from_esls_id"
                    + ",to_esls_id"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":from_esls_id"
                    + ",:to_esls_id"
                    + ",:created_at"
                    + ",:created_by"
                    + ",:updated_at"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("from_esls_id", to_enrollment_student_loaded_subject_transfers.from_esls_id)
                    .setNumber("to_esls_id", to_enrollment_student_loaded_subject_transfers.to_esls_id)
                    .setString("created_at", to_enrollment_student_loaded_subject_transfers.created_at)
                    .setNumber("created_by", to_enrollment_student_loaded_subject_transfers.created_by)
                    .setString("updated_at", to_enrollment_student_loaded_subject_transfers.updated_at)
                    .setNumber("updated_by", to_enrollment_student_loaded_subject_transfers.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subject_transfers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            String s2 = "insert into enrollment_student_loaded_subjects("
                    + "enrollment_id"
                    + ",enrollment_no"
                    + ",student_id"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",enrollment_offered_subject_section_id"
                    + ",enrollment_offered_subject_id"
                    + ",academic_offering_subject_id"
                    + ",academic_offering_id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",year_level"
                    + ",subject_id"
                    + ",subject_code"
                    + ",description"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",faculty_id"
                    + ",faculty_name"
                    + ",section"
                    + ",room_id"
                    + ",room"
                    + ",schedule"
                    + ",day"
                    + ",time"
                    + ",start_time"
                    + ",closing_time"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",is_added"
                    + ")values("
                    + ":enrollment_id"
                    + ",:enrollment_no"
                    + ",:student_id"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:enrollment_offered_subject_section_id"
                    + ",:enrollment_offered_subject_id"
                    + ",:academic_offering_subject_id"
                    + ",:academic_offering_id"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:term"
                    + ",:year_level"
                    + ",:subject_id"
                    + ",:subject_code"
                    + ",:description"
                    + ",:lecture_units"
                    + ",:lab_units"
                    + ",:faculty_id"
                    + ",:faculty_name"
                    + ",:section"
                    + ",:room_id"
                    + ",:room"
                    + ",:schedule"
                    + ",:day"
                    + ",:time"
                    + ",:start_time"
                    + ",:closing_time"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ",:is_added"
                    + ")";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("enrollment_id", to_enrollment_student_loaded_subjects.enrollment_id)
                    .setString("enrollment_no", to_enrollment_student_loaded_subjects.enrollment_no)
                    .setNumber("student_id", to_enrollment_student_loaded_subjects.student_id)
                    .setString("student_no", to_enrollment_student_loaded_subjects.student_no)
                    .setString("fname", to_enrollment_student_loaded_subjects.fname)
                    .setString("mi", to_enrollment_student_loaded_subjects.mi)
                    .setString("lname", to_enrollment_student_loaded_subjects.lname)
                    .setNumber("enrollment_offered_subject_section_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_section_id)
                    .setNumber("enrollment_offered_subject_id", to_enrollment_student_loaded_subjects.enrollment_offered_subject_id)
                    .setNumber("academic_offering_subject_id", to_enrollment_student_loaded_subjects.academic_offering_subject_id)
                    .setNumber("academic_offering_id", to_enrollment_student_loaded_subjects.academic_offering_id)
                    .setNumber("academic_year_id", to_enrollment_student_loaded_subjects.academic_year_id)
                    .setString("academic_year", to_enrollment_student_loaded_subjects.academic_year)
                    .setNumber("level_id", to_enrollment_student_loaded_subjects.level_id)
                    .setString("level", to_enrollment_student_loaded_subjects.level)
                    .setNumber("college_id", to_enrollment_student_loaded_subjects.college_id)
                    .setString("college", to_enrollment_student_loaded_subjects.college)
                    .setNumber("department_id", to_enrollment_student_loaded_subjects.department_id)
                    .setString("department", to_enrollment_student_loaded_subjects.department)
                    .setNumber("course_id", to_enrollment_student_loaded_subjects.course_id)
                    .setString("course_code", to_enrollment_student_loaded_subjects.course_code)
                    .setString("course_description", to_enrollment_student_loaded_subjects.course_description)
                    .setString("term", to_enrollment_student_loaded_subjects.term)
                    .setString("year_level", to_enrollment_student_loaded_subjects.year_level)
                    .setNumber("subject_id", to_enrollment_student_loaded_subjects.subject_id)
                    .setString("subject_code", to_enrollment_student_loaded_subjects.subject_code)
                    .setString("description", to_enrollment_student_loaded_subjects.description)
                    .setNumber("lecture_units", to_enrollment_student_loaded_subjects.lecture_units)
                    .setNumber("lab_units", to_enrollment_student_loaded_subjects.lab_units)
                    .setString("faculty_id", to_enrollment_student_loaded_subjects.faculty_id)
                    .setString("faculty_name", to_enrollment_student_loaded_subjects.faculty_name)
                    .setString("section", to_enrollment_student_loaded_subjects.section)
                    .setNumber("room_id", to_enrollment_student_loaded_subjects.room_id)
                    .setString("room", to_enrollment_student_loaded_subjects.room)
                    .setString("schedule", to_enrollment_student_loaded_subjects.schedule)
                    .setString("day", to_enrollment_student_loaded_subjects.day)
                    .setString("time", to_enrollment_student_loaded_subjects.time)
                    .setString("start_time", to_enrollment_student_loaded_subjects.start_time)
                    .setString("closing_time", to_enrollment_student_loaded_subjects.closing_time)
                    .setString("created_at", to_enrollment_student_loaded_subjects.created_at)
                    .setString("updated_at", to_enrollment_student_loaded_subjects.updated_at)
                    .setString("created_by", to_enrollment_student_loaded_subjects.created_by)
                    .setString("updated_by", to_enrollment_student_loaded_subjects.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subjects.status)
                    .setNumber("is_uploaded", to_enrollment_student_loaded_subjects.is_uploaded)
                    .setNumber("is_added", to_enrollment_student_loaded_subjects.is_added)
                    .ok();
            stmt.addBatch(s2);

            String s3 = "update enrollment_student_loaded_subjects set "
                    + " status= 5 "
                    + " where id='" + to_enrollment_student_loaded_subject_transfers.from_esls_id + "' "
                    + " ";

            stmt.addBatch(s3);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Enrollment_student_loaded_subject_transfers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_student_loaded_subject_transfers to_enrollment_student_loaded_subject_transfers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_student_loaded_subject_transfers set "
                    + "from_esls_id= :from_esls_id "
                    + ",to_esls_id= :to_esls_id "
                    + ",created_at= :created_at "
                    + ",created_by= :created_by "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_enrollment_student_loaded_subject_transfers.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("from_esls_id", to_enrollment_student_loaded_subject_transfers.from_esls_id)
                    .setNumber("to_esls_id", to_enrollment_student_loaded_subject_transfers.to_esls_id)
                    .setString("created_at", to_enrollment_student_loaded_subject_transfers.created_at)
                    .setNumber("created_by", to_enrollment_student_loaded_subject_transfers.created_by)
                    .setString("updated_at", to_enrollment_student_loaded_subject_transfers.updated_at)
                    .setNumber("updated_by", to_enrollment_student_loaded_subject_transfers.updated_by)
                    .setNumber("status", to_enrollment_student_loaded_subject_transfers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subject_transfers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_student_loaded_subject_transfers to_enrollment_student_loaded_subject_transfers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_student_loaded_subject_transfers  "
                    + " where id='" + to_enrollment_student_loaded_subject_transfers.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_student_loaded_subject_transfers.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_student_loaded_subject_transfers> ret_data(String where) {
        List<to_enrollment_student_loaded_subject_transfers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",from_esls_id"
                    + ",to_esls_id"
                    + ",created_at"
                    + ",created_by"
                    + ",updated_at"
                    + ",updated_by"
                    + ",status"
                    + " from enrollment_student_loaded_subject_transfers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int from_esls_id = rs.getInt(2);
                int to_esls_id = rs.getInt(3);
                String created_at = rs.getString(4);
                int created_by = rs.getInt(5);
                String updated_at = rs.getString(6);
                int updated_by = rs.getInt(7);
                int status = rs.getInt(8);

                to_enrollment_student_loaded_subject_transfers to = new to_enrollment_student_loaded_subject_transfers(id, from_esls_id, to_esls_id, created_at, created_by, updated_at, updated_by, status);
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

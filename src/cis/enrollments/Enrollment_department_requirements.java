/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

import cis.departments.Department_requirements;
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
public class Enrollment_department_requirements {

    public static class to_enrollment_department_requirements {

        public final int id;
        public final int enrollment_id;
        public final String enrollment_no;
        public final int academic_year_id;
        public final String academic_year;
        public final int department_id;
        public final String department;
        public final int department_requirement_id;
        public final String requirements;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;
        public boolean selected;

        public to_enrollment_department_requirements(int id, int enrollment_id, String enrollment_no, int academic_year_id, String academic_year, int department_id, String department, int department_requirement_id, String requirements, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded, boolean selected) {
            this.id = id;
            this.enrollment_id = enrollment_id;
            this.enrollment_no = enrollment_no;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.department_id = department_id;
            this.department = department;
            this.department_requirement_id = department_requirement_id;
            this.requirements = requirements;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.selected = selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    public static void add_data(to_enrollment_department_requirements to_enrollment_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into enrollment_department_requirements("
                    + "enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",department_requirement_id"
                    + ",requirements"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":enrollment_id"
                    + ",:enrollment_no"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:department_id"
                    + ",:department"
                    + ",:department_requirement_id"
                    + ",:requirements"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_department_requirements.enrollment_id)
                    .setString("enrollment_no", to_enrollment_department_requirements.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_department_requirements.academic_year_id)
                    .setString("academic_year", to_enrollment_department_requirements.academic_year)
                    .setNumber("department_id", to_enrollment_department_requirements.department_id)
                    .setString("department", to_enrollment_department_requirements.department)
                    .setNumber("department_requirement_id", to_enrollment_department_requirements.department_requirement_id)
                    .setString("requirements", to_enrollment_department_requirements.requirements)
                    .setString("created_at", to_enrollment_department_requirements.created_at)
                    .setString("updated_at", to_enrollment_department_requirements.updated_at)
                    .setString("created_by", to_enrollment_department_requirements.created_by)
                    .setString("updated_by", to_enrollment_department_requirements.updated_by)
                    .setNumber("status", to_enrollment_department_requirements.status)
                    .setNumber("is_uploaded", to_enrollment_department_requirements.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_department_requirements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollment_department_requirements to_enrollment_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollment_department_requirements set "
                    + "enrollment_id= :enrollment_id "
                    + ",enrollment_no= :enrollment_no "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",department_requirement_id= :department_requirement_id "
                    + ",requirements= :requirements "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_enrollment_department_requirements.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("enrollment_id", to_enrollment_department_requirements.enrollment_id)
                    .setString("enrollment_no", to_enrollment_department_requirements.enrollment_no)
                    .setNumber("academic_year_id", to_enrollment_department_requirements.academic_year_id)
                    .setString("academic_year", to_enrollment_department_requirements.academic_year)
                    .setNumber("department_id", to_enrollment_department_requirements.department_id)
                    .setString("department", to_enrollment_department_requirements.department)
                    .setNumber("department_requirement_id", to_enrollment_department_requirements.department_requirement_id)
                    .setString("requirements", to_enrollment_department_requirements.requirements)
                    .setString("created_at", to_enrollment_department_requirements.created_at)
                    .setString("updated_at", to_enrollment_department_requirements.updated_at)
                    .setString("created_by", to_enrollment_department_requirements.created_by)
                    .setString("updated_by", to_enrollment_department_requirements.updated_by)
                    .setNumber("status", to_enrollment_department_requirements.status)
                    .setNumber("is_uploaded", to_enrollment_department_requirements.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_department_requirements.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollment_department_requirements to_enrollment_department_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollment_department_requirements  "
                    + " where id='" + to_enrollment_department_requirements.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollment_department_requirements.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_department_requirements> ret_data(String where) {
        List<to_enrollment_department_requirements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",department_requirement_id"
                    + ",requirements"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from enrollment_department_requirements"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_id = rs.getInt(2);
                String enrollment_no = rs.getString(3);
                int academic_year_id = rs.getInt(4);
                String academic_year = rs.getString(5);
                int department_id = rs.getInt(6);
                String department = rs.getString(7);
                int department_requirement_id = rs.getInt(8);
                String requirements = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                String created_by = rs.getString(12);
                String updated_by = rs.getString(13);
                int status = rs.getInt(14);
                int is_uploaded = rs.getInt(15);

                to_enrollment_department_requirements to = new to_enrollment_department_requirements(id, enrollment_id, enrollment_no, academic_year_id, academic_year, department_id, department, department_requirement_id, requirements, created_at, updated_at, created_by, updated_by, status, is_uploaded, false);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollment_department_requirements> ret_data_selected(int department_id, int enrollment_id) {

        List<to_enrollment_department_requirements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();

            String s2 = "select "
                    + "id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",department_id"
                    + ",department"
                    + ",requirements"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from department_requirements"
                    + " where department_id='" + department_id + "' ";

            Statement stmt2 = conn.createStatement();
            ResultSet rs = stmt2.executeQuery(s2);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                String academic_year = rs.getString(3);
                int department_id1 = rs.getInt(4);
                String department = rs.getString(5);
                String requirements = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                String created_by = rs.getString(9);
                String updated_by = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);

                String s3 = "select "
                        + "id"
                        + ",enrollment_id"
                        + ",enrollment_no"
                        + ",academic_year_id"
                        + ",academic_year"
                        + ",department_id"
                        + ",department"
                        + ",department_requirement_id"
                        + ",requirements"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + " from enrollment_department_requirements"
                        + " where enrollment_id='" + enrollment_id + "' and department_requirement_id='" + id + "' ";
             
                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);
                int id2 = 0;
                int enrollment_id1 = 0;
                String enrollment_no = "";
                boolean selected = false;
                if (rs3.next()) {
                    id2 = rs3.getInt(1);
                    enrollment_id1 = rs3.getInt(2);
                    enrollment_no = rs3.getString(3);
                    int academic_year_id2 = rs3.getInt(4);
                    String academic_year2 = rs3.getString(5);
                    int department_id2 = rs3.getInt(6);
                    String department2 = rs3.getString(7);
                    int department_requirement_id = rs3.getInt(8);
                    String requirements2 = rs3.getString(9);
                    String created_at2 = rs3.getString(10);
                    String updated_at2 = rs3.getString(11);
                    String created_by2 = rs3.getString(12);
                    String updated_by2 = rs3.getString(13);
                    int status2 = rs3.getInt(14);
                    int is_uploaded2 = rs3.getInt(15);
                    selected = true;
                }
//                System.out.println("id2: "+id2);
                to_enrollment_department_requirements to = new to_enrollment_department_requirements(id2, enrollment_id1, enrollment_no, academic_year_id, academic_year, department_id, department, id, requirements, created_at, updated_at, created_by, updated_by, status, id, selected);
//                System.out.println("selected: "+selected);
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

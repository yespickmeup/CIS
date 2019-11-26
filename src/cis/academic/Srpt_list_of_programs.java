/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

import cis.academic.Academic_offerings.to_academic_offerings;
import cis.utils.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronescape
 */
public class Srpt_list_of_programs {

    public final String school_name;
    public final String school_year;
    public final String date_printed;
    public final String printed_by;
    public final List<field> fields;

    public Srpt_list_of_programs(String school_name, String school_year, String date_printed, String printed_by) {
        this.school_name = school_name;
        this.school_year = school_year;
        this.date_printed = date_printed;
        this.printed_by = printed_by;
        this.fields = new ArrayList();
    }

    public static class field {

        String course_id;
        String course_code;
        String course_description;
        String college_id;
        String college;
        String department_id;
        String department;
        int no_of_years;
        String studies;

        public field() {
        }

        public field(String course_id, String course_code, String course_description, String college_id, String college, String department_id, String department, int no_of_years, String studies) {
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.no_of_years = no_of_years;
            this.studies = studies;
        }

        public String getCourse_id() {
            return course_id;
        }

        public void setCourse_id(String course_id) {
            this.course_id = course_id;
        }

        public String getCourse_code() {
            return course_code;
        }

        public void setCourse_code(String course_code) {
            this.course_code = course_code;
        }

        public String getCourse_description() {
            return course_description;
        }

        public void setCourse_description(String course_description) {
            this.course_description = course_description;
        }

        public String getCollege_id() {
            return college_id;
        }

        public void setCollege_id(String college_id) {
            this.college_id = college_id;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public String getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(String department_id) {
            this.department_id = department_id;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getNo_of_years() {
            return no_of_years;
        }

        public void setNo_of_years(int no_of_years) {
            this.no_of_years = no_of_years;
        }

        public String getStudies() {
            return studies;
        }

        public void setStudies(String studies) {
            this.studies = studies;
        }

    }

    public static void main(String[] args) {
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");
        String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria");
        String school_year = "2019-2020";
        String date_printed = "November 26, 2019";
        String printed_by = "Administrator";
        List<field> fields = Srpt_list_of_programs.ret_data(" where academic_year_id='2' ");
        String jrxml = "rpt_list_of_programs.jrxml";
        Srpt_list_of_programs rpt = new Srpt_list_of_programs(school_name, school_year, date_printed, printed_by);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_list_of_programs.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_list_of_programs to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<field> ret_data(String where) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department_name"
                    + ",no_of_years"
                    + ",studies"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from academic_offerings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_year_id = rs.getInt(2);
                String academic_year = rs.getString(3);
                int course_id = rs.getInt(4);
                String course_code = rs.getString(5);
                String course_description = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department_name = rs.getString(10);
                int no_of_years = rs.getInt(11);
                String studies = rs.getString(12);
                String created_at = rs.getString(13);
                String updated_at = rs.getString(14);
                String created_by = rs.getString(15);
                String updated_by = rs.getString(16);
                int status = rs.getInt(17);
                int is_uploaded = rs.getInt(18);

                String department = department_name;
                field f = new field(course_code, course_code, course_description, college, college, department, department, no_of_years, studies);
                datas.add(f);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

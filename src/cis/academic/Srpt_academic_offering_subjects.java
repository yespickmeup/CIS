/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

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
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronescape
 */
public class Srpt_academic_offering_subjects {

    public final String school_name;
    public final String school_year;
    public final String date_printed;
    public final String printed_by;
    public final String course;
    public final List<field> fields;

    public Srpt_academic_offering_subjects(String school_name, String school_year, String date_printed, String printed_by, String course) {
        this.school_name = school_name;
        this.school_year = school_year;
        this.date_printed = date_printed;
        this.printed_by = printed_by;
        this.course = course;
        this.fields = new ArrayList();
    }

    public static class field {

        String subject_id;
        String subject_code;
        String subject_description;
        int lecture_units;
        int lab_units;
        String prerequisites;
        String year_level;
        String term;

        public field() {
        }

        public field(String subject_id, String subject_code, String subject_description, int lecture_units, int lab_units, String prerequisites, String year_level, String term) {
            this.subject_id = subject_id;
            this.subject_code = subject_code;
            this.subject_description = subject_description;
            this.lecture_units = lecture_units;
            this.lab_units = lab_units;
            this.prerequisites = prerequisites;
            this.year_level = year_level;
            this.term = term;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getSubject_code() {
            return subject_code;
        }

        public void setSubject_code(String subject_code) {
            this.subject_code = subject_code;
        }

        public String getSubject_description() {
            return subject_description;
        }

        public void setSubject_description(String subject_description) {
            this.subject_description = subject_description;
        }

        public int getLecture_units() {
            return lecture_units;
        }

        public void setLecture_units(int lecture_units) {
            this.lecture_units = lecture_units;
        }

        public int getLab_units() {
            return lab_units;
        }

        public void setLab_units(int lab_units) {
            this.lab_units = lab_units;
        }

        public String getPrerequisites() {
            return prerequisites;
        }

        public void setPrerequisites(String prerequisites) {
            this.prerequisites = prerequisites;
        }

        public String getYear_level() {
            return year_level;
        }

        public void setYear_level(String year_level) {
            this.year_level = year_level;
        }

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

    }

    public static void main(String[] args) {
//        System.setProperty("pool_db", "db_cis_cosca");
//        System.setProperty("pool_password", "password");

        String course = "Bachelor of Science Major in Philosophy";

        String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria");
        String school_year = "2019-2020";
        String date_printed = "November 26, 2019";
        String printed_by = "Administrator";

        String where = " where academic_offering_id='29' ";
        List<Srpt_academic_offering_subjects.field> fields = Srpt_academic_offering_subjects.ret_data_with_prerequisites(where);
        String jrxml = "rpt_academic_offering_subjects.jrxml";
        Srpt_academic_offering_subjects rpt = new Srpt_academic_offering_subjects(school_name, school_year, date_printed, printed_by, course);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_academic_offering_subjects.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_academic_offering_subjects to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<field> ret_data_with_prerequisites(String where) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
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
                    + ",units"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",amount"
                    + ",is_lab"
                    + ",max_students"
                    + ",prerequisite_subject_ids"
                    + ",subject_group"
                    + ",subject_group_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from academic_offering_subjects"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int academic_offering_id = rs.getInt(2);
                int academic_year_id = rs.getInt(3);
                String academic_year = rs.getString(4);
                int level_id = rs.getInt(5);
                String level = rs.getString(6);
                int college_id = rs.getInt(7);
                String college = rs.getString(8);
                int department_id = rs.getInt(9);
                String department = rs.getString(10);
                int course_id = rs.getInt(11);
                String course_code = rs.getString(12);
                String course_description = rs.getString(13);
                String term = rs.getString(14);
                String year_level = rs.getString(15);
                int subject_id = rs.getInt(16);
                String subject_code = rs.getString(17);
                String description = rs.getString(18);
                double units = rs.getDouble(19);
                double lecture_units = rs.getDouble(20);
                double lab_units = rs.getDouble(21);
                double amount = rs.getDouble(22);
                int is_lab = rs.getInt(23);
                int max_students = rs.getInt(24);
                String prerequisite_subject_ids = rs.getString(25);
                String subject_group = rs.getString(26);
                int subject_group_id = rs.getInt(27);
                String created_at = rs.getString(28);
                String updated_at = rs.getString(29);
                String created_by = rs.getString(30);
                String updated_by = rs.getString(31);
                int status = rs.getInt(32);
                int is_uploaded = rs.getInt(33);

                String s2 = "select "
                        + "id"
                        + ",main_subject_id"
                        + ",subject_code"
                        + ",description"
                        + ",lecture_units"
                        + ",lab_units"
                        + ",remarks"
                        + " from academic_offering_subject_prerequisites"
                        + " where academic_offering_id='" + academic_offering_id + "' and ref_subject_id='" + subject_id + "' ";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                String pres = "";

                while (rs2.next()) {
                    int id2 = rs2.getInt(1);
                    int subject_id2 = rs2.getInt(2);
                    String subject_code2 = rs2.getString(3);
//                    System.out.println("subject_code2:" +subject_code2);
                    String description2 = rs2.getString(4);
                    double lecture_units2 = rs2.getDouble(5);
                    double lab_units2 = rs2.getDouble(6);
                    String remarks = rs2.getString(7);
                    if (pres.isEmpty()) {
                        pres = subject_code2;
                    } else {
                        pres = pres + ", " + subject_code2;
                    }
                }
                String subject_description = description;
                String prerequisites = pres;
                field f = new field(""+subject_id, subject_code, subject_description, FitIn.toInt(""+lecture_units),  FitIn.toInt(""+lab_units), prerequisites, year_level, term);
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

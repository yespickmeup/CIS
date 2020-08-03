/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Srpt_enrollment_summary2 {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String department;
    public final List<field> fields;

    public Srpt_enrollment_summary2(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.fields = new ArrayList();
    }

    public static class field {

        String student_no;
        String last_name;
        String first_name;
        String middle_name;
        String gender;
        String year_level;
        String course;
        String subjects_enrolled;
        double no_of_units;

        public field() {
        }

        public field(String student_no, String last_name, String first_name, String middle_name, String gender, String year_level, String course, String subjects_enrolled, double no_of_units) {
            this.student_no = student_no;
            this.last_name = last_name;
            this.first_name = first_name;
            this.middle_name = middle_name;
            this.gender = gender;
            this.year_level = year_level;
            this.course = course;
            this.subjects_enrolled = subjects_enrolled;
            this.no_of_units = no_of_units;
        }

        public String getStudent_no() {
            return student_no;
        }

        public void setStudent_no(String student_no) {
            this.student_no = student_no;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getMiddle_name() {
            return middle_name;
        }

        public void setMiddle_name(String middle_name) {
            this.middle_name = middle_name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getYear_level() {
            return year_level;
        }

        public void setYear_level(String year_level) {
            this.year_level = year_level;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getSubjects_enrolled() {
            return subjects_enrolled;
        }

        public void setSubjects_enrolled(String subjects_enrolled) {
            this.subjects_enrolled = subjects_enrolled;
        }

        public double getNo_of_units() {
            return no_of_units;
        }

        public void setNo_of_units(double no_of_units) {
            this.no_of_units = no_of_units;
        }

    }

    public static void main(String[] args) {
        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String printed_by = "Administrator";
        String school_year = "2020 - 2021";
        String semester = "First Semester";
        List<Srpt_enrollment_summary2.field> fields = new ArrayList();

        String department = "";

        for (int i = 0; i < 20; i++) {

        }
        String jrxml = "rpt_enrollment_summary2.jrxml";

        Srpt_enrollment_summary2 rpt = new Srpt_enrollment_summary2(business_name, address, contact_no, date, printed_by, school_year, semester, department);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_enrollment_summary2.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_enrollment_summary2 to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

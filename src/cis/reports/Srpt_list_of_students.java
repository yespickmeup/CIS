/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import static cis.reports.Srpt_enrollment_assessment.get_viewer;
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
public class Srpt_list_of_students {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;

    public final List<field> fields;

    public Srpt_list_of_students(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.fields = new ArrayList();
    }

    public static class field {

        String enrollment_id;
        String student_no;
        String name;
        String course;
        double no_of_units;

        public field() {
        }

        public field(String enrollment_id,String student_no, String name, String course, double no_of_units) {
            this.enrollment_id=enrollment_id;
            this.student_no = student_no;
            this.name = name;
            this.course = course;
            this.no_of_units = no_of_units;
        }

        public String getEnrollment_id() {
            return enrollment_id;
        }

        public void setEnrollment_id(String enrollment_id) {
            this.enrollment_id = enrollment_id;
        }

        public String getStudent_no() {
            return student_no;
        }

        public void setStudent_no(String student_no) {
            this.student_no = student_no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
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
        List<field> fields = new ArrayList();
        for (int i = 0; i < 20; i++) {
            String student_no = "2020000" + i;
            String name = "Juan Dela Cruz";
            String course = "BSIT-1";
            double no_of_units = i;
            field f = new field("",student_no, name, course, no_of_units);
            fields.add(f);
        }
        String jrxml = "rpt_list_of_students.jrxml";
        Srpt_list_of_students rpt = new Srpt_list_of_students(business_name, address, contact_no, date, printed_by, school_year, semester);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_list_of_students.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_list_of_students to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}

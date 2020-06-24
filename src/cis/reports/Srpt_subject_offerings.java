/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.utils.DateType;
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

/**
 *
 * @author User
 */
public class Srpt_subject_offerings {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String department;
    public final String college;
    public final List<field> fields;

    public Srpt_subject_offerings(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department, String college) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.college = college;
        this.fields = new ArrayList();
    }

    public static class field {

        String subject_code;
        String description;
        double lec_units;
        double lab_units;

        public field() {
        }

        public field(String subject_code, String description, double lec_units, double lab_units) {
            this.subject_code = subject_code;
            this.description = description;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
        }

        public String getSubject_code() {
            return subject_code;
        }

        public void setSubject_code(String subject_code) {
            this.subject_code = subject_code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getLec_units() {
            return lec_units;
        }

        public void setLec_units(double lec_units) {
            this.lec_units = lec_units;
        }

        public double getLab_units() {
            return lab_units;
        }

        public void setLab_units(double lab_units) {
            this.lab_units = lab_units;
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

        String department = "";

        List<field> fields = new ArrayList();
        for (int i = 0; i < 20; i++) {
            String subject_code = "NSTP1";
            String description = "National Service Training Program 1";
            subject_code = subject_code + " - " + description;
            double lec_units = 3;
            double lab_units = 0;
            field f = new field(subject_code, description, lec_units, lab_units);
            fields.add(f);
        }
        String jrxml = "rpt_subject_offerings.jrxml";

        Srpt_subject_offerings rpt = new Srpt_subject_offerings(business_name, address, contact_no, date, printed_by, school_year, semester, department, date);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_subject_offerings.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_subject_offerings to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

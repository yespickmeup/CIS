/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.accounts_receivables;

import cis.reports.Srpt_subject_offerings;
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
public class Srpt_ar_student_balances {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String department;
    public final String college;
    public final String course;
    public final List<field> fields;

    public Srpt_ar_student_balances(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department, String college, String course) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.college = college;
        this.course = course;
        this.fields = new ArrayList();
    }

    public static class field {

        String student_no;
        String student_name;
        String contact_no;
        String address;
        double balance;

        public field() {
        }

        public field(String student_no, String student_name, String contact_no, String address, double balance) {
            this.student_no = student_no;
            this.student_name = student_name;
            this.contact_no = contact_no;
            this.address = address;
            this.balance = balance;
        }

        public String getStudent_no() {
            return student_no;
        }

        public void setStudent_no(String student_no) {
            this.student_no = student_no;
        }

        public String getStudent_name() {
            return student_name;
        }

        public void setStudent_name(String student_name) {
            this.student_name = student_name;
        }

        public String getContact_no() {
            return contact_no;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
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
        String college = "";
        String course = "";

        List<field> fields = new ArrayList();
        for (int i = 0; i < 20; i++) {

            String student_no = "2020000" + i;
            String student_name = "Juan dela Cruz";
            String contact_no1 = "09161932567";
            String address1 = "Canlas Subdivision, Lower Bagacay, Dumaguete City";
            double balance = 100 * i;
            field f = new field(student_no, student_name, contact_no, address, balance);
            fields.add(f);
        }
        String jrxml = "rpt_ar_student_balances.jrxml";

        Srpt_ar_student_balances rpt = new Srpt_ar_student_balances(business_name, address, contact_no, date, printed_by, school_year, semester, department, college, course);

        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_ar_student_balances.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_ar_student_balances to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}

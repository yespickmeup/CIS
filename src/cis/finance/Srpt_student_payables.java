/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.reports.Srpt_teachers_load;
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
public class Srpt_student_payables {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String student_no;
    public final String student_name;
    public final List<field> fields;

    public Srpt_student_payables(String business_name, String address, String contact_no, String date, String student_no, String student_name) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.student_no = student_no;
        this.student_name = student_name;
        this.fields = new ArrayList();
    }

    public static class field {

        int id;
        String mode;
        String term;
        String year_level;
        String academic_year;
        String date;
        double amount;
        double interest;
        double paid;
        double balance;

        public field(int id, String mode, String year_level, String academic_year, String date, double amount, double interest, double paid, double balance) {
            this.id = id;
            this.mode = mode;
            this.year_level = year_level;
            this.academic_year = academic_year;
            this.date = date;
            this.amount = amount;
            this.interest = interest;
            this.paid = paid;
            this.balance = balance;
        }

        public field() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public String getYear_level() {
            return year_level;
        }

        public void setYear_level(String year_level) {
            this.year_level = year_level;
        }

        public String getAcademic_year() {
            return academic_year;
        }

        public void setAcademic_year(String academic_year) {
            this.academic_year = academic_year;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }

        public double getPaid() {
            return paid;
        }

        public void setPaid(double paid) {
            this.paid = paid;
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
        String student_no = "00000001";
        String student_name = "Ronald Pascua";
        List<Srpt_student_payables.field> fields = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int id = 0;
            String mode = "First Payment";
            String term = "First Semester";
            String year_level = "First Year";
            String academic_year = "2020-2021";
            String date2 = "09/11/2020";
            double amount = 2047;
            double interest = 0;
            double paid = 0;
            double balance = 2047;
            field f = new field(id, mode, year_level, academic_year, date, amount, interest, paid, balance);
            fields.add(f);
        }
        String jrxml = "rpt_student_payables.jrxml";

        Srpt_student_payables rpt = new Srpt_student_payables(business_name, address, contact_no, date, student_no, student_name);

        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_student_payables.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_student_payables to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

import cis.utils.DateType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
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
 * @author User
 */
public class Srpt_student_ledger {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String student_no;
    public final String student_name;
    public final List<Srpt_student_ledger.field> fields;

    public Srpt_student_ledger(String business_name, String address, String contact_no, String date, String student_no, String student_name) {
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
        String year_level;
        String term;
        String academic_year;
        String date;
        String debit;
        String credit;
        String interest;
        double balance;
        String or_no;
        double amount;

        public field() {
        }

        public field(int id, String mode, String year_level, String term, String academic_year, String date, String debit, String credit, String interest, double balance,String or_no, double amount) {
            this.id = id;
            this.mode = mode;
            this.year_level = year_level;
            this.term = term;
            this.academic_year = academic_year;
            this.date = date;
            this.debit = debit;
            this.credit = credit;
            this.interest = interest;
            this.balance = balance;
            this.or_no=or_no;
            this.amount = amount;
        }

    public String getOr_no() {
      return or_no;
    }

    public void setOr_no(String or_no) {
      this.or_no = or_no;
    }

    public double getAmount() {
      return amount;
    }

    public void setAmount(double amount) {
      this.amount = amount;
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

        public String getDebit() {
            return debit;
        }

        public void setDebit(String debit) {
            this.debit = debit;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getInterest() {
            return interest;
        }

        public void setInterest(String interest) {
            this.interest = interest;
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
        List<Srpt_student_ledger.field> fields = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int id = 0;
            String mode = "First Payment";
            String term = "First Semester";
            String year_level = "First Year";
            String academic_year = "2020-2021";
            String date2 = "09/11/2020";
            String debit = "" + (100 * i);
            String credit = "" + (150 * i);
            String interest = "";
            double balance = FitIn.toDouble(debit) - FitIn.toDouble(credit);
            String or_no="";
            double amount = 0;
            Srpt_student_ledger.field f = new Srpt_student_ledger.field(id, mode, year_level, term, academic_year, date, debit, credit, interest, balance,or_no, amount);
            fields.add(f);
        }
        String jrxml = "rpt_student_ledger.jrxml";

        Srpt_student_ledger rpt = new Srpt_student_ledger(business_name, address, contact_no, date, student_no, student_name);

        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_student_ledger.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_student_ledger to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

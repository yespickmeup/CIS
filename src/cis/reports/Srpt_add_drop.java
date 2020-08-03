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
public class Srpt_add_drop {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String student_no;
    public final String student_name;
    public final String course;
    public final double amount;
    public final double cash;
    public final double discount;
    public final double check_amount;
    public final double credit_card_amount;
    public final double gc_amount;
    public final double online_amount;
    public final double charge_amount;
    public final double lec_amount;
    public final double lab_amount;
    public final double fee_amount;
    public final String trans_type;
    public final List<field> fields;

    public Srpt_add_drop(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String student_no, String student_name, String course, double amount, double cash, double discount, double check_amount, double credit_card_amount, double gc_amount, double online_amount, double charge_amount, double lec_amount, double lab_amount, double fee_amount, String trans_type) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.student_no = student_no;
        this.student_name = student_name;
        this.course = course;
        this.amount = amount;
        this.cash = cash;
        this.discount = discount;
        this.check_amount = check_amount;
        this.credit_card_amount = credit_card_amount;
        this.gc_amount = gc_amount;
        this.online_amount = online_amount;
        this.charge_amount = charge_amount;
        this.lec_amount = lec_amount;
        this.lab_amount = lab_amount;
        this.fee_amount = fee_amount;
        this.fields = new ArrayList();
        this.trans_type = trans_type;
    }

    public static class field {

        String subject_code;
        String description;
        double lec_units;
        double lab_units;
        String faculty;
        String section;
        String room;
        String day;
        double amount;
        
        public field() {
        }

        public field(String subject_code, String description, double lec_units, double lab_units, String faculty, String section, String room, String day, double amount) {
            this.subject_code = subject_code;
            this.description = description;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
            this.faculty = faculty;
            this.section = section;
            this.room = room;
            this.day = day;
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
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

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
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

        String student_no = "20200005";
        String student_name = "Ronald Pascua";
        String course = "BSIT-1";
        double amount = 3000;
        double cash = 3000;
        double discount = 0;
        double check_amount = 0;
        double credit_card_amount = 0;
        double gc_amount = 0;
        double online_amount = 0;
        double charge_amount = 0;
        double lec_amount = 385;
        double lab_amount = 0;
        double fee_amount = 0;
        List<field> fields = new ArrayList();
        String jrxml = "rpt_add_drop.jrxml";
        String trans_type = "Add Subject";
        Srpt_add_drop rpt = new Srpt_add_drop(business_name, address, contact_no, date, printed_by, school_year, semester, student_no, student_name, course, amount, cash, discount, check_amount, credit_card_amount, gc_amount, online_amount, charge_amount, lec_amount, lab_amount, fee_amount, trans_type);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_add_drop.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_add_drop to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

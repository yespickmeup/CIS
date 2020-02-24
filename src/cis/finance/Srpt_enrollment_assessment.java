/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.finance;

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
 * @author Ronescape
 */
public class Srpt_enrollment_assessment {

    public final String school_name;
    public final String address;
    public final String date;
    public final String contact_no;
    public final String enrollment_id;
    public final String enrollment_no;
    public final String student_id;
    public final String student_no;
    public final String student_name;
    public final String academic_year;
    public final String course_code;
    public final String course_description;
    public final int no_of_years;
    public final String level;
    public final String college;
    public final String department;
    public final String year_level;
    public final double tuition_amount;
    public final double tuition_discount;
    public final int no_of_units;
    public final double amount_per_unit;
    public final double miscellaneous_amount;
    public final double miscellaneous_discount;
    public final double other_fees_amount;
    public final double other_fees_discount;
    public final double total_discount;
    public final double total_amount_due;
    public final List<field> fields;
    public final String SUBREPORT_DIR;
    public final List<field> rpt_subjects;
    public final List<Srpt_enrollment_assessment.mode_of_payments> rpt_mode_of_payments;
    public final String assessed_by;

    public Srpt_enrollment_assessment(String school_name, String address, String date, String contact_no, String enrollment_id, String enrollment_no, String student_id, String student_no, String student_name, String academic_year, String course_code, String course_description, int no_of_years, String level, String college, String department, String year_level, double tuition_amount, double tuition_discount, int no_of_units, double amount_per_unit, double miscellaneous_amount, double miscellaneous_discount, double other_fees_amount, double other_fees_discount, double total_discount, double total_amount_due, String SUBREPORT_DIR, List<field> rpt_subjects, List<Srpt_enrollment_assessment.mode_of_payments> rpt_mode_of_payments, String assessed_by) {
        this.school_name = school_name;
        this.address = address;
        this.date = date;
        this.contact_no = contact_no;
        this.enrollment_id = enrollment_id;
        this.enrollment_no = enrollment_no;
        this.student_id = student_id;
        this.student_no = student_no;
        this.student_name = student_name;
        this.academic_year = academic_year;
        this.course_code = course_code;
        this.course_description = course_description;
        this.no_of_years = no_of_years;
        this.level = level;
        this.college = college;
        this.department = department;
        this.year_level = year_level;
        this.tuition_amount = tuition_amount;
        this.tuition_discount = tuition_discount;
        this.no_of_units = no_of_units;
        this.amount_per_unit = amount_per_unit;
        this.miscellaneous_amount = miscellaneous_amount;
        this.miscellaneous_discount = miscellaneous_discount;
        this.other_fees_amount = other_fees_amount;
        this.other_fees_discount = other_fees_discount;
        this.total_discount = total_discount;
        this.total_amount_due = total_amount_due;
        this.fields = new ArrayList();
        this.SUBREPORT_DIR = SUBREPORT_DIR;
        this.rpt_subjects = rpt_subjects;
        this.rpt_mode_of_payments = rpt_mode_of_payments;
        this.assessed_by = assessed_by;
    }

    public static class mode_of_payments {

        String mode;
        String date;
        double amount;

        public mode_of_payments() {
        }

        public mode_of_payments(String mode, String date, double amount) {
            this.mode = mode;
            this.date = date;
            this.amount = amount;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
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

    }

    public static class field {

        String subject_code;
        String subject_description;
        String prerequisites;
        double lec_units;
        double lab_units;
        String faculty_name;
        String section;
        String room;
        String day;

        public field() {
        }

        public field(String subject_code, String subject_description, String prerequisites, double lec_units, double lab_units, String faculty_name, String section, String room, String day) {
            this.subject_code = subject_code;
            this.subject_description = subject_description;
            this.prerequisites = prerequisites;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
            this.faculty_name = faculty_name;
            this.section = section;
            this.room = room;
            this.day = day;
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

        public String getPrerequisites() {
            return prerequisites;
        }

        public void setPrerequisites(String prerequisites) {
            this.prerequisites = prerequisites;
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

        public String getFaculty_name() {
            return faculty_name;
        }

        public void setFaculty_name(String faculty_name) {
            this.faculty_name = faculty_name;
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

        String school_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String enrollment_id = "1";
        String enrollment_no = "00000001";
        String student_id = "";
        String student_no = "FSW12923";
        String student_name = "Juan dela Cruz";
        String academic_year = "2020 - 2021";
        String course_code = "BSIT";
        String course_description = "Bachelor of Science in Information Technology";
        int no_of_years = 4;
        String level = "COLLEGE OF ARTS AND SCIENCES";
        String college = "COLLEGE OF ARTS AND SCIENCES";
        String department = "TERTIARY DEPARTMENT";
        String year_level = "First Year";
        double tuition_amount = 11500;
        double tuition_discount = 1000;
        int no_of_units = 23;
        double amount_per_unit = 500;
        double miscellaneous_amount = 5000;
        double miscellaneous_discount = 0;
        double other_fees_amount = 1000;
        double other_fees_discount = 0;
        double total_discount = 1000;
        double total_amount_due = 16500;
        String home = System.getProperty("user.home");
        String SUBREPORT_DIR = home + "\\cis\\";
        List<field> fields = new ArrayList();
        List<field> rpt_subjects = new ArrayList();

        for (int i = 0; i < 14; i++) {
            String subject_code = "Code" + i;
            String subject_description = "Description " + i;
            String prerequisites = "";
            double lec_units = 3;
            double lab_units = 0;
            String faculty_name = "Faculty name";
            String section = "AF";
            String room = "" + (100 + i);
            String day = "MWF";
            field f = new field(subject_code, subject_description, prerequisites, lec_units, lab_units, faculty_name, section, room, day);
            rpt_subjects.add(f);
        }
        List<Srpt_enrollment_assessment.mode_of_payments> rpt_mode_of_payments = new ArrayList();
        int payment_count = 3;
        if (payment_count == 3) {
            Srpt_enrollment_assessment.mode_of_payments mop0 = new mode_of_payments("Downpayment", date, 5000);
            Srpt_enrollment_assessment.mode_of_payments mop1 = new mode_of_payments("1st Payment", date, 3833.33);
            Srpt_enrollment_assessment.mode_of_payments mop2 = new mode_of_payments("2nd Payment", date, 3833.33);
            Srpt_enrollment_assessment.mode_of_payments mop3 = new mode_of_payments("3rd Payment", date, 3833.33);
            rpt_mode_of_payments.add(mop0);
            rpt_mode_of_payments.add(mop1);
            rpt_mode_of_payments.add(mop2);
            rpt_mode_of_payments.add(mop3);
        }
        String assessed_by = "Joey de Leon";

        Srpt_enrollment_assessment rpt = new Srpt_enrollment_assessment(school_name, address, date, contact_no, enrollment_id, enrollment_no, student_id, student_no, student_name, academic_year, course_code, course_description, no_of_years, level, college, department, year_level, tuition_amount, tuition_discount, no_of_units, amount_per_unit, miscellaneous_amount, miscellaneous_discount, other_fees_amount, other_fees_discount, total_discount, total_amount_due, SUBREPORT_DIR, rpt_subjects, rpt_mode_of_payments,assessed_by);
//        rpt.fields.addAll(fields);
        String jrxml = "enrollment_assessment.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_enrollment_assessment.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_enrollment_assessment to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}

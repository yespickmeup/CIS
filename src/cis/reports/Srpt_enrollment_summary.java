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
public class Srpt_enrollment_summary {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String department;
    public final int continuing_1st;
    public final int continuing_2nd;
    public final int continuing_3rd;
    public final int continuing_4th;
    public final int continuing_5th;
    public final int new_1st;
    public final int new_2nd;
    public final int new_3rd;
    public final int new_4th;
    public final int new_5th;
    public final int transferee_1st;
    public final int transferee_2nd;
    public final int transferee_3rd;
    public final int transferee_4th;
    public final int transferee_5th;

    public final List<field> fields;

    public Srpt_enrollment_summary(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department, int continuing_1st, int continuing_2nd, int continuing_3rd, int continuing_4th, int continuing_5th, int new_1st, int new_2nd, int new_3rd, int new_4th, int new_5th, int transferee_1st, int transferee_2nd, int transferee_3rd, int transferee_4th, int transferee_5th) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.continuing_1st = continuing_1st;
        this.continuing_2nd = continuing_2nd;
        this.continuing_3rd = continuing_3rd;
        this.continuing_4th = continuing_4th;
        this.continuing_5th = continuing_5th;
        this.new_1st = new_1st;
        this.new_2nd = new_2nd;
        this.new_3rd = new_3rd;
        this.new_4th = new_4th;
        this.new_5th = new_5th;
        this.transferee_1st = transferee_1st;
        this.transferee_2nd = transferee_2nd;
        this.transferee_3rd = transferee_3rd;
        this.transferee_4th = transferee_4th;
        this.transferee_5th = transferee_5th;
        this.fields = new ArrayList();
    }

    public static class field {

        String college_code;
        String college;
        String course;
        int first_female;
        int first_male;
        int second_female;
        int second_male;
        int third_female;
        int third_male;
        int fourth_female;
        int fourth_male;
        int fifth_female;
        int fifth_male;

        public field() {
        }

        public field(String college_code, String college, String course, int first_female, int first_male, int second_female, int second_male, int third_female, int third_male, int fourth_female, int fourth_male, int fifth_female, int fifth_male) {
            this.college_code = college_code;
            this.college = college;
            this.course = course;
            this.first_female = first_female;
            this.first_male = first_male;
            this.second_female = second_female;
            this.second_male = second_male;
            this.third_female = third_female;
            this.third_male = third_male;
            this.fourth_female = fourth_female;
            this.fourth_male = fourth_male;
            this.fifth_female = fifth_female;
            this.fifth_male = fifth_male;
        }

        public String getCollege_code() {
            return college_code;
        }

        public void setCollege_code(String college_code) {
            this.college_code = college_code;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getFirst_female() {
            return first_female;
        }

        public void setFirst_female(int first_female) {
            this.first_female = first_female;
        }

        public int getFirst_male() {
            return first_male;
        }

        public void setFirst_male(int first_male) {
            this.first_male = first_male;
        }

        public int getSecond_female() {
            return second_female;
        }

        public void setSecond_female(int second_female) {
            this.second_female = second_female;
        }

        public int getSecond_male() {
            return second_male;
        }

        public void setSecond_male(int second_male) {
            this.second_male = second_male;
        }

        public int getThird_female() {
            return third_female;
        }

        public void setThird_female(int third_female) {
            this.third_female = third_female;
        }

        public int getThird_male() {
            return third_male;
        }

        public void setThird_male(int third_male) {
            this.third_male = third_male;
        }

        public int getFourth_female() {
            return fourth_female;
        }

        public void setFourth_female(int fourth_female) {
            this.fourth_female = fourth_female;
        }

        public int getFourth_male() {
            return fourth_male;
        }

        public void setFourth_male(int fourth_male) {
            this.fourth_male = fourth_male;
        }

        public int getFifth_female() {
            return fifth_female;
        }

        public void setFifth_female(int fifth_female) {
            this.fifth_female = fifth_female;
        }

        public int getFifth_male() {
            return fifth_male;
        }

        public void setFifth_male(int fifth_male) {
            this.fifth_male = fifth_male;
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

        String department = "";
        int continuing_1st = 1;
        int continuing_2nd = 2;
        int continuing_3rd = 3;
        int continuing_4th = 4;
        int continuing_5th = 5;
        int new_1st = 6;
        int new_2nd = 7;
        int new_3rd = 8;
        int new_4th = 9;
        int new_5th = 10;
        int transferee_1st = 11;
        int transferee_2nd = 12;
        int transferee_3rd = 13;
        int transferee_4th = 14;
        int transferee_5th = 15;
        for (int i = 0; i < 20; i++) {
            String college_code = "000" + i;
            String college = "College";
            String course = "Course";
            int first_female = 1;
            int first_male = 2;
            int second_female = 3;
            int second_male = 4;
            int third_female = 5;
            int third_male = 6;
            int fourth_female = 7;
            int fourth_male = 8;
            int fifth_female = 9;
            int fifth_male = 10;
            Srpt_enrollment_summary.field f = new field(college_code, college, course, first_female, first_male, second_female, second_male, third_female, third_male, fourth_female, fourth_male, fifth_female, fifth_male);
            fields.add(f);
        }
        String jrxml = "rpt_enrollment_summary.jrxml";

        Srpt_enrollment_summary rpt = new Srpt_enrollment_summary(business_name, address, contact_no, date, printed_by, school_year, semester, department, continuing_1st, continuing_2nd, continuing_3rd, continuing_4th, continuing_5th, new_1st, new_2nd, new_3rd, new_4th, new_5th, transferee_1st, transferee_2nd, transferee_3rd, transferee_4th, transferee_5th);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_enrollment_summary.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_enrollment_summary to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}

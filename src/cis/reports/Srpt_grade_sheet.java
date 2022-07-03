/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.enrollments.Enrollment_offered_subject_sections;
import cis.utils.DateType;
import cis.utils.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Srpt_grade_sheet {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String date;
    public final String printed_by;
    public final String school_year;
    public final String semester;
    public final String department;
    public final String college;
    public final String year_level;
    public final String room;
    public final List<field> fields;
    public final String first;
    public final String second;
    public final String third;
    public final String fourth;
    public final String fifth;

    public Srpt_grade_sheet(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department, String college, String year_level, String room, String first, String second, String third, String fourth, String fifth) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.date = date;
        this.printed_by = printed_by;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.college = college;
        this.year_level = year_level;
        this.room = room;
        this.fields = new ArrayList();
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;

        this.fifth = fifth;
    }

    public static class field {

        int section_id;
        String subject_code;
        String description;
        double lec_units;
        double lab_units;
        int max_students;
        String faculty_id;
        String faculty_name;
        String section;
        String room;
        String day;
        String time;
        String student_no;
        String student_name;
        String course;
        String year_level;
        String contact_no;
        String email_address;
        int esls_id;
        double final_grade;
        double retake;
        String grade_remarks;
        String fb_name;
        String first;
        String second;
        String third;
        String fourth;
        String fifth;
        String sixth;
        String status;

        public field() {
        }

        public field(int section_id, String subject_code, String description, double lec_units, double lab_units, int max_students, String faculty_id, String faculty_name, String section, String room, String day, String time, String student_no, String student_name, String course, String year_level, String contact_no, String email_address, int esls_id, double final_grade, double retake, String grade_remarks, String fb_name, String first, String second, String third, String fourth, String fifth, String sixth, String status) {
            this.section_id = section_id;
            this.subject_code = subject_code;
            this.description = description;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
            this.max_students = max_students;
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
            this.section = section;
            this.room = room;
            this.day = day;
            this.time = time;
            this.student_no = student_no;
            this.student_name = student_name;
            this.course = course;
            this.year_level = year_level;
            this.contact_no = contact_no;
            this.email_address = email_address;
            this.esls_id = esls_id;
            this.final_grade = final_grade;
            this.retake = retake;
            this.grade_remarks = grade_remarks;
            this.fb_name = fb_name;
            this.first = first;
            this.second = second;
            this.third = third;
            this.fourth = fourth;
            this.fifth = fifth;
            this.sixth = sixth;
            this.status = status;
        }

        public String getSixth() {
            return sixth;
        }

        public void setSixth(String sixth) {
            this.sixth = sixth;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public String getThird() {
            return third;
        }

        public void setThird(String third) {
            this.third = third;
        }

        public String getFourth() {
            return fourth;
        }

        public void setFourth(String fourth) {
            this.fourth = fourth;
        }

        public String getFifth() {
            return fifth;
        }

        public void setFifth(String fifth) {
            this.fifth = fifth;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getRetake() {
            return retake;
        }

        public void setRetake(double retake) {
            this.retake = retake;
        }

        public String getFb_name() {
            return fb_name;
        }

        public void setFb_name(String fb_name) {
            this.fb_name = fb_name;
        }

        public double getFinal_grade() {
            return final_grade;
        }

        public void setFinal_grade(double final_grade) {
            this.final_grade = final_grade;
        }

        public String getGrade_remarks() {
            return grade_remarks;
        }

        public void setGrade_remarks(String grade_remarks) {
            this.grade_remarks = grade_remarks;
        }

        public int getEsls_id() {
            return esls_id;
        }

        public void setEsls_id(int esls_id) {
            this.esls_id = esls_id;
        }

        public String getContact_no() {
            return contact_no;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public String getEmail_address() {
            return email_address;
        }

        public void setEmail_address(String email_address) {
            this.email_address = email_address;
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

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getYear_level() {
            return year_level;
        }

        public void setYear_level(String year_level) {
            this.year_level = year_level;
        }

        public int getSection_id() {
            return section_id;
        }

        public void setSection_id(int section_id) {
            this.section_id = section_id;
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

        public int getMax_students() {
            return max_students;
        }

        public void setMax_students(int max_students) {
            this.max_students = max_students;
        }

        public String getFaculty_id() {
            return faculty_id;
        }

        public void setFaculty_id(String faculty_id) {
            this.faculty_id = faculty_id;
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

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
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
        String year_level = "";
        String room = "";

        List<Srpt_grade_sheet.field> fields = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int section_id = 1;
            String subject_code = "0001";
            String description = "Description";
            double lec_units = 3;
            double lab_units = 0;
            int max_students = 50;
            String faculty_id = "1";
            String faculty_name = "Faculty Name";
            String section = "A";
            String room1 = "202";
            String day = "MWF";
            String time = "10:00am - 11:00am";
            String student_no = "20200010";
            String student_name = "Juan dela Cruz" + i;
            String course = "OfCourse";
            String year_level1 = "First Year";
            String contact_no1 = "";
            String email_address = "";
            int esls_id = 0;
            double final_grade = 0;
            String grade_remarks = "";
            String fb_name = "";
            double retake = 0;
            String first = "";
            String second = "";
            String third = "";
            String fourth = "";
            String fifth = "";
            String sixth = "";
            String status = "";
            Srpt_grade_sheet.field f = new field(section_id, subject_code, description, lec_units, lab_units, max_students, faculty_id, faculty_name, section, room1, day, time, student_no, student_name, course, year_level1, contact_no1, email_address, esls_id, final_grade, retake, grade_remarks, fb_name, first, second, third, fourth, fifth, sixth, status);
            fields.add(f);
        }
        String first = "Prelim";
        String second = "Midterm";
        String third = "Prefinal";
        String fourth = "Final";
        String fifth = "";
        String jrxml = "rpt_class_list.jrxml";

        Srpt_grade_sheet rpt = new Srpt_grade_sheet(business_name, address, contact_no, date, printed_by, school_year, semester, department, college, year_level, room, first, second, third, fourth, fifth);

        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_grade_sheet.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_grade_sheet to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Srpt_grade_sheet.field> ret_data(List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> sections) {

        List<Srpt_grade_sheet.field> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
//            System.out.println("sections: " + sections.size());
            for (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections section : sections) {
//                System.out.println("id: "+section.id);
                String s0 = "select "
                        + "id"
                        + ",enrollment_offered_subject_section_id"
                        + ",enrollment_offered_subject_id"
                        + ",academic_offering_subject_id"
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
                        + ",faculty_id"
                        + ",faculty_name"
                        + ",section"
                        + ",room_id"
                        + ",room"
                        + ",schedule"
                        + ",day"
                        + ",time"
                        + ",start_time"
                        + ",closing_time"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + " from enrollment_offered_subject_section_instructors"
                        + " where enrollment_offered_subject_section_id='" + section.id + "' ";

                String my_faculty_id = "";
                String my_faculty_name = "";
                String my_room = "";
                String my_schedule = "";
                String my_day = "";
                String my_time = "";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(s0);
                while (rs.next()) {
                    int id = rs.getInt(1);
                    int enrollment_offered_subject_section_id = rs.getInt(2);
                    int enrollment_offered_subject_id = rs.getInt(3);
                    int academic_offering_subject_id = rs.getInt(4);
                    int academic_offering_id = rs.getInt(5);
                    int academic_year_id = rs.getInt(6);
                    String academic_year = rs.getString(7);
                    int level_id = rs.getInt(8);
                    String level = rs.getString(9);
                    int college_id = rs.getInt(10);
                    String college = rs.getString(11);
                    int department_id = rs.getInt(12);
                    String department = rs.getString(13);
                    int course_id = rs.getInt(14);
                    String course_code = rs.getString(15);
                    String course_description = rs.getString(16);
                    String term = rs.getString(17);
                    String year_level = rs.getString(18);
                    int subject_id = rs.getInt(19);
                    String subject_code = rs.getString(20);
                    String description = rs.getString(21);
                    my_faculty_id = rs.getString(22);
                    my_faculty_name = rs.getString(23);
                    String section1 = rs.getString(24);
                    int room_id = rs.getInt(25);
                    my_room = rs.getString(26);
                    my_schedule = rs.getString(27);
                    my_day = rs.getString(28);
                    my_day = cis.utils.DateType.mwf(my_day);

                    String start_time = rs.getString(30);
                    String closing_time = rs.getString(31);
                    String created_at = rs.getString(32);
                    String updated_at = rs.getString(33);
                    String created_by = rs.getString(34);
                    String updated_by = rs.getString(35);
                    int status = rs.getInt(36);
                    int is_uploaded = rs.getInt(37);

                }

                //check time
                String s3 = "select "
                        + " room "
                        + ", day"
                        + ",concat(start_time,'/',closing_time) as time"
                        + " from enrollment_offered_subject_section_room_schedules"
                        + " where enrollment_offered_subject_section_id='" + section.id + "'  "; //group by room_id

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);
                int i = 0;
                String day = "";
                while (rs3.next()) {
                    String day2 = rs3.getString(2);
                    String s = rs3.getString(3);
                    String[] ss = s.split("/");
                    String otime = ss[0];
                    String ctime = ss[1];
                    otime = DateType.convert_datetime_to_hour_minute(otime);
                    ctime = DateType.convert_datetime_to_hour_minute(ctime);
                    s = otime + "-" + ctime;
                    day2 = day2 + ": " + s;

                    if (i == 0) {
                        day = "&nbsp;&nbsp;" + day2;
                    } else {
                        day = day + "<br>" + "&nbsp;&nbsp;" + day2;
                    }
                    i++;
                }
                my_time = day;
                if (!my_time.isEmpty()) {
                    my_time = DateType.daytime(my_time);
                }
                my_time = my_time.replaceAll("WFM", "MWF");
                my_time = my_time.replaceAll("FM", "MF");
//                System.out.println("my_time: "+my_time);
                //<editor-fold defaultstate="collapsed" desc=" students ">
                String s2 = "select "
                        + "id"
                        + ",student_id"
                        + ",student_no"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",course_id"
                        + ",course_code"
                        + ",course_description"
                        + ",term"
                        + ",year_level"
                        + ",final_grade"
                        + ",ifnull(final_grade_remarks,'')"
                        + ",retake"
                        + " from enrollment_student_loaded_subjects"
                        + " where enrollment_offered_subject_section_id ='" + section.id + "' and status=1 order by lname asc ";
//                System.out.println("section.id: "+section.id);
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                while (rs2.next()) {
                    int id2 = rs2.getInt(1);
                    int student_id = rs2.getInt(2);
                    String student_no = rs2.getString(3);
                    String fname = rs2.getString(4);
                    String mi = rs2.getString(5);
                    String lname = rs2.getString(6);
                    int course_id2 = rs2.getInt(7);
                    String course_code2 = rs2.getString(8);
                    String course_description2 = rs2.getString(9);
                    String term2 = rs2.getString(10);
                    String year_level2 = rs2.getString(11);
                    double final_grade = rs2.getDouble(12);
                    String grade_remarks = rs2.getString(13);
                    double retake = rs2.getDouble(14);
                    int section_id = section.id;

                    double lec_units = section.lecture_units;
                    double lab_units = section.lab_units;
                    int max_students = section.max_students;

                    String student_name = lname + ", " + fname + " " + mi;
                    String course = course_code2;
                    String year_level1 = year_level2;

                    String contact_no1 = "";
                    String email_address = "";
                    int college_id = 0;
                    String fb_name = "";
                    String s4 = "select "
                            + "student_no"
                            + ",mobile_no"
                            + ",email_address"
                            + ",college_id"
                            + ",fb_account"
                            + " from students"
                            + " where id ='" + student_id + "' ";
                    Statement stmt4 = conn.createStatement();
                    ResultSet rs4 = stmt4.executeQuery(s4);
                    if (rs4.next()) {
                        contact_no1 = rs4.getString(2);
                        email_address = rs4.getString(3);
                        college_id = rs4.getInt(4);
                        fb_name = rs4.getString(5);
                    }

                    String first = "";
                    String second = "";
                    String third = "";
                    String fourth = "";
                    String fifth = "";
                    String sixth = "";
                    String status = "";
                    String s5 = "select "
                            + "ifnull(first,'')"
                            + ",ifnull(second,'')"
                            + ",ifnull(third,'')"
                            + ",ifnull(fourth,'')"
                            + ",ifnull(fifth,'')"
                            + ",ifnull(sixth,'')"
                            + ",ifnull(status,'') "
                            + " from enrollment_student_loaded_subject_grades "
                            + "where enrollment_student_loaded_subject_id='" + id2 + "' limit 1";
                    Statement stmt5 = conn.createStatement();
                    ResultSet rs5 = stmt5.executeQuery(s5);
                    if (rs5.next()) {
                        first = rs5.getString(1);
                        second = rs5.getString(2);
                        third = rs5.getString(3);
                        fourth = rs5.getString(4);
                        fifth = rs5.getString(5);
                        sixth = rs5.getString(6);
                        status = rs5.getString(7);
                    }

                    Srpt_grade_sheet.field f = new Srpt_grade_sheet.field(section_id, section.subject_code, section.description, lec_units,
                                                                          lab_units, max_students, my_faculty_id, my_faculty_name,
                                                                          section.section, my_room, my_day, my_time, student_no, student_name, course, year_level1, contact_no1, email_address, id2, final_grade, retake, grade_remarks, fb_name, first, second, third, fourth, fifth, sixth, status);

                    datas.add(f);

                }
                //</editor-fold>
            }

            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Srpt_grade_sheet.field> ret_data2(List<Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections> sections, int college_id1, String year_level3, int course_id1) {

        List<Srpt_grade_sheet.field> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
//            System.out.println("sections: " + sections.size());
            for (Enrollment_offered_subject_sections.to_enrollment_offered_subject_sections section : sections) {
//                System.out.println("id: "+section.id);
                String s0 = "select "
                        + "id"
                        + ",enrollment_offered_subject_section_id"
                        + ",enrollment_offered_subject_id"
                        + ",academic_offering_subject_id"
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
                        + ",faculty_id"
                        + ",faculty_name"
                        + ",section"
                        + ",room_id"
                        + ",room"
                        + ",schedule"
                        + ",day"
                        + ",time"
                        + ",start_time"
                        + ",closing_time"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",is_uploaded"
                        + " from enrollment_offered_subject_section_instructors"
                        + " where enrollment_offered_subject_section_id='" + section.id + "' ";

                String my_faculty_id = "";
                String my_faculty_name = "";
                String my_room = "";
                String my_schedule = "";
                String my_day = "";
                String my_time = "";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(s0);
                while (rs.next()) {
                    int id = rs.getInt(1);
                    int enrollment_offered_subject_section_id = rs.getInt(2);
                    int enrollment_offered_subject_id = rs.getInt(3);
                    int academic_offering_subject_id = rs.getInt(4);
                    int academic_offering_id = rs.getInt(5);
                    int academic_year_id = rs.getInt(6);
                    String academic_year = rs.getString(7);
                    int level_id = rs.getInt(8);
                    String level = rs.getString(9);
                    int college_id = rs.getInt(10);
                    String college = rs.getString(11);
                    int department_id = rs.getInt(12);
                    String department = rs.getString(13);
                    int course_id = rs.getInt(14);
                    String course_code = rs.getString(15);
                    String course_description = rs.getString(16);
                    String term = rs.getString(17);
                    String year_level = rs.getString(18);
                    int subject_id = rs.getInt(19);
                    String subject_code = rs.getString(20);
                    String description = rs.getString(21);
                    my_faculty_id = rs.getString(22);
                    my_faculty_name = rs.getString(23);
                    String section1 = rs.getString(24);
                    int room_id = rs.getInt(25);
                    my_room = rs.getString(26);
                    my_schedule = rs.getString(27);
                    my_day = rs.getString(28);
                    my_day = cis.utils.DateType.mwf(my_day);

                    String start_time = rs.getString(30);
                    String closing_time = rs.getString(31);
                    String created_at = rs.getString(32);
                    String updated_at = rs.getString(33);
                    String created_by = rs.getString(34);
                    String updated_by = rs.getString(35);
                    int status = rs.getInt(36);
                    int is_uploaded = rs.getInt(37);

                }

                //check time
                String s3 = "select "
                        + " room "
                        + ", day"
                        + ",concat(start_time,'/',closing_time) as time"
                        + " from enrollment_offered_subject_section_room_schedules"
                        + " where enrollment_offered_subject_section_id='" + section.id + "'  "; //group by room_id

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);
                int i = 0;
                String day = "";
                while (rs3.next()) {
                    String day2 = rs3.getString(2);
                    String s = rs3.getString(3);
                    String[] ss = s.split("/");
                    String otime = ss[0];
                    String ctime = ss[1];
                    otime = DateType.convert_datetime_to_hour_minute(otime);
                    ctime = DateType.convert_datetime_to_hour_minute(ctime);
                    s = otime + "-" + ctime;
                    day2 = day2 + ": " + s;

                    if (i == 0) {
                        day = "&nbsp;&nbsp;" + day2;
                    } else {
                        day = day + "<br>" + "&nbsp;&nbsp;" + day2;
                    }
                    i++;
                }
                my_time = day;
                if (!my_time.isEmpty()) {
                    my_time = DateType.daytime(my_time);
                }
                my_time = my_time.replaceAll("WFM", "MWF");
                my_time = my_time.replaceAll("FM", "MF");
//                System.out.println("my_time: "+my_time);
                //<editor-fold defaultstate="collapsed" desc=" students ">
                String s2 = "select "
                        + "id"
                        + ",student_id"
                        + ",student_no"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",course_id"
                        + ",course_code"
                        + ",course_description"
                        + ",term"
                        + ",year_level"
                        + ",final_grade"
                        + ",ifnull(final_grade_remarks,'')"
                        + ",retake"
                        + " from enrollment_student_loaded_subjects"
                        + " where enrollment_offered_subject_section_id ='" + section.id + "' and status=1 order by lname asc ";
//                System.out.println("section.id: "+section.id);
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                while (rs2.next()) {
                    int id2 = rs2.getInt(1);
                    int student_id = rs2.getInt(2);
                    String student_no = rs2.getString(3);
                    String fname = rs2.getString(4);
                    String mi = rs2.getString(5);
                    String lname = rs2.getString(6);
                    int course_id2 = rs2.getInt(7);
                    String course_code2 = rs2.getString(8);
                    String course_description2 = rs2.getString(9);
                    String term2 = rs2.getString(10);
                    String year_level2 = rs2.getString(11);
                    double final_grade = rs2.getDouble(12);
                    String grade_remarks = rs2.getString(13);
                    double retake = rs2.getDouble(14);
                    int section_id = section.id;

                    double lec_units = section.lecture_units;
                    double lab_units = section.lab_units;
                    int max_students = section.max_students;

                    String student_name = lname + ", " + fname + " " + mi;
                    String course = course_code2;
                    String year_level1 = year_level2;

                    String contact_no1 = "";
                    String email_address = "";
                    int college_id = 0;
                    String fb_name = "";
                    String s4 = "select "
                            + "student_no"
                            + ",mobile_no"
                            + ",email_address"
                            + ",college_id"
                            + ",fb_account"
                            + " from students"
                            + " where id ='" + student_id + "' ";
                    Statement stmt4 = conn.createStatement();
                    ResultSet rs4 = stmt4.executeQuery(s4);
                    if (rs4.next()) {
                        contact_no1 = rs4.getString(2);
                        email_address = rs4.getString(3);
                        college_id = rs4.getInt(4);
                        fb_name = rs4.getString(5);
                    }

                    String first = "";
                    String second = "";
                    String third = "";
                    String fourth = "";
                    String fifth = "";
                    String sixth = "";
                    String status = "";
                    String s5 = "select "
                            + " first"
                            + ",second"
                            + ",third"
                            + ",fourth"
                            + ",fifth"
                            + ",sixth"
                            + ",remarks"
                            + " from enrollment_student_loaded_subject_grades "
                            + " where enrollment_student_loaded_subject_id='" + id2 + "' order by id desc limit 1";
//                    System.out.println("id2: "+id2);
                    Statement stmt5 = conn.createStatement();
                    ResultSet rs5 = stmt5.executeQuery(s5);
                    if (rs5.next()) {
                        first = zero(rs5.getString(1));
                        second = zero(rs5.getString(2));
                        third = zero(rs5.getString(3));
                        fourth = zero(rs5.getString(4));
                        fifth = zero(rs5.getString(5));
                        sixth = zero(rs5.getString(6));
                        status = rs5.getString(7);
                    }

                    Srpt_grade_sheet.field f = new Srpt_grade_sheet.field(section_id, section.subject_code, section.description, lec_units,
                                                                          lab_units, max_students, my_faculty_id, my_faculty_name,
                                                                          section.section, my_room, my_day, my_time, student_no, student_name, course, year_level1, contact_no1, email_address, id2, final_grade, retake, grade_remarks, fb_name, first, second, third, fourth, fifth, sixth, status);

                    if (course_id1 == 0) {
                        if (college_id1 == 0) {

                            if (year_level3.equalsIgnoreCase("All")) {
                                datas.add(f);
                            } else {
                                if (year_level1.equalsIgnoreCase(year_level3)) {
                                    datas.add(f);
                                }
                            }
                        } else {

                            if (college_id1 == college_id) {
                                if (year_level3.equalsIgnoreCase("All")) {
                                    datas.add(f);
                                } else {
                                    if (year_level1.equalsIgnoreCase(year_level3)) {
                                        datas.add(f);
                                    }
                                }

                            }
                        }
                    } else {
                        if (course_id1 == course_id2) {
                            if (college_id1 == 0) {
                                if (year_level3.equalsIgnoreCase("All")) {
                                    datas.add(f);
                                } else {
                                    if (year_level1.equalsIgnoreCase(year_level3)) {
                                        datas.add(f);
                                    }
                                }
                            } else {

                                if (college_id1 == college_id) {
                                    if (year_level3.equalsIgnoreCase("All")) {
                                        datas.add(f);
                                    } else {
                                        if (year_level1.equalsIgnoreCase(year_level3)) {
                                            datas.add(f);
                                        }
                                    }

                                }
                            }
                        }
                    }

                }
                //</editor-fold>
            }

            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    private static String zero(String stmt) {
        if (stmt.equalsIgnoreCase("0")) {
            return "";
        } else if (stmt == null) {
            return null;
        } else {
            return FitIn.fmt_wc_0(stmt);
        }
    }
}

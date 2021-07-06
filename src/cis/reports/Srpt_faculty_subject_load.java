/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.faculty_members.Faculty_members;
import static cis.reports.Srpt_class_list.get_viewer;
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
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author User
 */
public class Srpt_faculty_subject_load {

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

    public Srpt_faculty_subject_load(String business_name, String address, String contact_no, String date, String printed_by, String school_year, String semester, String department, String college) {
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

        String faculty_id;
        String faculty_name;
        int subject_id;
        String subject_description;
        String subject_code;
        String day;
        String time;
        double lec_units;
        double lab_units;
        String room;
        int no_of_students;
        String section;
        int eoss_id;

        public field() {
        }

        public field(String faculty_id, String faculty_name, int subject_id, String subject_description, String subject_code, String day, String time, double lec_units, double lab_units, String room, int no_of_students, String section, int eoss_id) {
            this.faculty_id = faculty_id;
            this.faculty_name = faculty_name;
            this.subject_id = subject_id;
            this.subject_description = subject_description;
            this.subject_code = subject_code;
            this.day = day;
            this.time = time;
            this.lec_units = lec_units;
            this.lab_units = lab_units;
            this.room = room;
            this.no_of_students = no_of_students;
            this.section = section;
            this.eoss_id = eoss_id;
        }

        public int getEoss_id() {
            return eoss_id;
        }

        public void setEoss_id(int eoss_id) {
            this.eoss_id = eoss_id;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
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

        public int getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(int subject_id) {
            this.subject_id = subject_id;
        }

        public String getSubject_description() {
            return subject_description;
        }

        public void setSubject_description(String subject_description) {
            this.subject_description = subject_description;
        }

        public String getSubject_code() {
            return subject_code;
        }

        public void setSubject_code(String subject_code) {
            this.subject_code = subject_code;
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

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public int getNo_of_students() {
            return no_of_students;
        }

        public void setNo_of_students(int no_of_students) {
            this.no_of_students = no_of_students;
        }
    }

    public static void main(String[] args) {
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");

        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");
        String date = DateType.slash.format(new Date());
        String contact_no = System.getProperty("contact_no", "(035) 225 4831");
        String printed_by = "Administrator";
        String school_year = "2020 - 2021";
        String semester = "First Semester";
        String department = "";
        String college = "";

        String where = " where id<>0 ";
        List<Faculty_members.to_faculty_members> members = Faculty_members.ret_data("order by lname asc ");
        List<field> fields = ret_data(members, where, "",9);
        String jrxml = "rpt_faculty_subject_loads.jrxml";

        Srpt_faculty_subject_load rpt = new Srpt_faculty_subject_load(business_name, address, contact_no, date, printed_by, school_year, semester, department, college);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_faculty_subject_load.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_faculty_subject_load to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<field> ret_data(List<Faculty_members.to_faculty_members> members, String where, String period, int academic_year_id1) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            for (Faculty_members.to_faculty_members faculty : members) {
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
                        + " from enrollment_offered_subject_section_instructors "
                        + " " + where + " and faculty_id='" + faculty.id + "' and term like '" + period + "' "
                        + " and academic_year_id='" + academic_year_id1 + "' "
                        + " order by description asc ";
//                        + " group by enrollment_offered_subject_section_id ";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(s0);

                String my_faculty_id = "";
                String my_faculty_name = "";
                String my_room = "";
                String my_schedule = "";
                String my_day = "";
                String my_time = "";

                String faculty_id = "";
                String faculty_name = "";
                int subject_id = 0;
                String subject_description = "";
                String subject_code = "F";
                String day = "";
                String time = "";
                double lec_units = 0;
                double lab_units = 0;
                String room = "";
                int no_of_students = 0;
                String section = "";
                int enrollment_offered_subject_section_id = 0;
                while (rs.next()) {
                    int id = rs.getInt(1);

                    enrollment_offered_subject_section_id = rs.getInt(2);
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
                    subject_id = rs.getInt(19);
                    subject_code = rs.getString(20);
                    subject_description = rs.getString(21);
                    faculty_id = rs.getString(22);
                    faculty_name = rs.getString(23);
                    section = rs.getString(24);

                    int room_id = rs.getInt(25);
                    room = rs.getString(26);
                    String schedule = rs.getString(27);
                    day = rs.getString(28);
                    time = rs.getString(29);
                    String start_time = rs.getString(30);
                    String closing_time = rs.getString(31);
                    String created_at = rs.getString(32);
                    String updated_at = rs.getString(33);
                    String created_by = rs.getString(34);
                    String updated_by = rs.getString(35);
                    int status = rs.getInt(36);
                    int is_uploaded = rs.getInt(37);

                    //<editor-fold defaultstate="collapsed" desc=" Search units ">
                    String s2 = "select "
                            + " id "
                            + ", lecture_units"
                            + ", lab_units"
                            + " from enrollment_offered_subject_sections"
                            + " where id='" + enrollment_offered_subject_section_id + "'   ";

                    Statement stmt2 = conn.createStatement();
                    ResultSet rs2 = stmt2.executeQuery(s2);
                    while (rs2.next()) {
                        int id2 = rs2.getInt(1);
                        lec_units = rs2.getInt(2);
                        lab_units = rs2.getInt(3);

                    }
                    //</editor-fold>

                    String s3 = "select "
                            + " room "
                            + ", day"
                            + ",concat(start_time,'/',closing_time) as time"
                            + " from enrollment_offered_subject_section_room_schedules"
                            + " where enrollment_offered_subject_section_id='" + enrollment_offered_subject_section_id + "'  "; //group by room_id

                    Statement stmt3 = conn.createStatement();
                    ResultSet rs3 = stmt3.executeQuery(s3);
                    int i = 0;
                    day = "";
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
                    String[] stamp = new String[2];
                    if (!my_time.isEmpty()) {
                        stamp = DateType.daytime2(my_time);
                    }
                    String day1 = stamp[0];
                    String time1 = stamp[1];
                    day1 = day1.replaceAll("WFM", "MWF");
                    day1 = day1.replaceAll("FM", "MF");

                    //<editor-fold defaultstate="collapsed" desc=" Check Students Count ">
                    String s4 = "select "
                            + "count(id)"
                            + " from enrollment_student_loaded_subjects"
                            + " where enrollment_offered_subject_section_id ='" + enrollment_offered_subject_section_id + "' and status=1 order by lname asc ";

                    Statement stmt4 = conn.createStatement();
                    ResultSet rs4 = stmt4.executeQuery(s4);
                    while (rs4.next()) {
                        no_of_students = rs4.getInt(1);
                    }
                    //</editor-fold>
//                    System.out.println("subject_description: "+subject_description);
                    field f = new field(faculty_id, faculty_name, subject_id, subject_description, subject_code, day1, time1, lec_units, lab_units, room, no_of_students, section, enrollment_offered_subject_section_id);
                    datas.add(f);
                }

            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

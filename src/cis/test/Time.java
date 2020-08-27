/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.test;

import cis.enrollments.Enrollment_offered_subject_section_room_schedules;
import cis.enrollments.Enrollment_offered_subject_section_room_schedules.to_enrollment_offered_subject_section_room_schedules;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import synsoftech.util.DateType;

/**
 *
 * @author User
 */
public class Time {

    public static class field {

        String day;
        String time;

        public field(String day, String time) {
            this.day = day;
            this.time = time;
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

    public static void main3(String[] args) {
//        where day like '%%' and enrollment_offered_subject_section_id='79' order by start_time asc 
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "password");
        List<String> days = new ArrayList();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        String room = "MM7";
        String time1 = "2019-01-01 12:00:00.0";
        String time2 = "2019-01-01 15:00:00.0";

        String where = " where day like '%" + "" + "%' and enrollment_offered_subject_section_id='" + "434" + "' order by start_time asc ";
        List<to_enrollment_offered_subject_section_room_schedules> datas = Enrollment_offered_subject_section_room_schedules.ret_data(where);

        for (to_enrollment_offered_subject_section_room_schedules to : datas) {
            
            for (String day : days) {

                if (room.equalsIgnoreCase(to.room) && day.equalsIgnoreCase(to.day)) {
                    try {
                        Date min = DateType.datetime.parse(to.start_time);
                        Date max = DateType.datetime.parse(to.closing_time);
                        Date d1 = DateType.datetime.parse(time1);

                        boolean ret = d1.compareTo(min) >= 0 && d1.compareTo(max) <= 0;
                        if (!ret) {

                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        String time = "&nbsp;&nbsp;Tuesday: 03:00 PM-04:00 PM"
                + "<br>&nbsp;&nbsp;Thursday: 03:00 PM-04:00 PM"
                + "<br>&nbsp;&nbsp;Saturday: 03:00 PM-04:00 PM"
                + "<br>&nbsp;&nbsp;Saturday: 04:00 PM-05:00 PM";
        String[] split = time.split("<br>");
        List<field> fields = new ArrayList();
        for (String s : split) {
            String t1 = s.replaceAll("&nbsp;&nbsp;", "");
            int index1 = t1.indexOf(":");
            String t2 = t1.substring(index1 + 2, t1.length());
            String t3 = t1.substring(0, index1);

            int exists = 0;
            for (field f1 : fields) {
                if (f1.time.equalsIgnoreCase(t2)) {
                    exists = 1;
                    String d = setDay(t3);
                    f1.setDay(f1.getDay() + d);
                    break;
                }
            }
            if (exists == 0) {
                String d = setDay(t3);
                field f = new field(d, t2);
                fields.add(f);
            }
        }
        String day = "";
        int i = 0;
        for (field f1 : fields) {
            if (i == 0) {
                day = f1.day + " " + f1.time;
            } else {
                day = day + ", " + f1.day + " " + f1.time;
            }
            i++;
        }
        System.out.println(day);
    }

    private static String setDay(String day) {
        if (day.equalsIgnoreCase("Monday")) {
            return "M";
        } else if (day.equalsIgnoreCase("Tuesday")) {
            return "T";
        } else if (day.equalsIgnoreCase("Wednesday")) {
            return "W";
        } else if (day.equalsIgnoreCase("Thursday")) {
            return "Th";
        } else if (day.equalsIgnoreCase("Friday")) {
            return "F";
        } else if (day.equalsIgnoreCase("Saturday")) {
            return "S";
        } else {
            return "Su";
        }
    }
}

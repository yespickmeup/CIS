/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.test;

import java.util.ArrayList;
import java.util.List;

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

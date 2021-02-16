/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.test;

import cis.utils.DateType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mijzcx.synapse.desk.utils.FitIn;
import static java.lang.Integer.compare;

/**
 *
 * @author User
 */
public class DayCheck {

    public static void main(String[] args) {

//        String eos = "&nbsp;&nbsp;Monday: 01:00 PM-02:00 PM<br>&nbsp;&nbsp;Wednesday: 01:00 PM-02:00 PM";
        String eos = "&nbsp;&nbsp;Tuesday: 02:30 PM-04:00 PM<br>&nbsp;&nbsp;Thursday: 05:30 PM-07:00 PM";

        List<String> schedules = new ArrayList();
        schedules.add("&nbsp;&nbsp;Tuesday: 02:30 PM-04:00 PM<br>&nbsp;&nbsp;Thursday: 05:30 PM-07:00 PM");
        schedules.add("&nbsp;&nbsp;Tuesday: 02:30 PM-04:00 PM<br>&nbsp;&nbsp;Thursday: 05:30 PM-07:00 PM");
        schedules.add("&nbsp;&nbsp;Tuesday: 02:30 PM-04:00 PM<br>&nbsp;&nbsp;Thursday: 05:30 PM-07:00 PM");
        schedules.add("&nbsp;&nbsp;Tuesday: 02:30 PM-04:00 PM<br>&nbsp;&nbsp;Thursday: 05:30 PM-07:00 PM");

        compare_schedule(eos, schedules);
    }

    public static boolean compare_schedule(String eos, List<String> schedules) {
        String[] eos_list = eos.split("<br>");
        boolean not_available = false;
        for (int i = 0; i < eos_list.length; i++) {

            String eos_days = eos_list[i];
            eos_days = eos_days.replaceAll("&nbsp;&nbsp;", "");

            String[] eos_day = eos_days.split(": ");
            String day1 = eos_day[0];
//            System.out.println("eos_days: " + eos_days);
            for (String schedule : schedules) {
                boolean is_not_available = false;
                if (schedule.contains(day1)) {
                    String[] schedule_list = schedule.split("<br>");
                    for (int ii = 0; ii < schedule_list.length; ii++) {
                        String schedule_days = schedule_list[ii];
                        schedule_days = schedule_days.replaceAll("&nbsp;&nbsp;", "");
                        boolean check = check(schedule_days, eos_days);
//                        System.out.println("eos_days: " + eos_days + " & " + schedule_days + " = " + check);
                        if (check) {
                            is_not_available = true;
                            break;
                        }
                    }
                }
                if (is_not_available) {

                    not_available = true;
                    break;
                }
            }
            if (not_available) {
                break;
            }
        }

        return not_available;
    }

    public static boolean check(String stmt, String to_add) {

        String[] dates = convertFromTo(stmt);
        String[] now = convertFromTo(to_add);
        boolean exists1 = false;
        boolean exists2 = false;
        try {
            Date d1 = DateType.datetime3.parse(dates[0]);
            Date d2 = DateType.datetime3.parse(dates[1]);

            Date d3 = DateType.datetime3.parse(now[0]);
            Date d4 = DateType.datetime3.parse(now[1]);

            String day = DateType.d2.format(d1);
            double from_time = FitIn.toDouble(DateType.time4.format(d1).replaceAll(":", "."));
            double to_time = FitIn.toDouble(DateType.time4.format(d2).replaceAll(":", "."));

            String c_day = DateType.d2.format(d3);
            double c_from_time = FitIn.toDouble(DateType.time4.format(d3).replaceAll(":", "."));
            double c_to_time = FitIn.toDouble(DateType.time4.format(d4).replaceAll(":", "."));

            if (day.equalsIgnoreCase(c_day)) {

                if (d1.compareTo(d3) * d3.compareTo(d1) == 0) {
                    int aw = d1.compareTo(d3) * d3.compareTo(d1);
//                    System.out.println("d3: " + d3 + " = " + d1 + " & " + d2 + " --- " + aw);
                    exists1 = true;
                } else {
                    int aw2 = d1.compareTo(d4) * d4.compareTo(d1);
//                    System.out.println("d4: " + d4 + " = " + d1 + " & " + d2 + " --- " + aw2);
                    if (aw2 == 0) {
                        exists2 = true;
                    }
                }
                if (c_to_time == from_time) {
                    exists1 = false;
                    exists2 = false;
                }

            }

        } catch (ParseException ex) {
            return false;
        }
        if (exists1 || exists2) {
            return true;
        } else {
            return false;
        }
    }

    private static String[] convertFromTo(String stmt) {
        String[] d = stmt.split(": ");
        String day = d[0];
        String[] t = d[1].split("-");
        String t1 = t[0];
        String t2 = t[1];

        String from = "";
        String to = "";
        if (day.equals("Monday")) {
            from = "2021-02-01 " + t1;
            to = "2021-02-01 " + t2;
        }
        if (day.equals("Tuesday")) {
            from = "2021-02-02 " + t1;
            to = "2021-02-02 " + t2;
        }
        if (day.equals("Wednesday")) {
            from = "2021-02-03 " + t1;
            to = "2021-02-03 " + t2;
        }
        if (day.equals("Thursday")) {
            from = "2021-02-04 " + t1;
            to = "2021-02-04 " + t2;
        }
        if (day.equals("Friday")) {
            from = "2021-02-05 " + t1;
            to = "2021-02-05 " + t2;
        }
        if (day.equals("Saturday")) {
            from = "2021-02-06 " + t1;
            to = "2021-02-06 " + t2;
        }
        if (day.equals("Sunday")) {
            from = "2021-02-07 " + t1;
            to = "2021-02-07 " + t2;
        }

        String[] dates = new String[2];
        dates[0] = from;
        dates[1] = to;
        return dates;

    }
}

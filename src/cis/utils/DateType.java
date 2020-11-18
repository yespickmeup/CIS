/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Dummy
 */
public class DateType {

    public static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat sf2 = new SimpleDateFormat("MM-dd-yyyy");
    public static SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat datetime2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
    public static SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss aa");
    public static SimpleDateFormat time2 = new SimpleDateFormat("HH:mm aa");
    public static SimpleDateFormat sf1 = new SimpleDateFormat("EEE, MMM dd,yyyy");
    public static SimpleDateFormat d = new SimpleDateFormat("dd");
    public static SimpleDateFormat m = new SimpleDateFormat("MMMMMMMMMMM");
    public static SimpleDateFormat m1 = new SimpleDateFormat("MM");
    public static SimpleDateFormat y = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat liquid = new SimpleDateFormat("EEEEEEEEEEE dd MMMMMMMMMMM yyyy");
    public static SimpleDateFormat day = new SimpleDateFormat("EEEEEEEEEEE");
    public static SimpleDateFormat day_1 = new SimpleDateFormat("EEEEEEEEEEE dd");
    public static SimpleDateFormat month_year = new SimpleDateFormat("MMMMMMMMMMM yyyy");
    public static SimpleDateFormat month_date = new SimpleDateFormat("MMMMMMMMMM dd, yyyy");
    public static SimpleDateFormat month_date2 = new SimpleDateFormat("MMMMMMMMMM dd yyyy");
    public static SimpleDateFormat day_and_time = new SimpleDateFormat("MMMMMMMMMM dd, yyyy HH:mm aa");
    public static SimpleDateFormat slash = new SimpleDateFormat("MM/dd/yyyy");
    public static SimpleDateFormat slash_w_time = new SimpleDateFormat("MM/dd/yyyy HH:mm aa");
    public static SimpleDateFormat slash_w_time2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss aa");
    public static SimpleDateFormat slash_w_time3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
    public static SimpleDateFormat hour_minute = new SimpleDateFormat("HH:mm:ss");
    public static SimpleDateFormat hour_minute2 = new SimpleDateFormat("HH:mm aa");
    public static SimpleDateFormat hour_minute3 = new SimpleDateFormat("hh:mm aa");
    public static SimpleDateFormat hour = new SimpleDateFormat("HH");
    public static SimpleDateFormat minute = new SimpleDateFormat("mm");
    public static SimpleDateFormat second = new SimpleDateFormat("ss");
    public static SimpleDateFormat time3 = new SimpleDateFormat("hh:mm:ss aa");
    public static SimpleDateFormat backup = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

    public static void main(String[] args) {
        System.out.println(sf1.format(new Date()));
    }

    public static String convert_jan_1_2013_datetime(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.day_and_time.format(d);
        return date;
    }

    public static String convert_jan_1_2013_datetime2(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.month_date.format(d);
        return date;
    }

    public static String convert_jan_1_2013_sf(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.month_date.format(d);
        return date;
    }

    public static String convert_slash_datetime(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.slash.format(d);
        return date;
    }

    public static String convert_slash_datetime3(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.slash_w_time.format(d);
        return date;
    }

    public static String convert_slash_datetime4(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.hour_minute2.format(d);
        return date;
    }

    public static String convert_slash_datetime5(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.slash_w_time3.format(new Date());
        }
        try {
            d = DateType.slash_w_time3.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.datetime.format(d);
        return date;
    }

    public static String convert_slash_datetime2(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.slash.format(d);
        return date;
    }

    public static String convert_slash_datetime_sf(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.slash.format(new Date());
        }
        try {
            d = DateType.slash.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_dash_date(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.month_date.format(d);
        return date;
    }

    public static String convert_monthDate_sf(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.month_date.format(new Date());
        }
        try {
            d = DateType.month_date.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_dash_date2(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.slash.format(d);
        return date;
    }

    public static String convert_dash_date5(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.slash.format(new Date());
        }
        try {
            d = DateType.slash.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_dash_date3(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.month_date2.format(new Date());
        }
        try {
            d = DateType.month_date2.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_datetime_to_month(String datetime) {
        String date = "";

        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.m.format(d);
        return date;
    }

    public static String convert_datetime_to_hour_minute(String datetime) {
        String date = "";

        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.hour_minute3.format(d);
        return date;
    }

    public static List<String> listMonths() {
        List<String> datas = new ArrayList();
        datas.add("January");
        datas.add("February");
        datas.add("March");
        datas.add("April");
        datas.add("May");
        datas.add("June");
        datas.add("July");
        datas.add("August");
        datas.add("September");
        datas.add("October");
        datas.add("November");
        datas.add("December");
        return datas;
    }

    public static String now() {
        Date d = new Date();
        String s = DateType.datetime.format(d);
        return s;
    }

    public static String mDate_to_Date(String m) {
        Date d = new Date();
        try {
            d = DateType.month_date.parse(m);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        String s = DateType.sf.format(d);
        return s;
    }

    public static String noMonth(String month) {
        String ret = "";
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            String mon = months[i];
            if (mon.equalsIgnoreCase(month)) {
                String s = "" + mon;
                if (s.length() == 1) {
                    s = "0" + mon;
                }
                ret = s;
                break;
            }
        }
        return ret;
    }

    public static List<String> listDays() {
        List<String> datas = new ArrayList();
        for (int i = 1; i < 32; i++) {
            String s = "" + i;
            if (s.length() == 1) {
                s = "0" + s;
            }
            datas.add(s);
        }
        return datas;
    }

    public static List<String> listYear() {
        List<String> datas = new ArrayList();
        int year = FitIn.toInt(DateType.y.format(new Date()));
        for (int i = 1993; i < year; i++) {
            String s = "" + i;
            if (s.length() == 1) {
                s = "0" + s;
            }
            datas.add(s);
        }
        return datas;
    }

    public static String add_zero(String day) {

        if (day.length() == 1) {
            day = "0" + day;
        }
        return day;
    }

    public static String mwf(String stmt) {
        List<String> s = new ArrayList();
        if (stmt.contains("Monday")) {
            s.add("M");
        }
        if (stmt.contains("Tuesday")) {
            s.add("T");
        }
        if (stmt.contains("Wednesday")) {
            s.add("W");
        }
        if (stmt.contains("Thursday")) {
            s.add("Th");
        }
        if (stmt.contains("Friday")) {
            s.add("F");
        }
        if (stmt.contains("Saturday")) {
            s.add("S");
        }
        if (stmt.contains("Sunday")) {
            s.add("Su");
        }
        String listString = String.join("", s);
        return listString;
    }

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

    public static String daytime(String time2) {
        String[] split = time2.split("<br>");
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
        return day;
    }

    public static String[] daytime2(String time2) {
        String[] split = time2.split("<br>");
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
        String time = "";
        int i = 0;
        for (field f1 : fields) {
            if (i == 0) {
                day = f1.day;
                time = f1.time;
            } else {
                day = day + ", " + f1.day;
                time = time + ", " + f1.time;
            }
            i++;
        }
        String[] ret=new String[2];
        ret[0] = day;
        ret[1] = time;
        return ret;
    }

    public static String setDay(String day) {
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

    public static int calculateAge(int year, int month, int day) {
        LocalDate start = LocalDate.of(year, month, day);
        LocalDate end = LocalDate.now();
        long years = ChronoUnit.YEARS.between(start, end);
        return FitIn.toInt("" + years);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.reports.Srpt_teachers_load;
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
 * @author USER
 */
public class Srpt_collections {

    public final String business_name;
    public final String address;
    public final String contact_no;
    public final String school_year;
    public final String semester;
    public final String department;
    public final String college;
    public final String year_level;
    public final String user;
    public final String date;
    public final String printed_by;
    public final double cashin_beg;
    public final double cash_sales;
    public final double receipts_total;
    public final double receipts_line_discount;
    public final double receipts_sale_discount;
    public final double receipts_sub_total;
    public final double receipt_net_total;
    public final double check_amount;
    public final double credit_card_amount;
    public final double gc_amount;
    public final double online_amount;
    public final double bills_thousand;
    public final double bills_five_hundred;
    public final double bills_two_hundred;
    public final double bills_one_hundred;
    public final double bills_fifty;
    public final double bills_twenty;
    public final double coins_ten;
    public final double coins_five;
    public final double coins_one;
    public final double coins_point_fifty;
    public final double coins_point_twenty_five;
    public final double coins_point_ten;
    public final double coins_point_zero_five;
    public final double count_bills_thousand;
    public final double count_bills_five_hundred;
    public final double count_bills_two_hundred;
    public final double count_bills_one_hundred;
    public final double count_bills_fifty;
    public final double count_bills_twenty;
    public final double count_coins_ten;
    public final double count_coins_five;
    public final double count_coins_one;
    public final double count_coins_point_fifty;
    public final double count_coins_point_twenty_five;
    public final double count_coins_point_ten;
    public final double count_coins_point_zero_five;
    public final double cc_total;
    public final double cc_last_remittance;
    public final double cc_cashin_end;
    public final double disbursement;
    public final List<field> fields;
    public final String status;
    public final double status_amount;
    public final String course;

    public Srpt_collections(String business_name, String address, String contact_no, String school_year, String semester, String department, String college, String year_level, String user, String date, String printed_by, double cashin_beg, double cash_sales, double receipts_total, double receipts_line_discount, double receipts_sale_discount, double receipts_sub_total, double receipt_net_total, double check_amount, double credit_card_amount, double gc_amount, double online_amount, double bills_thousand, double bills_five_hundred, double bills_two_hundred, double bills_one_hundred, double bills_fifty, double bills_twenty, double coins_ten, double coins_five, double coins_one, double coins_point_fifty, double coins_point_twenty_five, double coins_point_ten, double coins_point_zero_five, double count_bills_thousand, double count_bills_five_hundred, double count_bills_two_hundred, double count_bills_one_hundred, double count_bills_fifty, double count_bills_twenty, double count_coins_ten, double count_coins_five, double count_coins_one, double count_coins_point_fifty, double count_coins_point_twenty_five, double count_coins_point_ten, double count_coins_point_zero_five, double cc_total, double cc_last_remittance, double cc_cashin_end, double disbursement,String status,double status_amount,String course) {
        this.business_name = business_name;
        this.address = address;
        this.contact_no = contact_no;
        this.school_year = school_year;
        this.semester = semester;
        this.department = department;
        this.college = college;
        this.year_level = year_level;
        this.user = user;
        this.date = date;
        this.printed_by = printed_by;
        this.cashin_beg = cashin_beg;
        this.cash_sales = cash_sales;
        this.receipts_total = receipts_total;
        this.receipts_line_discount = receipts_line_discount;
        this.receipts_sale_discount = receipts_sale_discount;
        this.receipts_sub_total = receipts_sub_total;
        this.receipt_net_total = receipt_net_total;
        this.check_amount = check_amount;
        this.credit_card_amount = credit_card_amount;
        this.gc_amount = gc_amount;
        this.online_amount = online_amount;
        this.bills_thousand = bills_thousand;
        this.bills_five_hundred = bills_five_hundred;
        this.bills_two_hundred = bills_two_hundred;
        this.bills_one_hundred = bills_one_hundred;
        this.bills_fifty = bills_fifty;
        this.bills_twenty = bills_twenty;
        this.coins_ten = coins_ten;
        this.coins_five = coins_five;
        this.coins_one = coins_one;
        this.coins_point_fifty = coins_point_fifty;
        this.coins_point_twenty_five = coins_point_twenty_five;
        this.coins_point_ten = coins_point_ten;
        this.coins_point_zero_five = coins_point_zero_five;
        this.count_bills_thousand = count_bills_thousand;
        this.count_bills_five_hundred = count_bills_five_hundred;
        this.count_bills_two_hundred = count_bills_two_hundred;
        this.count_bills_one_hundred = count_bills_one_hundred;
        this.count_bills_fifty = count_bills_fifty;
        this.count_bills_twenty = count_bills_twenty;
        this.count_coins_ten = count_coins_ten;
        this.count_coins_five = count_coins_five;
        this.count_coins_one = count_coins_one;
        this.count_coins_point_fifty = count_coins_point_fifty;
        this.count_coins_point_twenty_five = count_coins_point_twenty_five;
        this.count_coins_point_ten = count_coins_point_ten;
        this.count_coins_point_zero_five = count_coins_point_zero_five;
        this.cc_total = cc_total;
        this.cc_last_remittance = cc_last_remittance;
        this.cc_cashin_end = cc_cashin_end;
        this.disbursement = disbursement;
        this.fields = new ArrayList();
        this.status=status;
        this.status_amount=status_amount;
        this.course=course;
    }

    public static class field {
    }

    public static void main(String[] args) {
        String business_name = System.getProperty("school_name", "Colegio de Santa Catalina de Alejandria (COSCA)");
        String address = System.getProperty("address", "Bishop Epifanio B. Surban St. Dumaguete City Negros Oriental, Bishop Epifanio Surban St, Dumaguete, Negros Oriental");

        String contact_no = System.getProperty("contact_no", "(035) 225 4831");

        String school_year = "2020 - 2021";
        String semester = "First Semester";

        String department = "Department";
        String college = "College";
        String year_level = "Year Level";

        String user = "User";
        String date = DateType.slash.format(new Date());
        String printed_by = "Administrator";
        double cashin_beg = 0;
        double cash_sales = 0;
        double receipts_total = 0;
        double receipts_line_discount = 0;
        double receipts_sale_discount = 0;
        double receipts_sub_total = 0;
        double receipt_net_total = 0;

        double check_amount = 0;
        double credit_card_amount = 0;
        double gc_amount = 0;
        double online_amount = 0;

        double bills_thousand = 0;
        double bills_five_hundred = 0;
        double bills_two_hundred = 0;
        double bills_one_hundred = 0;
        double bills_fifty = 0;
        double bills_twenty = 0;
        double coins_ten = 0;
        double coins_five = 0;
        double coins_one = 0;
        double coins_point_fifty = 0;
        double coins_point_twenty_five = 0;
        double coins_point_ten = 0;
        double coins_point_zero_five = 0;
        double count_bills_thousand = 0;
        double count_bills_five_hundred = 0;
        double count_bills_two_hundred = 0;
        double count_bills_one_hundred = 0;
        double count_bills_fifty = 0;
        double count_bills_twenty = 0;
        double count_coins_ten = 0;
        double count_coins_five = 0;
        double count_coins_one = 0;
        double count_coins_point_fifty = 0;
        double count_coins_point_twenty_five = 0;
        double count_coins_point_ten = 0;
        double count_coins_point_zero_five = 0;
        double cc_total = 0;
        double cc_last_remittance = 0;
        double cc_cashin_end = 0;
        double disbursement = 0;
        List<field> fields = new ArrayList();
        String status="";
        double status_amount=0;
        String course = "";
        String jrxml = "rpt_collections.jrxml";
        
        Srpt_collections rpt = new Srpt_collections(business_name, address, contact_no, school_year, semester, department, college, year_level, user, date, printed_by, cashin_beg, cash_sales, receipts_total, receipts_line_discount, receipts_sale_discount, receipts_sub_total, receipt_net_total, check_amount, credit_card_amount, gc_amount, online_amount, bills_thousand, bills_five_hundred, bills_two_hundred, bills_one_hundred, bills_fifty, bills_twenty, coins_ten, coins_five, coins_one, coins_point_fifty, coins_point_twenty_five, coins_point_ten, coins_point_zero_five, count_bills_thousand, count_bills_five_hundred, count_bills_two_hundred, count_bills_one_hundred, count_bills_fifty, count_bills_twenty, count_coins_ten, count_coins_five, count_coins_one, count_coins_point_fifty, count_coins_point_twenty_five, count_coins_point_ten, count_coins_point_zero_five, cc_total, cc_last_remittance, cc_cashin_end, disbursement,status,status_amount,course);
        rpt.fields.addAll(fields);
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_collections.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_collections to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}

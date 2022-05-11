/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.reports;

import cis.finance.Enrollment_assessment_payments;
import cis.finance.Enrollment_sls_payments;
import cis.reports.Srpt_teachers_load;
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

    public final double sf_cash;
    public final double sf_cebuana;
    public final double sf_palawan;
    public final double sf_ml;
    public final double sf_gcash;
    public final double sf_check;
    public final double sf_credit_card;

    public final double canteen_cash;
    public final double canteen_cebuana;
    public final double canteen_palawan;
    public final double canteen_ml;
    public final double canteen_gcash;
    public final double canteen_check;
    public final double canteen_credit_card;

    public final double books_cash;
    public final double books_cebuana;
    public final double books_palawan;
    public final double books_ml;
    public final double books_gcash;
    public final double books_check;
    public final double books_credit_card;

    public final double oi_cash;
    public final double oi_cebuana;
    public final double oi_palawan;
    public final double oi_ml;
    public final double oi_gcash;
    public final double oi_check;
    public final double oi_credit_card;

    public final double cebuana_total;
    public final double palawan_total;
    public final double ml_total;
    public final double gcash_total;
    public final double check_total;
    public final double credit_card_total;

    public Srpt_collections(String business_name, String address, String contact_no, String school_year, String semester, String department, String college, String year_level, String user, String date, String printed_by, double cashin_beg, double cash_sales, double receipts_total, double receipts_line_discount, double receipts_sale_discount, double receipts_sub_total, double receipt_net_total, double check_amount, double credit_card_amount, double gc_amount, double online_amount, double bills_thousand, double bills_five_hundred, double bills_two_hundred, double bills_one_hundred, double bills_fifty, double bills_twenty, double coins_ten, double coins_five, double coins_one, double coins_point_fifty, double coins_point_twenty_five, double coins_point_ten, double coins_point_zero_five, double count_bills_thousand, double count_bills_five_hundred, double count_bills_two_hundred, double count_bills_one_hundred, double count_bills_fifty, double count_bills_twenty, double count_coins_ten, double count_coins_five, double count_coins_one, double count_coins_point_fifty, double count_coins_point_twenty_five, double count_coins_point_ten, double count_coins_point_zero_five, double cc_total, double cc_last_remittance, double cc_cashin_end, double disbursement, List<field> fields, String status, double status_amount, String course, double sf_cash, double sf_cebuana, double sf_palawan, double sf_ml, double sf_gcash, double sf_check, double sf_credit_card, double canteen_cash, double canteen_cebuana, double canteen_palawan, double canteen_ml, double canteen_gcash, double canteen_check, double canteen_credit_card, double books_cash, double books_cebuana, double books_palawan, double books_ml, double books_gcash, double books_check, double books_credit_card, double oi_cash, double oi_cebuana, double oi_palawan, double oi_ml, double oi_gcash, double oi_check, double oi_credit_card, double cebuana_total, double palawan_total, double ml_total, double gcash_total, double check_total, double credit_card_total) {
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
        this.fields = fields;
        this.status = status;
        this.status_amount = status_amount;
        this.course = course;
        this.sf_cash = sf_cash;
        this.sf_cebuana = sf_cebuana;
        this.sf_palawan = sf_palawan;
        this.sf_ml = sf_ml;
        this.sf_gcash = sf_gcash;
        this.sf_check = sf_check;
        this.sf_credit_card = sf_credit_card;
        this.canteen_cash = canteen_cash;
        this.canteen_cebuana = canteen_cebuana;
        this.canteen_palawan = canteen_palawan;
        this.canteen_ml = canteen_ml;
        this.canteen_gcash = canteen_gcash;
        this.canteen_check = canteen_check;
        this.canteen_credit_card = canteen_credit_card;
        this.books_cash = books_cash;
        this.books_cebuana = books_cebuana;
        this.books_palawan = books_palawan;
        this.books_ml = books_ml;
        this.books_gcash = books_gcash;
        this.books_check = books_check;
        this.books_credit_card = books_credit_card;
        this.oi_cash = oi_cash;
        this.oi_cebuana = oi_cebuana;
        this.oi_palawan = oi_palawan;
        this.oi_ml = oi_ml;
        this.oi_gcash = oi_gcash;
        this.oi_check = oi_check;
        this.oi_credit_card = oi_credit_card;
        this.cebuana_total = cebuana_total;
        this.palawan_total = palawan_total;
        this.ml_total = ml_total;
        this.gcash_total = gcash_total;
        this.check_total = check_total;
        this.credit_card_total = credit_card_total;
    }

    public static class field {

        int id;
        String transaction_no;
        String or_no;
        String or_date;
        double amount_paid;
        double cash;
        double discount_amount;
        double check_amount;
        double credit_amount;
        double gc_amount;
        double online_amount;
        double net_total;

        public field() {
        }

        public field(int id, String transaction_no, String or_no, String or_date, double amount_paid, double cash, double discount_amount, double check_amount, double credit_amount, double gc_amount, double online_amount, double net_total) {
            this.id = id;
            this.transaction_no = transaction_no;
            this.or_no = or_no;
            this.or_date = or_date;
            this.amount_paid = amount_paid;
            this.cash = cash;
            this.discount_amount = discount_amount;
            this.check_amount = check_amount;
            this.credit_amount = credit_amount;
            this.gc_amount = gc_amount;
            this.online_amount = online_amount;
            this.net_total = net_total;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTransaction_no() {
            return transaction_no;
        }

        public void setTransaction_no(String transaction_no) {
            this.transaction_no = transaction_no;
        }

        public String getOr_no() {
            return or_no;
        }

        public void setOr_no(String or_no) {
            this.or_no = or_no;
        }

        public String getOr_date() {
            return or_date;
        }

        public void setOr_date(String or_date) {
            this.or_date = or_date;
        }

        public double getAmount_paid() {
            return amount_paid;
        }

        public void setAmount_paid(double amount_paid) {
            this.amount_paid = amount_paid;
        }

        public double getCash() {
            return cash;
        }

        public void setCash(double cash) {
            this.cash = cash;
        }

        public double getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(double discount_amount) {
            this.discount_amount = discount_amount;
        }

        public double getCheck_amount() {
            return check_amount;
        }

        public void setCheck_amount(double check_amount) {
            this.check_amount = check_amount;
        }

        public double getCredit_amount() {
            return credit_amount;
        }

        public void setCredit_amount(double credit_amount) {
            this.credit_amount = credit_amount;
        }

        public double getGc_amount() {
            return gc_amount;
        }

        public void setGc_amount(double gc_amount) {
            this.gc_amount = gc_amount;
        }

        public double getOnline_amount() {
            return online_amount;
        }

        public void setOnline_amount(double online_amount) {
            this.online_amount = online_amount;
        }

        public double getNet_total() {
            return net_total;
        }

        public void setNet_total(double net_total) {
            this.net_total = net_total;
        }

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

        double sf_cash = 0;
        double sf_cebuana = 0;
        double sf_palawan = 0;
        double sf_ml = 0;
        double sf_gcash = 0;
        double sf_check = 0;
        double sf_credit_card = 0;

        double canteen_cash = 0;
        double canteen_cebuana = 0;
        double canteen_palawan = 0;
        double canteen_ml = 0;
        double canteen_gcash = 0;
        double canteen_check = 0;
        double canteen_credit_card = 0;

        double books_cash = 0;
        double books_cebuana = 0;
        double books_palawan = 0;
        double books_ml = 0;
        double books_gcash = 0;
        double books_check = 0;
        double books_credit_card = 0;

        double oi_cash = 0;
        double oi_cebuana = 0;
        double oi_palawan = 0;
        double oi_ml = 0;
        double oi_gcash = 0;
        double oi_check = 0;
        double oi_credit_card = 0;

        double cebuana_total = 0;
        double palawan_total = 0;
        double ml_total = 0;
        double gcash_total = 0;
        double check_total = 0;
        double credit_card_total = 0;

        List<field> fields = new ArrayList();
        String status = "";
        double status_amount = 0;
        String course = "";
        String jrxml = "rpt_collections.jrxml";

        Srpt_collections rpt = new Srpt_collections(business_name, address, contact_no, school_year, semester, department, college, year_level, user, date, printed_by, cashin_beg, cash_sales, receipts_total, receipts_line_discount, receipts_sale_discount, receipts_sub_total, receipt_net_total, check_amount, credit_card_amount, gc_amount, online_amount, bills_thousand, bills_five_hundred, bills_two_hundred, bills_one_hundred, bills_fifty, bills_twenty, coins_ten, coins_five, coins_one, coins_point_fifty, coins_point_twenty_five, coins_point_ten, coins_point_zero_five, count_bills_thousand, count_bills_five_hundred, count_bills_two_hundred, count_bills_one_hundred, count_bills_fifty, count_bills_twenty, count_coins_ten, count_coins_five, count_coins_one, count_coins_point_fifty, count_coins_point_twenty_five, count_coins_point_ten, count_coins_point_zero_five, cc_total, cc_last_remittance, cc_cashin_end, disbursement, fields, status, status_amount, course, sf_cash, sf_cebuana, sf_palawan, sf_ml, sf_gcash, sf_check, sf_credit_card, canteen_cash, canteen_cebuana, canteen_palawan, canteen_ml, canteen_gcash, canteen_check, canteen_credit_card, books_cash, books_cebuana, books_palawan, books_ml, books_gcash, books_check, books_credit_card, oi_cash, oi_cebuana, oi_palawan, oi_ml, oi_gcash, oi_check, oi_credit_card, cebuana_total, palawan_total, ml_total, gcash_total, check_total, credit_card_total);

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

    public static List<field> ret_data(String where) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_assessment_id"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",amount_paid"
                    + ",cash"
                    + ",discount_name"
                    + ",discount_rate"
                    + ",discount_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",check_holder"
                    + ",check_date"
                    + ",credit_card_type"
                    + ",credit_card_rate"
                    + ",credit_card_amount"
                    + ",credit_card_no"
                    + ",credit_card_holder"
                    + ",gift_certificate_from"
                    + ",gift_certificate_description"
                    + ",gift_certificate_no"
                    + ",gift_certificate_amount"
                    + ",online_bank"
                    + ",online_reference_no"
                    + ",online_amount"
                    + ",online_holder"
                    + ",online_date"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from enrollment_assessment_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int enrollment_assessment_id = rs.getInt(2);
                int enrollment_id = rs.getInt(3);
                String enrollment_no = rs.getString(4);
                int academic_year_id = rs.getInt(5);
                String academic_year = rs.getString(6);
                double amount_paid = rs.getDouble(7);
                double cash = rs.getDouble(8);
                String discount_name = rs.getString(9);
                double discount_rate = rs.getDouble(10);
                double discount_amount = rs.getDouble(11);
                String discount_customer_name = rs.getString(12);
                String discount_customer_id = rs.getString(13);
                String check_bank = rs.getString(14);
                String check_no = rs.getString(15);
                double check_amount = rs.getDouble(16);
                String check_holder = rs.getString(17);
                String check_date = rs.getString(18);
                String credit_card_type = rs.getString(19);
                double credit_card_rate = rs.getDouble(20);
                double credit_card_amount = rs.getDouble(21);
                String credit_card_no = rs.getString(22);
                String credit_card_holder = rs.getString(23);
                String gift_certificate_from = rs.getString(24);
                String gift_certificate_description = rs.getString(25);
                String gift_certificate_no = rs.getString(26);
                double gift_certificate_amount = rs.getDouble(27);
                String online_bank = rs.getString(28);
                String online_reference_no = rs.getString(29);
                double online_amount = rs.getDouble(30);
                String online_holder = rs.getString(31);
                String online_date = rs.getString(32);
                String created_at = rs.getString(33);
                String updated_at = rs.getString(34);
                String created_by = rs.getString(35);
                String updated_by = rs.getString(36);
                int status = rs.getInt(37);
                int is_uploaded = rs.getInt(38);

                String transaction_no = "" + id;
                String or_no = "";
                String or_date = DateType.convert_slash_datetime3(created_at);

                double credit_amount = credit_card_amount;
                double gc_amount = gift_certificate_amount;

                double net_total = amount_paid - discount_amount;
                field f = new field(id, transaction_no, or_no, or_date, amount_paid, cash, discount_amount, check_amount, credit_amount, gc_amount, online_amount, net_total);
                datas.add(f);

            }

            String s2 = "select "
                    + "id"
                    + ",trans_type"
                    + ",enrollment_id"
                    + ",enrollment_no"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",amount_paid"
                    + ",cash"
                    + ",discount_name"
                    + ",discount_rate"
                    + ",discount_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",check_holder"
                    + ",check_date"
                    + ",credit_card_type"
                    + ",credit_card_rate"
                    + ",credit_card_amount"
                    + ",credit_card_no"
                    + ",credit_card_holder"
                    + ",gift_certificate_from"
                    + ",gift_certificate_description"
                    + ",gift_certificate_no"
                    + ",gift_certificate_amount"
                    + ",online_bank"
                    + ",online_reference_no"
                    + ",online_amount"
                    + ",online_holder"
                    + ",online_date"
                    + ",lecture_units"
                    + ",lab_units"
                    + ",lec_amount"
                    + ",lab_amount"
                    + ",fee_amount"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ",student_id"
                    + ",student_no"
                    + ",first_name"
                    + ",middle_name"
                    + ",last_name"
                    + " from enrollment_sls_payments"
                    + " " + where;

            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(s2);
            while (rs2.next()) {
                int id = rs2.getInt(1);
                int trans_type = rs2.getInt(2);
                int enrollment_id = rs2.getInt(3);
                String enrollment_no = rs2.getString(4);
                int academic_year_id = rs2.getInt(5);
                String academic_year = rs2.getString(6);
                double amount_paid = rs2.getDouble(7);
                double cash = rs2.getDouble(8);
                String discount_name = rs2.getString(9);
                double discount_rate = rs2.getDouble(10);
                double discount_amount = rs2.getDouble(11);
                String discount_customer_name = rs2.getString(12);
                String discount_customer_id = rs2.getString(13);
                String check_bank = rs2.getString(14);
                String check_no = rs2.getString(15);
                double check_amount = rs2.getDouble(16);
                String check_holder = rs2.getString(17);
                String check_date = rs2.getString(18);
                String credit_card_type = rs2.getString(19);
                double credit_card_rate = rs2.getDouble(20);
                double credit_card_amount = rs2.getDouble(21);
                String credit_card_no = rs2.getString(22);
                String credit_card_holder = rs2.getString(23);
                String gift_certificate_from = rs2.getString(24);
                String gift_certificate_description = rs2.getString(25);
                String gift_certificate_no = rs2.getString(26);
                double gift_certificate_amount = rs2.getDouble(27);
                String online_bank = rs2.getString(28);
                String online_reference_no = rs2.getString(29);
                double online_amount = rs2.getDouble(30);
                String online_holder = rs2.getString(31);
                String online_date = rs2.getString(32);
                int lecture_units = rs2.getInt(33);
                int lab_units = rs2.getInt(34);
                double lec_amount = rs2.getDouble(35);
                double lab_amount = rs2.getDouble(36);
                double fee_amount = rs2.getDouble(37);
                String created_at = rs2.getString(38);
                String updated_at = rs2.getString(39);
                String created_by = rs2.getString(40);
                String updated_by = rs2.getString(41);
                int status = rs2.getInt(42);
                int is_uploaded = rs2.getInt(43);
                int student_id = rs2.getInt(44);
                String student_no = rs2.getString(45);
                String first_name = rs2.getString(46);
                String middle_name = rs2.getString(47);
                String last_name = rs2.getString(48);

                String transaction_no = "" + id;
                String or_no = "";
                String or_date = DateType.convert_slash_datetime3(created_at);

                double credit_amount = credit_card_amount;
                double gc_amount = gift_certificate_amount;
                cash = amount_paid;
                double net_total = amount_paid - discount_amount;
                field f = new field(id, transaction_no, or_no, or_date, amount_paid, cash, discount_amount, check_amount, credit_amount, gc_amount, online_amount, net_total);
                datas.add(f);

            }

            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
    
}

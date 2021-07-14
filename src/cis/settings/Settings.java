/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.settings;

import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Settings {

    public static class to_settings {

        public final int id;
        public final String company_name;
        public final String company_address;
        public final String company_operated_by;
        public final String company_slogan;
        public final String company_contact_no;
        public final String company_fax_no;
        public final String company_email_address;
        public final String cloud_host;
        public final String cloud_port;
        public final String cloud_user;
        public final String cloud_password;
        public final String cloud_db;
        public final int strict_enrollment;

        public to_settings(int id, String company_name, String company_address, String company_operated_by, String company_slogan, String company_contact_no, String company_fax_no, String company_email_address, String cloud_host, String cloud_port, String cloud_user, String cloud_password, String cloud_db,int strict_enrollment) {
            this.id = id;
            this.company_name = company_name;
            this.company_address = company_address;
            this.company_operated_by = company_operated_by;
            this.company_slogan = company_slogan;
            this.company_contact_no = company_contact_no;
            this.company_fax_no = company_fax_no;
            this.company_email_address = company_email_address;
            this.cloud_host = cloud_host;
            this.cloud_port = cloud_port;
            this.cloud_user = cloud_user;
            this.cloud_password = cloud_password;
            this.cloud_db = cloud_db;
            this.strict_enrollment=strict_enrollment;
        }
    }

    public static void add_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into settings("
                    + "company_name"
                    + ",company_address"
                    + ",company_operated_by"
                    + ",company_slogan"
                    + ",company_contact_no"
                    + ",company_fax_no"
                    + ",company_email_address"
                    + ",cloud_host"
                    + ",cloud_port"
                    + ",cloud_user"
                    + ",cloud_password"
                    + ",cloud_db"
                    + ",strict_enrollment"
                    + ")values("
                    + ":company_name"
                    + ",:company_address"
                    + ",:company_operated_by"
                    + ",:company_slogan"
                    + ",:company_contact_no"
                    + ",:company_fax_no"
                    + ",:company_email_address"
                    + ",:cloud_host"
                    + ",:cloud_port"
                    + ",:cloud_user"
                    + ",:cloud_password"
                    + ",:cloud_db"
                    + ",:strict_enrollment"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("company_name", to_settings.company_name)
                    .setString("company_address", to_settings.company_address)
                    .setString("company_operated_by", to_settings.company_operated_by)
                    .setString("company_slogan", to_settings.company_slogan)
                    .setString("company_contact_no", to_settings.company_contact_no)
                    .setString("company_fax_no", to_settings.company_fax_no)
                    .setString("company_email_address", to_settings.company_email_address)
                    .setString("cloud_host", to_settings.cloud_host)
                    .setString("cloud_port", to_settings.cloud_port)
                    .setString("cloud_user", to_settings.cloud_user)
                    .setString("cloud_password", to_settings.cloud_password)
                    .setString("cloud_db", to_settings.cloud_db)
                    .setNumber("strict_enrollment",to_settings.strict_enrollment)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update settings set "
                    + "company_name= :company_name "
                    + ",company_address= :company_address "
                    + ",company_operated_by= :company_operated_by "
                    + ",company_slogan= :company_slogan "
                    + ",company_contact_no= :company_contact_no "
                    + ",company_fax_no= :company_fax_no "
                    + ",company_email_address= :company_email_address "
                    + ",cloud_host= :cloud_host "
                    + ",cloud_port= :cloud_port "
                    + ",cloud_user= :cloud_user "
                    + ",cloud_password= :cloud_password "
                    + ",cloud_db= :cloud_db "
                    + ",strict_enrollment= :strict_enrollment"
                    + " where id='" + to_settings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("company_name", to_settings.company_name)
                    .setString("company_address", to_settings.company_address)
                    .setString("company_operated_by", to_settings.company_operated_by)
                    .setString("company_slogan", to_settings.company_slogan)
                    .setString("company_contact_no", to_settings.company_contact_no)
                    .setString("company_fax_no", to_settings.company_fax_no)
                    .setString("company_email_address", to_settings.company_email_address)
                    .setString("cloud_host", to_settings.cloud_host)
                    .setString("cloud_port", to_settings.cloud_port)
                    .setString("cloud_user", to_settings.cloud_user)
                    .setString("cloud_password", to_settings.cloud_password)
                    .setString("cloud_db", to_settings.cloud_db)
                    .setNumber("strict_enrollment",to_settings.strict_enrollment)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from settings  "
                    + " where id='" + to_settings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_settings> ret_data(String where) {
        List<to_settings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",company_name"
                    + ",company_address"
                    + ",company_operated_by"
                    + ",company_slogan"
                    + ",company_contact_no"
                    + ",company_fax_no"
                    + ",company_email_address"
                    + ",cloud_host"
                    + ",cloud_port"
                    + ",cloud_user"
                    + ",cloud_password"
                    + ",cloud_db"
                    + ",strict_enrollment"
                    + " from settings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String company_name = rs.getString(2);
                String company_address = rs.getString(3);
                String company_operated_by = rs.getString(4);
                String company_slogan = rs.getString(5);
                String company_contact_no = rs.getString(6);
                String company_fax_no = rs.getString(7);
                String company_email_address = rs.getString(8);
                String cloud_host = rs.getString(9);
                String cloud_port = rs.getString(10);
                String cloud_user = rs.getString(11);
                String cloud_password = rs.getString(12);
                String cloud_db = rs.getString(13);
                int strict_enrollment=rs.getInt(14);
                to_settings to = new to_settings(id, company_name, company_address, company_operated_by, company_slogan, company_contact_no, company_fax_no, company_email_address, cloud_host, cloud_port, cloud_user, cloud_password, cloud_db,strict_enrollment);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

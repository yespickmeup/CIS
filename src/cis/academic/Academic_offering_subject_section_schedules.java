/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.academic;

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
 * @author Ronescape
 */

public class Academic_offering_subject_section_schedules {

    public static class to_academic_offering_subject_section_schedules {

        public final int id;
        public final int aoss_id;
        public final int room_id;
        public final String room;
        public final String day;
        public final String start_time;
        public final String end_time;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_academic_offering_subject_section_schedules(int id, int aoss_id, int room_id, String room, String day, String start_time, String end_time, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.aoss_id = aoss_id;
            this.room_id = room_id;
            this.room = room;
            this.day = day;
            this.start_time = start_time;
            this.end_time = end_time;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_academic_offering_subject_section_schedules to_academic_offering_subject_section_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into academic_offering_subject_section_schedules("
                    + " aoss_id"
                    + ",room_id"
                    + ",room"
                    + ",day"
                    + ",start_time"
                    + ",end_time"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":aoss_id"
                    + ",:room_id"
                    + ",:room"
                    + ",:day"
                    + ",:start_time"
                    + ",:end_time"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("aoss_id", to_academic_offering_subject_section_schedules.aoss_id)
                    .setNumber("room_id", to_academic_offering_subject_section_schedules.room_id)
                    .setString("room", to_academic_offering_subject_section_schedules.room)
                    .setString("day", to_academic_offering_subject_section_schedules.day)
                    .setString("start_time", to_academic_offering_subject_section_schedules.start_time)
                    .setString("end_time", to_academic_offering_subject_section_schedules.end_time)
                    .setString("created_at", to_academic_offering_subject_section_schedules.created_at)
                    .setString("updated_at", to_academic_offering_subject_section_schedules.updated_at)
                    .setString("created_by", to_academic_offering_subject_section_schedules.created_by)
                    .setString("updated_by", to_academic_offering_subject_section_schedules.updated_by)
                    .setNumber("status", to_academic_offering_subject_section_schedules.status)
                    .setNumber("is_uploaded", to_academic_offering_subject_section_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_section_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_academic_offering_subject_section_schedules to_academic_offering_subject_section_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update academic_offering_subject_section_schedules set "
                    + "aoss_id= :aoss_id "
                    + ",room_id= :room_id "
                    + ",room= :room "
                    + ",day= :day "
                    + ",start_time= :start_time "
                    + ",end_time= :end_time "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_academic_offering_subject_section_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("aoss_id", to_academic_offering_subject_section_schedules.aoss_id)
                    .setNumber("room_id", to_academic_offering_subject_section_schedules.room_id)
                    .setString("room", to_academic_offering_subject_section_schedules.room)
                    .setString("day", to_academic_offering_subject_section_schedules.day)
                    .setString("start_time", to_academic_offering_subject_section_schedules.start_time)
                    .setString("end_time", to_academic_offering_subject_section_schedules.end_time)
                    .setString("created_at", to_academic_offering_subject_section_schedules.created_at)
                    .setString("updated_at", to_academic_offering_subject_section_schedules.updated_at)
                    .setString("created_by", to_academic_offering_subject_section_schedules.created_by)
                    .setString("updated_by", to_academic_offering_subject_section_schedules.updated_by)
                    .setNumber("status", to_academic_offering_subject_section_schedules.status)
                    .setNumber("is_uploaded", to_academic_offering_subject_section_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_section_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_academic_offering_subject_section_schedules to_academic_offering_subject_section_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from academic_offering_subject_section_schedules  "
                    + " where id='" + to_academic_offering_subject_section_schedules.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Academic_offering_subject_section_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_academic_offering_subject_section_schedules> ret_data(String where) {
        List<to_academic_offering_subject_section_schedules> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",aoss_id"
                    + ",room_id"
                    + ",room"
                    + ",day"
                    + ",start_time"
                    + ",end_time"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from academic_offering_subject_section_schedules"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int aoss_id = rs.getInt(2);
                int room_id = rs.getInt(3);
                String room = rs.getString(4);
                String day = rs.getString(5);
                String start_time = rs.getString(6);
                String end_time = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                String created_by = rs.getString(10);
                String updated_by = rs.getString(11);
                int status = rs.getInt(12);
                int is_uploaded = rs.getInt(13);

                to_academic_offering_subject_section_schedules to = new to_academic_offering_subject_section_schedules(id, aoss_id, room_id, room, day, start_time, end_time, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

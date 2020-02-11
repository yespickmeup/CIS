/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.enrollments;

import cis.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Ronescape
 */
public class Enrollments {

    public static class to_enrollments {

        public final int id;
        public String enrollment_no;
        public final int is_transferee;
        public final int academic_year_id;
        public final String academic_year;
        public final int curriculum_id;
        public final int course_id;
        public final String course_code;
        public final String course_description;
        public final String term;
        public final String encoded_by_id;
        public final String encoded_by;
        public final String encoded_date;
        public final String assessed_by_id;
        public final String assessed_by;
        public final String assessed_date;
        public final String advised_by_id;
        public final String advised_by;
        public final String advised_date;
        public final String approved_by_id;
        public final String approved_by;
        public final String approved_date;
        public final String student_no;
        public final String last_name;
        public final String first_name;
        public final String middle_name;
        public final String nick_name;
        public final String current_address;
        public final String permanent_address;
        public final String email_address;
        public final String postal_code;
        public final String tel_no;
        public final String mobile_no;
        public final String date_of_birth;
        public final String place_of_birth;
        public final int age;
        public final int gender;
        public final String citizenship;
        public final String religion;
        public final String civil_status;
        public final String spouse_name;
        public final String date_of_communion;
        public final String date_of_confirmation;
        public final int is_right_handed;
        public final int is_indigenous;
        public final String indigenous_name;
        public final int level_id;
        public final String level;
        public final int college_id;
        public final String college;
        public final int department_id;
        public final String department;
        public final String year_level;
        public final String year_level_status;
        public final String preferred_course1;
        public final String preferred_course2;
        public final String preferred_course3;
        public final String father_name;
        public final String father_citizenship;
        public final String father_home_address;
        public final String father_email_address;
        public final String father_mobile_no;
        public final String father_occupation;
        public final String father_employer;
        public final String father_business_address;
        public final String father_business_tel_no;
        public final String father_educational_attainment;
        public final String father_last_school_attended;
        public final String mother_name;
        public final String mother_citizenship;
        public final String mother_home_address;
        public final String mother_email_address;
        public final String mother_mobile_no;
        public final String mother_occupation;
        public final String mother_employer;
        public final String mother_business_address;
        public final String mother_business_tel_no;
        public final String mother_educational_attainment;
        public final String mother_last_school_attended;
        public final String guardian_name;
        public final String guardian_mailing_address;
        public final String guardian_telephone_no;
        public final String grade_school_name;
        public final String grade_school_region;
        public final String grade_school_school_year;
        public final String grade_school_awards;
        public final String high_school_name;
        public final String high_school_region;
        public final String high_school_school_year;
        public final String high_school_awards;
        public final String college_school_name;
        public final String college_school_region;
        public final String college_school_school_year;
        public final String college_awards;
        public final String junior_high_name;
        public final String junior_high_region;
        public final String junior_high_year;
        public final String junior_high_awards;
        public final String tesda_name;
        public final String tesda_region;
        public final String tesda_year;
        public final String tesda_awards;
        public final String sibling1;
        public final String sibling2;
        public final String sibling3;
        public final String sibling4;
        public final String sibling5;
        public final String sibling6;
        public final String sibling7;
        public final String sibling8;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_enrollments(int id, String enrollment_no, int is_transferee, int academic_year_id, String academic_year, int curriculum_id, int course_id, String course_code, String course_description, String term, String encoded_by_id, String encoded_by, String encoded_date, String assessed_by_id, String assessed_by, String assessed_date, String advised_by_id, String advised_by, String advised_date, String approved_by_id, String approved_by, String approved_date, String student_no, String last_name, String first_name, String middle_name, String nick_name, String current_address, String permanent_address, String email_address, String postal_code, String tel_no, String mobile_no, String date_of_birth, String place_of_birth, int age, int gender, String citizenship, String religion, String civil_status, String spouse_name, String date_of_communion, String date_of_confirmation, int is_right_handed, int is_indigenous, String indigenous_name, int level_id, String level, int college_id, String college, int department_id, String department, String year_level, String year_level_status, String preferred_course1, String preferred_course2, String preferred_course3, String father_name, String father_citizenship, String father_home_address, String father_email_address, String father_mobile_no, String father_occupation, String father_employer, String father_business_address, String father_business_tel_no, String father_educational_attainment, String father_last_school_attended, String mother_name, String mother_citizenship, String mother_home_address, String mother_email_address, String mother_mobile_no, String mother_occupation, String mother_employer, String mother_business_address, String mother_business_tel_no, String mother_educational_attainment, String mother_last_school_attended, String guardian_name, String guardian_mailing_address, String guardian_telephone_no, String grade_school_name, String grade_school_region, String grade_school_school_year, String grade_school_awards, String high_school_name, String high_school_region, String high_school_school_year, String high_school_awards, String college_school_name, String college_school_region, String college_school_school_year, String college_awards, String junior_high_name, String junior_high_region, String junior_high_year, String junior_high_awards, String tesda_name, String tesda_region, String tesda_year, String tesda_awards, String sibling1, String sibling2, String sibling3, String sibling4, String sibling5, String sibling6, String sibling7, String sibling8, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.enrollment_no = enrollment_no;
            this.is_transferee = is_transferee;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.curriculum_id = curriculum_id;
            this.course_id = course_id;
            this.course_code = course_code;
            this.course_description = course_description;
            this.term = term;
            this.encoded_by_id = encoded_by_id;
            this.encoded_by = encoded_by;
            this.encoded_date = encoded_date;
            this.assessed_by_id = assessed_by_id;
            this.assessed_by = assessed_by;
            this.assessed_date = assessed_date;
            this.advised_by_id = advised_by_id;
            this.advised_by = advised_by;
            this.advised_date = advised_date;
            this.approved_by_id = approved_by_id;
            this.approved_by = approved_by;
            this.approved_date = approved_date;
            this.student_no = student_no;
            this.last_name = last_name;
            this.first_name = first_name;
            this.middle_name = middle_name;
            this.nick_name = nick_name;
            this.current_address = current_address;
            this.permanent_address = permanent_address;
            this.email_address = email_address;
            this.postal_code = postal_code;
            this.tel_no = tel_no;
            this.mobile_no = mobile_no;
            this.date_of_birth = date_of_birth;
            this.place_of_birth = place_of_birth;
            this.age = age;
            this.gender = gender;
            this.citizenship = citizenship;
            this.religion = religion;
            this.civil_status = civil_status;
            this.spouse_name = spouse_name;
            this.date_of_communion = date_of_communion;
            this.date_of_confirmation = date_of_confirmation;
            this.is_right_handed = is_right_handed;
            this.is_indigenous = is_indigenous;
            this.indigenous_name = indigenous_name;
            this.level_id = level_id;
            this.level = level;
            this.college_id = college_id;
            this.college = college;
            this.department_id = department_id;
            this.department = department;
            this.year_level = year_level;
            this.year_level_status = year_level_status;
            this.preferred_course1 = preferred_course1;
            this.preferred_course2 = preferred_course2;
            this.preferred_course3 = preferred_course3;
            this.father_name = father_name;
            this.father_citizenship = father_citizenship;
            this.father_home_address = father_home_address;
            this.father_email_address = father_email_address;
            this.father_mobile_no = father_mobile_no;
            this.father_occupation = father_occupation;
            this.father_employer = father_employer;
            this.father_business_address = father_business_address;
            this.father_business_tel_no = father_business_tel_no;
            this.father_educational_attainment = father_educational_attainment;
            this.father_last_school_attended = father_last_school_attended;
            this.mother_name = mother_name;
            this.mother_citizenship = mother_citizenship;
            this.mother_home_address = mother_home_address;
            this.mother_email_address = mother_email_address;
            this.mother_mobile_no = mother_mobile_no;
            this.mother_occupation = mother_occupation;
            this.mother_employer = mother_employer;
            this.mother_business_address = mother_business_address;
            this.mother_business_tel_no = mother_business_tel_no;
            this.mother_educational_attainment = mother_educational_attainment;
            this.mother_last_school_attended = mother_last_school_attended;
            this.guardian_name = guardian_name;
            this.guardian_mailing_address = guardian_mailing_address;
            this.guardian_telephone_no = guardian_telephone_no;
            this.grade_school_name = grade_school_name;
            this.grade_school_region = grade_school_region;
            this.grade_school_school_year = grade_school_school_year;
            this.grade_school_awards = grade_school_awards;
            this.high_school_name = high_school_name;
            this.high_school_region = high_school_region;
            this.high_school_school_year = high_school_school_year;
            this.high_school_awards = high_school_awards;
            this.college_school_name = college_school_name;
            this.college_school_region = college_school_region;
            this.college_school_school_year = college_school_school_year;
            this.college_awards = college_awards;
            this.junior_high_name = junior_high_name;
            this.junior_high_region = junior_high_region;
            this.junior_high_year = junior_high_year;
            this.junior_high_awards = junior_high_awards;
            this.tesda_name = tesda_name;
            this.tesda_region = tesda_region;
            this.tesda_year = tesda_year;
            this.tesda_awards = tesda_awards;
            this.sibling1 = sibling1;
            this.sibling2 = sibling2;
            this.sibling3 = sibling3;
            this.sibling4 = sibling4;
            this.sibling5 = sibling5;
            this.sibling6 = sibling6;
            this.sibling7 = sibling7;
            this.sibling8 = sibling8;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }

        public String getEnrollment_no() {
            return enrollment_no;
        }

        public void setEnrollment_no(String enrollment_no) {
            this.enrollment_no = enrollment_no;
        }

    }

    public static String add_data(to_enrollments to_enrollments) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt3 = conn.prepareStatement("");

            String id = "00000000";
            String s1 = "select max(id) from enrollments";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s1);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select enrollment_no from enrollments where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000000";
            }
            id = ReceiptIncrementor.increment(id);

            String s0 = "insert into enrollments("
                    + "enrollment_no"
                    + ",is_transferee"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",curriculum_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",encoded_by_id"
                    + ",encoded_by"
                    + ",encoded_date"
                    + ",assessed_by_id"
                    + ",assessed_by"
                    + ",assessed_date"
                    + ",advised_by_id"
                    + ",advised_by"
                    + ",advised_date"
                    + ",approved_by_id"
                    + ",approved_by"
                    + ",approved_date"
                    + ",student_no"
                    + ",last_name"
                    + ",first_name"
                    + ",middle_name"
                    + ",nick_name"
                    + ",current_address"
                    + ",permanent_address"
                    + ",email_address"
                    + ",postal_code"
                    + ",tel_no"
                    + ",mobile_no"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",age"
                    + ",gender"
                    + ",citizenship"
                    + ",religion"
                    + ",civil_status"
                    + ",spouse_name"
                    + ",date_of_communion"
                    + ",date_of_confirmation"
                    + ",is_right_handed"
                    + ",is_indigenous"
                    + ",indigenous_name"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",year_level"
                    + ",year_level_status"
                    + ",preferred_course1"
                    + ",preferred_course2"
                    + ",preferred_course3"
                    + ",father_name"
                    + ",father_citizenship"
                    + ",father_home_address"
                    + ",father_email_address"
                    + ",father_mobile_no"
                    + ",father_occupation"
                    + ",father_employer"
                    + ",father_business_address"
                    + ",father_business_tel_no"
                    + ",father_educational_attainment"
                    + ",father_last_school_attended"
                    + ",mother_name"
                    + ",mother_citizenship"
                    + ",mother_home_address"
                    + ",mother_email_address"
                    + ",mother_mobile_no"
                    + ",mother_occupation"
                    + ",mother_employer"
                    + ",mother_business_address"
                    + ",mother_business_tel_no"
                    + ",mother_educational_attainment"
                    + ",mother_last_school_attended"
                    + ",guardian_name"
                    + ",guardian_mailing_address"
                    + ",guardian_telephone_no"
                    + ",grade_school_name"
                    + ",grade_school_region"
                    + ",grade_school_school_year"
                    + ",grade_school_awards"
                    + ",high_school_name"
                    + ",high_school_region"
                    + ",high_school_school_year"
                    + ",high_school_awards"
                    + ",college_school_name"
                    + ",college_school_region"
                    + ",college_school_school_year"
                    + ",college_awards"
                    + ",junior_high_name"
                    + ",junior_high_region"
                    + ",junior_high_year"
                    + ",junior_high_awards"
                    + ",tesda_name"
                    + ",tesda_region"
                    + ",tesda_year"
                    + ",tesda_awards"
                    + ",sibling1"
                    + ",sibling2"
                    + ",sibling3"
                    + ",sibling4"
                    + ",sibling5"
                    + ",sibling6"
                    + ",sibling7"
                    + ",sibling8"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":enrollment_no"
                    + ",:is_transferee"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:curriculum_id"
                    + ",:course_id"
                    + ",:course_code"
                    + ",:course_description"
                    + ",:term"
                    + ",:encoded_by_id"
                    + ",:encoded_by"
                    + ",:encoded_date"
                    + ",:assessed_by_id"
                    + ",:assessed_by"
                    + ",:assessed_date"
                    + ",:advised_by_id"
                    + ",:advised_by"
                    + ",:advised_date"
                    + ",:approved_by_id"
                    + ",:approved_by"
                    + ",:approved_date"
                    + ",:student_no"
                    + ",:last_name"
                    + ",:first_name"
                    + ",:middle_name"
                    + ",:nick_name"
                    + ",:current_address"
                    + ",:permanent_address"
                    + ",:email_address"
                    + ",:postal_code"
                    + ",:tel_no"
                    + ",:mobile_no"
                    + ",:date_of_birth"
                    + ",:place_of_birth"
                    + ",:age"
                    + ",:gender"
                    + ",:citizenship"
                    + ",:religion"
                    + ",:civil_status"
                    + ",:spouse_name"
                    + ",:date_of_communion"
                    + ",:date_of_confirmation"
                    + ",:is_right_handed"
                    + ",:is_indigenous"
                    + ",:indigenous_name"
                    + ",:level_id"
                    + ",:level"
                    + ",:college_id"
                    + ",:college"
                    + ",:department_id"
                    + ",:department"
                    + ",:year_level"
                    + ",:year_level_status"
                    + ",:preferred_course1"
                    + ",:preferred_course2"
                    + ",:preferred_course3"
                    + ",:father_name"
                    + ",:father_citizenship"
                    + ",:father_home_address"
                    + ",:father_email_address"
                    + ",:father_mobile_no"
                    + ",:father_occupation"
                    + ",:father_employer"
                    + ",:father_business_address"
                    + ",:father_business_tel_no"
                    + ",:father_educational_attainment"
                    + ",:father_last_school_attended"
                    + ",:mother_name"
                    + ",:mother_citizenship"
                    + ",:mother_home_address"
                    + ",:mother_email_address"
                    + ",:mother_mobile_no"
                    + ",:mother_occupation"
                    + ",:mother_employer"
                    + ",:mother_business_address"
                    + ",:mother_business_tel_no"
                    + ",:mother_educational_attainment"
                    + ",:mother_last_school_attended"
                    + ",:guardian_name"
                    + ",:guardian_mailing_address"
                    + ",:guardian_telephone_no"
                    + ",:grade_school_name"
                    + ",:grade_school_region"
                    + ",:grade_school_school_year"
                    + ",:grade_school_awards"
                    + ",:high_school_name"
                    + ",:high_school_region"
                    + ",:high_school_school_year"
                    + ",:high_school_awards"
                    + ",:college_school_name"
                    + ",:college_school_region"
                    + ",:college_school_school_year"
                    + ",:college_awards"
                    + ",:junior_high_name"
                    + ",:junior_high_region"
                    + ",:junior_high_year"
                    + ",:junior_high_awards"
                    + ",:tesda_name"
                    + ",:tesda_region"
                    + ",:tesda_year"
                    + ",:tesda_awards"
                    + ",:sibling1"
                    + ",:sibling2"
                    + ",:sibling3"
                    + ",:sibling4"
                    + ",:sibling5"
                    + ",:sibling6"
                    + ",:sibling7"
                    + ",:sibling8"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("enrollment_no", id)
                    .setNumber("is_transferee", to_enrollments.is_transferee)
                    .setNumber("academic_year_id", to_enrollments.academic_year_id)
                    .setString("academic_year", to_enrollments.academic_year)
                    .setNumber("curriculum_id", to_enrollments.curriculum_id)
                    .setNumber("course_id", to_enrollments.course_id)
                    .setString("course_code", to_enrollments.course_code)
                    .setString("course_description", to_enrollments.course_description)
                    .setString("term", to_enrollments.term)
                    .setString("encoded_by_id", to_enrollments.encoded_by_id)
                    .setString("encoded_by", to_enrollments.encoded_by)
                    .setString("encoded_date", to_enrollments.encoded_date)
                    .setString("assessed_by_id", to_enrollments.assessed_by_id)
                    .setString("assessed_by", to_enrollments.assessed_by)
                    .setString("assessed_date", to_enrollments.assessed_date)
                    .setString("advised_by_id", to_enrollments.advised_by_id)
                    .setString("advised_by", to_enrollments.advised_by)
                    .setString("advised_date", to_enrollments.advised_date)
                    .setString("approved_by_id", to_enrollments.approved_by_id)
                    .setString("approved_by", to_enrollments.approved_by)
                    .setString("approved_date", to_enrollments.approved_date)
                    .setString("student_no", to_enrollments.student_no)
                    .setString("last_name", to_enrollments.last_name)
                    .setString("first_name", to_enrollments.first_name)
                    .setString("middle_name", to_enrollments.middle_name)
                    .setString("nick_name", to_enrollments.nick_name)
                    .setString("current_address", to_enrollments.current_address)
                    .setString("permanent_address", to_enrollments.permanent_address)
                    .setString("email_address", to_enrollments.email_address)
                    .setString("postal_code", to_enrollments.postal_code)
                    .setString("tel_no", to_enrollments.tel_no)
                    .setString("mobile_no", to_enrollments.mobile_no)
                    .setString("date_of_birth", to_enrollments.date_of_birth)
                    .setString("place_of_birth", to_enrollments.place_of_birth)
                    .setNumber("age", to_enrollments.age)
                    .setNumber("gender", to_enrollments.gender)
                    .setString("citizenship", to_enrollments.citizenship)
                    .setString("religion", to_enrollments.religion)
                    .setString("civil_status", to_enrollments.civil_status)
                    .setString("spouse_name", to_enrollments.spouse_name)
                    .setString("date_of_communion", to_enrollments.date_of_communion)
                    .setString("date_of_confirmation", to_enrollments.date_of_confirmation)
                    .setNumber("is_right_handed", to_enrollments.is_right_handed)
                    .setNumber("is_indigenous", to_enrollments.is_indigenous)
                    .setString("indigenous_name", to_enrollments.indigenous_name)
                    .setNumber("level_id", to_enrollments.level_id)
                    .setString("level", to_enrollments.level)
                    .setNumber("college_id", to_enrollments.college_id)
                    .setString("college", to_enrollments.college)
                    .setNumber("department_id", to_enrollments.department_id)
                    .setString("department", to_enrollments.department)
                    .setString("year_level", to_enrollments.year_level)
                    .setString("year_level_status", to_enrollments.year_level_status)
                    .setString("preferred_course1", to_enrollments.preferred_course1)
                    .setString("preferred_course2", to_enrollments.preferred_course2)
                    .setString("preferred_course3", to_enrollments.preferred_course3)
                    .setString("father_name", to_enrollments.father_name)
                    .setString("father_citizenship", to_enrollments.father_citizenship)
                    .setString("father_home_address", to_enrollments.father_home_address)
                    .setString("father_email_address", to_enrollments.father_email_address)
                    .setString("father_mobile_no", to_enrollments.father_mobile_no)
                    .setString("father_occupation", to_enrollments.father_occupation)
                    .setString("father_employer", to_enrollments.father_employer)
                    .setString("father_business_address", to_enrollments.father_business_address)
                    .setString("father_business_tel_no", to_enrollments.father_business_tel_no)
                    .setString("father_educational_attainment", to_enrollments.father_educational_attainment)
                    .setString("father_last_school_attended", to_enrollments.father_last_school_attended)
                    .setString("mother_name", to_enrollments.mother_name)
                    .setString("mother_citizenship", to_enrollments.mother_citizenship)
                    .setString("mother_home_address", to_enrollments.mother_home_address)
                    .setString("mother_email_address", to_enrollments.mother_email_address)
                    .setString("mother_mobile_no", to_enrollments.mother_mobile_no)
                    .setString("mother_occupation", to_enrollments.mother_occupation)
                    .setString("mother_employer", to_enrollments.mother_employer)
                    .setString("mother_business_address", to_enrollments.mother_business_address)
                    .setString("mother_business_tel_no", to_enrollments.mother_business_tel_no)
                    .setString("mother_educational_attainment", to_enrollments.mother_educational_attainment)
                    .setString("mother_last_school_attended", to_enrollments.mother_last_school_attended)
                    .setString("guardian_name", to_enrollments.guardian_name)
                    .setString("guardian_mailing_address", to_enrollments.guardian_mailing_address)
                    .setString("guardian_telephone_no", to_enrollments.guardian_telephone_no)
                    .setString("grade_school_name", to_enrollments.grade_school_name)
                    .setString("grade_school_region", to_enrollments.grade_school_region)
                    .setString("grade_school_school_year", to_enrollments.grade_school_school_year)
                    .setString("grade_school_awards", to_enrollments.grade_school_awards)
                    .setString("high_school_name", to_enrollments.high_school_name)
                    .setString("high_school_region", to_enrollments.high_school_region)
                    .setString("high_school_school_year", to_enrollments.high_school_school_year)
                    .setString("high_school_awards", to_enrollments.high_school_awards)
                    .setString("college_school_name", to_enrollments.college_school_name)
                    .setString("college_school_region", to_enrollments.college_school_region)
                    .setString("college_school_school_year", to_enrollments.college_school_school_year)
                    .setString("college_awards", to_enrollments.college_awards)
                    .setString("junior_high_name", to_enrollments.junior_high_name)
                    .setString("junior_high_region", to_enrollments.junior_high_region)
                    .setString("junior_high_year", to_enrollments.junior_high_year)
                    .setString("junior_high_awards", to_enrollments.junior_high_awards)
                    .setString("tesda_name", to_enrollments.tesda_name)
                    .setString("tesda_region", to_enrollments.tesda_region)
                    .setString("tesda_year", to_enrollments.tesda_year)
                    .setString("tesda_awards", to_enrollments.tesda_awards)
                    .setString("sibling1", to_enrollments.sibling1)
                    .setString("sibling2", to_enrollments.sibling2)
                    .setString("sibling3", to_enrollments.sibling3)
                    .setString("sibling4", to_enrollments.sibling4)
                    .setString("sibling5", to_enrollments.sibling5)
                    .setString("sibling6", to_enrollments.sibling6)
                    .setString("sibling7", to_enrollments.sibling7)
                    .setString("sibling8", to_enrollments.sibling8)
                    .setString("created_at", to_enrollments.created_at)
                    .setString("updated_at", to_enrollments.updated_at)
                    .setString("created_by", to_enrollments.created_by)
                    .setString("updated_by", to_enrollments.updated_by)
                    .setNumber("status", to_enrollments.status)
                    .setNumber("is_uploaded", to_enrollments.is_uploaded)
                    .ok();

            stmt3.addBatch(s0);
            stmt3.executeBatch();
            conn.commit();
            Lg.s(Enrollments.class, "Successfully Added");

            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_enrollments to_enrollments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollments set "
                    + "enrollment_no= :enrollment_no "
                    + ",is_transferee= :is_transferee "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",curriculum_id= :curriculum_id "
                    + ",course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",term= :term "
                    + ",encoded_by_id= :encoded_by_id "
                    + ",encoded_by= :encoded_by "
                    + ",encoded_date= :encoded_date "
                    + ",assessed_by_id= :assessed_by_id "
                    + ",assessed_by= :assessed_by "
                    + ",assessed_date= :assessed_date "
                    + ",advised_by_id= :advised_by_id "
                    + ",advised_by= :advised_by "
                    + ",advised_date= :advised_date "
                    + ",approved_by_id= :approved_by_id "
                    + ",approved_by= :approved_by "
                    + ",approved_date= :approved_date "
                    + ",student_no= :student_no "
                    + ",last_name= :last_name "
                    + ",first_name= :first_name "
                    + ",middle_name= :middle_name "
                    + ",nick_name= :nick_name "
                    + ",current_address= :current_address "
                    + ",permanent_address= :permanent_address "
                    + ",email_address= :email_address "
                    + ",postal_code= :postal_code "
                    + ",tel_no= :tel_no "
                    + ",mobile_no= :mobile_no "
                    + ",date_of_birth= :date_of_birth "
                    + ",place_of_birth= :place_of_birth "
                    + ",age= :age "
                    + ",gender= :gender "
                    + ",citizenship= :citizenship "
                    + ",religion= :religion "
                    + ",civil_status= :civil_status "
                    + ",spouse_name= :spouse_name "
                    + ",date_of_communion= :date_of_communion "
                    + ",date_of_confirmation= :date_of_confirmation "
                    + ",is_right_handed= :is_right_handed "
                    + ",is_indigenous= :is_indigenous "
                    + ",indigenous_name= :indigenous_name "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",year_level= :year_level "
                    + ",year_level_status= :year_level_status "
                    + ",preferred_course1= :preferred_course1 "
                    + ",preferred_course2= :preferred_course2 "
                    + ",preferred_course3= :preferred_course3 "
                    + ",father_name= :father_name "
                    + ",father_citizenship= :father_citizenship "
                    + ",father_home_address= :father_home_address "
                    + ",father_email_address= :father_email_address "
                    + ",father_mobile_no= :father_mobile_no "
                    + ",father_occupation= :father_occupation "
                    + ",father_employer= :father_employer "
                    + ",father_business_address= :father_business_address "
                    + ",father_business_tel_no= :father_business_tel_no "
                    + ",father_educational_attainment= :father_educational_attainment "
                    + ",father_last_school_attended= :father_last_school_attended "
                    + ",mother_name= :mother_name "
                    + ",mother_citizenship= :mother_citizenship "
                    + ",mother_home_address= :mother_home_address "
                    + ",mother_email_address= :mother_email_address "
                    + ",mother_mobile_no= :mother_mobile_no "
                    + ",mother_occupation= :mother_occupation "
                    + ",mother_employer= :mother_employer "
                    + ",mother_business_address= :mother_business_address "
                    + ",mother_business_tel_no= :mother_business_tel_no "
                    + ",mother_educational_attainment= :mother_educational_attainment "
                    + ",mother_last_school_attended= :mother_last_school_attended "
                    + ",guardian_name= :guardian_name "
                    + ",guardian_mailing_address= :guardian_mailing_address "
                    + ",guardian_telephone_no= :guardian_telephone_no "
                    + ",grade_school_name= :grade_school_name "
                    + ",grade_school_region= :grade_school_region "
                    + ",grade_school_school_year= :grade_school_school_year "
                    + ",grade_school_awards= :grade_school_awards "
                    + ",high_school_name= :high_school_name "
                    + ",high_school_region= :high_school_region "
                    + ",high_school_school_year= :high_school_school_year "
                    + ",high_school_awards= :high_school_awards "
                    + ",college_school_name= :college_school_name "
                    + ",college_school_region= :college_school_region "
                    + ",college_school_school_year= :college_school_school_year "
                    + ",college_awards= :college_awards "
                    + ",junior_high_name= :junior_high_name "
                    + ",junior_high_region= :junior_high_region "
                    + ",junior_high_year= :junior_high_year "
                    + ",junior_high_awards= :junior_high_awards "
                    + ",tesda_name= :tesda_name "
                    + ",tesda_region= :tesda_region "
                    + ",tesda_year= :tesda_year "
                    + ",tesda_awards= :tesda_awards "
                    + ",sibling1= :sibling1 "
                    + ",sibling2= :sibling2 "
                    + ",sibling3= :sibling3 "
                    + ",sibling4= :sibling4 "
                    + ",sibling5= :sibling5 "
                    + ",sibling6= :sibling6 "
                    + ",sibling7= :sibling7 "
                    + ",sibling8= :sibling8 "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_enrollments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("enrollment_no", to_enrollments.enrollment_no)
                    .setNumber("is_transferee", to_enrollments.is_transferee)
                    .setNumber("academic_year_id", to_enrollments.academic_year_id)
                    .setString("academic_year", to_enrollments.academic_year)
                    .setNumber("curriculum_id", to_enrollments.curriculum_id)
                    .setNumber("course_id", to_enrollments.course_id)
                    .setString("course_code", to_enrollments.course_code)
                    .setString("course_description", to_enrollments.course_description)
                    .setString("term", to_enrollments.term)
                    .setString("encoded_by_id", to_enrollments.encoded_by_id)
                    .setString("encoded_by", to_enrollments.encoded_by)
                    .setString("encoded_date", to_enrollments.encoded_date)
                    .setString("assessed_by_id", to_enrollments.assessed_by_id)
                    .setString("assessed_by", to_enrollments.assessed_by)
                    .setString("assessed_date", to_enrollments.assessed_date)
                    .setString("advised_by_id", to_enrollments.advised_by_id)
                    .setString("advised_by", to_enrollments.advised_by)
                    .setString("advised_date", to_enrollments.advised_date)
                    .setString("approved_by_id", to_enrollments.approved_by_id)
                    .setString("approved_by", to_enrollments.approved_by)
                    .setString("approved_date", to_enrollments.approved_date)
                    .setString("student_no", to_enrollments.student_no)
                    .setString("last_name", to_enrollments.last_name)
                    .setString("first_name", to_enrollments.first_name)
                    .setString("middle_name", to_enrollments.middle_name)
                    .setString("nick_name", to_enrollments.nick_name)
                    .setString("current_address", to_enrollments.current_address)
                    .setString("permanent_address", to_enrollments.permanent_address)
                    .setString("email_address", to_enrollments.email_address)
                    .setString("postal_code", to_enrollments.postal_code)
                    .setString("tel_no", to_enrollments.tel_no)
                    .setString("mobile_no", to_enrollments.mobile_no)
                    .setString("date_of_birth", to_enrollments.date_of_birth)
                    .setString("place_of_birth", to_enrollments.place_of_birth)
                    .setNumber("age", to_enrollments.age)
                    .setNumber("gender", to_enrollments.gender)
                    .setString("citizenship", to_enrollments.citizenship)
                    .setString("religion", to_enrollments.religion)
                    .setString("civil_status", to_enrollments.civil_status)
                    .setString("spouse_name", to_enrollments.spouse_name)
                    .setString("date_of_communion", to_enrollments.date_of_communion)
                    .setString("date_of_confirmation", to_enrollments.date_of_confirmation)
                    .setNumber("is_right_handed", to_enrollments.is_right_handed)
                    .setNumber("is_indigenous", to_enrollments.is_indigenous)
                    .setString("indigenous_name", to_enrollments.indigenous_name)
                    .setNumber("level_id", to_enrollments.level_id)
                    .setString("level", to_enrollments.level)
                    .setNumber("college_id", to_enrollments.college_id)
                    .setString("college", to_enrollments.college)
                    .setNumber("department_id", to_enrollments.department_id)
                    .setString("department", to_enrollments.department)
                    .setString("year_level", to_enrollments.year_level)
                    .setString("year_level_status", to_enrollments.year_level_status)
                    .setString("preferred_course1", to_enrollments.preferred_course1)
                    .setString("preferred_course2", to_enrollments.preferred_course2)
                    .setString("preferred_course3", to_enrollments.preferred_course3)
                    .setString("father_name", to_enrollments.father_name)
                    .setString("father_citizenship", to_enrollments.father_citizenship)
                    .setString("father_home_address", to_enrollments.father_home_address)
                    .setString("father_email_address", to_enrollments.father_email_address)
                    .setString("father_mobile_no", to_enrollments.father_mobile_no)
                    .setString("father_occupation", to_enrollments.father_occupation)
                    .setString("father_employer", to_enrollments.father_employer)
                    .setString("father_business_address", to_enrollments.father_business_address)
                    .setString("father_business_tel_no", to_enrollments.father_business_tel_no)
                    .setString("father_educational_attainment", to_enrollments.father_educational_attainment)
                    .setString("father_last_school_attended", to_enrollments.father_last_school_attended)
                    .setString("mother_name", to_enrollments.mother_name)
                    .setString("mother_citizenship", to_enrollments.mother_citizenship)
                    .setString("mother_home_address", to_enrollments.mother_home_address)
                    .setString("mother_email_address", to_enrollments.mother_email_address)
                    .setString("mother_mobile_no", to_enrollments.mother_mobile_no)
                    .setString("mother_occupation", to_enrollments.mother_occupation)
                    .setString("mother_employer", to_enrollments.mother_employer)
                    .setString("mother_business_address", to_enrollments.mother_business_address)
                    .setString("mother_business_tel_no", to_enrollments.mother_business_tel_no)
                    .setString("mother_educational_attainment", to_enrollments.mother_educational_attainment)
                    .setString("mother_last_school_attended", to_enrollments.mother_last_school_attended)
                    .setString("guardian_name", to_enrollments.guardian_name)
                    .setString("guardian_mailing_address", to_enrollments.guardian_mailing_address)
                    .setString("guardian_telephone_no", to_enrollments.guardian_telephone_no)
                    .setString("grade_school_name", to_enrollments.grade_school_name)
                    .setString("grade_school_region", to_enrollments.grade_school_region)
                    .setString("grade_school_school_year", to_enrollments.grade_school_school_year)
                    .setString("grade_school_awards", to_enrollments.grade_school_awards)
                    .setString("high_school_name", to_enrollments.high_school_name)
                    .setString("high_school_region", to_enrollments.high_school_region)
                    .setString("high_school_school_year", to_enrollments.high_school_school_year)
                    .setString("high_school_awards", to_enrollments.high_school_awards)
                    .setString("college_school_name", to_enrollments.college_school_name)
                    .setString("college_school_region", to_enrollments.college_school_region)
                    .setString("college_school_school_year", to_enrollments.college_school_school_year)
                    .setString("college_awards", to_enrollments.college_awards)
                    .setString("junior_high_name", to_enrollments.junior_high_name)
                    .setString("junior_high_region", to_enrollments.junior_high_region)
                    .setString("junior_high_year", to_enrollments.junior_high_year)
                    .setString("junior_high_awards", to_enrollments.junior_high_awards)
                    .setString("tesda_name", to_enrollments.tesda_name)
                    .setString("tesda_region", to_enrollments.tesda_region)
                    .setString("tesda_year", to_enrollments.tesda_year)
                    .setString("tesda_awards", to_enrollments.tesda_awards)
                    .setString("sibling1", to_enrollments.sibling1)
                    .setString("sibling2", to_enrollments.sibling2)
                    .setString("sibling3", to_enrollments.sibling3)
                    .setString("sibling4", to_enrollments.sibling4)
                    .setString("sibling5", to_enrollments.sibling5)
                    .setString("sibling6", to_enrollments.sibling6)
                    .setString("sibling7", to_enrollments.sibling7)
                    .setString("sibling8", to_enrollments.sibling8)
                    .setString("created_at", to_enrollments.created_at)
                    .setString("updated_at", to_enrollments.updated_at)
                    .setString("created_by", to_enrollments.created_by)
                    .setString("updated_by", to_enrollments.updated_by)
                    .setNumber("status", to_enrollments.status)
                    .setNumber("is_uploaded", to_enrollments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_enroll_course(int id, int course_id, String course_code, String course_description, int level_id, String level, int college_id,
             String college, int department_id, String department, String year_level) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update enrollments set "
                    + " course_id= :course_id "
                    + ",course_code= :course_code "
                    + ",course_description= :course_description "
                    + ",level_id= :level_id "
                    + ",level= :level "
                    + ",college_id= :college_id "
                    + ",college= :college "
                    + ",department_id= :department_id "
                    + ",department= :department "
                    + ",year_level= :year_level "
                    + " where id='" + id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("course_id", course_id)
                    .setString("course_code", course_code)
                    .setString("course_description", course_description)
                    .setNumber("level_id", level_id)
                    .setString("level", level)
                    .setNumber("college_id", college_id)
                    .setString("college", college)
                    .setNumber("department_id", department_id)
                    .setString("department", department)
                    .setString("year_level", year_level)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_enrollments to_enrollments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from enrollments  "
                    + " where id='" + to_enrollments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Enrollments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_enrollments> ret_data(String where) {
        List<to_enrollments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",enrollment_no"
                    + ",is_transferee"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",curriculum_id"
                    + ",course_id"
                    + ",course_code"
                    + ",course_description"
                    + ",term"
                    + ",encoded_by_id"
                    + ",encoded_by"
                    + ",encoded_date"
                    + ",assessed_by_id"
                    + ",assessed_by"
                    + ",assessed_date"
                    + ",advised_by_id"
                    + ",advised_by"
                    + ",advised_date"
                    + ",approved_by_id"
                    + ",approved_by"
                    + ",approved_date"
                    + ",student_no"
                    + ",last_name"
                    + ",first_name"
                    + ",middle_name"
                    + ",nick_name"
                    + ",current_address"
                    + ",permanent_address"
                    + ",email_address"
                    + ",postal_code"
                    + ",tel_no"
                    + ",mobile_no"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",age"
                    + ",gender"
                    + ",citizenship"
                    + ",religion"
                    + ",civil_status"
                    + ",spouse_name"
                    + ",date_of_communion"
                    + ",date_of_confirmation"
                    + ",is_right_handed"
                    + ",is_indigenous"
                    + ",indigenous_name"
                    + ",level_id"
                    + ",level"
                    + ",college_id"
                    + ",college"
                    + ",department_id"
                    + ",department"
                    + ",year_level"
                    + ",year_level_status"
                    + ",preferred_course1"
                    + ",preferred_course2"
                    + ",preferred_course3"
                    + ",father_name"
                    + ",father_citizenship"
                    + ",father_home_address"
                    + ",father_email_address"
                    + ",father_mobile_no"
                    + ",father_occupation"
                    + ",father_employer"
                    + ",father_business_address"
                    + ",father_business_tel_no"
                    + ",father_educational_attainment"
                    + ",father_last_school_attended"
                    + ",mother_name"
                    + ",mother_citizenship"
                    + ",mother_home_address"
                    + ",mother_email_address"
                    + ",mother_mobile_no"
                    + ",mother_occupation"
                    + ",mother_employer"
                    + ",mother_business_address"
                    + ",mother_business_tel_no"
                    + ",mother_educational_attainment"
                    + ",mother_last_school_attended"
                    + ",guardian_name"
                    + ",guardian_mailing_address"
                    + ",guardian_telephone_no"
                    + ",grade_school_name"
                    + ",grade_school_region"
                    + ",grade_school_school_year"
                    + ",grade_school_awards"
                    + ",high_school_name"
                    + ",high_school_region"
                    + ",high_school_school_year"
                    + ",high_school_awards"
                    + ",college_school_name"
                    + ",college_school_region"
                    + ",college_school_school_year"
                    + ",college_awards"
                    + ",junior_high_name"
                    + ",junior_high_region"
                    + ",junior_high_year"
                    + ",junior_high_awards"
                    + ",tesda_name"
                    + ",tesda_region"
                    + ",tesda_year"
                    + ",tesda_awards"
                    + ",sibling1"
                    + ",sibling2"
                    + ",sibling3"
                    + ",sibling4"
                    + ",sibling5"
                    + ",sibling6"
                    + ",sibling7"
                    + ",sibling8"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from enrollments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String enrollment_no = rs.getString(2);
                int is_transferee = rs.getInt(3);
                int academic_year_id = rs.getInt(4);
                String academic_year = rs.getString(5);
                int curriculum_id = rs.getInt(6);
                int course_id = rs.getInt(7);
                String course_code = rs.getString(8);
                String course_description = rs.getString(9);
                String term = rs.getString(10);
                String encoded_by_id = rs.getString(11);
                String encoded_by = rs.getString(12);
                String encoded_date = rs.getString(13);
                String assessed_by_id = rs.getString(14);
                String assessed_by = rs.getString(15);
                String assessed_date = rs.getString(16);
                String advised_by_id = rs.getString(17);
                String advised_by = rs.getString(18);
                String advised_date = rs.getString(19);
                String approved_by_id = rs.getString(20);
                String approved_by = rs.getString(21);
                String approved_date = rs.getString(22);
                String student_no = rs.getString(23);
                String last_name = rs.getString(24);
                String first_name = rs.getString(25);
                String middle_name = rs.getString(26);
                String nick_name = rs.getString(27);
                String current_address = rs.getString(28);
                String permanent_address = rs.getString(29);
                String email_address = rs.getString(30);
                String postal_code = rs.getString(31);
                String tel_no = rs.getString(32);
                String mobile_no = rs.getString(33);
                String date_of_birth = rs.getString(34);
                String place_of_birth = rs.getString(35);
                int age = rs.getInt(36);
                int gender = rs.getInt(37);
                String citizenship = rs.getString(38);
                String religion = rs.getString(39);
                String civil_status = rs.getString(40);
                String spouse_name = rs.getString(41);
                String date_of_communion = rs.getString(42);
                String date_of_confirmation = rs.getString(43);
                int is_right_handed = rs.getInt(44);
                int is_indigenous = rs.getInt(45);
                String indigenous_name = rs.getString(46);
                int level_id = rs.getInt(47);
                String level = rs.getString(48);
                int college_id = rs.getInt(49);
                String college = rs.getString(50);
                int department_id = rs.getInt(51);
                String department = rs.getString(52);
                String year_level = rs.getString(53);
                String year_level_status = rs.getString(54);
                String preferred_course1 = rs.getString(55);
                String preferred_course2 = rs.getString(56);
                String preferred_course3 = rs.getString(57);
                String father_name = rs.getString(58);
                String father_citizenship = rs.getString(59);
                String father_home_address = rs.getString(60);
                String father_email_address = rs.getString(61);
                String father_mobile_no = rs.getString(62);
                String father_occupation = rs.getString(63);
                String father_employer = rs.getString(64);
                String father_business_address = rs.getString(65);
                String father_business_tel_no = rs.getString(66);
                String father_educational_attainment = rs.getString(67);
                String father_last_school_attended = rs.getString(68);
                String mother_name = rs.getString(69);
                String mother_citizenship = rs.getString(70);
                String mother_home_address = rs.getString(71);
                String mother_email_address = rs.getString(72);
                String mother_mobile_no = rs.getString(73);
                String mother_occupation = rs.getString(74);
                String mother_employer = rs.getString(75);
                String mother_business_address = rs.getString(76);
                String mother_business_tel_no = rs.getString(77);
                String mother_educational_attainment = rs.getString(78);
                String mother_last_school_attended = rs.getString(79);
                String guardian_name = rs.getString(80);
                String guardian_mailing_address = rs.getString(81);
                String guardian_telephone_no = rs.getString(82);
                String grade_school_name = rs.getString(83);
                String grade_school_region = rs.getString(84);
                String grade_school_school_year = rs.getString(85);
                String grade_school_awards = rs.getString(86);
                String high_school_name = rs.getString(87);
                String high_school_region = rs.getString(88);
                String high_school_school_year = rs.getString(89);
                String high_school_awards = rs.getString(90);
                String college_school_name = rs.getString(91);
                String college_school_region = rs.getString(92);
                String college_school_school_year = rs.getString(93);
                String college_awards = rs.getString(94);
                String junior_high_name = rs.getString(95);
                String junior_high_region = rs.getString(96);
                String junior_high_year = rs.getString(97);
                String junior_high_awards = rs.getString(98);
                String tesda_name = rs.getString(99);
                String tesda_region = rs.getString(100);
                String tesda_year = rs.getString(101);
                String tesda_awards = rs.getString(102);
                String sibling1 = rs.getString(103);
                String sibling2 = rs.getString(104);
                String sibling3 = rs.getString(105);
                String sibling4 = rs.getString(106);
                String sibling5 = rs.getString(107);
                String sibling6 = rs.getString(108);
                String sibling7 = rs.getString(109);
                String sibling8 = rs.getString(110);
                String created_at = rs.getString(111);
                String updated_at = rs.getString(112);
                String created_by = rs.getString(113);
                String updated_by = rs.getString(114);
                int status = rs.getInt(115);
                int is_uploaded = rs.getInt(116);

                to_enrollments to = new to_enrollments(id, enrollment_no, is_transferee, academic_year_id, academic_year, curriculum_id, course_id, course_code, course_description, term, encoded_by_id, encoded_by, encoded_date, assessed_by_id, assessed_by, assessed_date, advised_by_id, advised_by, advised_date, approved_by_id, approved_by, approved_date, student_no, last_name, first_name, middle_name, nick_name, current_address, permanent_address, email_address, postal_code, tel_no, mobile_no, date_of_birth, place_of_birth, age, gender, citizenship, religion, civil_status, spouse_name, date_of_communion, date_of_confirmation, is_right_handed, is_indigenous, indigenous_name, level_id, level, college_id, college, department_id, department, year_level, year_level_status, preferred_course1, preferred_course2, preferred_course3, father_name, father_citizenship, father_home_address, father_email_address, father_mobile_no, father_occupation, father_employer, father_business_address, father_business_tel_no, father_educational_attainment, father_last_school_attended, mother_name, mother_citizenship, mother_home_address, mother_email_address, mother_mobile_no, mother_occupation, mother_employer, mother_business_address, mother_business_tel_no, mother_educational_attainment, mother_last_school_attended, guardian_name, guardian_mailing_address, guardian_telephone_no, grade_school_name, grade_school_region, grade_school_school_year, grade_school_awards, high_school_name, high_school_region, high_school_school_year, high_school_awards, college_school_name, college_school_region, college_school_school_year, college_awards, junior_high_name, junior_high_region, junior_high_year, junior_high_awards, tesda_name, tesda_region, tesda_year, tesda_awards, sibling1, sibling2, sibling3, sibling4, sibling5, sibling6, sibling7, sibling8, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.students;

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
public class Students {

    public static class to_students {

        public final int id;
        public final int is_transferee;
        public final int academic_year_id;
        public final String academic_year;
        public final String student_no;
        public final String last_name;
        public final String first_name;
        public final String middle_name;
        public final String nick_name;
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
        public final String high_school_name;
        public final String high_school_region;
        public final String high_school_school_year;
        public final String college_school_name;
        public final String college_school_region;
        public final String college_school_school_year;
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

        public to_students(int id, int is_transferee, int academic_year_id, String academic_year, String student_no, String last_name, String first_name, String middle_name, String nick_name, String permanent_address, String email_address, String postal_code, String tel_no, String mobile_no, String date_of_birth, String place_of_birth, int age, int gender, String citizenship, String religion, String civil_status, String spouse_name, String date_of_communion, String date_of_confirmation, int is_right_handed, int level_id, String level, int college_id, String college, int department_id, String department, String year_level, String year_level_status, String preferred_course1, String preferred_course2, String preferred_course3, String father_name, String father_citizenship, String father_home_address, String father_email_address, String father_mobile_no, String father_occupation, String father_employer, String father_business_address, String father_business_tel_no, String father_educational_attainment, String father_last_school_attended, String mother_name, String mother_citizenship, String mother_home_address, String mother_email_address, String mother_mobile_no, String mother_occupation, String mother_employer, String mother_business_address, String mother_business_tel_no, String mother_educational_attainment, String mother_last_school_attended, String guardian_name, String guardian_mailing_address, String guardian_telephone_no, String grade_school_name, String grade_school_region, String grade_school_school_year, String high_school_name, String high_school_region, String high_school_school_year, String college_school_name, String college_school_region, String college_school_school_year, String sibling1, String sibling2, String sibling3, String sibling4, String sibling5, String sibling6, String sibling7, String sibling8, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.is_transferee = is_transferee;
            this.academic_year_id = academic_year_id;
            this.academic_year = academic_year;
            this.student_no = student_no;
            this.last_name = last_name;
            this.first_name = first_name;
            this.middle_name = middle_name;
            this.nick_name = nick_name;
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
            this.high_school_name = high_school_name;
            this.high_school_region = high_school_region;
            this.high_school_school_year = high_school_school_year;
            this.college_school_name = college_school_name;
            this.college_school_region = college_school_region;
            this.college_school_school_year = college_school_school_year;
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
    }

    public static void add_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into students("
                    + "is_transferee"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",student_no"
                    + ",last_name"
                    + ",first_name"
                    + ",middle_name"
                    + ",nick_name"
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
                    + ",high_school_name"
                    + ",high_school_region"
                    + ",high_school_school_year"
                    + ",college_school_name"
                    + ",college_school_region"
                    + ",college_school_school_year"
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
                    + ":is_transferee"
                    + ",:academic_year_id"
                    + ",:academic_year"
                    + ",:student_no"
                    + ",:last_name"
                    + ",:first_name"
                    + ",:middle_name"
                    + ",:nick_name"
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
                    + ",:high_school_name"
                    + ",:high_school_region"
                    + ",:high_school_school_year"
                    + ",:college_school_name"
                    + ",:college_school_region"
                    + ",:college_school_school_year"
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
                    .setNumber("is_transferee", to_students.is_transferee)
                    .setNumber("academic_year_id", to_students.academic_year_id)
                    .setString("academic_year", to_students.academic_year)
                    .setString("student_no", to_students.student_no)
                    .setString("last_name", to_students.last_name)
                    .setString("first_name", to_students.first_name)
                    .setString("middle_name", to_students.middle_name)
                    .setString("nick_name", to_students.nick_name)
                    .setString("permanent_address", to_students.permanent_address)
                    .setString("email_address", to_students.email_address)
                    .setString("postal_code", to_students.postal_code)
                    .setString("tel_no", to_students.tel_no)
                    .setString("mobile_no", to_students.mobile_no)
                    .setString("date_of_birth", to_students.date_of_birth)
                    .setString("place_of_birth", to_students.place_of_birth)
                    .setNumber("age", to_students.age)
                    .setNumber("gender", to_students.gender)
                    .setString("citizenship", to_students.citizenship)
                    .setString("religion", to_students.religion)
                    .setString("civil_status", to_students.civil_status)
                    .setString("spouse_name", to_students.spouse_name)
                    .setString("date_of_communion", to_students.date_of_communion)
                    .setString("date_of_confirmation", to_students.date_of_confirmation)
                    .setNumber("is_right_handed", to_students.is_right_handed)
                    .setNumber("level_id", to_students.level_id)
                    .setString("level", to_students.level)
                    .setNumber("college_id", to_students.college_id)
                    .setString("college", to_students.college)
                    .setNumber("department_id", to_students.department_id)
                    .setString("department", to_students.department)
                    .setString("year_level", to_students.year_level)
                    .setString("year_level_status", to_students.year_level_status)
                    .setString("preferred_course1", to_students.preferred_course1)
                    .setString("preferred_course2", to_students.preferred_course2)
                    .setString("preferred_course3", to_students.preferred_course3)
                    .setString("father_name", to_students.father_name)
                    .setString("father_citizenship", to_students.father_citizenship)
                    .setString("father_home_address", to_students.father_home_address)
                    .setString("father_email_address", to_students.father_email_address)
                    .setString("father_mobile_no", to_students.father_mobile_no)
                    .setString("father_occupation", to_students.father_occupation)
                    .setString("father_employer", to_students.father_employer)
                    .setString("father_business_address", to_students.father_business_address)
                    .setString("father_business_tel_no", to_students.father_business_tel_no)
                    .setString("father_educational_attainment", to_students.father_educational_attainment)
                    .setString("father_last_school_attended", to_students.father_last_school_attended)
                    .setString("mother_name", to_students.mother_name)
                    .setString("mother_citizenship", to_students.mother_citizenship)
                    .setString("mother_home_address", to_students.mother_home_address)
                    .setString("mother_email_address", to_students.mother_email_address)
                    .setString("mother_mobile_no", to_students.mother_mobile_no)
                    .setString("mother_occupation", to_students.mother_occupation)
                    .setString("mother_employer", to_students.mother_employer)
                    .setString("mother_business_address", to_students.mother_business_address)
                    .setString("mother_business_tel_no", to_students.mother_business_tel_no)
                    .setString("mother_educational_attainment", to_students.mother_educational_attainment)
                    .setString("mother_last_school_attended", to_students.mother_last_school_attended)
                    .setString("guardian_name", to_students.guardian_name)
                    .setString("guardian_mailing_address", to_students.guardian_mailing_address)
                    .setString("guardian_telephone_no", to_students.guardian_telephone_no)
                    .setString("grade_school_name", to_students.grade_school_name)
                    .setString("grade_school_region", to_students.grade_school_region)
                    .setString("grade_school_school_year", to_students.grade_school_school_year)
                    .setString("high_school_name", to_students.high_school_name)
                    .setString("high_school_region", to_students.high_school_region)
                    .setString("high_school_school_year", to_students.high_school_school_year)
                    .setString("college_school_name", to_students.college_school_name)
                    .setString("college_school_region", to_students.college_school_region)
                    .setString("college_school_school_year", to_students.college_school_school_year)
                    .setString("sibling1", to_students.sibling1)
                    .setString("sibling2", to_students.sibling2)
                    .setString("sibling3", to_students.sibling3)
                    .setString("sibling4", to_students.sibling4)
                    .setString("sibling5", to_students.sibling5)
                    .setString("sibling6", to_students.sibling6)
                    .setString("sibling7", to_students.sibling7)
                    .setString("sibling8", to_students.sibling8)
                    .setString("created_at", to_students.created_at)
                    .setString("updated_at", to_students.updated_at)
                    .setString("created_by", to_students.created_by)
                    .setString("updated_by", to_students.updated_by)
                    .setNumber("status", to_students.status)
                    .setNumber("is_uploaded", to_students.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Students.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update students set "
                    + "is_transferee= :is_transferee "
                    + ",academic_year_id= :academic_year_id "
                    + ",academic_year= :academic_year "
                    + ",student_no= :student_no "
                    + ",last_name= :last_name "
                    + ",first_name= :first_name "
                    + ",middle_name= :middle_name "
                    + ",nick_name= :nick_name "
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
                    + ",high_school_name= :high_school_name "
                    + ",high_school_region= :high_school_region "
                    + ",high_school_school_year= :high_school_school_year "
                    + ",college_school_name= :college_school_name "
                    + ",college_school_region= :college_school_region "
                    + ",college_school_school_year= :college_school_school_year "
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
                    + " where id='" + to_students.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("is_transferee", to_students.is_transferee)
                    .setNumber("academic_year_id", to_students.academic_year_id)
                    .setString("academic_year", to_students.academic_year)
                    .setString("student_no", to_students.student_no)
                    .setString("last_name", to_students.last_name)
                    .setString("first_name", to_students.first_name)
                    .setString("middle_name", to_students.middle_name)
                    .setString("nick_name", to_students.nick_name)
                    .setString("permanent_address", to_students.permanent_address)
                    .setString("email_address", to_students.email_address)
                    .setString("postal_code", to_students.postal_code)
                    .setString("tel_no", to_students.tel_no)
                    .setString("mobile_no", to_students.mobile_no)
                    .setString("date_of_birth", to_students.date_of_birth)
                    .setString("place_of_birth", to_students.place_of_birth)
                    .setNumber("age", to_students.age)
                    .setNumber("gender", to_students.gender)
                    .setString("citizenship", to_students.citizenship)
                    .setString("religion", to_students.religion)
                    .setString("civil_status", to_students.civil_status)
                    .setString("spouse_name", to_students.spouse_name)
                    .setString("date_of_communion", to_students.date_of_communion)
                    .setString("date_of_confirmation", to_students.date_of_confirmation)
                    .setNumber("is_right_handed", to_students.is_right_handed)
                    .setNumber("level_id", to_students.level_id)
                    .setString("level", to_students.level)
                    .setNumber("college_id", to_students.college_id)
                    .setString("college", to_students.college)
                    .setNumber("department_id", to_students.department_id)
                    .setString("department", to_students.department)
                    .setString("year_level", to_students.year_level)
                    .setString("year_level_status", to_students.year_level_status)
                    .setString("preferred_course1", to_students.preferred_course1)
                    .setString("preferred_course2", to_students.preferred_course2)
                    .setString("preferred_course3", to_students.preferred_course3)
                    .setString("father_name", to_students.father_name)
                    .setString("father_citizenship", to_students.father_citizenship)
                    .setString("father_home_address", to_students.father_home_address)
                    .setString("father_email_address", to_students.father_email_address)
                    .setString("father_mobile_no", to_students.father_mobile_no)
                    .setString("father_occupation", to_students.father_occupation)
                    .setString("father_employer", to_students.father_employer)
                    .setString("father_business_address", to_students.father_business_address)
                    .setString("father_business_tel_no", to_students.father_business_tel_no)
                    .setString("father_educational_attainment", to_students.father_educational_attainment)
                    .setString("father_last_school_attended", to_students.father_last_school_attended)
                    .setString("mother_name", to_students.mother_name)
                    .setString("mother_citizenship", to_students.mother_citizenship)
                    .setString("mother_home_address", to_students.mother_home_address)
                    .setString("mother_email_address", to_students.mother_email_address)
                    .setString("mother_mobile_no", to_students.mother_mobile_no)
                    .setString("mother_occupation", to_students.mother_occupation)
                    .setString("mother_employer", to_students.mother_employer)
                    .setString("mother_business_address", to_students.mother_business_address)
                    .setString("mother_business_tel_no", to_students.mother_business_tel_no)
                    .setString("mother_educational_attainment", to_students.mother_educational_attainment)
                    .setString("mother_last_school_attended", to_students.mother_last_school_attended)
                    .setString("guardian_name", to_students.guardian_name)
                    .setString("guardian_mailing_address", to_students.guardian_mailing_address)
                    .setString("guardian_telephone_no", to_students.guardian_telephone_no)
                    .setString("grade_school_name", to_students.grade_school_name)
                    .setString("grade_school_region", to_students.grade_school_region)
                    .setString("grade_school_school_year", to_students.grade_school_school_year)
                    .setString("high_school_name", to_students.high_school_name)
                    .setString("high_school_region", to_students.high_school_region)
                    .setString("high_school_school_year", to_students.high_school_school_year)
                    .setString("college_school_name", to_students.college_school_name)
                    .setString("college_school_region", to_students.college_school_region)
                    .setString("college_school_school_year", to_students.college_school_school_year)
                    .setString("sibling1", to_students.sibling1)
                    .setString("sibling2", to_students.sibling2)
                    .setString("sibling3", to_students.sibling3)
                    .setString("sibling4", to_students.sibling4)
                    .setString("sibling5", to_students.sibling5)
                    .setString("sibling6", to_students.sibling6)
                    .setString("sibling7", to_students.sibling7)
                    .setString("sibling8", to_students.sibling8)
                    .setString("created_at", to_students.created_at)
                    .setString("updated_at", to_students.updated_at)
                    .setString("created_by", to_students.created_by)
                    .setString("updated_by", to_students.updated_by)
                    .setNumber("status", to_students.status)
                    .setNumber("is_uploaded", to_students.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Students.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from students  "
                    + " where id='" + to_students.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Students.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_students> ret_data(String where) {
        List<to_students> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",is_transferee"
                    + ",academic_year_id"
                    + ",academic_year"
                    + ",student_no"
                    + ",last_name"
                    + ",first_name"
                    + ",middle_name"
                    + ",nick_name"
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
                    + ",high_school_name"
                    + ",high_school_region"
                    + ",high_school_school_year"
                    + ",college_school_name"
                    + ",college_school_region"
                    + ",college_school_school_year"
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
                    + " from students"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int is_transferee = rs.getInt(2);
                int academic_year_id = rs.getInt(3);
                String academic_year = rs.getString(4);
                String student_no = rs.getString(5);
                String last_name = rs.getString(6);
                String first_name = rs.getString(7);
                String middle_name = rs.getString(8);
                String nick_name = rs.getString(9);
                String permanent_address = rs.getString(10);
                String email_address = rs.getString(11);
                String postal_code = rs.getString(12);
                String tel_no = rs.getString(13);
                String mobile_no = rs.getString(14);
                String date_of_birth = rs.getString(15);
                String place_of_birth = rs.getString(16);
                int age = rs.getInt(17);
                int gender = rs.getInt(18);
                String citizenship = rs.getString(19);
                String religion = rs.getString(20);
                String civil_status = rs.getString(21);
                String spouse_name = rs.getString(22);
                String date_of_communion = rs.getString(23);
                String date_of_confirmation = rs.getString(24);
                int is_right_handed = rs.getInt(25);
                int level_id = rs.getInt(26);
                String level = rs.getString(27);
                int college_id = rs.getInt(28);
                String college = rs.getString(29);
                int department_id = rs.getInt(30);
                String department = rs.getString(31);
                String year_level = rs.getString(32);
                String year_level_status = rs.getString(33);
                String preferred_course1 = rs.getString(34);
                String preferred_course2 = rs.getString(35);
                String preferred_course3 = rs.getString(36);
                String father_name = rs.getString(37);
                String father_citizenship = rs.getString(38);
                String father_home_address = rs.getString(39);
                String father_email_address = rs.getString(40);
                String father_mobile_no = rs.getString(41);
                String father_occupation = rs.getString(42);
                String father_employer = rs.getString(43);
                String father_business_address = rs.getString(44);
                String father_business_tel_no = rs.getString(45);
                String father_educational_attainment = rs.getString(46);
                String father_last_school_attended = rs.getString(47);
                String mother_name = rs.getString(48);
                String mother_citizenship = rs.getString(49);
                String mother_home_address = rs.getString(50);
                String mother_email_address = rs.getString(51);
                String mother_mobile_no = rs.getString(52);
                String mother_occupation = rs.getString(53);
                String mother_employer = rs.getString(54);
                String mother_business_address = rs.getString(55);
                String mother_business_tel_no = rs.getString(56);
                String mother_educational_attainment = rs.getString(57);
                String mother_last_school_attended = rs.getString(58);
                String guardian_name = rs.getString(59);
                String guardian_mailing_address = rs.getString(60);
                String guardian_telephone_no = rs.getString(61);
                String grade_school_name = rs.getString(62);
                String grade_school_region = rs.getString(63);
                String grade_school_school_year = rs.getString(64);
                String high_school_name = rs.getString(65);
                String high_school_region = rs.getString(66);
                String high_school_school_year = rs.getString(67);
                String college_school_name = rs.getString(68);
                String college_school_region = rs.getString(69);
                String college_school_school_year = rs.getString(70);
                String sibling1 = rs.getString(71);
                String sibling2 = rs.getString(72);
                String sibling3 = rs.getString(73);
                String sibling4 = rs.getString(74);
                String sibling5 = rs.getString(75);
                String sibling6 = rs.getString(76);
                String sibling7 = rs.getString(77);
                String sibling8 = rs.getString(78);
                String created_at = rs.getString(79);
                String updated_at = rs.getString(80);
                String created_by = rs.getString(81);
                String updated_by = rs.getString(82);
                int status = rs.getInt(83);
                int is_uploaded = rs.getInt(84);

                to_students to = new to_students(id, is_transferee, academic_year_id, academic_year, student_no, last_name, first_name, middle_name, nick_name, permanent_address, email_address, postal_code, tel_no, mobile_no, date_of_birth, place_of_birth, age, gender, citizenship, religion, civil_status, spouse_name, date_of_communion, date_of_confirmation, is_right_handed, level_id, level, college_id, college, department_id, department, year_level, year_level_status, preferred_course1, preferred_course2, preferred_course3, father_name, father_citizenship, father_home_address, father_email_address, father_mobile_no, father_occupation, father_employer, father_business_address, father_business_tel_no, father_educational_attainment, father_last_school_attended, mother_name, mother_citizenship, mother_home_address, mother_email_address, mother_mobile_no, mother_occupation, mother_employer, mother_business_address, mother_business_tel_no, mother_educational_attainment, mother_last_school_attended, guardian_name, guardian_mailing_address, guardian_telephone_no, grade_school_name, grade_school_region, grade_school_school_year, high_school_name, high_school_region, high_school_school_year, college_school_name, college_school_region, college_school_school_year, sibling1, sibling2, sibling3, sibling4, sibling5, sibling6, sibling7, sibling8, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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

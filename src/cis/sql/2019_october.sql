/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Oct 24, 2019
 */



drop schema if exists db_cis_cosca;
create schema db_cis_cosca;
use db_cis_cosca;

drop table if exists colleges;
create table colleges(
id int auto_increment primary key
,college_name varchar(255)
,college_admin_id int
,college_admin_name varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists departments;
create table departments(
id int auto_increment primary key
,department_name varchar(255)
,college_id int
,department_admin_id int
,department_admin_name varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists courses;
create table courses(
id int auto_increment primary key
,course_code varchar(255)
,course_description varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department_name varchar(255)
,no_of_years int
,studies varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists academic_years;
create table academic_years(
id int auto_increment primary key
,academic_year varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists academic_year_terms;
create table academic_year_terms(
id int auto_increment primary key
,term varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists year_levels;
create table year_levels(
id int auto_increment primary key
,level varchar(255)
,year_level varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists rooms;
create table rooms(
id int auto_increment primary key
,room varchar(255)
,description varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists time_schedules;
create table time_schedules(
id int auto_increment primary key
,time_interval varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);






drop table if exists subjects;
create table subjects(
id int auto_increment primary key
,subject_code varchar(255)
,description varchar(255)
,level_id int /* General Education, Senior High, Tertiary*/
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,units double
,amount double
,is_lab int
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists curriculums;
create table curriculums(
id int auto_increment primary key
,academic_year varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists curriculum_subjects;
create table curriculum_subjects(
id int auto_increment primary key
,curriculum_id int
,academic_year varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,term varchar(255) /* Basis Ed - 1 Year, SHS - , Tertiary - 1st Semester, 2nd Semester*/
,year_level varchar(255)
,subject_code varchar(255)
,description varchar(255)
,units double
,amount double
,is_lab int
,max_students int
,prerequisite_subject_ids varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists users;
create table users(
id int auto_increment primary key
,fname varchar(255)
,lname varchar(255)
,mi varchar(255)
,user_name varchar(255)
,password varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists faculty_members;
create table faculty_members(
id int auto_increment primary key
,fname varchar(255)
,lname varchar(255)
,mi varchar(255)
,designation varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,is_fulltime int
,user_name varchar(255)
,password varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);



drop table if exists students;
create table students(
id int auto_increment primary key
,student_no varchar(255)
,last_name varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,nick_name varchar(255)
,permanent_address varchar(255)
,email_address varchar(255)
,postal_code varchar(255)
,tel_no varchar(255)
,mobile_no varchar(255)
,date_of_birth date
,place_of_birth varchar(255)
,age int
,gender int
,citizenship varchar(255)
,religion varchar(255)
,civil_status varchar(255)
,spouse_name varchar(255)
,date_of_communion date
,date_of_confirmation date
,is_right_handed int
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,year_level varchar(255)
,year_level_status varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);



drop table if exists enrollments;
create table enrollments(
id int auto_increment primary key
,enrollment_no varchar(255)
,fname varchar(255)
,lname varchar(255)
,mi varchar(255)
,student_no varchar(255)
,last_name varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,nick_name varchar(255)
,curriculum_id int
,academic_year varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,term varchar(255) /* Basis Ed - 1 Year, SHS - , Tertiary - 1st Semester, 2nd Semester*/
,year_level varchar(255)
,encoded_by_id varchar(255)
,encoded_by varchar(255)
,encoded_date datetime
,assessed_by_id varchar(255)
,assessed_by varchar(255)
,assessed_date datetime
,advised_by_id varchar(255)
,advised_by varchar(255)
,advised_date date
,approved_by_id varchar(255)
,approved_by varchar(255)
,approved_date datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);



drop table if exists enrollment_loads;
create table enrollment_loads(
id int auto_increment primary key
,student_enrollment_id int
,enrollment_no varchar(255)
,student_no varchar(255)
,last_name varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,nick_name varchar(255)
,curriculum_id int
,academic_year varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,term varchar(255) /* Basis Ed - 1 Year, SHS - , Tertiary - 1st Semester, 2nd Semester*/
,year_level varchar(255)
,subject_code varchar(255)
,description varchar(255)
,units double
,amount double
,is_lab int
,prerequisite_subject_ids varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists users;
create table users(
id int auto_increment primary key
,user_screen_name varchar(255)
,user_name varchar(255)
,password varchar(255)
,date_added datetime
,date_updated datetime
,added_by_id varchar(255)
,update_by_id varchar(255)
,status int
);

drop table if exists user_default_privileges;
create table user_default_privileges(
id int auto_increment primary key
,account varchar(255)
,privilege varchar(255)
,date_added datetime
,date_updated datetime
,added_by_id varchar(255)
,update_by_id varchar(255)
);
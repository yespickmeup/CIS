/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Feb 13, 2020
 */




drop table if exists enrollment_offered_subjects;
create table enrollment_offered_subjects(
id int auto_increment primary key
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
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
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,units double
,lecture_units double
,lab_units double
,amount double
,is_lab int
,max_students int
,prerequisite_subject_ids varchar(255)
,subject_group varchar(255)
,subject_group_id int
,faculty_id varchar(255)
,faculty_name varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists enrollment_offered_subject_sections;
create table enrollment_offered_subject_sections(
id int auto_increment primary key
,enrollment_offered_subject_id int
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
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
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,units double
,lecture_units double
,lab_units double
,amount double
,is_lab int
,max_students int
,faculty_id varchar(255)
,faculty_name varchar(255)
,section varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,day varchar(255)
,time varchar(255)
,start_time date
,closing_time date
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists enrollment_offered_subject_section_room_schedules;
create table enrollment_offered_subject_section_room_schedules(
id int auto_increment primary key
,enrollment_offered_subject_section_id int
,enrollment_offered_subject_id int
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
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
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,day varchar(255)
,time varchar(255)
,start_time datetime
,closing_time datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists enrollment_offered_subject_section_instructors;
create table enrollment_offered_subject_section_instructors(
id int auto_increment primary key
,enrollment_offered_subject_section_id int
,enrollment_offered_subject_id int
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
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
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,faculty_id varchar(255)
,faculty_name varchar(255)
,section varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,day varchar(255)
,time varchar(255)
,start_time datetime
,closing_time datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);




drop table if exists enrollment_student_loaded_subjects;
create table enrollment_student_loaded_subjects(
id int auto_increment primary key
,enrollment_id int
,enrollment_no varchar(255)
,student_id int
,student_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,enrollment_offered_subject_section_id int
,enrollment_offered_subject_id int
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
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
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,lecture_units int
,lab_units int
,faculty_id varchar(255)
,faculty_name varchar(255)
,section varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,day varchar(255)
,time varchar(255)
,start_time datetime
,closing_time datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists academic_year_fees;
create table academic_year_fees(
id int auto_increment primary key
,academic_year_id int
,academic_year varchar(255)
,department_id int
,department varchar(255)
,level_id int
,level varchar(255)
,course_id int
,course varchar(255)
,period varchar(255)
,group_id int
,group_name varchar(255)
,fee_id int
,fee varchar(255)
,amount double 
,is_per_unit int
,per_unit double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists tuition_fees;
create table tuition_fees(
id int auto_increment primary key
,fee varchar(255)
,amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists miscellaneous_fees;
create table miscellaneous_fees(
id int auto_increment primary key
,fee varchar(255)
,amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists other_school_fees;
create table other_school_fees(
id int auto_increment primary key
,fee varchar(255)
,amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);



drop table if exists mode_of_payments;
create table mode_of_payments(
id int auto_increment primary key
,mode varchar(255)
,nos int
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);




drop table if exists enrollment_assessments;
create table enrollment_assessments(
id int auto_increment primary key
,enrollment_id int
,enrollment_no varchar(255)
,student_id int
,student_no varchar(255)
,fname varchar(255)
,lname varchar(255)
,mi varchar(255)
,academic_year_id int
,academic_year varchar(255)
,curriculum_id int
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,term varchar(255) 
,year_level varchar(255)
,year_level_status varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,tuition_amount double
,no_of_units int
,amount_per_unit double
,tuition_discount double
,miscellaneous_amount double
,miscellaneous_discount double
,other_fees_amount double
,other_fees_discount double
,mode_of_payment int 
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists enrollment_assessment_payment_modes;
create table enrollment_assessment_payment_modes(
id int auto_increment primary key
,enrollment_assessment_id int
,enrollment_id int
,enrollment_no varchar(255)
,academic_year_id int
,academic_year varchar(255)
,mode varchar(255)
,mode_order int
,to_pay date
,amount double
,discount double
,paid double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


alter table enrollments add student_id int after approved_date;
alter table enrollments add date_enrolled datetime after approved_date;
alter table enrollments change date_enrolled date_enrolled datetime;
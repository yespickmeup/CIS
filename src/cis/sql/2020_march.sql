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

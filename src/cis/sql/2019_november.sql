/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Nov 24, 2019
 */


drop table if exists faculty_member_designations;
create table faculty_member_designations(
id int auto_increment primary key
,group_id int
,group_name varchar(255)
,designation varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

drop table if exists faculty_member_designation_groups;
create table faculty_member_designation_groups(
id int auto_increment primary key
,group_name varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists classrooms;
create table classrooms(
id int auto_increment primary key
,classroom varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


drop table if exists settings;
create table settings(
id int auto_increment primary key
,company_name varchar(255)
,company_address  varchar(255)
,company_operated_by varchar(255)
,company_slogan varchar(255)
,company_contact_no varchar(255)
,company_fax_no varchar(255)
,company_email_address varchar(255)
,cloud_host varchar(255)
,cloud_port varchar(255)
,cloud_user varchar(255)
,cloud_password varchar(255)
,cloud_db varchar(255)
);

alter table users add faculty_id int default 0;


insert into user_default_privileges(account,privilege)values('Transactions','Enrollment');
insert into user_default_privileges(account,privilege)values('Transactions','Dean');
insert into user_default_privileges(account,privilege)values('Transactions','Registrar');
insert into user_default_privileges(account,privilege)values('Transactions','Accounting');
insert into user_default_privileges(account,privilege)values('Transactions','Faculty');

insert into user_default_privileges(account,privilege)values('Maintenance','Academic Years');
insert into user_default_privileges(account,privilege)values('Maintenance','Academic Offerings');
insert into user_default_privileges(account,privilege)values('Maintenance','Class Schedules');
insert into user_default_privileges(account,privilege)values('Maintenance','Classrooms');
insert into user_default_privileges(account,privilege)values('Maintenance','Courses');
insert into user_default_privileges(account,privilege)values('Maintenance','Colleges');
insert into user_default_privileges(account,privilege)values('Maintenance','Departments');
insert into user_default_privileges(account,privilege)values('Maintenance','Faculty and Staff');
insert into user_default_privileges(account,privilege)values('Maintenance','Subjects');
insert into user_default_privileges(account,privilege)values('Maintenance','Users');
in


alter table academic_offering_subjects add faculty_id int after is_uploaded  ;
alter table academic_offering_subjects add faculty_name varchar(255) default '' ;
alter table academic_offering_subjects add room_id int default 0 ;
alter table academic_offering_subjects add room varchar(255) default '' ;
alter table academic_offering_subjects add schedule varchar(255) default '' ;



drop table if exists academic_offering_subject_sections;
create table academic_offering_subject_sections(
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
,term varchar(255) /* Basis Ed - 1 Year, SHS - , Tertiary - 1st Semester, 2nd Semester*/
,year_level varchar(255)
,section varchar(255)
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
,faculty_id int
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
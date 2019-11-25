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
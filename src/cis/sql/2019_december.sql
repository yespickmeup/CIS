/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Dec 11, 2019
 */


drop table if exists academic_offering_subject_section_schedules;
create table academic_offering_subject_section_schedules(
id int auto_increment primary key
,aoss_id int
,room_id int
,room varchar(255)
,day varchar(255)
,start_time datetime
,end_time datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);


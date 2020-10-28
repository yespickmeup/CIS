/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 10 27, 20
 */

insert into user_default_privileges(account,privilege)values('Maintenance','Student Masterlist');
insert into user_default_privileges(account,privilege)values('Maintenance','Balance Adjustment');

drop table if exists student_balance_adjustments;
create table student_balance_adjustments(
id int auto_increment primary key
,student_id int
,student_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,is_transferee int
,academic_year varchar(255)
,academic_year_id int
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,year_level varchar(255)
,term varchar(255)
,department_id int
,department varchar(255)
,college_id int
,college varchar(255)
,adjustment_amount double
,paid double
,remarks varchar(255)
,status int
,created_at datetime
,created_by int
,updated_at datetime
,updated_by int
);



drop table if exists student_balance_adjustment_payments;
create table student_balance_adjustment_payments(
id int auto_increment primary key
,sba_id int
,student_id int
,student_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,adjustment_amount double
,paid double
,remarks varchar(255)
,status int
,created_at datetime
,created_by int
,updated_at datetime
,updated_by int
);
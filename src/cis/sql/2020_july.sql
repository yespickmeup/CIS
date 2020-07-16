/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 07 2, 20
 */


drop table if exists enrollment_sls_payments;
create table enrollment_sls_payments(
id int auto_increment primary key
,trans_type int
,enrollment_id int
,enrollment_no varchar(255)
,academic_year_id int
,academic_year varchar(255)
,amount_paid double
,cash double
,discount_name varchar(255)
,discount_rate double
,discount_amount double
,discount_customer_name varchar(255)
,discount_customer_id varchar(255)
,check_bank varchar(255)
,check_no varchar(255)
,check_amount double
,check_holder varchar(255)
,check_date date
,credit_card_type varchar(255)
,credit_card_rate double
,credit_card_amount double
,credit_card_no varchar(255)
,credit_card_holder varchar(255)
,gift_certificate_from varchar(255)
,gift_certificate_description varchar(255)
,gift_certificate_no varchar(255)
,gift_certificate_amount double
,online_bank varchar(255)
,online_reference_no varchar(255)
,online_amount double
,online_holder varchar(255)
,online_date date
,lecture_units int
,lab_units int
,lec_amount double
,lab_amount double
,fee_amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
,student_id int
,student_no varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,last_name varchar(255)
);

drop table if exists enrollment_sls_payment_details;
create table enrollment_sls_payment_details(
id int auto_increment primary key
,enrollment_sls_payment_id int
,enrollment_sls_id int
,trans_type int
,enrollment_id int
,enrollment_no varchar(255)
,academic_year_id int
,academic_year varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,lecture_units int
,lab_units int
,lec_amount double
,lab_amount double
,fee_amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
,student_id int
,student_no varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,last_name varchar(255)
);

alter table academic_year_fees add lab_unit_amount double default 0;
alter table enrollments add period varchar(255);
update enrollments set period = 'First Semester';

alter table enrollment_student_loaded_subjects add is_added int default 0;
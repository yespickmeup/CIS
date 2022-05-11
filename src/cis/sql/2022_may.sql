/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 04 28, 22
 */
drop table if exists cash_drawer;

CREATE TABLE `cash_drawer` (
  `id` int(11) auto_increment primary key,
  `session_no` varchar(100) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `screen_name` varchar(100) DEFAULT NULL,
  `time_in` datetime DEFAULT NULL,
  `time_out` datetime DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `cash_out` double DEFAULT NULL,
  `thousand` double DEFAULT NULL,
  `five_hundred` double DEFAULT NULL,
  `two_hundred` double DEFAULT NULL,
  `fifty` double DEFAULT NULL,
  `twenty` double DEFAULT NULL,
  `coins` double DEFAULT NULL,
  `one_hundred` double DEFAULT NULL,
  `expenses` double DEFAULT NULL,
  `ten` double DEFAULT NULL,
  `five` double DEFAULT NULL,
  `one` double DEFAULT NULL,
  `point_five` double DEFAULT NULL,
  `point_two_five` double DEFAULT NULL,
  `point_ten` double DEFAULT NULL,
  `point_zero_five` double DEFAULT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `branch_id` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `location_id` varchar(100) DEFAULT NULL,
  `user_id` varchar(100) DEFAULT NULL,
  `user_screen_name` varchar(100) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT '0',
  `lock_session` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


drop table if exists cash_drawer_checks;

CREATE TABLE `cash_drawer_checks` (
  `id` int(11) auto_increment primary key,
  `session_no` varchar(100) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `screen_name` varchar(100) DEFAULT NULL,
  `time_in` datetime DEFAULT NULL,
  `time_out` datetime DEFAULT NULL,
  `bank` varchar(100) DEFAULT NULL,
  `check_no` varchar(100) DEFAULT NULL,
  `check_holder` varchar(100) DEFAULT NULL,
  `amount` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


drop table if exists cash_drawer_expenses;
CREATE TABLE `cash_drawer_expenses` (
  `id` int(11) auto_increment primary key,
  `session_no` varchar(500) DEFAULT NULL,
  `user_name` varchar(500) DEFAULT NULL,
  `screen_name` varchar(500) DEFAULT NULL,
  `time_in` datetime DEFAULT NULL,
  `time_out` datetime DEFAULT NULL,
  `bank` varchar(500) DEFAULT NULL,
  `check_no` varchar(500) DEFAULT NULL,
  `check_holder` varchar(500) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `date_added` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



drop table if exists disbursements;
CREATE TABLE `disbursements` (
  `id` int(11) auto_increment primary key,
  `user_id` varchar(1000) DEFAULT NULL,
  `user_screen_name` varchar(1000) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `purpose` varchar(1000) DEFAULT NULL,
  `category_id` varchar(1000) DEFAULT NULL,
  `category_name` varchar(1000) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `is_vat` int(11) DEFAULT NULL,
  `disbursement_date` date DEFAULT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `branch_id` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `location_id` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


drop table if exists disbursement_categories;
CREATE TABLE `disbursement_categories` (
  `id` int(11) auto_increment primary key,
  `category_name` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `disbursement_categories`
--

INSERT INTO `disbursement_categories` (`id`, `category_name`) VALUES
(1, 'Transportation'),
(2, 'Maintenance'),
(3, 'Gas and Diesel'),
(4, 'Office'),
(5, 'Taxes'),
(6, 'Wages'),
(7, 'Housekeeping'),
(8, 'Utilities'),
(9, 'Snacks');


insert into user_default_privileges(account,privilege)values('Transactions','Disbursements');
insert into user_default_privileges(account,privilege)values('Maintenance','Disbursement Categories');

insert into user_default_privileges(account,privilege)values('Reports','Collections Report');


alter table enrollment_assessment_payments add collection_id int;
alter table enrollment_assessment_payments add collection_no varchar(255);
alter table enrollment_assessment_payments add collection_sales_no varchar(255);

alter table enrollment_sls_payments add collection_id int;
alter table enrollment_sls_payments add collection_no varchar(255);
alter table enrollment_sls_payments add collection_sales_no varchar(255);

alter table student_balance_adjustment_payments add collection_id int;
alter table student_balance_adjustment_payments add collection_no varchar(255);
alter table student_balance_adjustment_payments add collection_sales_no varchar(255);


drop table if exists collections;
create table collections(
id int auto_increment 
,collection_no varchar(255)
,or_no varchar(255)
,payment_type varchar(255)
,amount_paid double
,cash double
,discount_name varchar(255)
,discount_rate double
,discount_amount double
,discount_customer_name varchar(255)
,discount_customer_id varchar(255)
,check_amount double
,check_bank varchar(255)
,check_no varchar(255)
,check_holder varchar(255)
,check_date date
,credit_card_type varchar(255)
,credit_card_rate double
,credit_card_amount double
,credit_card_no varchar(255)
,gift_certificate_from varchar(255)
,gift_certificate_description varchar(255)
,gift_certificate_no varchar(255)
,gift_certificate_amount double
,online_bank varchar(255)
,online_reference_no varchar(255)
,online_amount double
,online_holder varchar(255)
,online_date date
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
,ref_id int
,school_year varchar(255)
,period varchar(255)
,year_level varchar(255)
,department_id varchar(255)
,department varchar(255)
,college_id varchar(255)
,college varchar(255)
,course_id varchar(255)
,course varchar(255)
,primary key(id,collection_no)
);



insert into user_default_privileges(account,privilege)values('Transactions','Finance Encoding');


alter table student_balance_adjustments add particular_id int;
alter table student_balance_adjustments add particular varchar(255);
alter table student_balance_adjustments add is_payable int;
alter table student_balance_adjustments add is_add int;

alter table student_balance_adjustment_payments add particular_id int;
alter table student_balance_adjustment_payments add particular varchar(255);


drop table if exists account_particulars;
create table account_particulars(
id int auto_increment primary key
,particular varchar(255)
,particular_type int
,account_type_id int
,account_type varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
);



insert into banks(bank) values
('Cebuana')
,('Palawan')
,('MLhuillier')
,('GCash')
;




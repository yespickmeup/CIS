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
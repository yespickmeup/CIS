/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 07 25, 22
 */

drop table if exists discount_types;
create table discount_types(
id int auto_increment primary key
,discount_name varchar(255)
,is_tution int
,is_tuition_percent int
,tuition_rate double
,tuition_amount double
,is_misc int
,is_misc_percent int
,misc_rate double
,misc_amount double
,is_total int
,is_total_percent int
,total_rate double
,total_amount double
,created_at datetime
,created_by int
);

drop table if exists enrollment_assessment_discounts;
create table enrollment_assessment_discounts(
id int auto_increment primary key
,enrollment_assessment_id int
,enrollment_assessment_no varchar(255)
,enrollment_id int
,enrollment_no varchar(255)
,academic_year_id int
,academic_year varchar(255)
,discount_name varchar(255)
,is_tution int
,is_tuition_percent int
,tuition_rate double
,tuition_amount double
,is_misc int
,is_misc_percent int
,misc_rate double
,misc_amount double
,is_total int
,is_total_percent int
,total_rate double
,total_amount double
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
);


INSERT INTO `students` (`id`, `is_transferee`, `academic_year_id`, `academic_year`, `student_no`, `last_name`, `first_name`, `middle_name`, `nick_name`, `current_address`, `permanent_address`, `email_address`, `postal_code`, `tel_no`, `mobile_no`, `date_of_birth`, `place_of_birth`, `age`, `gender`, `citizenship`, `religion`, `civil_status`, `spouse_name`, `date_of_communion`, `date_of_confirmation`, `is_right_handed`, `is_indigenous`, `indigenous_name`, `level_id`, `level`, `college_id`, `college`, `department_id`, `department`, `year_level`, `year_level_status`, `preferred_course1`, `preferred_course2`, `preferred_course3`, `father_name`, `father_citizenship`, `father_home_address`, `father_email_address`, `father_mobile_no`, `father_occupation`, `father_employer`, `father_business_address`, `father_business_tel_no`, `father_educational_attainment`, `father_last_school_attended`, `mother_name`, `mother_citizenship`, `mother_home_address`, `mother_email_address`, `mother_mobile_no`, `mother_occupation`, `mother_employer`, `mother_business_address`, `mother_business_tel_no`, `mother_educational_attainment`, `mother_last_school_attended`, `guardian_name`, `guardian_mailing_address`, `guardian_telephone_no`, `grade_school_name`, `grade_school_region`, `grade_school_school_year`, `grade_school_awards`, `high_school_name`, `high_school_region`, `high_school_school_year`, `high_school_awards`, `college_school_name`, `college_school_region`, `college_school_school_year`, `college_awards`, `junior_high_name`, `junior_high_region`, `junior_high_year`, `junior_high_awards`, `tesda_name`, `tesda_region`, `tesda_year`, `tesda_awards`, `sibling1`, `sibling2`, `sibling3`, `sibling4`, `sibling5`, `sibling6`, `sibling7`, `sibling8`, `created_at`, `updated_at`, `created_by`, `updated_by`, `status`, `is_uploaded`, `course_id`, `course_code`, `course_description`, `date_enrolled`, `balance`, `prepaid`, `fb_account`, `blood_type`, `als_name`, `als_region`, `als_year`, `als_awards`, `high_school_strand`, `high_school_track`) VALUES
(621, 2, 10, '2021 - 2022', '20200619', 'QUIBOT', 'DANICA', 'AUDITOR', 'DAN', 'PUROK YELLOW BELL SOUTH BAGACAY DUMAGUETE CITY', 'PUROK YELLOW BELL SOUTH BAGACAY DUMAGUETE CITY', 'danicaquibot12@gmail.com', '', '', '09658028780', '2001-09-13', 'PAMPLONA NEGROS ORIENTAL', 18, 1, 'Filipino', 'Roman Catholic', '1', '', NULL, NULL, 0, 0, '', 213, 'Batchelo of Science in Hospitality Management (ABM Track)', 9, 'College of Business Education', 5, 'TERTIARY DEPARTMENT', 'First Year', 'Regular', '', '', '', ' DIONY A. QUIBOT%%', 'FILIPINO', 'PUROK YELLOW BELL SOUTH BAGACAY DUMAGUETE CITY', '', '09533625755', 'DRIVER', '', '', '', '', '', 'JANET  A. QUIBOT%%', 'FILIPINO', 'PUROK YELLOW BELL SOUTH BAGACAY DUMAGUETE CITY', '', '', 'HOUSEWIFE', '', '', '', '', '', ' DIONY A. QUIBOT', 'PUROK YELLOW BELL SOUTH BAGACAY DUMAGUETE CITY', '09533625755', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Region 7', '', '', '', 'Region 7', '', '', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '2020-08-11 18:16:19', '2022-01-12 16:39:48', '12', '46', 0, 0, 213, 'BSHM 2018 ABM', 'Bachelor of Science in Hospitality Management (ABM Track)', '2020-08-11', 56305, 0, 'danica auditor quibot', '', '', '', '', '', '', '');

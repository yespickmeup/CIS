/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 03 5, 23
 */


select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where lab_units=5 and academic_year='2022 - 2023';

update enrollment_student_loaded_subjects set lecture_units=2, lab_units=3 where lab_units=5 and academic_year='2022 - 2023';

INSERT INTO `students` (`id`, `is_transferee`, `academic_year_id`, `academic_year`, `student_no`, `last_name`, `first_name`, `middle_name`, `nick_name`, `current_address`, `permanent_address`, `email_address`, `postal_code`, `tel_no`, `mobile_no`, `date_of_birth`, `place_of_birth`, `age`, `gender`, `citizenship`, `religion`, `civil_status`, `spouse_name`, `date_of_communion`, `date_of_confirmation`, `is_right_handed`, `is_indigenous`, `indigenous_name`, `level_id`, `level`, `college_id`, `college`, `department_id`, `department`, `year_level`, `year_level_status`, `preferred_course1`, `preferred_course2`, `preferred_course3`, `father_name`, `father_citizenship`, `father_home_address`, `father_email_address`, `father_mobile_no`, `father_occupation`, `father_employer`, `father_business_address`, `father_business_tel_no`, `father_educational_attainment`, `father_last_school_attended`, `mother_name`, `mother_citizenship`, `mother_home_address`, `mother_email_address`, `mother_mobile_no`, `mother_occupation`, `mother_employer`, `mother_business_address`, `mother_business_tel_no`, `mother_educational_attainment`, `mother_last_school_attended`, `guardian_name`, `guardian_mailing_address`, `guardian_telephone_no`, `grade_school_name`, `grade_school_region`, `grade_school_school_year`, `grade_school_awards`, `high_school_name`, `high_school_region`, `high_school_school_year`, `high_school_awards`, `college_school_name`, `college_school_region`, `college_school_school_year`, `college_awards`, `junior_high_name`, `junior_high_region`, `junior_high_year`, `junior_high_awards`, `tesda_name`, `tesda_region`, `tesda_year`, `tesda_awards`, `sibling1`, `sibling2`, `sibling3`, `sibling4`, `sibling5`, `sibling6`, `sibling7`, `sibling8`, `created_at`, `updated_at`, `created_by`, `updated_by`, `status`, `is_uploaded`, `course_id`, `course_code`, `course_description`, `date_enrolled`, `balance`, `prepaid`, `fb_account`, `blood_type`, `als_name`, `als_region`, `als_year`, `als_awards`, `high_school_strand`, `high_school_track`) VALUES
(3186, 0, 12, '2022 - 2023', '20220152', 'DIAZ', 'CHRISTELL JHANE', 'BALIGASA', 'CJ', '', 'PANCIL LOOC SIBULAN DUMAGUETE CITY NEG. OR. ', 'DIAZCHRISTELL16@GMAIL.COM', '6201', '', '0918-550-5017', '2003-10-29', 'NOPH', 18, 0, 'Filipino', 'Roman Catholic', '1', '', NULL, NULL, 1, 0, '', 13, 'College of Allied Health Sciences', 13, 'College of Allied Health Sciences', 5, 'TERTIARY DEPARTMENT', 'First Year', NULL, 'MIDWIFERY', '', '', 'AMELIO III%M%DIAZ', 'FILIPINO', 'SAN JOSE NEG. OR. ', '', '', '', '', '', '', '', '', 'CRISTINA%S%BALIGASA', 'FILIPINO', 'PANCIL LOOC SIBULAN NEG. OR ', '', '0936-958-2325', 'OFW', '', '', '', 'HIGH SCHOOL GRADUATE', 'SIBULAN NHS', '', '', '', 'SIBULAN CENTRAL ELEMENTARY SCHOOL', '', '2009-2016', '', 'NOHS', '', '2020-2022', '', '', '', '', '', 'NOHS', 'Region 7', '2016-2020', '', '', 'Region 7', '', '', 'AMYLL HAYLE L. DIAZ%15%SINGLE%PAMPLONA NATIONAL %%2022%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '%%%%%%', '2022-07-13 17:15:09', '2022-07-13 17:15:09', '47', '47', 0, 0, 257, 'MID 2022', 'Laderized Bachelor of Science in Midwifery Program', '2022-07-13', 3000, 0, 'CHRISTELL JHANE BALIGASA DIAZ', 'AB+', '', 'Region 7', '', '', '', 'STEM');


select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where subject_code like 'FORENSIC4' and academic_year='2022 - 2023';
update enrollment_student_loaded_subjects set lecture_units=1, lab_units=2 where subject_code like 'FORENSIC4' and academic_year='2022 - 2023';

Subject Code: FORENSIC4
Rows: 144 

select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where subject_code like 'DEFTACT04' and academic_year='2022 - 2023';
update enrollment_student_loaded_subjects set lecture_units=0, lab_units=2 where subject_code like 'DEFTACT04' and academic_year='2022 - 2023';

Subject Code: DEFTACT04
Rows: 404 records

select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where subject_code like 'RT10' and academic_year='2022 - 2023';
update enrollment_student_loaded_subjects set lecture_units=1, lab_units=1 where subject_code like 'RT10' and academic_year='2022 - 2023';

Subject Code: RT10
Rows: 174

select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where subject_code like 'RT11' and academic_year='2022 - 2023';
update enrollment_student_loaded_subjects set lecture_units=2, lab_units=1 where subject_code like 'RT11' and academic_year='2022 - 2023';

Subject Code: RT11
Rows: 168


select id,subject_code,academic_year,term,year_level,student_no, concat(lname,',',fname,' ',mi) as name ,lecture_units, lab_units,created_at from enrollment_student_loaded_subjects where subject_code like 'FORENSIC3' and academic_year='2022 - 2023';
update enrollment_student_loaded_subjects set lecture_units=2, lab_units=3 where subject_code like 'FORENSIC3' and academic_year='2022 - 2023';

Subject Code: FORENSIC4
Rows: 144 














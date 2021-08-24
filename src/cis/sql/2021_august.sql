/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 08 3, 21
 */

update enrollments set academic_year='2021 - 2022' where academic_year='2021 - 2021'  and academic_year_id='10';

update enrollment_assessments set academic_year='2021 - 2022' where academic_year='2021 - 2021'  and academic_year_id='10';

update students set academic_year='2021 - 2022' where academic_year='2021 - 2021'  and academic_year_id='10';

update academic_year_period_schedules set academic_year='2021 - 2022' where academic_year='2021 - 2021' and academic_year_id='10';


update enrollment_student_loaded_subjects set enrollment_id=4396,enrollment_no='00004329' where enrollment_id='4325';


update enrollments set period='First Semester' where period like 'Semester';

update enrollment_student_loaded_subjects set enrollment_id=4330,enrollment_no='00004263' where enrollment_id='4327';


update students set student_no='20210000' where id=2714;
update enrollments set student_no='20210000' where id=4948;
update enrollments set student_no='20210000' where id=2714;
update enrollment_assessments set student_no='20210000',student_id=2714 where enrollment_id=4948;
update enrollment_assessment_payments set student_no='20210000',student_id=2714 where enrollment_id=4948;
update  enrollment_student_loaded_subjects set student_no='20210000',student_id=2714 where enrollment_id=4948;


ALTER TABLE  students ADD UNIQUE (student_no);

-- delete from enrollment_offered_subject_sections where enrollment_offered_subject_id=593;


select * from enrollment_offered_subject_section_room_schedules where enrollment_offered_subject_id=593; 
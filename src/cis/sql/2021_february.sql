/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 02 3, 21
 */

update enrollment_student_loaded_subjects esld set esld.student_no=(select e.student_no from enrollments e where esld.enrollment_no=e.enrollment_no) where esld.student_id=0;

update enrollment_student_loaded_subjects esld set esld.student_id=(select e.id from students e where esld.student_no=e.student_no) where esld.student_id=0;

update students set academic_year="2020 - 2021" where academic_year like '';

update enrollments set academic_year="2020 - 2021" where academic_year like '';
update enrollment_assessments set academic_year="2020 - 2021" where academic_year like '';


SELECT 
    concat(last_name,space(1),first_name,space(1),middle_name) as name,
    GROUP_CONCAT(id order by id asc separator ', ') as ids,
    GROUP_CONCAT(student_no order by student_no asc separator ', ') as student_nos
   
FROM
    students
GROUP BY concat(last_name,space(1),first_name,space(1),middle_name)
HAVING COUNT(concat(last_name,space(1),first_name,space(1),middle_name)) > 1;


select student_id,student_no from enrollments where student_id=0 and student_no is not null;

update enrollments ea set ea.student_id=(select s.id from students s where s.student_no=ea.student_no limit 1) where ea.student_id=0 and ea.student_no is not null;

update enrollments e set e.student_id=(select ea.student_id from enrollment_assessments ea where e.enrollment_no=ea.enrollment_no limit 1),e.student_no=(select ea.student_no from enrollment_assessments ea where e.enrollment_no=ea.enrollment_no limit 1) where e.student_id=0 and e.student_no is null;

update enrollment_student_loaded_subjects ea set ea.student_id=(select s.id from students s where s.student_no=ea.student_no limit 1) where ea.student_id=0 and ea.student_no is not null;




select count(es.id) from enrollment_student_loaded_subjects es join students s on es.student_id=s.id where es.status=0 and s.date_enrolled is not null;
select es.subject_code,es.section,es.faculty_name,es.created_at,(select count(esl.id) from enrollment_student_loaded_subjects esl where esl.enrollment_offered_subject_section_id=es.enrollment_offered_subject_section_id and esl.status=1 limit 1)  from enrollment_student_loaded_subjects es join students s on es.student_id=s.id where es.status=0 and s.date_enrolled is not null and YEAR(es.created_at) !='2020' group by es.enrollment_offered_subject_section_id;

update enrollment_student_loaded_subjects es join students s on es.student_id=s.id set es.status=1 where es.status=0 and s.date_enrolled is not null;


select count(id) from enrollments  where period like '' and department_id=5;
update enrollments set period='Second Semester'  where period like '' and department_id=5 and YEAR(created_at)='2021';


select s.id,s.student_no,(select e.created_at from enrollments e where Year(created_at)='2021' and e.student_id=s.id limit 1) from students s  ;






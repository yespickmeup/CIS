/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 03 2, 21
 */



select count(es.id) from enrollment_student_loaded_subjects es join students s on es.student_id=s.id where es.status=0 and s.date_enrolled is not null;

select es.subject_code,es.section,es.faculty_name,es.created_at,(select count(esl.id) from enrollment_student_loaded_subjects esl where esl.enrollment_offered_subject_section_id=es.enrollment_offered_subject_section_id and esl.status=1 limit 1)  from enrollment_student_loaded_subjects es join students s on es.student_id=s.id where es.status=0 and s.date_enrolled is not null and YEAR(es.created_at) !='2020' group by es.enrollment_offered_subject_section_id;





-- 1
select id,student_id,student_no from enrollments where student_id=0 and student_no is not null;
update enrollments ea set ea.student_id=(select s.id from students s where s.student_no=ea.student_no limit 1) where ea.student_id=0 and ea.student_no is not null;

-- 2
select enrollment_id,enrollment_no,lname,fname,mi from enrollment_student_loaded_subjects where student_id is null and student_no like '' group by enrollment_no;

update enrollment_student_loaded_subjects esls set esls.student_id=(select e.student_id from enrollments e where e.id=esls.enrollment_id limit 1),esls.student_no=(select e.student_no from enrollments e where e.id=esls.enrollment_id limit 1) where student_id is null and student_no is not null;

-- 3
select count(id) from enrollments  where period like '' and department_id=5;
update enrollments set period='Second Semester' where period like '' and department_id=5;

-- 4
SELECT 
    concat(last_name,space(1),first_name,space(1),middle_name) as name,
    GROUP_CONCAT(id order by id asc separator ', ') as ids,
    GROUP_CONCAT(student_no order by student_no asc separator ', ') as student_nos,
    course_code,
    GROUP_CONCAT(created_at)
   
FROM
    students
GROUP BY concat(last_name,space(1),first_name,space(1),middle_name)
HAVING COUNT(concat(last_name,space(1),first_name,space(1),middle_name)) > 1;


-- 5
SELECT 
    concat(last_name,space(1),first_name,space(1),middle_name) as name,
    GROUP_CONCAT(id order by id asc separator ', ') as ids,
    GROUP_CONCAT(student_no order by student_no asc separator ', ') as student_nos
FROM
    enrollments
GROUP BY concat(last_name,space(1),first_name,space(1),middle_name),date_of_birth
HAVING COUNT(student_no) > 1;



-- 03/09/2021
-- 1
select student_id, student_no,fname,lname,enrollment_id from enrollment_student_loaded_subjects where student_no is not null and student_id is null ;

update enrollment_student_loaded_subjects es set es.student_id=(select s.id from students s where es.student_no=s.student_no) where es.student_no is not null and es.student_id is null ;

select e.student_no,e.last_name,e.first_name,s.id from enrollments e left join students s on s.id=e.student_id;

select student_id, student_no,first_name,last_name,id,created_at from enrollments where student_no is not null and student_id is null ;

update enrollments es set es.student_id=(select s.id from students s where es.student_no=s.student_no) where es.student_no is not null and es.student_id is null ;

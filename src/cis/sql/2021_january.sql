/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 01 29, 21
 */


alter table enrollment_student_loaded_subjects add final_grade double default 0;
alter table enrollment_student_loaded_subjects add final_grade_remarks varchar(255);
alter table enrollment_student_loaded_subjects add final_grade_created_at datetime;
alter table enrollment_student_loaded_subjects add final_grade_created_by varchar(255);


drop table if exists enrollment_student_loaded_subject_grades;
create table enrollment_student_loaded_subject_grades(
id int auto_increment primary key
,enrollment_student_loaded_subject_id int
,first double
,second double
,third double
,fourth double
,fifth double
,sixth double
,remarks varchar(255)
,created_at datetime
,created_by varchar(255)
,updated_at datetime
,updated_by varchar(255)
,status int
);


SELECT * FROM `enrollment_student_loaded_subjects` WHERE enrollment_offered_subject_id<=254 and Date(created_at) BETWEEN '2021-01-01' and '2021-03-01';

update enrollment_student_loaded_subjects set term ="Second Semester" WHERE enrollment_offered_subject_id<=254 and Date(created_at) BETWEEN "2021-01-01" and "2021-03-01";

SELECT 
    student_no, 
    COUNT(student_no)
FROM
    students
GROUP BY student_no
HAVING COUNT(student_no) > 1;

--  20210002   |                 2
--  20210003   |                 2
--  20210005   |                 5

--  Si Quibot, Danica ga doble ang mode of payment. 20210002


delete from enrollment_assessment_payment_modes where id>=9568 and id<=9571;


update students set student_no='20210003' where id=1535;
update students set student_no='20210004' where id=1536;
update students set student_no='20210005' where id=1537;
update students set student_no='20210006' where id=1538;
update students set student_no='20210007' where id=1539;
update students set student_no='20210008' where id=1540;
update students set student_no='20210009' where id=1541;
update students set student_no='20210010' where id=1542;
update students set student_no='20210011' where id=1543;
update students set student_no='20210012' where id=1544;

update enrollments e set e.student_no=(select s.student_no from students s where e.student_id=s.id);
update students set academic_year='2020 - 2021' where academic_year like '';
update enrollments set academic_year='2020 - 2021' where academic_year like '';
select id,student_no from students order by id desc limit 1;
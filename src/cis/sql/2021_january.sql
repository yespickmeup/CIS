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


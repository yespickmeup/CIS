/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 07 21, 21
 */

insert into user_default_privileges(account,privilege)values('Reports','Grade Sheet');

update  enrollments e set 
e.student_id=(select s.id from students s where s.last_name=e.last_name and s.first_name=e.first_name and s.middle_name=e.middle_name and s.date_of_birth=e.date_of_birth limit 1)
,e.student_no=(select s.student_no from students s where s.last_name=e.last_name and s.first_name=e.first_name and s.middle_name=e.middle_name and s.date_of_birth=e.date_of_birth limit 1)
where e.student_id is null;

update enrollment_assessments ea set 
ea.student_id=(select e.student_id from enrollments e where ea.enrollment_id=e.id limit 1)
,ea.student_no=(select e.student_no from enrollments e where ea.enrollment_id=e.id limit 1)
where ea.student_id=976;


update enrollment_student_loaded_subjects_drop_requests ea set 
ea.student_id=(select e.student_id from enrollments e where ea.enrollment_id=e.id limit 1)
,ea.student_no=(select e.student_no from enrollments e where ea.enrollment_id=e.id limit 1)
where ea.student_id=976;



--------------------------------------------------------------------

alter table academic_year_fees add year_level varchar(255) default '';
alter table academic_year_other_fees add year_level varchar(255) default '';


drop table if exists enrollment_offered_subject_section_blocks;
create table enrollment_offered_subject_section_blocks(
id int auto_increment primary key
,eoss_id int 
,course_id int
,course_code varchar(255)
,created_at datetime
,updated_at datetime
,created_by int
,updated_by int
,status int
);


insert into user_default_privileges(account,privilege)values('Maintenance','Assessment');


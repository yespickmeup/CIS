/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 06 19, 20
 */

insert into user_default_privileges(account,privilege)values('Reports','Student Reports');
insert into user_default_privileges(account,privilege)values('Reports','Enrollment Assessments');
insert into user_default_privileges(account,privilege)values('Reports','Class List');

alter table students add balance double default 0;
alter table students add prepaid double default 0;


insert into user_default_privileges(account,privilege)values('Reports','Subject Offerings');
insert into user_default_privileges(account,privilege)values('Reports','Accounts Receivables');


update enrollment_student_loaded_subjects e set e.status=1 where (select en.date_enrolled from enrollments en where en.id = e.enrollment_id) is not null;

update students s set
    s.course_id=(select e.course_id from enrollments e where e.student_id=s.id),
    s.course_code=(select e.course_code from enrollments e where e.student_id=s.id),
    s.course_description=(select e.course_description from enrollments e where e.student_id=s.id),
    s.date_enrolled=(select e.date_enrolled from enrollments e where e.student_id=s.id)
    ;



drop table if exists enrollment_student_loaded_subjects_drop_requests;
create table enrollment_student_loaded_subjects_drop_requests(
id int auto_increment primary key
,enrollment_student_loaded_subject_id int
,enrollment_id int
,enrollment_no varchar(255)
,student_id int
,student_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,enrollment_offered_subject_section_id int
,enrollment_offered_subject_id int
,academic_offering_subject_id int
,academic_offering_id int
,academic_year_id int
,academic_year varchar(255)
,level_id int
,level varchar(255)
,college_id int
,college varchar(255)
,department_id int
,department varchar(255)
,course_id int
,course_code varchar(255)
,course_description varchar(255)
,term varchar(255)
,year_level varchar(255)
,subject_id int
,subject_code varchar(255)
,description varchar(255)
,lecture_units int
,lab_units int
,faculty_id varchar(255)
,faculty_name varchar(255)
,section varchar(255)
,room_id int
,room varchar(255)
,schedule varchar(255)
,day varchar(255)
,time varchar(255)
,start_time datetime
,closing_time datetime
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int
);

    
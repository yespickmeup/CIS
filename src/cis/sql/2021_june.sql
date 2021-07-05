/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 06 17, 21
 */



update enrollment_student_loaded_subjects esls set 
esls.college_id=(select e.college_id from enrollments e where esls.enrollment_id=e.id)
,esls.college=(select e.college from enrollments e where esls.enrollment_id=e.id)
;


select college,count(id) from enrollment_student_loaded_subjects group by college order by college asc;

alter table academic_year_period_schedules add enrollment_starts date;
alter table academic_year_period_schedules add enrollment_ends date;




-- To update


alter table enrollments add fb_account varchar(255);
alter table enrollments add blood_type varchar(255);

alter table students add fb_account varchar(255);
alter table students add blood_type varchar(255);



update enrollment_student_loaded_subjects esls set 
esls.student_id=(select e.student_id from enrollments e  where e.id=esls.enrollment_id limit 1),
esls.student_no=(select e.student_no from enrollments e where e.id=esls.enrollment_id limit 1) where esls.student_id=0;

alter table enrollment_student_loaded_subjects add is_payed int;

update enrollment_student_loaded_subjects es set es.is_payed=if((select e.date_enrolled from enrollments e where e.id=es.enrollment_id limit 1) is not null ,1,is_payed) 
where  status=0 ;


insert into user_default_privileges(account,privilege)values('Reports','Transcript of Records');


drop table if exists user_default_previlege_others;
create table user_default_previlege_others(
id int auto_increment primary key
,account varchar(255)
,account_name varchar(255)
,name varchar(255)
);

insert into  user_default_previlege_others(account,account_name,name)values('Transactions','Enrollment','Subject Overload Override');

drop table if exists school_settings;
create table school_settings(
id int auto_increment primary key
,name varchar(255)
,remarks varchar(255)
,amount double
,amount2 double
);

insert into school_settings(name,remarks,amount,amount2)values('Subject Loading overload','Units',21,9);







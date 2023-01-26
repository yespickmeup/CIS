/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 01 18, 23
 */

insert into  user_default_previlege_others(account,account_name,name)values('Transactions','Enrollment','Override Conflict Subject Schedule');



create table enrollment_offered_subject_units(
id int auto_increment primary key
,eos_id int
,lec double
,lab double
,created_at datetime
,created_by int
,updated_at datetime
,updated_by int
);

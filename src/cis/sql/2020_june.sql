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



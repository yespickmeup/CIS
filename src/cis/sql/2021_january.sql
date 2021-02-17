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


update students set student_no='20210014' where id=1546;
update students set student_no='20210015' where id=1547;
update students set student_no='20210016' where id=1548;
update students set student_no='20210017' where id=1549;
update students set student_no='20210018' where id=1550;
update students set student_no='20210019' where id=1551;
update students set student_no='20210021' where id=1552;
update students set student_no='20210022' where id=1553;
update students set student_no='20210023' where id=1554;
update students set student_no='20210024' where id=1555;
update students set student_no='20210025' where id=1556;
update students set student_no='20210026' where id=1557;
update students set student_no='20210027' where id=1558;
update students set student_no='20210028' where id=1559;
update students set student_no='20210029' where id=1560;
update students set student_no='20210030' where id=1561;
update students set student_no='20210031' where id=1562;
update students set student_no='20210032' where id=1563;
update students set student_no='20210033' where id=1564;
update students set student_no='20210034' where id=1565;
update students set student_no='20210035' where id=1566;
update students set student_no='20210036' where id=1567;
update students set student_no='20210037' where id=1568;
update students set student_no='20210038' where id=1569;
update students set student_no='20210039' where id=1570;
update students set student_no='20210040' where id=1571;
update students set student_no='20210041' where id=1572;
update students set student_no='20210042' where id=1573;
update students set student_no='20210043' where id=1574;
update students set student_no='20210044' where id=1575;
update students set student_no='20210045' where id=1576;
update students set student_no='20210046' where id=1577;
update students set student_no='20210047' where id=1578;
update students set student_no='20210048' where id=1579;
update students set student_no='20210049' where id=1580;
update students set student_no='20210050' where id=1581;
update students set student_no='20210051' where id=1582;
update students set student_no='20210052' where id=1583;
update students set student_no='20210053' where id=1584;
update students set student_no='20210054' where id=1585;
update students set student_no='20210055' where id=1586;
update students set student_no='20210056' where id=1587;
update students set student_no='20210057' where id=1588;
update students set student_no='20210058' where id=1589;
update students set student_no='20210059' where id=1590;
update students set student_no='20210060' where id=1591;
update students set student_no='20210061' where id=1592;
update students set student_no='20210062' where id=1593;
update students set student_no='20210063' where id=1594;
update students set student_no='20210064' where id=1595;
update students set student_no='20210065' where id=1596;
update students set student_no='20210066' where id=1597;
update students set student_no='20210067' where id=1598;
update students set student_no='20210068' where id=1599;
update students set student_no='20210069' where id=1600;
update students set student_no='20210070' where id=1601;
update students set student_no='20210071' where id=1602;
update students set student_no='20210072' where id=1603;
update students set student_no='20210073' where id=1604;
update students set student_no='20210074' where id=1605;
update students set student_no='20210075' where id=1606;
update students set student_no='20210076' where id=1607;

update enrollments e set e.student_id=(select s.id from students s where e.student_no=s.student_no) where e.student_id=0 and e.student_no is not null;
update enrollment_assessments e set e.student_id=(select s.id from students s where e.student_no=s.student_no) where e.student_id=0 and e.student_no is not null;

update enrollment_student_loaded_subjects esls set esls.student_id=(select s.id from students s where esls.student_no=s.student_no limit 1) where student_id=0;

update enrollment_student_loaded_subjects esls set esls.student_id=(select s.id from students s where esls.student_no=s.student_no limit 1) where esls.student_no is not null and esls.student_id is null;

update enrollment_offered_subject_sections set lecture_units=3 where enrollment_offered_subject_id=292;
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



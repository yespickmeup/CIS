/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 02 3, 21
 */

update enrollment_student_loaded_subjects esld set esld.student_no=(select e.student_no from enrollments e where esld.enrollment_no=e.enrollment_no) where esld.student_id=0;

update enrollment_student_loaded_subjects esld set esld.student_id=(select e.id from students e where esld.student_no=e.student_no) where esld.student_id=0;

update students set academic_year="2020 - 2021" where academic_year like '';

update enrollments set academic_year="2020 - 2021" where academic_year like '';
update enrollment_assessments set academic_year="2020 - 2021" where academic_year like '';


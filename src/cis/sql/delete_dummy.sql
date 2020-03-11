/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Mar 3, 2020
 */

delete from academic_offerings ;
delete from academic_offering_subjects;
delete from academic_offering_subject_prerequisites;
delete from academic_offering_subject_sections;
delete from academic_offering_subject_section_schedules;
delete from academic_year_fees;
delete from academic_year_periods;
delete from academic_year_period_schedules;
delete from classrooms;

delete from courses where department_id=5;

delete from enrollments;
delete from enrollment_assessments;
delete from enrollment_assessment_payments;
delete from enrollment_assessment_payment_details;
delete from enrollment_assessment_payment_modes;
delete from enrollment_department_requirements;
delete from enrollment_offered_subjects;
delete from enrollment_offered_subject_sections;
delete from enrollment_offered_subject_section_instructors;
delete from enrollment_offered_subject_section_room_schedules;
delete from enrollment_student_loaded_subjects;
delete from faculty_members;
delete from students;
delete from subjects;
delete from subject_prerequisites;




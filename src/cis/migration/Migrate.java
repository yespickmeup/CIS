/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.migration;

import cis.courses.Courses;
import cis.utils.DateType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Migrate {

    public static void main(String[] args) {
        System.setProperty("pool_db", "db_cosca");
        System.setProperty("pool_user", "root");
        System.setProperty("pool_password", "password");
        String where = "  order by subdesc asc ";
        //ret subjects

        //<editor-fold defaultstate="collapsed" desc=" subjects ">
//        List<Subjectmasterlist.to_subjectmasterlist> subjects = Subjectmasterlist.ret_data(where);
//        List<Subjects.to_subjects> l_subjects = new ArrayList();
//        System.setProperty("pool_db", "db_cis_cosca");
//        for (Subjectmasterlist.to_subjectmasterlist to : subjects) {
//            int id = 0;
//            String subject_code = to.subname;
//            String description = to.subdesc;
//            int level_id = 0;
//            String level = "";
//            int college_id = 0;
//            String college = "";
//            int department_id = 5;
//            String department = "TERTIARY DEPARTMENT";
//            int course_id = 0;
//            String course_code = "";
//            String course_description = "";
//            double lecture_units = 0;
//            double lab_units = 0;
//            if (to.lab == 1) {
//                lab_units = to.units;
//            } else {
//                lecture_units = to.units;
//            }
//            double amount = 0;
//            String prerequisites_course_ids = "";
//            String subject_group = "";
//            int subject_group_id = 0;
//            String created_at = DateType.now();
//            String updated_at = DateType.now();
//            String created_by = "";
//            String updated_by = "";
//            int status = 1;
//            int is_uploaded = 0;
//            Subjects.to_subjects subj = new Subjects.to_subjects(id, subject_code, description, level_id, level, college_id, college, department_id, department, course_id, course_code, course_description, lecture_units, lab_units, amount, prerequisites_course_ids, subject_group, subject_group_id, created_at, updated_at, created_by, updated_by, status, is_uploaded);
//            l_subjects.add(subj);
//
//        }
//        Subjects.add_data_list(l_subjects);
        //</editor-fold>
//        System.out.println("subjects: "+subjects.size());
        //ret colleges
//        List<College.to_college> colleges = College.ret_data("");
//        for (College.to_college to : colleges) {
//            System.out.println(to.Collcode + " - " + to.CollName+ " - "+to.CollDept);
//        }
        //ret courses
        List<CoursesM.to_courses> courses = CoursesM.ret_data(" group by CourseDescription order by CourseDescription asc ");
        System.setProperty("pool_db", "db_cis_cosca");
        List<Courses.to_courses> courses_to_add = new ArrayList();
        for (CoursesM.to_courses to : courses) {
            int id = 0;
            String course_code = to.course;
            String course_description = to.CourseDescription;
            int college_id = 0;
            String college = "";
            int department_id = 5;
            String department_name = "TERTIARY DEPARTMENT";
            int no_of_years = to.Yrs;
            String studies = "Undergraduate";
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = "";
            String updated_by = "";
            int status = 1;
            int is_uploaded = 0;
            boolean selected = false;
            Courses.to_courses co = new Courses.to_courses(id, course_code, course_description, college_id, college, department_id, department_name, no_of_years, studies, created_at, updated_at, created_by, updated_by, status, is_uploaded, selected);
            courses_to_add.add(co);
        }
        Courses.add_data_list(courses_to_add);
//      creditablesubjects
    }

}

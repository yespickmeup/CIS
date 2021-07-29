/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.test;

import java.util.List;
import cis.students.Students;

/**
 *
 * @author User
 */
public class Finance {

    public static void main2(String[] args) {
        System.setProperty("pool_db", "db_cis_cosca");
        System.setProperty("pool_password", "synapse246");
        System.setProperty("pool_host", "10.0.0.251");

        List<Students.to_students> students = Students.ret_data(" order by last_name");
        for (Students.to_students student : students) {
            double balance = 0;
            List<cis.finance.Finance.transactions> transactions = cis.finance.Finance.ret_transactions(student);
            for (cis.finance.Finance.transactions trans : transactions) {
                balance = trans.balance;
            }
            System.out.println("Student: " + student.student_no + " = " + student.last_name + " " + student.first_name + ", " + student.middle_name);
            System.out.println("Balance: " + balance);
            Students.update_balance(student, balance);
            System.out.println("**************************************************");
            
        }

    }
}

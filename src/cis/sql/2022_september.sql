/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 09 20, 22
 */
select id, collection_no,or_no, payment_type,amount_paid, cash, discount_amount, check_amount, online_amount, online_bank, student_id, student_name, ref_id, created_by 
from collections 
where payment_type like 'Back Account' and student_id IS NULL 
or payment_type like 'Summer 2021-2022' and student_id IS NULL 
or payment_type like 'Downpayment' and student_id IS NULL 
or payment_type like 'Back Account 2021-22' and student_id is NULL 
or payment_type like 'Tuition' and student_id is NULL 
order by payment_type,id asc;

update enrollments set student_id=3645 where student_id=3644;
update enrollment_assessments set student_id=3645 where student_id=3644;

update collections set created_at='2022-08-31 08:32:42' where id=6572;
update collections set created_at='2022-08-31 13:21:38' where id=6645;

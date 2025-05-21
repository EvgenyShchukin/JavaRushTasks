package com.javarush.task.sql.task10.task1003;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import com.javarush.task.sql.task10.task1002.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        Employee result;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "update Employee set smth = cconcat( 'senior ', smth)";
            Transaction transaction = session.beginTransaction();
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.executeUpdate();
            transaction.commit();
        }
    }
}
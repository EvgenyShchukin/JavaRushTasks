package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select distinct smth from employee where age > 18";
            Query<Employee> query = session.createQuery(hql , Employee.class);
            List<Employee> employees = query.list();
            for (Employee value : employees) {
                System.out.println(value);
            }
        }
    }
}
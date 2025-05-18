package com.javarush.task.sql.task10.task1008;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/* 
task1008
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getSorted(3, 5).forEach(System.out::println);
    }

    public static List<Employee> getSorted(int offset, int limit) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from employee order by age";
            Query<Employee> query = session.createQuery(hql , Employee.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            List<Employee> employees = query.list();

            return employees;
    }
}
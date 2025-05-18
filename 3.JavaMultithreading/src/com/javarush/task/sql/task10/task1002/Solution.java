package com.javarush.task.sql.task10.task1002;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        Employee result;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select * from employee where smth = 'director'";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            result = query.uniqueResult();
        }
        return result;
    }
}
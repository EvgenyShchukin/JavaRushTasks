package com.javarush.task.sql.task10.task1009;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import com.javarush.task.sql.task10.task1007.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select sum(salary) from Employee";
            Query<Long> query = session.createQuery(hql, Long.class);
            Long allSalary = query.getSingleResult();
            return allSalary;
        }
    }

    public static Double getAverageAge() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select avg(salary) from Employee";
            Query<Double> query = session.createQuery(hql, Double.class);
            Double avgSalary = query.getSingleResult();
            return avgSalary;
        }
    }
}
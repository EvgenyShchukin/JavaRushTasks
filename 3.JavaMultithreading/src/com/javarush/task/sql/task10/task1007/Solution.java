package com.javarush.task.sql.task10.task1007;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/* 
task1007
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from Employee where smth IN (:occupation_list) order by age";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.setParameter("occupation_list", in);
            List<Employee> employees = query.list();

            return employees;
        }
    }
}
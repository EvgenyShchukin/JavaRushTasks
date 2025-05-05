package com.javarush.task.sql.task08.task0806;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        String sql = "SELECT id, name, age, smth FROM employee";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery(sql);
            while (results.next()) {
                Employee employee = new Employee();
                employee.setId(results.getInt("id"));
                employee.setName(results.getString("name"));
                employee.setAge(results.getInt("age"));
                employee.setSmth(results.getString("smth"));

                employees.add(employee);
            }
            employees.forEach(System.out::println);
        }
    }
}
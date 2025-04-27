package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root", "root");
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT name, weight FROM employee");
            while (results.next()) {
                Double weight = results.getDouble("weight");
                if (results.wasNull()) {
                    weight = null;
                }
                System.out.println(results.getString("name") + weight);
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }
        connection.close();

    }
}

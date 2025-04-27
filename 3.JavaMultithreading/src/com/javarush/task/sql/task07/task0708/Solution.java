package com.javarush.task.sql.task07.task0708;

import java.sql.*;

/* 
Получение даты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root", "root");
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT name, created FROM employee");
            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getTimestamp("created"));
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }
        connection.close();
    }
}

package com.javarush.task.sql.task07.task0702;

import java.sql.*;

/* 
task0702
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root", "root");
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT 7 * 8");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }
        connection.close();
    }
}

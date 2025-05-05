package com.javarush.task.sql.task08.task0803;

import java.sql.*;

/* 
task0803
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String name = "Harry";
        int age = 18;
        String smth = "Senior pomidor";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, smth);

            stmt.executeUpdate();

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }

    }
}

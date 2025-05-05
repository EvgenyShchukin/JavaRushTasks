package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 
task0804
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");
            PreparedStatement stmt = connection.prepareStatement(sql);

            for (int i = 0; i <= 4; i++) {
            stmt.setString(1, "name_" + i);
            stmt.setInt(2,  30 + i);
            stmt.setString(3, "i=" + i);
            stmt.addBatch();
            }

            int[] results = stmt.executeBatch();

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }
    }
}

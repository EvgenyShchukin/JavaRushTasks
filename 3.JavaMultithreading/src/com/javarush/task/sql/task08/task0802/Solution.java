package com.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Откат транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");
            try {
                connection.setAutoCommit(false);
                Statement statement = connection.createStatement();
                int rowsCount1 = statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
                int rowsCount2 = statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");
                connection.commit();
                statement.close();
            } catch (Exception e) {
                connection.rollback();
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }

    }
}

package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root", "root");
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("select * from employee limit 1");
            ResultSetMetaData resultSetMetaData = results.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++)
            {
                String name = resultSetMetaData.getColumnName(column);
                String typeName = resultSetMetaData.getColumnTypeName(column);

                System.out.println(name + "(" + typeName + ")");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            throw new RuntimeException(e);
        }
        connection.close();

    }
}

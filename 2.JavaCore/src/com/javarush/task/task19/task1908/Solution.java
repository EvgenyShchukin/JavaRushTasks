package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String text = reader.readLine();
                String[] strings = text.split(" ");
                for (String string : strings) {
                    try {
                        int number = Integer.parseInt(string);
                        writer.write(number + " ");
                    } catch (Exception e) {
                    }
                }
            }
        }
    }
}

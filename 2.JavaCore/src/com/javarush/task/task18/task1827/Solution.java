package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (
                FileReader reader = new FileReader(fileName);
                FileWriter writer = new FileWriter(fileName, true);
                BufferedReader bufferedReader = new BufferedReader(reader);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);) {


            int max = 0;

            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                int id = Integer.parseInt(line.substring(0, 8).trim());
                max = Integer.max(max, id);
            }
            if (args.length != 0) {
                if (args[0].equals("-c")) {
                    String id = check(String.valueOf(max + 1), 8);
                    String productName = check(args[1], 30);
                    String price = check(args[2], 8);
                    String quantity = check(args[3], 4);
                    bufferedWriter.newLine();
                    bufferedWriter.write(id + productName + price + quantity);
                }
            }
        }

    }

    private static String check(String text, int limit) {
        if (text.length() > limit) {
            return text.substring(0, limit);
        } else {
            StringBuilder stringBuilder = new StringBuilder(text);
            while (stringBuilder.length() != limit) {
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        }
    }
}

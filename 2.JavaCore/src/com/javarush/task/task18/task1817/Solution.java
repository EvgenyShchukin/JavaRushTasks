package com.javarush.task.task18.task1817;

import java.io.*;
import java.util.Scanner;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
        }
        int count = stringBuilder.length();
        int countSpace = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Character.isSpaceChar(stringBuilder.charAt(i))) {
                countSpace++;
            }
        }
        if (count != 0) {
            System.out.printf("%.2f", (double) countSpace / count * 100);
        }
    }
}

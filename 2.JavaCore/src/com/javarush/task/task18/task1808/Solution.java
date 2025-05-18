package com.javarush.task.task18.task1808;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
             FileOutputStream fileOutputStream3 = new FileOutputStream(file3)) {

            int half = (fileInputStream.available() + 1) / 2;
            int count = 0;

            while (fileInputStream.available() > 0) {
                if (count < half) {
                    fileOutputStream2.write(fileInputStream.read());
                    count++;
                } else {
                    fileOutputStream3.write(fileInputStream.read());
                }
            }
        }
    }
}

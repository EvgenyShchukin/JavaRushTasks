package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();

        try (FileInputStream inputStream2 = new FileInputStream(file2);
             FileInputStream inputStream3 = new FileInputStream(file3);
             FileOutputStream outputStream1 = new FileOutputStream(file1, true)) {

            while (inputStream2.available() > 0)
            {
                int data = inputStream2.read();
                outputStream1.write(data);
            }

            while (inputStream3.available() > 0)
            {
                int data = inputStream3.read();
                outputStream1.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

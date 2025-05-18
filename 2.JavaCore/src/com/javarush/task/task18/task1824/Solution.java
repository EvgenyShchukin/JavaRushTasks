package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String file = scanner.nextLine();
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
            } catch (FileNotFoundException e) {
                System.out.println(file);
                break;
            }
        }
    }
}

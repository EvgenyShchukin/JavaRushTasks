package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String src = console.nextLine();
            if (Files.isRegularFile(Path.of(src))) {
                System.out.println(src + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(src))) {
                System.out.println(src + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}


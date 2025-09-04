package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.Scanner;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader buffer = new BufferedReader(new FileReader(console.readLine()));) {

            while (buffer.ready()) {
                StringBuilder builder = new StringBuilder(buffer.readLine());
                System.out.println(builder.reverse());
            }
        }
    }
}

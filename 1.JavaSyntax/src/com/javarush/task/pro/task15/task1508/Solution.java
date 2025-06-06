package com.javarush.task.pro.task15.task1508;

import java.io.*;
import java.util.Scanner;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                String line = bufferedReader.readLine();
                char[] chars = line.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (i % 2 == 1) {
                        System.out.print(String.valueOf(chars[i]).toUpperCase());
                    } else {
                        System.out.print(String.valueOf(chars[i]).toLowerCase());
                    }
                }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


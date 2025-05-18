package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        TreeSet<Integer> results = new TreeSet<>();

        while (inputStream.available() > 0) {
            results.add(inputStream.read());
        }
        inputStream.close();
        for (int n : results) {
            System.out.print(n + " ");
        }
    }
}

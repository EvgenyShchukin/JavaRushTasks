package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));) {
            while (reader.ready()) {
                String text = reader.readLine();
                int number = Integer.parseInt(text);
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
        }

        list.sort(Integer::compareTo);
        list.forEach(System.out::println);
    }
}

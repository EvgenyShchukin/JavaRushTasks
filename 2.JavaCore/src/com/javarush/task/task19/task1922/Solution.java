package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
        words.add("А");
        words.add("Б");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader buffer = new BufferedReader(new FileReader(reader.readLine()));) {

            while (buffer.ready()) {
                int count = 0;
                String line = buffer.readLine();
                String[] strings = line.split("\\s+");

                for (int i = 0; i < strings.length; i++) {
                    if (words.contains(strings[i])) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }


        }
    }
}

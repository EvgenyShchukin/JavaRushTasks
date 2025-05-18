package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("end")) {
                break;
            }
            int index = line.lastIndexOf("t");
            int number = Integer.parseInt(line.substring(index + 1));
            treeMap.put(number, line);
        }
        for (String value : treeMap.values()) {
            String name = value.substring(0, value.lastIndexOf("."));
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(value));
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(name, true));) {
                while (bufferedInputStream.available() > 0) {
                    bufferedOutputStream.write(bufferedInputStream.read());
                }
            }
        }
    }
}

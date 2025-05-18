package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read) + 1);
                }
            }
            int max = Collections.max(map.values());
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(max)) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }
}

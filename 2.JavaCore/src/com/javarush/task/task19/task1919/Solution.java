package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<String, Double> map = new TreeMap<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] strings = line.split(" ");
                String key = strings[0];
                Double value = Double.parseDouble(strings[1]);
                if (!map.containsKey(key)) {
                    map.put(key, value);
                } else {
                    Double aDouble = map.get(key);
                    map.put(key, value + aDouble);
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of(args[0])).stream()
                .collect(Collectors.toMap(
                        str -> str.split(" ")[0],
                        str -> Double.parseDouble(str.split(" ")[1]),
                        (oV, nV) -> oV + nV,
                        () -> new TreeMap<>()
                ))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }
}

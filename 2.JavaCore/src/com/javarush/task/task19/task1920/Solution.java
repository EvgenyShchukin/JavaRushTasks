package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Самый богатый
*/

public class Solution {
    public static void main3(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));) {
            Map<String, Double> map = new HashMap<>();

            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                String[] strings = string.split(" ");
                if (map.containsKey(strings[0])) {
                    Double aDouble = map.get(strings[0]);
                    aDouble = aDouble + Double.parseDouble(strings[1]);
                    map.put(strings[0], aDouble);
                } else {
                    map.put(strings[0], Double.parseDouble(strings[1]));
                }
            }

            Collection<Double> values = map.values();
            Double max = Collections.max(values);
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue().equals(max)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Map<String, Double> map = Files.readAllLines(Path.of(args[0]))
                .stream().collect
                        (Collectors.toMap(
                                        str -> str.split(" ")[0],
                                        str -> Double.parseDouble(str.split(" ")[1]),
                                        (a, b) -> a + b,
                                () -> new TreeMap<>()
                                )
                        );

        map.entrySet().stream().
                filter(entry -> Objects.equals(entry.getValue(), Collections.max(map.values()))).
                forEach(entry -> System.out.println(entry.getKey()));


    }
}

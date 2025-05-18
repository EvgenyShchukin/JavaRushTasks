package com.javarush.task.task18.task1804;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main1(String[] args) throws Exception {
        HashMap<Integer, Integer> bytes = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (!bytes.containsKey(currByte)) {
                    bytes.put(currByte, 1);
                } else {
                    int count = bytes.get(currByte);
                    bytes.put(currByte, count + 1);
                }
            }
            Integer minCount = Collections.min(bytes.values());
            Set<Map.Entry<Integer, Integer>> entries = bytes.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                if (entry.getValue() == minCount) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scaner = new Scanner(System.in);
        byte[] bytes = Files.readAllBytes(Path.of(scaner.nextLine()));
        Map<Byte, Integer> map = IntStream.range(0, bytes.length)
                .boxed()
                .collect(Collectors.toMap(i -> bytes[i], i -> 1, (oldValue, newValue) -> oldValue + newValue));
        map.entrySet().stream()
                .filter(pair -> pair.getValue().equals(Collections.min(map.values())))
                .forEach(pair -> System.out.print(pair.getKey() + " "));
    }
}

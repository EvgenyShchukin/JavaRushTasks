package com.javarush.task.task18.task1809;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Реверс файла
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        Scanner scaner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scaner.nextLine());
        FileOutputStream outputStream = new FileOutputStream(scaner.nextLine());

        byte[] buffer = new byte[inputStream.available()];
        int count = 0;
        while (inputStream.available() > 0) {
            buffer[count] = (byte) inputStream.read();
            count++;
        }
        for (int i = buffer.length - 1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void main2(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream inputStream = new FileInputStream(scanner.nextLine());
             FileOutputStream outputStream = new FileOutputStream(scanner.nextLine());) {

            List<Integer> buffer = new ArrayList<>();
            while (inputStream.available() > 0) {
                buffer.add(inputStream.read());
            }
            Collections.reverse(buffer);
            for (Integer integer : buffer) {
                outputStream.write(integer);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        byte [] buffer = Files.readAllBytes(Path.of(scanner.nextLine()));
        List<Byte> list = IntStream.range(0, buffer.length).boxed().map(i -> buffer[i]).toList();
        Collections.reverse(list);
        Files.write(Path.of(scanner.nextLine()), buffer);

    }
}

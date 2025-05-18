package com.javarush.task.task18.task1820;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(console.readLine()));) {

            while (bufferedReader.ready()) {
                StringBuilder stringBuilder = new StringBuilder();
                String line = bufferedReader.readLine();
                String[] arraysString = line.split(" ");
                for (int i = 0; i < arraysString.length; i++) {
                    double parsedDouble = Double.parseDouble(arraysString[i]);
                    long round = Math.round(parsedDouble);
                    stringBuilder.append(round).append(" ");
                }
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
            }
        }
    }

    public static void main1(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
        List<String> collect = list.stream().map(string -> string.split(" "))
                .flatMap(array -> Arrays.stream(array).mapToDouble(value -> Double.parseDouble(value))
                        .mapToLong(value -> Math.round(value))
                        .mapToObj(value -> String.join(" ")))
                .collect(Collectors.toList());
        Files.write(Paths.get(scanner.nextLine()), collect);
    }
}

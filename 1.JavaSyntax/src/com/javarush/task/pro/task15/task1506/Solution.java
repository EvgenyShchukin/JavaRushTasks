package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)){
            List<String> list = Files.readAllLines(Path.of(scanner.nextLine()));
            for(String line : list){
                line = line.replaceAll("[\\s ,.]", "");
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("ошибка");
        }
    }
}


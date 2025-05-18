package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            while (fileReader.ready()) {
                char read = (char) fileReader.read();
                if (!treeMap.containsKey(read)) {
                    treeMap.put(read, 1);
                } else {
                    Integer count = treeMap.get(read) + 1;
                    treeMap.put(read, count);
                }
            }
            for (Character key : treeMap.keySet()) {
                System.out.println(key + " " + treeMap.get(key));
            }
        }
    }

    //Files.readString
   // у переменной стринга есть метод chaars
    // Collectors.toMap
    //Нужен метод который формирует ключи, значения, объъединения значений при повторе ключа,  и какой тип данных мапы сформировать
}

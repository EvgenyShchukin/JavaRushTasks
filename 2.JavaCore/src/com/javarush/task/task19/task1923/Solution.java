package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1]);
             BufferedReader buffer = new BufferedReader(fileReader)) {
            StringBuilder builder = new StringBuilder();

            while (buffer.ready()) {
                builder.append(buffer.readLine());
            }
            String[] words = builder.toString().split("\\s+");

            for (String word : words) {
                if (word.matches(".*\\d.*")) {
                    fileWriter.write(word + " ");
                }
            }
        }
    }
}

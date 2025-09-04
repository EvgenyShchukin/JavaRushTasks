package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1]);
             BufferedReader buffer = new BufferedReader(fileReader);
             BufferedWriter bufferWriter = new BufferedWriter(fileWriter);) {
            StringBuilder builder = new StringBuilder();

            while (buffer.ready()) {
                builder.append(buffer.readLine()).append(" ");
            }
            String[] words = builder.toString().split("[\\s\\n\\r]+");

            StringBuilder builderDubl = new StringBuilder();

            for (String word : words) {
                if (word.length() > 6) {
                    builderDubl.append(word).append(",");
                }
            }
            String all = builderDubl.toString().replaceAll(",$", "");
            bufferWriter.write(all);
        }
    }
}

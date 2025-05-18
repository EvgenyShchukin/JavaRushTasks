package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            int count = 0;
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String [] text = line.replaceAll("\\p{P}", " ").replaceAll("\\s", " ").split(" ");
                for (String str : text) {
                    if (str.equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

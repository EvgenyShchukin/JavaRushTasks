package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        int counter = 1;
        while(fileReader.ready()){
            if(counter % 2 == 0) {
                fileWriter.write(fileReader.read());
            } else {
                int i = fileReader.read();
            }
            counter++;
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}

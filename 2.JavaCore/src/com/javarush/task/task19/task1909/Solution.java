package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        while (bufferedReader.ready()) {
            String data = bufferedReader.readLine();
            String dataResult = data.replaceAll("\\.", "\\!");
            bufferedWriter.write(dataResult);
            bufferedWriter.newLine();
        }

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

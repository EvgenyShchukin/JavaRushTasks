package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        while(bufferedReader.ready()){
            String string = bufferedReader.readLine().replaceAll("\\p{Punct}", "");
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        reader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));) {
            while (reader.ready()) {
                String s = reader.readLine();
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

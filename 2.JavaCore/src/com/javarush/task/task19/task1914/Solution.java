package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();
    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String string = outputStream.toString();

        String[] parts = string.split("\\s");
        int argumentA = Integer.parseInt(parts[0]);
        int argumentB = Integer.parseInt(parts[2]);

        int result = 0;

        if (parts[1].equals("+")) {
            result = argumentA + argumentB;
        } else if (parts[1].equals("-")){
            result = argumentA - argumentB;
        } else {
            result = argumentA * argumentB;
        }
        System.out.println(String.join(" ", parts) + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


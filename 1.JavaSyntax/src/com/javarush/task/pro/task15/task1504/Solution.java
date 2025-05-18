package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src1 = scanner.nextLine();
        String src2 = scanner.nextLine();

        try (InputStream inputStream1 = Files.newInputStream(Path.of(src1));
             OutputStream outputStream = Files.newOutputStream(Path.of(src2))) {
            byte[] input = inputStream1.readAllBytes();
            for (int i = 0; i < input.length; i = i + 2) {
                if (i < input.length - 1) {
                    byte temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
            outputStream.write(input);
        } catch (IOException e) {
        }

    }
}


package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            try (FileInputStream inputStream = new FileInputStream(scaner.nextLine());) {
                if (inputStream.available() < 1000)
                    throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

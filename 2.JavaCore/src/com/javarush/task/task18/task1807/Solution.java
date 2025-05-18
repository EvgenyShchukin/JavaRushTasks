package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());

        int count = 0;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            if (inputStream.read() == ',') {
                count++;
            }
        }
        System.out.println(count);

        inputStream.close();
    }
}

package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int line = console.nextInt();
        multiArray = new int[line] [];

        for (int i = 0; i < multiArray.length; i++) {
            int column = console.nextInt();
            multiArray[i] = new int [column];
        }
    }
}

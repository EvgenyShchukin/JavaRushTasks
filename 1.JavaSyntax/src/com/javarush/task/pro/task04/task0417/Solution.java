package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s = console.nextInt();

        int sx = (int) Math.round(s * 3.6);
        System.out.println(sx);
    }
}
package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int m = 0;
            while (m < 20) {
                String a = (m == 0 || m == 19 || i == 0 || i == 9) ? "Б" : " ";
                System.out.print(a);
                m++;
            }
            System.out.println();
            i++;
        }
    }
}
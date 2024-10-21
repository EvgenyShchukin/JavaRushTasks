package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long a = cube(3);
    }

    public static long cube(long a) {
        a = a * a * a;
        return a;
    }
}

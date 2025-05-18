package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

import static java.lang.Math.round;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        System.out.println(round(Double.parseDouble(string)));
    }
}

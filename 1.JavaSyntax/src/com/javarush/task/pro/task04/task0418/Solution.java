package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean result = console.nextBoolean();
        int glassNew = 0;

        if (result == true) {
            glassNew = (int) Math.round(Math.ceil(glass));
        } else if (result == false) {
            glassNew = (int) Math.round(Math.floor(glass));
        }
        System.out.println(glassNew);
    }
}
package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countB = input.nextInt();
        int countP = input.nextInt();

        double number = (1.0 * countB / countP);
        System.out.println(number);
    }
}
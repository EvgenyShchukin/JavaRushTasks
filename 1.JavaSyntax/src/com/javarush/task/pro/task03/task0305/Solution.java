package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOne = console.nextInt();
        int numberTwo = console.nextInt();
        int numberFree = console.nextInt();

        if (numberOne == numberFree && numberOne == numberTwo) {
            System.out.println(numberOne + " " + numberTwo + " " + numberFree);
        } else if (numberOne == numberTwo) {
            System.out.println(numberOne + " " + numberTwo);
        } else if (numberTwo == numberFree) {
            System.out.println(numberTwo + " " + numberFree);
        } else if (numberOne == numberFree) {
            System.out.println(numberOne + " " + numberFree);
        }

    }
}

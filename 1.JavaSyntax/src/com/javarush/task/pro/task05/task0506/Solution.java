package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = console.nextInt();
        }
//        int min = array[0];
//        for (int i = 0; i < array.length - 1; i++) {
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);

        Arrays.sort(array);
        System.out.println(array[0]);
    }
}

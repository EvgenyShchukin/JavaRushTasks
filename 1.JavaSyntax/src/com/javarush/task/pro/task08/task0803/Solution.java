package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++)
                min = Math.min(ints[i], ints[j]);
            minA = Math.min(min, minA);
        }
        return minA;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        int[] array = new int[10];
        while (console.hasNext()) {
            array[i] = console.nextInt();
            if (i == 9)
                break;
            i++;
        }
        return array;
    }
}

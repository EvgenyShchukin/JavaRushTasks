package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isEnough = false;

        while (!isEnough) {
            String text = console.nextLine();
            if (text.equals("enough")) {
                break;
            } else {
                System.out.println(text);
            }
        }
    }
}
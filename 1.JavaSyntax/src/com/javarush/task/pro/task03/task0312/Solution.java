package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String msg_1 = console.nextLine();
        String msg_2 = console.nextLine();

        if (msg_1.equals(msg_2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}

package com.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
    }
}

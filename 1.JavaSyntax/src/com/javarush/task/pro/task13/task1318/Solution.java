package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        if (month.ordinal() < 11) {
            return month.values()[month.ordinal() + 1];
        }
        if (month.ordinal() == 11) {
            return month.values()[0];
        }
        return month;
    }
}

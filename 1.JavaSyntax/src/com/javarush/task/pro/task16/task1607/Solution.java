package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        LocalDate today = LocalDate.of(2020, 9, 12);

        return today;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(2020, ofExample().getDayOfYear());
        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate day1 = LocalDate.of(1970, 1, 1);
        LocalDate day2 = LocalDate.of(2020, 9, 12);
        long daysUntilTargetDate = ChronoUnit.DAYS.between(day1, day2);
        LocalDate today = LocalDate.ofEpochDay(daysUntilTargetDate);

        return today;
    }
}

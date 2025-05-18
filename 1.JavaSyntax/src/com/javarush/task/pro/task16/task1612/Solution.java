package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> dateTime = new HashSet<>();
        for (LocalDate date : sourceMap.keySet()) {
            if (sourceMap.get(date).size() > 1) {
                for(LocalTime lt : sourceMap.get(date)) dateTime.add(LocalDateTime.of(date, lt));
            }
            else dateTime.add(LocalDateTime.of(date, sourceMap.get(date).get(0)));
        }
        return dateTime;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
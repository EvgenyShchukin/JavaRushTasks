package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Серега", 1000.11);
        grades.put("Max", 1200.11);
        grades.put("Vera", 1300.11);
        grades.put("Han", 1400.11);
        grades.put("Frank", 1500.11);
    }
}

package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, (Object) "8");
    }

    public static void printMatrix(double m, int n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами int");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(double m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((double) m, n, (Object) value);
    }
    public static void printMatrix(double m, Integer n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((double) m, n, (Object) value);
    }
    public static void printMatrix(short m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((short) m, n, (Object) value);
    }
}

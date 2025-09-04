package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        if (a == null || a.length == 0) return 0;
        int n = a.length;
        int m = a[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    count++;
                    clearRectangle(a, i, j, n, m);
                }
            }
        }
        return count;
    }

    private static void clearRectangle(byte[][] a, int i, int j, int n, int m) {
        // Находим правую границу
        int x = j;
        while (x < m && a[i][x] == 1) {
            x++;
        }
        // Находим нижнюю границу
        int y = i;
        while (y < n && a[y][j] == 1) {
            y++;
        }
        // Обнуляем найденный прямоугольник
        for (int row = i; row < y; row++) {
            for (int col = j; col < x; col++) {
                a[row][col] = 0;
            }
        }
    }
}

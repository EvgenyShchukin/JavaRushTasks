package com.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3:
                shape = "Треугольник";
                return shape;
            case 4:
                shape = "Четырехугольник";
                return shape;
            case 5:
                shape = "Пятиугольник";
                return shape;
            case 6:
                shape = "Шестиугольник";
                return shape;
            case 7:
                shape = "Семиугольник";
                return shape;
            case 8:
                shape = "Восьмиугольник";
                return shape;
            default:
                shape = "Другая фигура";
                return shape;
        }
    }
}

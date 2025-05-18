package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest [] types = JavarushQuest.values();
        for (JavarushQuest type : types) {
            System.out.println(type.ordinal());
        }
    }
}

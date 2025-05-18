package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest prepareMyTest = c.getAnnotation(PrepareMyTest.class);
            String [] result = prepareMyTest.fullyQualifiedNames();
            System.out.println(Arrays.toString(result));
            return true;
        }
        return false;

    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest prepareMyTest = c.getAnnotation(PrepareMyTest.class);
            Class<?>[] value = prepareMyTest.value();
            for (int i = 0; i < value.length; i++) {
                System.out.println(value[i].getSimpleName());
            }
            return true;
        }
        return false;
    }
}

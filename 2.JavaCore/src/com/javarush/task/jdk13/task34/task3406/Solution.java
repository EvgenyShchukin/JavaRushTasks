package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/* 
Классные методы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods1(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> map = new HashMap<>();
        for (Class<?> aclass : classes) {
            Set<String> setMethods = new HashSet<>();
            Method[] cashMethod = aclass.getDeclaredMethods();

            for (Method method : cashMethod) {
                if (Modifier.isStatic(method.getModifiers())) {
                    setMethods.add(method.getName());
                }
            }
            map.put(aclass, setMethods);
        }

        return map;
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {


        return classes.stream().collect(Collectors.toMap(
                aClass -> aClass,
                aClass -> Arrays.stream(aClass.getDeclaredMethods())
                        .filter(method -> Modifier.isStatic(method.getModifiers()))
                        .map(Method::getName)
                        .collect(Collectors.toSet())
        ));
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

package com.javarush.task.jdk13.task34.task3405;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Нарушение приватности
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    public static Map<String, Object> getFields1(Object object) throws Exception {
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        Map<String, Object> nameFields = new HashMap<>();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                nameFields.put(field.getName(), field.get(object));
            }

        }


        return nameFields;
    }

    @SneakyThrows
    private static Object fieldGetObject(Field field, Object object) {
            return field.get(object);
    }

    public static Map<String, Object> getFields(Object object) {


        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> Modifier.isPrivate(field.getModifiers()))
                .peek(field -> field.setAccessible(true))
                .collect(Collectors.toMap(
                        field -> field.getName(),
                        field -> fieldGetObject(field, object)
                ));
    }


    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}

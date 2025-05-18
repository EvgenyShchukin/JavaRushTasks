package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(List.of(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Set.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<K> keys, List<V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        /*
        HashMap<K,V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
         */
        return IntStream.range(0, keys.size())
                .boxed()
                .collect(Collectors.toMap(i -> keys.get(i), i -> values.get(i), (a, b) -> b, () -> new HashMap<>()));
    }
}


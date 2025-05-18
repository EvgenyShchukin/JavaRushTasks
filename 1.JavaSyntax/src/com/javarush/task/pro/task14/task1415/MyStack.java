package com.javarush.task.pro.task14.task1415;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String element = storage.get(0);
        storage.remove(element);
        return element;
    }

    public String peek() {
        String element = storage.get(0);
        return element;
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if (storage.contains(s)) {
            return storage.indexOf(s);
        } else if (!storage.contains(s)) {
            return -1;
        }
        return 0;
    }
}

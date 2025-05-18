package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = Arrays.asList("user", "loser", "coder", "proger");



        while (true) {
            String key = reader.readLine();
            if (!list.contains(key)) {
                break;
            }
            if (key.equalsIgnoreCase("user")) {
                Person.User user = new Person.User();
                doWork(user);
            } else if (key.equalsIgnoreCase("loser")) {
                Person.Loser loser = new Person.Loser();
                doWork(loser);
            } else if (key.equalsIgnoreCase("coder")) {
                Person.Coder coder = new Person.Coder();
                doWork(coder);
            } else if (key.equalsIgnoreCase("proger")) {
                Person.Proger proger = new Person.Proger();
                doWork(proger);
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

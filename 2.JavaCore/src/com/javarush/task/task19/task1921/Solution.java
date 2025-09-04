package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

        while(bufferedReader.ready()) {
            String text = bufferedReader.readLine();
            String name = text.replaceAll("\\d", "").trim();
            String data = text.replaceAll("\\D", " ").trim();

            PEOPLE.add(new Person(name, simpleDateFormat.parse(data)));
        }
        PEOPLE.forEach(System.out::println);

        fileReader.close();
        bufferedReader.close();

    }
}

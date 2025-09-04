package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\1.txt";
        Scanner scanner = new Scanner(new File(fileName));
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);
        Person person = personScannerAdapter.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String string = fileScanner.nextLine();
            String[] strings = string.split(" ", 4);
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            try {
                return new Person(strings[1], strings[2], strings[0], format.parse(strings[3]));
            } catch (ParseException e) {
                throw new RuntimeException();
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

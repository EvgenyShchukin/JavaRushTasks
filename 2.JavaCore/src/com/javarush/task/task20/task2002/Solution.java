package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User("A", "A2", new Date(), true, User.Country.RUSSIA);
            User user2 = new User("B", "B2", new Date(), true, User.Country.RUSSIA);

            javaRush.users.addAll(Arrays.asList(user1, user2));

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

            System.out.println(loadedObject.equals(javaRush));

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try(PrintStream printStream = new PrintStream(outputStream)) {
                if (!users.isEmpty()) {
                    for (User user : users) {
                        printStream.println(user.getFirstName() + "," +
                                user.getLastName() +"," +
                                user.getBirthDate().getTime() + "," +
                                user.isMale() + "," +
                                user.getCountry().getDisplayName());
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String line = reader.readLine();

                String[] strings = line.split(",");

                if (strings.length < 5) {
                    break;
                }
                User user =new User(
                        strings[0], strings[1], new Date(Long.parseLong(strings[2])), Boolean.parseBoolean(strings[3]),
                        User.Country.valueOf(strings[4].toUpperCase()));

                users.add(user);
            }
        }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution(4));

        // Создаем объект Solution
        Solution savedObject = new Solution(20);

        // Открываем потоки ввода/вывода
        File file = new File("solution.ser"); // Файл для хранения сериализованного объекта
        try (FileOutputStream fos = new FileOutputStream(file)) { // Поток записи
            ObjectOutputStream oos = new ObjectOutputStream(fos); // Запись объекта

            // Сериализация объекта
            oos.writeObject(savedObject);
            oos.flush(); // Очистка буферов
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение сериализованного объекта
        try (FileInputStream fis = new FileInputStream(file)) { // Поток чтения
            ObjectInputStream ois = new ObjectInputStream(fis); // Чтение объекта

            // Десериализация объекта
            Solution loadedObject = (Solution) ois.readObject();
            System.out.println("Loaded object: " + loadedObject.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}

package com.javarush.task.task20.task2022;

import java.io.*;
import java.util.Objects;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private String fileName;
    private transient FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("test.txt");
        solution.writeObject("test text");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serial.txt"));
        outputStream.writeObject(solution);
        outputStream.flush();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serial.txt"));
        Solution soluton2 = (Solution) inputStream.readObject();
        soluton2.writeObject("test2");
    }
}

package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;


    static {
        Scanner console = new Scanner(System.in);
        firstFileName = console.nextLine();
        secondFileName = console.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());

    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private StringBuilder content = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fileName;
        }

        @Override
        public String getFileContent() {
            return content.toString();
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                   content.append(reader.readLine()).append(" ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

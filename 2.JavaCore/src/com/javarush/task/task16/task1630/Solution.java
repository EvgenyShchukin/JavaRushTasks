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
        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.nextLine();
        secondFileName = scanner.nextLine();
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
        private StringBuilder content = new StringBuilder();
        private String fullFileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return content.toString();
        }

        @Override
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFileName));

                while (bufferedReader.ready()) {
                    content.append(bufferedReader.readLine()) .append(" ");
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

package com.javarush.task.task18.task1823;

import java.awt.List;
import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String fileName = scanner.nextLine();
            if (fileName.equals("exit")) {
                break;
            }
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();

        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> mapByte = new HashMap<>();
            try (InputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int read = inputStream.read();
                    if (mapByte.containsKey(read)) {
                        Integer count = mapByte.get(read);
                        count++;
                        mapByte.put(read, count);
                    } else {
                        mapByte.put(read, 1);
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Collection<Integer> values = mapByte.values();
            Integer max = Collections.max(values);
            ArrayList<Integer> list = new ArrayList<>();
            for (Integer key : mapByte.keySet()) {
                Integer value = mapByte.get(key);
                if (value.equals(max)) {
                    list.add(key);
                }
            }
            Integer min = Collections.min(list);
            resultMap.put(fileName, min);
        }
    }
}

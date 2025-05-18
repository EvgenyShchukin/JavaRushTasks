package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));) {
            while (bufferedReader1.ready()) {
                allLines.add(bufferedReader1.readLine());
            }
            while (bufferedReader2.ready()) {
                forRemoveLines.add(bufferedReader2.readLine());
            }
        }
        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (new HashSet<>(allLines).containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> result = detectAllWords(crossword, "home", "same");
        for (Word w : result) {
            System.out.println(w);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();

        // все 8 направлений (dx, dy)
        int[][] directions = {
                {-1, -1}, {0, -1}, {1, -1},  // вверх
                {-1, 0}, {1, 0},   // горизонталь
                {-1, 1}, {0, 1}, {1, 1}    // вниз
        };

        int height = crossword.length;
        int width = crossword[0].length;

        for (String word : words) {
            char firstChar = word.charAt(0);

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (crossword[y][x] == firstChar) {
                        // проверяем все направления
                        for (int[] dir : directions) {
                            int dx = dir[0];
                            int dy = dir[1];

                            if (checkWord(crossword, word, x, y, dx, dy)) {
                                Word w = new Word(word);
                                w.setStartPoint(x, y);
                                int endX = x + dx * (word.length() - 1);
                                int endY = y + dy * (word.length() - 1);
                                w.setEndPoint(endX, endY);
                                result.add(w);
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    private static boolean checkWord(int[][] crossword, String word, int startX, int startY, int dx, int dy) {
        int x = startX;
        int y = startY;

        for (int i = 0; i < word.length(); i++) {
            if (y < 0 || y >= crossword.length || x < 0 || x >= crossword[0].length) {
                return false;
            }
            if (crossword[y][x] != word.charAt(i)) {
                return false;
            }
            x += dx;
            y += dy;
        }
        return true;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}

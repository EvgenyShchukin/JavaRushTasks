package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            boolean isgigital = Character.isDigit(string.charAt(i));
            if (isgigital) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
       int count = 0;
        for (int i = 0; i < string.length(); i++) {
            boolean isletter = Character.isLetter(string.charAt(i));
            if (isletter) {
                count = count + 1;
            }
        }
        return  count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            boolean isspace = Character.isSpaceChar(string.charAt(i));
            if (isspace){
                count = count + 1;
            }
        }
        return  count;
    }
}

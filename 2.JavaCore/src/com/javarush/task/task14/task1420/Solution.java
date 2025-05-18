package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main1(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        BigInteger  bigInteger1 = new BigInteger(console.nextLine());
        BigInteger  bigInteger2 = new BigInteger(console.nextLine());

        System.out.println(bigInteger1.gcd(bigInteger2));
    }
}

package com.javarush.task.pro.task16.task1615;

import java.time.Duration;
import java.time.Instant;

/* 
Ой как много методов!
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {

        return instant.plus(Duration.ofMinutes(minutes));
    }

    static public Instant plusHours(Instant instant, long hours) {

        return instant.plus(Duration.ofHours(hours));
    }

    static public Instant plusDays(Instant instant, long days) {

        return instant.plus(Duration.ofDays(days));
    }

    static public Instant minusMinutes(Instant instant, long minutes) {

        return instant.minus(Duration.ofMinutes(minutes));
    }

    static public Instant minusHours(Instant instant, long hours) {

        return instant.minus(Duration.ofHours(hours));
    }

    static public Instant minusDays(Instant instant, long days) {

        return instant.minus(Duration.ofDays(days));
    }
}

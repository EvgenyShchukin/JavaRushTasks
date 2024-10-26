package com.javarush.task.pro.task08.task0805;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {

        Random random = new Random();
        int number = random.nextInt(8);

        if (number == 0) {
            return CERTAIN;
        } else if (number == 1) {
            return DEFINITELY;
        } else if (number == 2) {
            return MOST_LIKELY;
        } else if (number == 3) {
            return OUTLOOK_GOOD;
        } else if (number == 4) {
            return ASK_AGAIN_LATER;
        } else if (number == 5) {
            return TRY_AGAIN;
        } else if (number == 6) {
            return NO;
        } else if (number == 7) {
            return VERY_DOUBTFUL;
        }
        return null;
    }
}

package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper(String development) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + development);
    }

    public Skyscraper(int stage) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + stage);
    }

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}


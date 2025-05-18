package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void move(String newAddress);
    }
    public interface CanRun {
        void move(String newAddress);
    }
    public interface CanSwim {
        void move(String newAddress);
    }

}

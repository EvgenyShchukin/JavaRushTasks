package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
        public int intVar;
        public double doubleVar;
        public Double DoubleVar;
        public boolean booleanVar;
        public Object ObjectVar;
        public Exception ExceptionVar;
        public String StringVar;

    public ArrayList<Object> list = new ArrayList<>(Arrays.asList(intVar,doubleVar,DoubleVar,booleanVar,ObjectVar,ExceptionVar,StringVar));

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (Object item : solution.list)
            System.out.println(item);
    }
}

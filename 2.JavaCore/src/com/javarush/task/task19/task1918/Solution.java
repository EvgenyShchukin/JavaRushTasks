package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
            StringBuilder stringBuilder = new StringBuilder();

            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
            Document document = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
            Elements elements = document.select(args[0]);

            elements.forEach(System.out::println);
        }
    }
}

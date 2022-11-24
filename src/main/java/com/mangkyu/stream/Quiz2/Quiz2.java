package com.mangkyu.stream.Quiz2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz2 {

    private static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

    public Map<String, Integer> quiz1() {
        Map<String, Integer> result = new HashMap<>();

        // for
//        for (String word : WORDS) {
//            String substring = word.substring(0, 1);
//            result.put(substring, result.getOrDefault(substring, 0) + 1);
//        }

        // stream
        WORDS.stream()
                .forEach(word -> {
                    String substring = word.substring(0, 1);
                    result.put(substring, result.getOrDefault(substring, 0) + 1);
                });
        return result;
    }

    public String quiz2() {
        StringBuilder stringBuilder = new StringBuilder();

        // for
//        for (String word : WORDS) {
//            if (word.length() >= 2) {
//                stringBuilder.append(word.substring(0, 1).toUpperCase() + " ");
//            }
//        }

        // tream
        WORDS.stream()
                .filter(word -> word.length() >= 2)
                .map(word -> word.toUpperCase())
                .forEach(word -> {
                    String substring = word.substring(0, 1);
                    stringBuilder.append(substring + " ");
                });
        return stringBuilder.toString().trim();
    }

}

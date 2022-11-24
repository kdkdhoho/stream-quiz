package com.mangkyu.stream.Quiz3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz3 {

    private static final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    private static final List<Integer> numbers2 = Arrays.asList(3, 4);

    public List<Integer[]> quiz1() {
        // for
//        List<Integer[]> result = new ArrayList<>();
//        for (Integer num1 : numbers1) {
//            for (Integer num2 : numbers2) {
//                result.add(new Integer[]{num1, num2});
//            }
//        }
//        return result;

        // stream
        return numbers1.stream()
                .flatMap(num1 -> numbers2.stream()
                        .map(num2 -> new Integer[]{num1, num2}))
                .collect(Collectors.toList());
    }

    public int quiz2() {
        // for
//        int max = Integer.MIN_VALUE;
//        for (Integer num1 : numbers1) {
//            for (Integer num2 : numbers2) {
//                max = Math.max(max, num1 * num2);
//            }
//        }
//        return max;

        // stream
        return numbers1.stream()
                .flatMap(num1 -> numbers2.stream()
                        .map(num2 -> num1 * num2))
                .max(Comparator.naturalOrder())
                .orElse(0);
    }

}

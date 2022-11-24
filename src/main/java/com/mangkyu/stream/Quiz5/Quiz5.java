package com.mangkyu.stream.Quiz5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Quiz5 {

    private static final String[] STRING_ARR = {"aaa", "bb", "c", "dddd"};

    public int quiz1() {
        return Arrays.stream(STRING_ARR)
                .mapToInt(str -> str.length())
                .sum();
    }

    public int quiz2() {
        return Arrays.stream(STRING_ARR)
                .mapToInt(str -> str.length())
                .max()
                .orElse(-1);
    }

    public List<Integer> quiz3() {
        return new Random().ints(1, 46)
                .limit(6)
                .distinct()
                .sorted()
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
    }

    public List<Integer[]> quiz4() {
        return Collections.emptyList();
    }

}

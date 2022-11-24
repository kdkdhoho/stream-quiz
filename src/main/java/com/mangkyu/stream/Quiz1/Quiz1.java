package com.mangkyu.stream.Quiz1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Quiz1 {

    public Map<String, Integer> quiz1() throws IOException {
        List<String[]> csvLines = readCsvLines();
        Map<String, Integer> result = new HashMap<>();

        csvLines.stream().map(line -> line[1].trim())
                .map(line -> line.split(":"))
                .flatMap(Arrays::stream)
                .forEach(hobby -> result.put(hobby, result.getOrDefault(hobby, 0) + 1));
        return result;
    }

    public Map<String, Integer> quiz2() throws IOException {
        List<String[]> csvLines = readCsvLines();
        Map<String, Integer> result = new HashMap<>();

        csvLines.stream().filter(line -> line[0].startsWith("정"))
                .map(line -> line[1].trim().split(":"))
                .flatMap(Arrays::stream)
                .forEach(hobby -> result.put(hobby, result.getOrDefault(hobby, 0) + 1));
        return result;
    }

    public int quiz3() throws IOException {

    }

    private List<String[]> readCsvLines() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(getClass().getResource("/user.csv").getFile()));
        csvReader.readNext();
        return csvReader.readAll();
    }

}

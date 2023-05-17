package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.stream.Stream;

public class SortNumberList {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(5,2,1,56,3,7,1,645,12,3,7,4,5,123,86,12,3,2,3,4,4,3);
        integerStream.distinct().sorted().forEach(System.out::println);
    }
}

package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        evenStream.limit(10).forEach(System.out::println);

//        List<Integer> list = Stream.iterate(1, n -> n + 2).limit(10)
    }
}

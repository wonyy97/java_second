package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 4, 3, 20, 10, 100, 200, 300);

        List<Integer> resultList = intList.stream()
                                        .distinct()
                                        .skip(2)
                                        .limit(3)
                                        .toList();

        System.out.println(intList);
        System.out.println(resultList);

        System.out.println("=================");
        IntStream.range(1, 5).forEach(System.out::println); // 1,2,3,4
        IntStream.rangeClosed(1, 5).forEach(System.out::println); // 1,2,3,4,5

        List<Integer> list3 = Arrays.stream(IntStream.rangeClosed(1, 100).toArray())
                                    .boxed()
                                    .collect(Collectors.toList());

        List<Integer> list4 = IntStream.rangeClosed(1, 100).boxed().toList();
    }
}

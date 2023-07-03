package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //0,1,2,3,4,5,6,7,8,9,
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

        //원본에서 짝수만 제거
        list.removeIf(item -> item % 2 == 0 || item % 3 == 0);
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

        list.replaceAll(item -> item * 10);
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

    }
}


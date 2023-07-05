package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaEx6 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        IntSupplier s2 = () -> (int)(Math.random() * 100) + 1; // 속도가 더 빠르다
        IntConsumer ic;
        IntPredicate ip;
        IntFunction<Integer> iff;


    }
}
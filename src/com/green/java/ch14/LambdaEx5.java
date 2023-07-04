package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100 ) + 2;

        /*System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());*/

        //Consumer<T> 'T' 부분에 타입을 넣는대로 바뀐다.

        Consumer<Integer> c = i -> System.out.println(i);
//        Consumer<Integer> c2 = new ConsumerImple();
        Consumer<Integer> c4 = System.out::println; //메소드 참조
        Consumer<Integer> c3 = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        // consumer를 implements 했다
        c.accept(100);


        int val = 9;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.printf("%d > 10: %b\n", val,p1.test(100));

        Function<Double, Integer> fn1 = i -> (int)(Math.floor(i));
        Function<Double, Integer> fn2 = dVal -> (int)dVal.intValue();

        System.out.println(fn2.apply(10.5));



        //Wrapper Type 기본(프라모티브)타입을 감싸는 타입
        //int > Integer
        //short > Short
        //double > Double
        //float > Float

        Integer n1 = 10;
        int n2 = n1;
        Integer n3 = 20;
        n1 = 20;

        System.out.println(n1 == n3);

        String s1 = "안녕";
        String s2 = "안녕";
        System.out.println(s1 == s2);




    }
}


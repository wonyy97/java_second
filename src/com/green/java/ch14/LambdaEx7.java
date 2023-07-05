package com.green.java.ch14;

import java.util.function.*;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16); //16진수 문자열을 10진수로 변환
        Function<Integer, String> g = i -> Integer.toBinaryString(i); //10진수로 들어오면 2진수로 변환

        System.out.println(f.apply("f"));
        System.out.println(g.apply(9));

        Function<String, String> h = f.andThen(g);

        int r = f.apply("A");
        System.out.println("r : " + r);
        String r2 = g.apply(r);
        System.out.println("r2 : " + r2);
        System.out.println("h :  " + h.apply("A"));

        Function<String, String> f2 = x -> x;
        System.out.println(f2.apply("AAA"));

        System.out.println("===============================");
        //함수 Function , 메소드 Method
        //어디에 포함되어 있다 그러면 메소드
        //단독으로 있다 그러면 함수

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r3 = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        System.out.println("p.test : " + p.test(99));
        System.out.println("notP.test : " + notP.test(99));

        Predicate<Integer> all = notP.and(q.or(r3));
        System.out.println("all.test(223) : " + all.test(223));

        String str1 = new String("abc");
        String str2 = new String("abc");


        Predicate<String> p2 = Predicate.isEqual(str1);
        System.out.println("p2.test(str2) : " + p2.test(str2));
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));

    }
}
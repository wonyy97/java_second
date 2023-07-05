package com.green.java.ch14;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class RefMethod2 {
    public static void main(String[] args) {
        Function<Integer, Myclass2> f = Myclass2::new;
        Myclass2 mc2 = f.apply(10);
        System.out.println(mc2.getNum());

        Supplier<Myclass2> s = Myclass2::new;
        Myclass2 mc22 = s.get();
        System.out.println(mc22.getNum());

    }
}

class Myclass2 {
    private int num;
    private int age;
    private String name;

    public Myclass2() { }
    public Myclass2(int num) {
        this.num = num;
    }
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
}
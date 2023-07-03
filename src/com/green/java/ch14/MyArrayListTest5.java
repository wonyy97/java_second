package com.green.java.ch14;

public class MyArrayListTest5 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        for (int i = 100; i <= 120; i++) {
            ma.add(i);
        }
        System.out.println(ma);

        //110 이하는 + 1, 나머지는 * 2
        MyArrayList ma2 = ma.map(item -> item <= 110 ? item + 1 : item * 2);
        System.out.println(ma2);
    }
}

package com.green.java.ch07.ArrayList;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(22);
        myList.add(4);
        myList.add(200);
        myList.add(53);
        myList.add(96);

        myList.bubbleSort();
    }
}
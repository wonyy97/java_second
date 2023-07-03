package com.green.java.ch14;

import jdk.jfr.Percentage;

import javax.swing.*;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}


interface MyPredicate {
    boolean test(int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int num) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = num;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void forEach(MyConsumer consumer) {

        for (int i = 0; i < this.arr.length; i++) {
            consumer.accept(this.arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {

        /* MyArrayList mylist = new MyArrayList();
        for (int i = 0; i <arr.length; i++) {
            if(predicate.test(arr[i])) {
                mylist.add(arr[i]);
            }
        }
        return mylist; */

        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            if(predicate.test(val)) {
                temp.add(val);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i=0; i<this.arr.length; i++) {
            if(i > 0) { sb.append(", "); }
            sb.append(this.arr[i]);
        }
        sb.append(" ]");
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        String str = "[";
//        if (this.arr.length > 0) {
//            str += this.arr[0];
//            for (int i = 1; i < this.arr.length; i++) {
//                str += ", " + this.arr[i];
//            }
//        }
//        str += "]";
//        return String.format(str);
//    }
}
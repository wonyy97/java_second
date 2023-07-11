package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class GBoxTest<T> {
    public static void main(String[] args) {
        GBox box = new GBox();
        box.setItem("hello");
        box.setItem(12);
        box.setItem(12.3);
        box.setItem(new Car(1000));

        GBox<Car> cBox = new GBox();
        cBox.setItem(new Car(1000));

        Car c = cBox.getItem();
        System.out.println(c.getCc());

        List<String> list = new ArrayList();
    }

}

package com.green.java.ch12;

public class GenericsStudy1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        Box3<Apple> appleBox = new Box3();
//        Box3<Fruit> fruitBox2 = (Box3<Fruit>)appleBox; //불공변성
    }
}

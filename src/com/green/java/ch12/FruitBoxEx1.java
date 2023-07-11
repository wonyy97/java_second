package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box2<Fruit> fruitBox = new Box2();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
//        fruitBox.add(new Toy());
        System.out.println(fruitBox);

        Box2<Apple> appleBox = new Box2();
//        appleBox.add(new Fruit());
//        appleBox.add(new Toy());
//        appleBox.add(new Grape()); 프로그램은 무조건 상하관계만 있다. 형제관계는 아무 의미 없다 남이다.
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Apple a = appleBox.get(2);

        System.out.println(appleBox);
    }
}

class Fruit { public String toString() { return "Fruit"; } }
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy { public String toString() { return "Toy"; } }

class Box2 <T> {
    private List<T> list = new ArrayList();
    public void add(T item) { list.add(item); }
    public T get(int idx) { return list.get(idx); }
    public int size() { return list.size(); }
    public String toString () { return list.toString(); }
}
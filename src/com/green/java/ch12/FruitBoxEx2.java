package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        Box3<Car> box = new Box3();
//        FruitBox<Car> fBox = new FruitBox(); //Fruit을 상속받은 애만 사용 사능 그래서 Car는 안됨
        FruitBox<Fruit> fBox = new FruitBox();
        fBox.add(new Fruit());
        fBox.add(new Apple());
        fBox.add(new Grape());

        FruitBox<Apple> aBox = new FruitBox();
        aBox.add(new Apple());
    }
}

class Fruit2 { public String toString() { return "Fruit"; } }
class Apple2 extends Fruit { public String toString() { return "Apple"; } }
class Grape2 extends Fruit { public String toString() { return "Grape"; } }
class Toy2 { public String toString() { return "Toy"; } }

                    // Fruit 밑으로만 쓴다???? 제일 앞에 있는 제네릭이 Box3에 있는 제네릭으로 전달한다?
class FruitBox<T extends Fruit> extends Box3<T> {

}

class Box3 <T> {
    private List<T> list = new ArrayList();
    public void add(T item) { list.add(item); }
    public T get(int idx) { return list.get(idx); }
    public int size() { return list.size(); }
    public String toString () { return list.toString(); }
}
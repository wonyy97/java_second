package com.green.java.ch12;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();

        box.setItem("Hello");
        box.setItem(10);
        box.setItem(10.3);

        box.setItem(new Car(2000));
        box.setItem(new Car(3000));
//        box.setItem(new Car()); 객체생성 안 되어야 한다.

        Object obj = box.getItem();
        Car c = (Car) obj;
        int cc = c.getCc();

        Car car2 = (Car)box.getItem();
        car2.getCc();

        System.out.println(cc);

    }
}

class Car {
    private int cc;

//    public Car() {}

    public Car(int cc) { //일회용성 , 객체 생성하면 버려진다
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }
}
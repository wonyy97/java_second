package com.green.java.ch14;

public class FightableLambdaTest {

    public static void run(Fightable f) {
        f.punch();
    }

    //유추해서 사용한다.
    //람다를 사용할 땐 인터페이스에 메소드가 하나만 있어야 한다
    public static void main(String[] args) {
        Fightable f1 = () -> {
            System.out.println("I love 땅콩");
        };
        run(f1);


        Fightable f2 = new Fightable() { //인터페이스 객체화 한거 아니다. 익명클래스 호출해서 객체화함
            @Override
            public void punch() {
                System.out.println("I love 땅콩♥");
            }
        };
        run(f2);

    }
}

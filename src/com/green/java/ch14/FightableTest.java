package com.green.java.ch14;


public class FightableTest {

    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        StreetFighter sf = new StreetFighter();
        run(sf);

        //익명클래스
        run(new Fightable() {
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        run(new Fightable() {
            @Override
            public void punch() {

            }
        });

        Fightable f1 = new Fightable() { //인터페이스 객체화 한거 아니다. 익명클래스 호출해서 객체화함
            @Override
            public void punch() {
                System.out.println("I love 땅콩");
            }
        };


    }
}


class StreetFighter implements Fightable {

    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }

}
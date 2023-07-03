package com.green.java.ch14;


//인터페이스를 람다로 쓸 때는 @FunctionalInterface 어노테이션 사용
@FunctionalInterface
public interface Fightable {
    void punch();
}

package com.green.java.ch14;

public class LambdaInterfaceTest {
    public static void main(String[] args) {
        //하나일 때 소괄호 생략 가능
        //파라미터가 하나일 때 소괄호 생략 가능
        LambdaInterface li1 = heal -> System.out.println("에너지 : " + heal);

        li1.healing(100);
    }
}

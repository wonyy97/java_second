package com.green.java.ch14;

public class CalculatableTest {
    public static void main(String[] args) {
        Calculatable cc = new Calculatable() {
            @Override
            public int clac(int n1, int n2) {
                return n1 + n2;
            }
        };

        int result = cc.clac(10, 20);
        System.out.println("result : " + result);

        //인터페이스에서 인플리먼트 했기 때문에 타입을 적어주지 않아도 된다.
        //중괄호가 없다는것은 무조건 한줄이라는것 중괄호가 생략되면서 ;도 생략된다
        //중괄호가 생략되면 retrun도 생략된다.
        //두줄이 되면 중괄호가 생겨야 한다./ 한줄의 기준은 ;으로 나뉜다.
        Calculatable cc2 = (n1, n2) -> n1 + n2;
        int result2 = cc2.clac(20, 30);
        System.out.println("result2 : " + result2);

        //중괄호를 넣을 땐 ;을 넣어줘야 한다.
        Calculatable cc3 = (n1, n2) -> {
          return n1 + n2;
        };
        System.out.println("result2 : " + cc3.clac(100, 200));
    }
}

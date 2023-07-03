package com.green.java.ch01;

public class grade {
    public static void main(String[] args) {
        new grade("강백호", 90.0, 85.5,70.0);


    }
    grade(String name, double kor, double eng, double math) {
        double sum = 0;
        double avg = 0;
        sum = kor + eng + math;
        avg = sum / 3;
       System.out.printf("%s의 평균 점수: %.2f",name,avg);
    }
}

package com.green.java.ch01;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        int input =0; int sum=0; int avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        input = sc.nextInt();
        while (input==0) {
            if (input!=0) {
                input = sc.nextInt();
                sum += input;
                avg = sum;
            }
            break;
        }
        input = sc.nextInt();
        System.out.printf("합계는 %d입니다. 평균은 %d입니다.",sum,avg);
    }
}

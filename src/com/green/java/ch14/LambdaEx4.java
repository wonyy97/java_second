package com.green.java.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //0,1,2,3,4,5,6,7,8,9,
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

        //원본에서 짝수만 제거
        list.removeIf(item -> item % 2 == 0 || item % 3 == 0);
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

        list.replaceAll(item -> item * 10);
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();

        // 콜랙션 한곳에 여러개를 넣기 위한 것
        // ArrayList는 값만 넣는다. 시퀀스(순서)가 중요하다
        // Map은 방 이름을 지정 해 줘야한다.
        // 빼낼 때 방이름으로 꺼내면 된다.
        // 키와 밸류로 이루어져 있다.
        // 넣을 때 put, 뺄 때 get
        //   < 타입, 타입 >
        Map<String, Object> map = new HashMap<>();
        map.put("age", 27); //map.put("키값", "밸류값");
        map.put("name", "김원희");
        map.put("height", 160.3);

        int age = (int)map.get("age");
        String name = (String)map.get("name");
        double height = (double)map.get("height");

        System.out.println("age : " + age);
        System.out.println("name : " + name);
        System.out.println("height : " + height);
        System.out.println();

        map.forEach((key, value) -> {
            System.out.printf("%s, %s", key, value);
        });
    }
}


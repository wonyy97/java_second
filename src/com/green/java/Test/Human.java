package com.green.java.Test;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String addr;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddr() {
        return addr;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

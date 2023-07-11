package com.green.java.ch12;

public class Box {

    public final static int NUM_MAX = 10;
    private Object obj;

    public void setItem(Object obj) {
        this.obj = obj;
    }

    public Object getItem() {
        return obj;
    }


}

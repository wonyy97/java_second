package com.green.java.ch14;


@FunctionalInterface
interface Myfunction {
    void run();
}



public class LambdaEx1 {
    static void execute(Myfunction f) {f.run();}

    public static void main(String[] args) {
//        Myfunction mf1 = getMyFunction();
//        mf1.run();
//        execute(mf1);
        execute(getMyFunction());
    }

    public static Myfunction getMyFunction() {
        return () -> System.out.println("mf1");
    }
}


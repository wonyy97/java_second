package com.green.java.ch14;


@FunctionalInterface
interface MyFunction {
    void run();
}



public class LambdaEx1 {
    static void execute(MyFunction f) {f.run();}

    public static void main(String[] args) {
//        Myfunction mf1 = getMyFunction();
//        mf1.run();
//        execute(mf1);
        execute(getMyFunction());
    }

    public static MyFunction getMyFunction() {
        return () -> System.out.println("mf1");
    }
}


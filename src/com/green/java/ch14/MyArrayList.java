package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply(int p);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int num) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = num;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public static MyArrayList asList(int ...num) {
        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < num.length; i++) {
            int val = num[i];
            temp.add(val);
        }
        return temp;
    }



    public void forEach(MyConsumer consumer) {

        for (int i = 0; i < this.arr.length; i++) {
            consumer.accept(this.arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {

        /* MyArrayList mylist = new MyArrayList();
        for (int i = 0; i <arr.length; i++) {
            if(predicate.test(arr[i])) {
                mylist.add(arr[i]);
            }
        }
        return mylist; */

        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            if (predicate.test(val)) {
                temp.add(val);
            }
        }
        return temp;
    }

    public void removeIf(MyPredicate predicate) {
        //false로 넘어오는것만 살리자
        int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            if(!predicate.test(val)) {
                temp[idx++] = val;
            }
        }
        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
           temp2[i] =  temp[i];
        }
        this.arr = temp2;
    }

    public MyArrayList map(MyFunction2 fn) {
        /* MyArrayList temp = new MyArrayList();

        for (int i = 0; i < arr.length; i++) {
            temp.add(mf2.apply(arr[i]));
        }

        return temp;*/

        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < this.arr.length; i++) {
            int val = fn.apply(this.arr[i]);
            temp.add(val);
        }
        return temp;
    }

    public void replaceAll(MyFunction2 fn) {
        for (int i = 0; i < this.arr.length; i++) {
            int val = fn.apply(this.arr[i]);
            this.arr[i] = val;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < this.arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.arr[i]);
        }
        sb.append(" ]");
        return sb.toString();
    }




//    @Override
//    public String toString() {
//        String str = "[";
//        if (this.arr.length > 0) {
//            str += this.arr[0];
//            for (int i = 1; i < this.arr.length; i++) {
//                str += ", " + this.arr[i];
//            }
//        }
//        str += "]";
//        return String.format(str);
//    }

    /*int idx = 0;
        int[] temp = new int[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            if (!predicate.test(val)) {
                temp[idx++] = val;
            }
        }
        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;*/
}
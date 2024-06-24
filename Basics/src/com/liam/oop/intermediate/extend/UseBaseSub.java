package com.liam.oop.intermediate.extend;

public class UseBaseSub {
    public static void main(String[] args) {
        System.out.println("第一个对象===");
        Sub sub = new Sub();
        //sub.sayOK();
        System.out.println();
        System.out.println("第二个对象===");
        Sub sub2 = new Sub("jack");
    }
}

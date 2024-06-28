package com.liam.demo.oop.intermediate.qualifier.modifier;

public class A {
    //四种访问修饰符
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 =300;
    private int n4 = 400;

    public void m1(){
        //测试访问
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

    }
}


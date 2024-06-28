package com.liam.oop.intermediate.super_;

public class A {
    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //构造器
    public A(){}
    public A(String name){}
    public A(String name, int age){}
    //四个方法
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }

    public void cal(){
        System.out.println("A类的Cal方法");
    }
}

package com.liam.oop.basic.constructor;

public class Constructor01 {
    public static void main(String[] args) {
        Persion persion = new Persion("李雷", 18);
        System.out.println(persion.name);
    }
}
class Persion{
    String name;
    int age;
    //构造器
    public Persion(String pName,int pAge){
        //pName 的值传进来,赋值给属性 name;
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }
}

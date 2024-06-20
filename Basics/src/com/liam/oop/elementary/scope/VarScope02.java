package com.liam.oop.elementary.scope;

public class VarScope02 {
    public static void main(String[] args) {
        A a = new A();
        a.cat();
    }
}

class A{
    int age = 18;

    public void cat(){
        //属性和局部变量可以重名,访问是遵循就近原则;
        //int age = 19;
        System.out.println(age);
    }
}
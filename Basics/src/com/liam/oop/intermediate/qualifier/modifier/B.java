package com.liam.oop.intermediate.qualifier.modifier;

public class B {
    public void m2(){
        A a = new A();
        //同包下，访问测试,除了private其余都能访问
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
    }
}

package com.liam.demo.oop.intermediate.polymorphic;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 00:19
 * @Author: Liam
 * @Description:
 */

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        B b = new B();
        //传入不同的参数,会调用不同的 sum 方法,就体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        a.say();
        b.say();

    }
}
class B{
    public void say(){
        System.out.println("B say 方法被调用");
    }
}
class A extends B{
    public int sum(int n1,int n2){
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    public void say(){
        System.out.println("A say 方法被调用");
    }
}
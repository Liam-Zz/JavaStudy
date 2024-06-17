package com.liam.oop.basic.scope;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VarScope01 {
    public static void main(String[] args) {

    }
}

class Cat{

    //全局变量
    //age 的作用域为整个类体;
    int ages = 10;
    //不赋值,即可使用(存在默认值)
    double weight;


    public void say(){
        //局部变量;
        //n 和 name 的作用域在 car 方法中;
        int n =10;
        String name = "jack";
        System.out.println("在 car 中使用属性: " + ages);
    }

    public void eat(){
        System.out.println("age: " + ages);
        //无法使用 say 方法中的变量(无法使用)
        //System.out.println(n);
        //不赋值不可使用
        double weight1;
        //System.out.println(weight);
    }

}
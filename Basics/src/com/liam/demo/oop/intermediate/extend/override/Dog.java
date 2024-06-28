package com.liam.demo.oop.intermediate.extend.override;

public class Dog extends Animal{
    /*
    Dog 是 Animal 的子类
    Dog 的 cay 方法和 Animal 的 cay 定义的方式一样(返回值,名称,参数列表)
     */
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
}

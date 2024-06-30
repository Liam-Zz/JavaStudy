package com.liam.demo.oop.advanced.codeblock;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 18:31
 * @Author: Liam
 * @Description:
 */

public class CodeBlockDetail01 {

    public static void main(String[] args) {
        //创建实例时,静态代码块会被执行
/*        AA aa = new AA();
        System.out.println("---------");*/
        ////创建子类实例时,父类静态代码块也会被执行
        BB bb = new BB();
        System.out.println(Cat.age);
        System.out.println(AA.age);

    }
}
class AA{
    public static int age = 18;
/*    static {
        System.out.println("静态代码块AA被执行");
    }*/
    {
        System.out.println("非静态代码块AA被执行");
    }
}
class BB {
    static {
        System.out.println("静态代码块BB被执行");
    }
}
class Animal{
    static {
        System.out.println("Animal 静态代码块被执行");
    }
}
class Cat extends Animal{
    public static int age = 6;
    static {
        System.out.println("Cat 静态代码块被执行");
    }
}
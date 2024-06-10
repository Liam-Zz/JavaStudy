package com.liam.oop.basic;

public class CatDemo {
    public static void main(String[] args) {

        /*
            实例化一只猫;
            创建的对象(猫),赋给 cat1,cat2;
            cat 是自定义数据类型
            cat1 和 cat2 都是独立的对象
         */

        //第一只猫
        Cat cat1 = new Cat();
        //赋值
        cat1.name = "小黑";
        cat1.age = 18;
        cat1.color = "黑色";

        //第二只猫
        Cat cat2 = new Cat();
        //赋值
        cat2.name = "小白";
        cat2.age = 16;
        cat2.color = "白色";

        //访问第一只猫和第二只猫的数据
        System.out.println("第一只猫的名字: " + cat1.name + "\n第二只猫的名字: " + cat2.name);
    }
}

//创建一个类
class Cat{
    //属性
    String name;
    int age;
    String color;

    //增加属性(便利)
    double weight;
}
package com.liam.demo.oop.intermediate.polymorphic.polyobject_;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 18:06
 * @Author: Liam
 * @Description:
 */

public class PolyObject {
    /*
    1.一个对象的编译类型和运行类型可以不一致
    2.编译类型在定义时,就确定了,不能改变
    3.运行类型是可以变化的
    4.编译类型看定义 =号 的左边,运行类型看 =号 的右边

    示例:
    Animal animal = new Dog();
     */
    public static void main(String[] args) {
        //代码运行时以运行类型为主
        //编译类型为:Animal. 运行类型为:Dog
        Animal animal = new Dog();
        animal.cry();

        //编译类型为:Animal. 运行类型为:Cat
        animal = new Cat();
        animal.cry();
    }
}

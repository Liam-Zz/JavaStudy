package com.liam.demo.oop.intermediate.polymorphic.detail;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 19:46
 * @Author: Liam
 * @Description:
 */

public class PolyDetail {
    public static void main(String[] args) {
        /*
        向上转型: 父类的引用执行子类的对象
         */
        Animal animal = new Cat();
        animal.sleep();
        animal.run();
        animal.eat();
        animal.show();

        //可以调用 Cat 的 catchMouse 方法(通过向下转型实现)
        //cat 编译类型是 Cat, 运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //父类的引用必须指向的是当前目标类型的对象(animal 的指向必须是 Cat,才可以通过 cat 向下转型;)
        /*
        该语法编译正常,执行会报错;不能进行强制转换
        Dog dog =(Dog) animal;
        dog.DogchMouse();
        */
    }
}

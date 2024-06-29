package com.liam.demo.oop.intermediate.polymorphic;

public class Demo {
    /*
    多态非常重要
        解决代码的复用;
    多态概念:
        方法或对象具有多种形态,是面向对象的第三大特征,多态是建立在封装和继承基础之上的.

    多态的具体体现
        方法的多态
        对象的多态

     多态的前提条件
        1.两个对象存在继承关系
        2.多态的向上转型
            本质: 父类的引用指向了子类的对象
            语法: 父类类型 引用名 = new 子类类型();
            1.可以调用父类的所有成员(遵循访问权限 )
            2.不用调用子类的特有成员
            3.最终运行效果看子类的具体实现(调用方法是,按照从子类开始查找方法 )
        3.多态的向下转型
            语法: 子类类型 引用名 = (子类类型)父类引用;
            1.只能强转父类的引用,不能强转父类的对象
            2.要求父类的引用必须指向的是当前目标类型的对象
            3.当向下转型后,就可以调用子类类型中所有成员

        4.属性无重写之说,属性的值就看编译类型.
        5.instanceOf 比较操作符, 用于判断对象的类型是否为 XX 类型或 XX 类型的子类型
     */
    public static void main(String[] args) {
        Master tom = new Master("Tom");

        Dog dog = new Dog("小黑");
        Bone bone = new Bone("骨头");
        tom.feed(dog,bone);
        System.out.println("---------");
        Cat cat = new Cat("小花");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat,fish);
        System.out.println("---------");
        Pig pig = new Pig("小白");
        Rice rice = new Rice("米饭");
        tom.feed(pig,rice);
    }
}

package com.liam.demo.oop.intermediate.polymorphic;

public class Demo {
    /*
    多态非常重要
        解决代码的复用;

     */
    public static void main(String[] args) {
        Master tom = new Master("Tom");

        Dog dog = new Dog("小黑");
        Bone bone = new Bone("骨头");
        tom.eat(dog,bone);

        Cat cat = new Cat("小花");
        Fish fish = new Fish("黄花鱼");
        tom.eat(cat,fish);
    }
}

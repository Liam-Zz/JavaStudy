package com.liam.demo.oop.intermediate.polymorphic;

public class Master {
    private String name;

    //使用多态的机制,可以统一管理主人喂食物
    //animal 编译类型是 Animal,可以接收 Animal 子类的对象
    //food 编译类型是 Food,可以接收 Food 子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }
/*
    //主人给小狗喂食骨头
    public void eat(Dog dog,Bone bone){
        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
    }

    //主人给小猫喂食小鱼
    public void eat(Cat cat,Fish fish){
        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
    }*/

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

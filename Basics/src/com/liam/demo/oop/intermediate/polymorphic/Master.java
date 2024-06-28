package com.liam.demo.oop.intermediate.polymorphic;

public class Master {
    private String name;

    //主人给小狗喂食骨头
    public void eat(Dog dog,Bone bone){
        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
    }

    //主人给小猫喂食小鱼
    public void eat(Cat cat,Fish fish){
        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
    }
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

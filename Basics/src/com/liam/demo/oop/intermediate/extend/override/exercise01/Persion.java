package com.liam.demo.oop.intermediate.extend.override.exercise01;

public class Persion {
    private String name;
    private int age;

    public String info(){
        return "name= " + name + " age= " + age;
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

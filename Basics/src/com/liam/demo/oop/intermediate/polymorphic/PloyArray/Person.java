package com.liam.demo.oop.intermediate.polymorphic.PloyArray;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 23:43
 * @Author: Liam
 * @Description:
 */

public class Person {
    String name;
    int age;

    public String say(){
        return name + "\t" + age;
    }

    public Person(String name, int age) {
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

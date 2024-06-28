package com.liam.demo.oop.intermediate.package_.doguse;

import com.liam.demo.oop.intermediate.package_.dog.Dog;

public class Usedog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);

        //为什么下面的要写入包名？（因为同名的有冲突，为了做区分）
        com.liam.demo.oop.intermediate.package_.dog1.Dog dog1 = new com.liam.demo.oop.intermediate.package_.dog1.Dog();
        System.out.println(dog1);
    }
}

package com.liam.demo.oop.intermediate.extend.override.exercise01;

public class OverrideExercise {
    public static void main(String[] args) {
        Persion jack = new Persion("jack", 18);
        System.out.println(jack.info());

        System.out.println("---方法重写---");

        Student student = new Student("Liam", 18, 1, 100);
        System.out.println(student.info());
    }
}

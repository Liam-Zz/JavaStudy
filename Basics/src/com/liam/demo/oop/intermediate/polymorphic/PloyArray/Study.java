package com.liam.demo.oop.intermediate.polymorphic.PloyArray;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 23:45
 * @Author: Liam
 * @Description:
 */

public class Study extends Person{
    private double score;

    public void study(){
        System.out.println("学生 " + getName() + "正在学习");
    }

    @Override
    public String say() {
        return "学生: " + super.say() + " score: " + score;
    }

    public Study(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

package com.liam.demo.oop.intermediate.extend.improve;

//是Pupil和Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showinfo(){
        System.out.println("学生名字: " + name +"\t"  + age + "\t" + score);
    }
}

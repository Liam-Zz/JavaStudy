package com.liam.oop.intermediate.extend.improve;

public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println(name + "\t" + " 正在考试");
    }
    public void info(){
        System.out.println("学生名字: " + name +"\t"  + age + "\t" + score);
    }
}

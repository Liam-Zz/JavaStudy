package com.liam.oop.intermediate.extend;

import java.security.PublicKey;

public class Pupil {
    /*
        模拟小学生考试
     */
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println(name + "\t" + " 正在考试");
    }
    public void info(){
        System.out.println("小学生名字: " + name +"\t"  + age + "\t" + score);
    }
}

package com.liam.oop.intermediate.extend;

public class Graduate {
    /*
        大学考试情况
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
        System.out.println("大学生名字: " + name +"\t"  + age + "\t" + score);
    }
}

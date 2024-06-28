package com.liam.demo.oop.intermediate.extend.override.exercise01;

public class Student extends Persion{
    private int id;
    private double score;

    public String info(){
        return super.info() + " id= " + id + " score= " + score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age); //自动调用父类构造器
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

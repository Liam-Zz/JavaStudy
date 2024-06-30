package com.liam.demo.oop.intermediate.polymorphic.PloyArray;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 23:47
 * @Author: Liam
 * @Description:
 */

public class Teach extends Person{
    private double salary;

    public void teash(){
        System.out.println("老师 " + getName() + "正在授课");
    }

    @Override
    public String say() {
        return "老师: " + super.say() + " salary: "+ salary;
     }

    public Teach(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

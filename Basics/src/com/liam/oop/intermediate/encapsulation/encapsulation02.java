package com.liam.oop.intermediate.encapsulation;

public class encapsulation02 {

    /*
        将构造器和封装结合(如构造器不做优化,则封装限制失效)
        优化:将 set 方法写在构造器当中;

    */
    public static void main(String[] args) {

        Persion1 persion1 = new Persion1("aaaaaaaaaaaa",1800,3000);
        System.out.println(persion1.info());

    }
}

class Persion1{
    public String name;
    private int age;
    private double salary;

    public Persion1() {
    }

    public Persion1(String name, int age, double salary) {
        /*this.name = name;
        this.age = age;
        this.salary = salary;*/
        //将 set 方法写在构造器中
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //封装
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if ( name.length() >=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("姓名不合法");
            this.name = "无名";
        }

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >=1 && age <=120){
            this.age = age;
        }else {
            System.out.println("年龄不合法");
            //设置默认值
            this.age = 18;
        }

    }
    public double getSalary() {
        //可增加权限判断,来限制访问;
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "信息为: " + name + "\t" + age + "\t" + salary;
    }
}
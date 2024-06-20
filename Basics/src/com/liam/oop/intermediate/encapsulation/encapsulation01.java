package com.liam.oop.intermediate.encapsulation;

public class encapsulation01 {

    /*
    设置一个程序,记录工资等隐私信息,敏感信息不能查看,且对年龄进行合理验证;
    年龄限制:1-120;
    工资信息不能直接查看
    name 的长度在 2-6 之间
 */
    public static void main(String[] args) {

        Persion persion = new Persion();
        persion.setName("jackaaaaaa");
        persion.setAge(20);
        persion.setSalary(1000);
        System.out.println(persion.info());

    }
}

class Persion{
    public String name;
    private int age;
    private double salary;

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
package com.liam.oop.elementary.constructor;

public class Constructor02 {
    public static void main(String[] args) {
        //使用第一个构造器创建对象
        Persion01 king = new Persion01("king", 40);
        //使用第二个构造器创建对象
        Persion01 queer = new Persion01("queer");

        //不显视声明无参构造器,无法创建初始化对象
        Persion01 persion01 = new Persion01();
    }
}

class Persion01{
    String name;
    int age;

    //默认构造器
    Persion01(){

    }
    public Persion01(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    //构造器重载
    public  Persion01(String pName){
        name = pName;
    }
}
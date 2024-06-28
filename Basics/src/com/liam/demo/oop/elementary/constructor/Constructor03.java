package com.liam.demo.oop.elementary.constructor;

public class Constructor03 {
    public static void main(String[] args) {
        Persion03 persion03 = new Persion03();
        System.out.println(persion03.age);
        Persion03 persion031 = new Persion03(19, "李雷");
        System.out.println(persion031.name + " " + persion031.age);
    }
}
class Persion03{
    /*
        定义一个无参构造器,利用构造器设置所有人的 age 属性初始值为 18;
        定义一个 pName 和 pAge 两个参数构造器,每次创建 Persion03 对象时初始化 age 和 name属性值
     */
    int age;
    String name;

    public Persion03(){
            age = 18;
    }

    public Persion03(int pAge,String pName){
        name = pName;
        age = pAge;
    }
}
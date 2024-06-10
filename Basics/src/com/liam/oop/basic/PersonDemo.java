package com.liam.oop.basic;

public class PersonDemo {
    public static void main(String[] args) {
        /*
            分析以下代码内存图;
         */
        Persion p1 = new Persion();
        p1.name = "小明";
        p1.age = 18;

        Persion p2 = p1;
        System.out.println(p2.name + "\t" + p2.age);


        System.out.println("==== 练习二 ====");
        Persion persion01 = new Persion();
        persion01.age = 10;
        persion01.name = "小明";
        Persion persion02;
        persion02 = persion01;
        System.out.println(persion02.name);
        persion02.age = 200;
        persion02 = null;
        System.out.println(persion01.age);
        System.out.println(persion02.age);

    }
}

class Persion{
    String name;
    int age;
}

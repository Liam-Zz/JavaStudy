package com.liam.oop.basic;

public class MethodParameter03 {
    public static void main(String[] args) {
        /*
            编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。克隆对象
            注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
         */
        Persion03 p = new Persion03();
        p.name = "lilei";
        p.age = 18;

        MyTools03 tools = new MyTools03();
        Persion03 p2 = tools.copyPersion(p);
        p2.name = "lileiBack";

        //p 和 p2 是两个独立Persion03对象
        System.out.println(p.name +"\t"+ p.age);
        System.out.println(p2.name +"\t"+ p2.age);
        System.out.println();
        //通过输出对象的hashcode判断对象是否为一个
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p == p2);
    }
}

class Persion03{
    String name;
    int age;
}
class MyTools03{
    /*
        思路：
        1. 方法的返回类型 Person
        2. 方法的名字 copyPerson
        3. 方法的形参 (Person p)
        4. 方法体, 创建一个新对象，并复制属性，返回即可
     */
    public Persion03 copyPersion(Persion03 p){
        Persion03 p2 = new Persion03();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
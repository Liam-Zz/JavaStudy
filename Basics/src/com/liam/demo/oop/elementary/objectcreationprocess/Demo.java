package com.liam.demo.oop.elementary.objectcreationprocess;

public class Demo {
    /*
        对象创建的流程分析

           经典面试题

           创建对象后 -> 方法区内加载类信息(只加载一次);
                1.在堆里开辟空间
                2.初始化空间(默认初始化 -> 赋值初始化)
                3.构造器执行...
                4.构造器输入(构造器传入的值,赋值给对象)
                    遇到字符串的话,存放常量池,堆中值为常量池的地址
                5.对象创建完成(将堆中地址赋值给类对象)

                对象本质在堆里,栈里的是对象的引用(重点)
                扩展对象拷贝


                优化:
                1.加载 Persion 类信息(Persion.class),只会加载一次;
                2.在堆中分配空间
                3.完成对象初始化(默认初始化->显式初始化)
                4.构造器初始化
                5.对象在堆中的地址,赋值给 P(P 既为对象的引用)
     */
    public static void main(String[] args) {
        Persion04 persion04 = new Persion04(18, "小倩");
    }
}

class Persion04{
    int age =19;
    String name;

    public Persion04(int pAge,String pName){
        age = pAge;
        name = pName;
    }
}
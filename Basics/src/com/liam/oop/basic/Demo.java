package com.liam.oop.basic;

public class Demo {
    public static void main(String[] args) {
        /*
            单独变量解决问题: 不利于数据的管理;
         */
        String cat1Name = "小白";
        int cat1age = 5;
        String cat1Color="白色";

        String cat2Name = "小黑";
        int cat2age = 10;
        String cat2Color="黑色";
        /*
            数组解决问题: 只能存储同类型数据.无法关联数据
         */
        String[] cat1 = {"小白","3","白色"};
        String[] cat2 = {"小黑","10","黑色"};

        /*
            引出知识点: 类与对象

                类是抽象的，代表一类事物
                对象是具体的，代表一个具体事物
                通过类创建对象(实例化)

            类由属性和方法构成
            类是自定义数据类型

            对象存在形式--图

            如何创建对象?
                1.先声明再创建
                Cat cat;
                cat = new Cat;

                2.直接创建
                Cat cat = new Cat;

            如何访问属性?
                对象名.属性名


            Java 内存的结构分析:
                1.栈: 一般存放基本数据类型(局部变量)
                2.堆: 存放对象(Cat cat,数组等)
                3.方法区: 常量池(常量,字符串),类加载信息
                ps: 类加载,只会加载一次


            1.属性/成员变量/字段
                属性可以是基本数据类型,也可以是引用类型(对象,数组)

                注意事项:
                1.属性的定义
                    访问修饰符 属性类型 属性名;
                    访问修饰符: 控制属性的访问范围;
                    (public,protected,默认,private)
                2.属性存在默认值

            2.方法/成员方法
                1.方法的好处
                    提高代码的复用性
                    可以将实现的细节封装起来,然后供其他用户来调用即可

         */
    }
}

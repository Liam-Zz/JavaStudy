package com.liam.oop.elementary.thisuse;

public class This03 {
    public static void main(String[] args) {
        /*
            1、this 关键字可以用来访问本类的属性，方法，构造器；
            2、this 用于区分当前类的属性和局部变量
            3、访问成员方法的语句： this.方法名(形参列表);
            4、访问构造方法的语法： this(参数列表)； 只能再构造器中调用另外一个构造器
            5、this 不能在类定义的外部使用，只能在类定义的方法中使用
         */
        A a = new A();
        a.f2();
        a.f3();
    }
}

class A{

    String name = "jack";
    int age = 18;

    public A(){
        //通过无参构造器，去访问有参构造器
        //如果有this访问构造器，必须放在第一条语句；
        this("tom",18);
        System.out.println("无参构造器");

    }

    public A(String name,int age){
        System.out.println("有参构造器");
    }

    //通过

    public  void f1(){
        System.out.println("f1 方法被调用");
    }
    public void f2(){
        System.out.println("f2 方法被调用");
        //调用本类的f1方法
        //第一种方法
        f1();
        //第二种方法
        this.f1();
    }
    public void f3(){
        String name = "simisi";
        //下面的输出，受作用域影响（就近原则）
        System.out.println("name= " + name +"\t"+"age=" + age);
        //也可以使用this访问属性
        System.out.println(this.name + this.age);
    }
}


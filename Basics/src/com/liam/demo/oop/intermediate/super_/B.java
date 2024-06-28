package com.liam.demo.oop.intermediate.super_;

public class B extends A {
    public void hi(){
        System.out.println(super.n1 +" : "+ super.n2 +" : "+ super.n3);
    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    public void cal(){
        System.out.println("B类的Cal方法");
    }
    public void sum(){
        System.out.println("B类的Sum方法");
        //希望调用父类A的cal方法
        //如果在查找过程中，找到了，但不能访问，则报错；
        //三种方法
        cal();
        this.cal(); //等价于cal();
        super.cal();

    }
}

package com.liam.demo.oop.intermediate.extend;

//输入ctrl + H 看到类的继承关系
public class Sub extends Base{
    public Sub() {//子类无参构造器
        //默认存在Super()方法
        System.out.println("Sub(子类无参构造器)...");
    }
    public Sub(String name){
        //do think
        super("tom",20);
        System.out.println("Sub(子类有参构造器)...");
    }
    public void sayOK(){
        System.out.println("sayok");
        System.out.println(n1 +" "+n2 +" "+n3);
        test100();
        test200();
        test300();
        //使用父类公共方法，访问私有属性n4
        System.out.println(getn4());
        //使用父类公共方法，访问私有方法test400
        callTest400();
    }
}

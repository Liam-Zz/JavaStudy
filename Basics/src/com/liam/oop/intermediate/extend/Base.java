package com.liam.oop.intermediate.extend;

public class Base extends TopBase{
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {//父类，无参构造器
        System.out.println("Base(父类无参构造器)...");
    }
    public Base(String name,int age) {//父类，无参构造器
        System.out.println("Base(父类有参构造器)...");
    }
    public void test100(){
        System.out.println("test100");
    }

    protected void test200(){
        System.out.println("test200");
    }

    void test300(){
        System.out.println("test300");
    }

    private void test400(){
        System.out.println("test400");
    }



    //父类提供public的方法，访问本类私有属性
    public int getn4(){
        return n4;
    }
    //父类提供public的方法，访问本类私有方法
    public  void callTest400(){
        test400();
    }


}

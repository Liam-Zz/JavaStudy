package com.liam.demo.oop.intermediate.polymorphic.dynamic;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 23:16
 * @Author: Liam
 * @Description:
 */

public class Demo {
    /*
    动态绑定机制
    1.当调用对象方式时,该方法会和该对象的内存地址/运行类型绑定
    2.当调用
     */
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());

    }
}
class A{
    public int i = 10;
    public  int sum(){
        return getI()+10;
    }
    public  int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}
class B extends A{
    public int i = 20;
//注释后,sum 方法从父类寻找,但 getI 会总子类查找(动态绑定 B);
 /*   public int sum() {
        return getI() + 20;
    }*/
    public int getI() {
        return i;
    }
//注释后,sum 方法从父类寻找,但 i 是属性,遵循哪里声明哪里使用,所以值为 20
    /*public int sum1() {
        return i + 10;
    }*/
}
package com.liam.demo.oop.advanced.static_;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 08:55
 * @Author: Liam
 * @Description:
 */

public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名()
        //类变量是随着类的加载而创建的,所以没有创建对象实例也可以进行访问
        System.out.println(A.name);
        //对象名.类变量名
        A a = new A();
        System.out.println(a.name);
    }
}
class A{
    public static String name = "Liam";
}

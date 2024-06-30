package com.liam.demo.oop.advanced.main_;

import java.sql.SQLOutput;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 12:25
 * @Author: Liam
 * @Description:
 */

public class Main01 {
    //静态方法可以访问本类的静态成员
    private static String name  = "LIAM";
    public static void hi(){
        System.out.println("Main 的 hi 方法");
    }
    //非静态成员
    private int age = 28;
    /*
     语法说明
     */
    public static void main(String[] args) {
        System.out.println(Main01.name);
        Main01.hi();
        //Main01.age; 不能直接访问非静态成员(属性和方法),如果要访问,需要创建实例对象
    }
}

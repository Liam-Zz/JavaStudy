package com.liam.demo.oop.advanced.main_;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 12:15
 * @Author: Liam
 * @Description:
 */

public class Demo {
    /*
     1.main 是虚拟机调用的
     2.java 虚拟机需要调用类的 main 方法名,所以该方法名的访问权限必须是 public
     3.java 虚拟机在执行 main 方法时 不必创建对象,所以该方法必须是 static
     4.该方法接收 String 类型的数组参数, 该数组保存执行 java 命令式传递给所有运行类的参数

     ps: 在 main()方法中,可以直接调用 main 方法所在类的静态方法或静态属性,如果访问非静态资源,需创建实例对象;


     */
    public static void main(String[] args) {
    //如何传入 args 形参
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

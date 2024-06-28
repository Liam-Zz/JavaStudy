package com.liam.demo.array;

import java.util.Scanner;

public class ArrayUse01 {
    /*

        定义数组：
            方式一（动态初始化1）：数据类型 数组名[] = new 数据类型[大小]
            方式二（动态初始化2）：数组名 = new 数据类型[大小]
            方式三（静态初始化）：数据类型 数组名[] = new {元素值, ... 元素值...}
        使用数组：
            数组名[下表/索引]
    */
    public static void main(String[] args) {
        /*
            循环输入 5 个成绩，保存到 double 数组,并输出。
        */
        //1、输入
        double scores[] =new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入第"+(i+1)+"个元素的值");
            scores[i] = scanner.nextDouble();
        }
        //2、输出
        System.out.println("数组输出ing...");
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入第"+(i+1)+"个元素的值= " + scores[i]);
        }
    }
}

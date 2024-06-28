package com.liam.demo.array.array.search;

import java.awt.geom.AffineTransform;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        /*
        顺序查找
            1.定义一个字符数据
            2.接收用户输入,遍历数组,逐一比较

         */
        String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的名字...");
        String findName = scanner.next();

        int index = -1;
        for (int i = 0; i < names.length; i++) {
            //字符串比较
            if (findName.equals(names[i])){
                System.out.println("恭喜你,已找到 " + findName + "下标为: " + i);
                index=i;
                break;
            }
        }

        if (index == -1){
            //以后进行判断成功和失败,可以使用该方法
            System.out.println("Sorry,没有找到" + findName);
        }
    }
}

package com.liam.demo.array;

//数组快速入门
     /*
        数组是一种数据类型，为引用类型
        即：数组就是一组数据
    */
public class ArrayDemo {
    public static void main(String[] args) {

        //定义一个数组
        /*
            double[] 表示 是double类型的数组
            hens     表示 数组名
            {3,5,1,3.4,2,50} 表示 数组的值/元素
        */
        double[] hens = {3,5,1,3.4,2,50};

        /*
            遍历数组得到数组的所有元素的和
            for循环
        */
        for( int i = 0; i < 6; i++){
            System.out.println("第"+(i+1)+"个元素的值 = " + hens[i]);
        }
        /*
            补充：
            1、通过 hes[下标] 来访问数组的元素；
            2、利用for循环访问数组的元素
            3、使用变量将元素累积
            4、通过 数组名.length 得到数组的大小/长度
        */
        double  totalWeight = 0;
        /*
        普通版本for循环
        for(int i = 0; i < 6; i++)
        */
        for(int i = 0; i < hens.length; i++){
            totalWeight += hens[i];
        }
        System.out.println("数组的长度= " + hens.length);
        System.out.println("总体重= " + totalWeight + " 平均体重 = " + (totalWeight/hens.length) );
    }
}

package com.liam.array;

public class ArrayInversion02 {
    public static void main(String[] args) {
        /*
            逆序赋值方式,进行数组反转
         */

        int[] arr1 = {1,2,3,4,5};
        //创建新数组
        int[] arr2 = new int[arr1.length];

        //逆序遍历,将元素拷贝到新数组中;
        // i 从前往后, j 从后往前
        for (int i = arr1.length - 1, j = 0; i >= 0 ; i--,j++) {
            arr2[j] = arr1[i];
        }

        //arr1 指向 arr2 的数据空间,arr1 原来的数据空间没有变量引用就会被当做垃圾销毁
        arr1 = arr2;

        //当 for 循环结束后,arr2 就是一个逆序的数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}

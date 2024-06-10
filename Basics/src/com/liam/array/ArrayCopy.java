package com.liam.array;

public class ArrayCopy {
    public static void main(String[] args) {
        /*
            实现数组拷贝
         */
        int[] arr1 = {10,20,30};

        //创建新数组
        int[] arr2 = new int[arr1.length];

        //遍历 arr1 数组,并将 arr1 元素拷贝到 arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //修改 arr2
        arr2[0] = 15;

        //输出 arr1 和 arr2
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

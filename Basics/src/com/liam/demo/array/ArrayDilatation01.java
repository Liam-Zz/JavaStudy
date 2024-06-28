package com.liam.demo.array;

public class ArrayDilatation01 {
    public static void main(String[] args) {
        /*
            数组扩容
            1.原始数组静态分配
            2.添加元素至数组的最后
            3.通过方法来决定是否继续添加
         */
        int[] arr1 = {1,2,3};

        int[] arr2 = new int[arr1.length + 1];
        //遍历数组 arr1 ,将 arr1 的元素拷贝到 arr2, arr2 空间永远比 arr1 多一个空间
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //将新元素赋值给 arr2
        arr2[arr2.length - 1] = 4;
        arr1 =arr2;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}

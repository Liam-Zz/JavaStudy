package com.liam.array;

public class ArrayInversion01 {
    public static void main(String[] args) {
        /*
            将数组的元素内容反转
         */
        int[] arr1 = {10,20,30,40};

        int temp =0;
        int len = arr1.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr1[len -1 -i];
            arr1[len -1 -i] = arr1[i];
            arr1[i] = temp;
        }

        System.out.println("反转后...");
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}

package com.liam.array;

public class ArrayPractice02 {
    public static void main(String[] args) {
        /*
            请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。
         */
        int[] arr = {4,-1,9,10,23,44,21,2,11};
        
        //假定第一个元素是最大值
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("输出最大值：" + max + "下标为：" + maxIndex);
    }
}

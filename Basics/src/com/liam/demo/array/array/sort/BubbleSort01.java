package com.liam.demo.array.array.sort;

public class BubbleSort01 {
    public static void main(String[] args) {

        /*
             冒泡排序法:Bubble Sorting
                通过对排序序列从后往前,依次比较相邻元素的值,若发现逆序则交换;

                第一次排序:目标把最大数放在最后
                第二次排序:目标把第二大数放在倒数第二位置
                ...
                第n次排序:目标把第n大数放在倒数第n位置
                完成排序

         */
        int[] arr = {24,69,80,57,13};
        //用于辅助交换变量
        int temp = 0;
        for (int j = 0; j < 4 ; j++) {
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第一轮");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < 3 ; j++) {
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n第二轮");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < 2 ; j++) {
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n第三轮");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < 2 ; j++) {
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n第四轮");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}

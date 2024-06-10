package com.liam.array.array.sort;

public class BubbleSort02 {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13,12,11,6};
        //用于辅助交换变量
        int temp = 0;
        int len = arr.length - 1;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len - i ; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\n====第"+(i+1)+"轮====");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}

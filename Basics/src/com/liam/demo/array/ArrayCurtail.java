package com.liam.demo.array;

import java.util.Scanner;

public class ArrayCurtail {
    public static void main(String[] args) {
        /*
            数组缩减
         */
        int[] arr1 = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        do {
            int[] arr2 = new int[arr1.length - 1];
            //遍历数组 arr1 ,将 arr1 的元素拷贝到 arr2, arr2 空间永远比 arr1 少一个空间
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr1[i];
            }

            arr1 = arr2;

            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }

            System.out.println();
            System.out.println("是否继续删减 y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n' || arr1.length==1) {
                System.out.println("退出删除");
                break;
            }

        } while (true);
    }
}


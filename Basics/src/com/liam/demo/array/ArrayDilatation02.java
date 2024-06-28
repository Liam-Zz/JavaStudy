package com.liam.demo.array;

import java.util.Scanner;

public class ArrayDilatation02 {
    public static void main(String[] args) {
        /*
             数组扩容
            3.通过方法来决定是否继续添加
         */
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            System.out.println("请输入添加值");
            arrNew[arrNew.length -1] = scanner.nextInt();
            arr = arrNew;
            System.out.println("====arr 扩容情况====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }

            System.out.println();
            System.out.println("是否继续添加 y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }

        }while (true);
        System.out.println("退出添加");
    }
}

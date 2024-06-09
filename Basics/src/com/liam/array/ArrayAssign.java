package com.liam.array;

public class ArrayAssign {
    public static void main(String[] args) {
        /*
            基本数据类型赋值(值拷贝)，值为具体数据，相互不影响
            数组类型赋值(引用拷贝),值为地址，相互影响

         */
        int n1 = 10;
        int n2 = n1;

        n2 = 30;
        System.out.println("n1= " + n1);
        System.out.println("n2= " + n2);

        System.out.println("=== 对比 ===");

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        //修改arr2的值，影响到arr1
        arr2[0] = 10;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");
        }
    }
}

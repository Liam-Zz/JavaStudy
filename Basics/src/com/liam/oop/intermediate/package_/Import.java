package com.liam.oop.intermediate.package_;

import java.lang.reflect.Array;
import java.util.Arrays;

//import java.util.Scanner; //表示会引入java.util包下的 Scanner
//import java.util.*; //表示将引java.util 包下的所有类都引入，不建议使用此方法；
public class Import {
    public static void main(String[] args) {
        /*
            使用系统类，完成排序
         */
        int[] arr = {-1,12,11,16,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

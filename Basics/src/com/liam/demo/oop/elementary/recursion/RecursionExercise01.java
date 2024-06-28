package com.liam.demo.oop.elementary.recursion;

public class RecursionExercise01 {
    public static void main(String[] args) {
        /*
            请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13 给出一个整数,求出他得值是多少
         */
        A a = new A();
        System.out.println("斐波那契数: " + a.fibonacci(7));
    }
}

class A{
    /*
        思路分析
            1.当 n=1 斐波那契 =1
            2.当 n=2 斐波那契 =1
            3.当 n>=3 斐波那契 =前两个数之和
     */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("输入不合法");
            return 0;
        }
    }
}
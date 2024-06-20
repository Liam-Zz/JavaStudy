package com.liam.oop.elementary.recursion;

public class Recursion02 {
    /*
        阶乘 factorial
     */
    public static void main(String[] args) {
        DD dd = new DD();
        int test = dd.test(5);
        System.out.println(test);
    }
}

class DD{
    public int test(int n){
        if (n == 1) {
            return 1;
        }else {
            return test(n-1) * n;
        }
    }
}
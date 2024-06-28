package com.liam.demo.oop.elementary.recursion;

public class Recursion01 {
    public static void main(String[] args) {
        /*
            打印问题
         */
        CC cc = new CC();
        cc.test(4);
    }
}

class CC{
    public void test(int n){
        if (n >2) {
            test(n-1);
        }
            System.out.println("n= " + n);
    }
}
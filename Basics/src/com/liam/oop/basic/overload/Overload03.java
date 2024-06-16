package com.liam.oop.basic.overload;

public class Overload03 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(6);
        methods.m(6,5);
        methods.m("Hello World");

        double max = methods.max(1.1, 1.1, 4);
        System.out.println(max);
    }
}

class Methods{
    /*
        定义三个重载方法,方法名为m
        接受不同的参数,接收平方运算,并输出结果;
     */
    public void m(int n){
        System.out.println(n*n);
    }
    public void m(int n1,int n2){
        System.out.println(n1*n2);
    }
    public void m(String n1){
        System.out.println(n1);
    }

    public int max(int n1,int n2){
        return Math.max(n1, n2);
    }

    public  double max(double n1,double n2){
        return Math.max(n1, n2);
    }

    public double max(double n1,double n2,double n3){
        if (n1 > n2){
            return n1;
        }else {
            return Math.max(n2, n3);
        }
    }
}
package com.liam.oop.basic.overload;

public class Overload02 {
    public static void main(String[] args) {
        /*
            calculate 方法重载,实现多类型参数计算
         */
        A a = new A();
        //重载使用
        System.out.println(a.calculate(21,1));
    }
}

class A{
    public int calculate(int n1,int n2){
        return n1 + n2;
    }
    public  double calculate(int n1,double n2){
        return n1 +n2;
    }
    public  double calculate(double n1,int n2){
        return n1 +n2;
    }
}
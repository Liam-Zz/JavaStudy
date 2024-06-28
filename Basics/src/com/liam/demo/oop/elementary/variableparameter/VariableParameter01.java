package com.liam.demo.oop.elementary.variableparameter;

public class VariableParameter01 {
    public static void main(String[] args) {
        A a = new A();
        double sum = a.sum(1, 2, 3);
        System.out.println(sum);
    }
}

class A{
    /*
        提供一个方法,可以返回任意个数的值

        double... 表示多个参数,类型是 double;
     */
    public double sum(double... num){
        System.out.println(num.length);
        double res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        return res;
    }
}

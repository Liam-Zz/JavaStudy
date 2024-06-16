package com.liam.oop.basic.variableparameter;

public class VariableParameter02 {
    public static void main(String[] args) {
        /*
            可变参数的实参可以为数组;
         */
        int[] arr = {1,2,3};
        B b = new B();
        b.f1(arr);

        b.f2("刘德华",1,2,3,4);

    }
}

class B{
    public void f1(int... nums){
        System.out.println(nums.length);
    }
    //可变参数可以和普通参数一起放在形参列表,但必须保证可变参数在最后;
    public void f2(String str,double... nums){
        System.out.println(nums.length);
    }
}
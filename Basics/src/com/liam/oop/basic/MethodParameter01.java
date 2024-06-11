package com.liam.oop.basic;

public class MethodParameter01 {
    public static void main(String[] args) {
        /*
            基本类型传参
            基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参
         */
        int a = 10;
        int b = 20;
        BB bb = new BB();
        bb.swap(a,b);

        //此处输出的值为属性值，非方法值
        System.out.println("a= " + a + "\t" + "b= " + b);

    }
}

class BB{
    public void swap(int a,int b){
        System.out.println("交换前:" + a + "_"+ b);
        int tmp =a;
        a = b;
        b = tmp;
        System.out.println("a= " + a + "\t" + "b= " + b);
    }
}
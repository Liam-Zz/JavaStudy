package com.liam.oop.elementary;

public class MethodParameter02 {
    public static void main(String[] args) {
        /*
            引用类型传参
            引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参

            B 类中编写一个方法 test100，可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化(会变化);
            B 类中编写一个方法 test200，可以接收一个 Person(age,sal)对象，在方法中修改该对象属性，看看原来的对象是否变化();

         */
        bb bb = new bb();
        int[] arr = {1,2,3};
        bb.test100(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        Persionbb p = new Persionbb();
        p.name = "jack";
        p.age = 100;

        bb.test200(p);
        System.out.println();
        System.out.println(p.name + "\t" + p.age);

    }
}

class  Persionbb{
    String name;
    int age;
}

class bb{

    public void test200(Persionbb p){
        //修改对象属性
        //p.age = 10000;
         p = null;
    }

    public void test100(int[] arr){
        arr[0] = 200;
    }
}
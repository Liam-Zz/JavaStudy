package com.liam.demo.oop.intermediate.polymorphic.detail;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 22:55
 * @Author: Liam
 * @Description:
 */

public class PolyDetail02 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        //instanceof 判断对象的运行类型,是否为某某类型,或某某类型的子类

        AA aa = new BB();
        System.out.println(aa instanceof BB);//true
        System.out.println(aa instanceof AA);//true

        BB bb1 = (BB) aa;
        System.out.println(bb1 instanceof AA);
        System.out.println(bb1 instanceof BB);


    }
}
class AA{}
class BB extends AA {}
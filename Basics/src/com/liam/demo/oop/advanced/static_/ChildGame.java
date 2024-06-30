package com.liam.demo.oop.advanced.static_;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 00:28
 * @Author: Liam
 * @Description:
 */

public class ChildGame {
    /*
   代码问题
   1.count 是独立于对象的,很尴尬;
   2.访问 count 很麻烦,没有使用 OOP
   3.优化,使用类变量/静态变量;
     */
    public static void main(String[] args) {
        //优化,设置 count 为所有对象共享(使用类变量)
        int count = 0;
        Chile chile1 = new Chile("白骨精");
        chile1.join();
        //count++;
        chile1.countNum++;

        Chile chile2 = new Chile("狐狸精");
        chile2.join();
        //count++;
        chile2.countNum++;

        Chile chile3 = new Chile("老鼠精");
        chile3.join();
        //count++;
        chile3.countNum++;
        //类变量可以通过类名去访问
        System.out.println("共有 " + Chile.countNum + " 小孩加入了游戏...");
        System.out.println("1: " + chile1.countNum);
        System.out.println("2: " + chile2.countNum);
        System.out.println("3: " + chile3.countNum);
    }
}
class Chile{
    private String name;
    public static int countNum = 0;
    public void join(){
        System.out.println(name + "- 加入了游戏");
    }
    public Chile(String name) {
        this.name = name;
    }
}

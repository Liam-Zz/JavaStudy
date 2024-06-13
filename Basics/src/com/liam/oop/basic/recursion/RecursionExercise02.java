package com.liam.oop.basic.recursion;

public class RecursionExercise02 {
    public static void main(String[] args) {
        /*
            猴子吃桃:
                猴子第一天吃了其中的一半,并在多吃一个,以后每天猴子都吃其中的一半,然后再多吃一个
                当第十天的时候,发现只有一个桃子,求最初一共有多少个桃子
         */
        B b = new B();
        System.out.println("最初桃子共 " + b.peach(10));
        //可在前面判断,不再方法内判断(省略)
    }
}
class B{
    /*
        思路分析:
        day = 10; 1 个
        day = 9; (day10 +1) * 2 = 4
        day = 8; (day9 +1) * 2 = 10
        day = 7; (day8 +1) * 2 = 22
     */
    public int peach(int day){
        if (day==10){
            return 1;
        } else if (day >= 1 && day <=9) {
            return (peach(day + 1) +1) * 2;
        }else {
            System.out.println("请输入有效值");
            return 0;
        }
    }
}
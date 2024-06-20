package com.liam.oop.elementary.recursion;

public class RecursionExercise04 {
    public static void main(String[] args) {
        /*
            汉罗塔问题
         */
        D d = new D();
        d.move(5,'a','b','c');
    }
}

class D{
    public void move(int num,char a,char b,char c){
        if (num == 1){
            System.out.println( a +"->"+ c);
        }else {
            //先移动所有盘,移到 b,借助 c
            move(num -1,a,c,b);
            //a 移动到 c
            System.out.println(a +"->"+ c);
            //移动所有盘,移到 c,借助 a
            move(num-1,b,a,c);
        }
    }
}

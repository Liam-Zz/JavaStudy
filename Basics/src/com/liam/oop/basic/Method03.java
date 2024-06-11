package com.liam.oop.basic;

public class Method03 {
    public static void main(String[] args) {
        /*
            判断一个数的奇偶
         */
        Oddeven oddeven = new Oddeven();
        if (oddeven.isdoo(4)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
    }
}
class Oddeven{
    public boolean isdoo(int num){
/*        if (num % 2 != 0){
            return true;
        }else {
            return false;
        }*/
        //优化写法（返回值为 true 或者 false）
        return num %2 != 0;
    }
}

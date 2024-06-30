package com.liam.demo.oop.advanced.static_;

import com.liam.demo.oop.intermediate.polymorphic.PloyArray.Study;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 09:14
 * @Author: Liam
 * @Description:
 */

public class StaticMethod {
    public static void main(String[] args) {
        Studyt studyt = new Studyt("李雷");
        studyt.payFee(1000);
        Studyt studyt1 = new Studyt("韩梅梅");
        studyt1.payFee(1500);
        Studyt.show();
    }
}
class Studyt{
    private String name;
    private static double fee = 0 ;

    public Studyt(String name) {
        this.name = name;
    }
    static public void payFee(double fee){
        Studyt.fee += fee;//累积
    }
    static public void show(){
        System.out.println("总学费 " + fee);

    }
}
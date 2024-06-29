package com.liam.demo.oop.intermediate.polymorphic.detail;

import com.liam.demo.oop.intermediate.polymorphic.detail.Animal;
/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 19:45
 * @Author: Liam
 * @Description:
 */

public class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

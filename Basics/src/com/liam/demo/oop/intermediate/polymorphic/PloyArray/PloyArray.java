package com.liam.demo.oop.intermediate.polymorphic.PloyArray;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/29 23:41
 * @Author: Liam
 * @Description:
 */

public class PloyArray {
    /*
    多态数组:
    数组的定义类型为父类类型,里面保存的事迹元素类型为子类类型

    案例:
       创建 Person 对象 2 个 Student 对象和两个 Teacher 对象,统一放在数组中,并调用每个对象的 say 方法

    案例升级:
        各自有各自的方法
     */
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Study("Tom1",18,98);
        persons[2] = new Study("smith",18,77);
        persons[3] = new Teach("qurry",33,10000);
        persons[4] = new Teach("king",34,10005);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//动态绑定机制
            //无法直接调用子类方法,需要向下转型 + 类型判断
            if(persons[i] instanceof Study){
                //向下转型
                ((Study) persons[i]).study();
            } else if (persons[i] instanceof Teach) {
                //向下转型
                ((Teach) persons[i]).teash();
            }else {
                System.out.println("类型有误,请检查");
            }
        }
    }
}


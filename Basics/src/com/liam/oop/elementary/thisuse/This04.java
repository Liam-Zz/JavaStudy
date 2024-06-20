package com.liam.oop.elementary.thisuse;

public class This04 {
    public static void main(String[] args) {
        /*
            定义一个Persino类。里面有name和age属性，并提供compareTo比较方法，用于判断是否相等；
         */
        Persion tom = new Persion("tom", 18);
        Persion jack = new Persion("Jack", 19);
        System.out.println(tom.compareTo(jack));
    }
}
class Persion{
    String name;
    int age;

    public Persion(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Persion p){
        /*if (this.name.equals(p.name)&& this.age == p.age){
            return true;
        }else {
            return false;
        }*/
        return this.name.equals(p.name) && this.age == p.age;
    }
}


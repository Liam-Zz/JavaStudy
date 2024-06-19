package com.liam.oop.basic.thisuse;

public class This02 {
    public static void main(String[] args) {
        Cat jack = new Cat("jack", 18);
        jack.info();
    }
}

class Cat{
    String name;
    int age;
    public Cat(String name,int age){
        //对象.属性 = 参数列表值（this.name 表示当前对象的属性）
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println(name +"\t"+ age);
    }
}

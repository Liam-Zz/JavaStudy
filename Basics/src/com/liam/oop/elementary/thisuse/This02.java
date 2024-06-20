package com.liam.oop.elementary.thisuse;

public class This02 {
    public static void main(String[] args) {
        Cat jack = new Cat("jack", 18);
        jack.info();

        Cat tom = new Cat("tom", 19);
        tom.info();
    }
}

class Cat{
    String name;
    int age;
    public Cat(String name,int age){
        //对象.属性 = 参数列表值（this.name 表示当前对象的属性）
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }
    public void info(){
        //hashCode: 不是实际地址，是jvm给分配的空间地址
        System.out.println(name +"\t"+ age + "\t" + this.hashCode());
    }
}

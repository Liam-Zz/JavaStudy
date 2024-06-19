package com.liam.oop.basic.thisuse;

public class This01 {
    public static void main(String[] args) {
        Dog tom = new Dog("tom", 18);
        tom.info();
    }
}

class Dog{
    String name;
    int age;
    //如果参数列表的名字是属性名，那么根据作用域原则，构造器的name就是局部变量；
    //如果还是要属性名和参数列表名相同，还不想出现逻辑错误，就需要使用this来操作（this02）
    public Dog(String dName,int dAge){
        name = dName;
        age = dAge;
    }
    public void info(){
        //info 输出的是属性name值，所以输出为null和0;
        System.out.println(name +"\t"+ age);
    }
}

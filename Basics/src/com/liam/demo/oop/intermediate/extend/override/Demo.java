package com.liam.demo.oop.intermediate.extend.override;

public class Demo {
    /*
    方法重写:
        子类方法和父类方法的名称,返回类型,参数一致,那么我们就说子类的这个方法重写了父类的方法;

    注意事项:
        1.子类的参数列表,方法名称,要和父类的参数列表,方法名完全一致
        2.子类的返回值类型要和父类的返回值类型一样,或者是父类返回类型的子类(Object->String)
        3.子类方法不能缩小父类方法的访问权限(Public -> protected -> Default ->private)

    重写和重载比较:
        发生范围:
            重载:本类
            重写:父子类
        方法名:
            重载:必须一样
            重写:必须一样
        形参列表:
            重载:类型,个数,顺序,至少有一个不同
            重写:相同
        返回类型:
            重载:无要求
            重写:子类重写的方法,返回值类型和父子类返回的类型一致,或者是其子类
        修饰符:
            重载:无要求
            重写:子类方法不能缩小父类方法的访问范围
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

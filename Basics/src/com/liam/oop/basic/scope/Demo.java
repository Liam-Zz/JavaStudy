package com.liam.oop.basic.scope;

public class Demo {
    /*
        1.在 java 编程中,主要变量就是 成员变量(属性)和局部变量;
        2.局部变量一般是指在成员方法中定义的变量;

        java 中作用域分类:
            全局变量: 也就是属性,作用域是整个类体;
            局部变量: 也就是除了属性之外的其他变量;作用于为定义他的代码块

       全局变量可以不赋值因为有默认值;
       局部变量必须赋值后才能使用,因为没有默认值;

        注意事项:
            1.属性和局部变量可以重名,使用遵循就近原则
            2.同一个作用域中,两个变量不可以重名;
            3.属性生命周期较长,随着对象创建而创建,伴随对象的销毁而销毁
            4.局部变量生命周期较短,随着代码块的执行而创建,伴随代码块的结束而死亡

        使用细节:
            1.作用域范围不同
                全局变量(属性): 可以被本类使用,或其他类使用(通过对象调用)
                局部变量: 只能在本类中对应的方法中使用

            2.修饰符不同
                全局变量(属性)可以加修饰符
                局部变量不可以加修饰符


     */
}

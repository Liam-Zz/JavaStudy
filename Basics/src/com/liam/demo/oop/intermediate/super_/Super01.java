package com.liam.demo.oop.intermediate.super_;

public class Super01 {
    /*
       1、super可以访问父类的属性，但不能访问父类的privte属性
       2、super可以访问父类的方法，但不能访问父类的privte方法
       3、访问父类的构造器，只能放在构造器的第一句

       细节：
       Super给编程带来的遍历
       1、分工明确，父类属性由父类初始化，子类属性由子类初始化
       2、当子类中有和父类中的成员（属性和方法）重名时，必须通过Super访问，如果没有重名，使用super、this直接访问是一样的效果；
       3、Super的访问不限于直接父类，遵守就近原则；

        Super和this的比较
        1、访问属性
            this：访问本类的属性，如果本类没有，则从父类中继续查找
            super: 从父类开始查找属性
        2、调用方法
            同属性
        3、调用构造器
            this：调用本类构造器，必须放在构造器的首行（super与this二选一 不包括this.）
            super：调用父类构造器，必须放在子类的构造器行首（super与this二选一 不包括this.）
        4、特殊
            this：表示当前对象
            super：子类中访问父类的对象
     */
    public static void main(String[] args) {
        B b = new B();
        b.hi();
        b.ok();
        b.sum();
    }
}

package com.liam.oop.elementary;

public class PersonDemo {
    public static void main(String[] args) {
        /*
            分析以下代码内存图;
         */
        Persion p1 = new Persion();
        p1.name = "小明";
        p1.age = 18;

        Persion p2 = p1;
        System.out.println(p2.name + "\t" + p2.age);


        System.out.println("==== 练习二 ====");
        Persion persion01 = new Persion();
        persion01.age = 10;
        persion01.name = "小明";
        Persion persion02;
        persion02 = persion01;
        System.out.println(persion02.name);
        persion02.age = 200;
        persion02 = null;
        System.out.println(persion01.age);
        //System.out.println(persion02.age);

        System.out.println("==== 练习三 ====");
        //调用 speak 方法
        persion01.speak();

        System.out.println("==== 练习四 ====");
        persion01.cal01();

        System.out.println("==== 练习五 ====");
        persion01.cal02(99);

        System.out.println("==== 练习六 ====");
        int getsun = persion01.cal03(40, 20);
        System.out.println("累积合为: " + getsun);


    }
}

class Persion{
    //属性
    String name;
    int age;

    //方法
    /*
        1.添加成员方法,实现输出一句话

            public: 表示方法是公开的
            void: 表示方法没有返回值
            speak(): speak 是方法名, () 存放形参列表
            {} : 方法体(需要执行的代码)

            方法通过对象调用,如果不调用则不会被执行

     */
    /*
        常见方法实现输出与句话
     */
    public void speak(){
        System.out.println("我是一个好人");
    }

    /*
        创建方法实现计算 1~10000 的累积
     */
    public void cal01(){
        int res = 0;
        for (int i = 0; i <= 1000; i++) {
            res+= i;
        }
        System.out.println("计算结果: " + res);
    }

    /*
        创建方法实现计算 1~n 的累积
     */
    public void cal02( int n){
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res+= i;
        }
        System.out.println("计算结果: " + res);
    }

    /*
        创建方法实现计算两个数的和
        int : 表示方法执行后,返回一个 int 值
        return: 表示把 res 的值返回;

        方法调用原理图

            1.当程序执行到方法是,就会开辟一个独立的空间(栈空间)
            2.当方法执行完毕,或者执行到 return 语句时,就会返回(返回调用方法的地方)
            3.方法调用值返回后,继续指定方法后面的代码
            4.当 main 方法(栈)执行完毕后,整个程序退出
     */
    public int cal03(int num1,int num2) {
        //此处代码可简化
        //int res = num1 + num2;
        //return res;
        return num1+num2;
    }
}

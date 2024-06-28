package com.liam.demo.oop.intermediate.encapsulation;

public class Demo {
    /*
        封装
        封装,把抽象出来的数据(属性)和对数据的操作(方法)封装在一起,数据被保护在内部
        程序其他部分只有通过被授权的操作(方法),才能堆数据进行操作;

        封装的好处
            1.隐藏实现细节
            2.可以对数据进行验证,保证安全合理

        封装实现步骤
            1.属性私有化(不能直接修改属性)
            2.设置公共 set 方法,用于对属性判断并赋值
                public void setxxx(){
                    //加入数据验证的业务逻辑
                    属性 = 参数名;
                }
            3.设置公共 get 方法,用于获取属性的值
                public xx getxxx(){
                //权限判断
                    return xx;
                }
     */


}

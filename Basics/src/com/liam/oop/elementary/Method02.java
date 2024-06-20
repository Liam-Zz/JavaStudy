package com.liam.oop.elementary;

public class Method02 {
    public static void main(String[] args) {
        /*
            方法的定义:
                public 返回数据类型 方法名(形参列表...) {
                    方法体;
                    return 返回值;
                }

                形参列表: 表示成员方法输入
                返回数据类型(返回类型): 表示成员方法输出,void 表示没有返回值
                方法主体: 表示为了实现某一功能代码块
                return 语句不是必须的
         */

        /*
            方法细节
                访问修饰符: 作用是控制方法使用的范围

            返回数据类型
                1.一个方法最多有一个返回值,多个返回值可使用数组
                2.返回值类型可以为任意类型(基本数据类型,引用类型)
                3.如果方法要求有返回值,则方法体中最后的执行语句必须为 return 值,且返回值类型与 return 值类型相同(遵循类型转换)
                4.方法名命令建议遵循驼峰命令法,见名知意

            形参列表
                1.一个方法可以有 0 个参数,也可以有多个参数
                2.参数类型可以为任意类型
                3.调用带参数的方法时,一定对应着参数列表传入相同类型或兼容类型的参数
                4.方法定义时的参数成为形式参数,方法调用时的参数称为实际参数
                5.实参和形参的类型要兼容,个数和顺序必须一致

            方法体
                1.方法不能被嵌套定义

            方法调用
                1.同一个类中的方法可以直接调用
                2.跨类调用方法,需要通过对象名调用
                3.跨类的方法调用和方法的访问修饰符有关
         */
        AA aa = new AA();
        int[] sumAndSub = aa.getSumAndSub(1, 4);
        for (int i = 0; i < sumAndSub.length; i++) {
            System.out.print(sumAndSub[i] + "\t");
        }
        System.out.println("\n=== 展示=== ");
        System.out.println("和 : " + sumAndSub[0]);
        System.out.println("差 : " + sumAndSub[1]);
    }
}

class AA{
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];

        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
}

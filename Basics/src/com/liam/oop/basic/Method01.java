package com.liam.oop.basic;

public class Method01 {
    public static void main(String[] args) {
        /*
            遍历一个数组,输出数组的各个元素值
         */

        int[][] map = {{0,1,1},{1,1,1},{0,1,0}};

        //遍历 map 数组(传统方法)
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        /*
            要求再次遍历数组? 利用方法进行简化遍历操作
            定义一个类,常见操作方法
         */

        System.out.println("== 使用方法遍历二维数组 ==");

        MyTools myTools = new MyTools();
        myTools.printArr(map);
        //可实现多次调用,简化代码
        myTools.printArr(map);

    }
}

class MyTools{
    //接收二维数组方法
    public void printArr(int[][] map){
        //对传入的 map 数组进行遍历
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

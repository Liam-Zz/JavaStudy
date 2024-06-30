package com.liam.demo.oop.advanced.codeblock;

import java.sql.SQLOutput;

/**
 * @Classname: JavaStudy
 * @Date: 2024/6/30 17:48
 * @Author: Liam
 * @Description:
 */

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("你好,李焕英");
        Movie movie2 = new Movie("你好,李焕英",100);
        Movie movie3 = new Movie("你好,李焕英",100,30);
    }
}
class Movie{
    private String name;
    private int price;
    private int director;

   static {
        System.out.println("---------");
        System.out.println("电影开始");
        System.out.println("广告开始");
        System.out.println("电影结束");
    }

    //三个构造器造成重载
    /*
        下面是三个构造器存在冗余代码,使用代码块可减少代码重用性
     */
    public Movie(String name) {
        this.name = name;
        System.out.println("单参构造器");
        /*System.out.println("电影开始");
        System.out.println("广告开始");
        System.out.println("电影结束");*/
    };

    public Movie(String name, int price) {
        this.name = name;
        this.price = price;
        /*System.out.println("电影开始");
        System.out.println("广告开始");
        System.out.println("电影结束");*/
    }

    public Movie(String name, int price, int director) {
        this.name = name;
        this.price = price;
        this.director = director;
        /*System.out.println("电影开始");
        System.out.println("广告开始");
        System.out.println("电影结束");*/
    }
}

package com.liam.array;

public class Demo {
    public static void main(String[] args) {
        /*
            一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg
            请问这六只鸡的总体重是多少?平均体重是多少?

            思路分析：
                1、定义六个变量 double，求和 得到总体重
                2、平均体重 = 总体重 / 6
        */

        double hen1 = 1.2;
        double hen2 = 3.1;
        double hen3 = 2.3;
        double hen4 = 1.3;
        double hen5 = 2.4;
        double hen6 = 1.6;

        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;

        double avgWeight = totalWeight / 6;

        System.out.println("总体重= " + totalWeight + "平均体重= " + avgWeight );

    }
}

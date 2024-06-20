package com.liam.oop.elementary.variableparameter;

public class VariableParameter03 {
    public static void main(String[] args) {
        C c = new C();
        String  strScore = c.showScore("李磊", 11.1, 12.3, 13.4,11,16);
        System.out.println(strScore);
    }
}

class C{
    /*
        三个方法,分别实现返回姓名和多门课成绩
     */
    public String showScore(String str, double... nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return str +"\""+nums.length+"\""+"门学科的总的成绩是: " + res;
    }
}
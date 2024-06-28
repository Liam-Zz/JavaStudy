package com.liam.demo.oop.elementary;

public class Method04 {
    /*
        根据行、列、字符打印，对应行数和列数的字符
            ###
            ###
     */
    public static void main(String[] args) {

        Str str = new Str();
        str.echoStr(3,10,'0');
    }
}
class Str {
    public void echoStr(int row,int col,char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

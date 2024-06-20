package com.liam.oop.intermediate.encapsulation;

public class encapsulation03 {
    private String name;
    private int num;
    private String passwd;

    public String getName() {
        return name;
    }

    public encapsulation03() {
    }

    public encapsulation03(String name, int num, String passwd) {
        setName(name);
        setNum(num);
        setPasswd(passwd);
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <=4) {
            this.name = name;
        }else {
            System.out.println("姓名不合法");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num > 20){
            this.num = num;
        }else {
            System.out.println("薪水不合法");
        }

    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if (passwd.length() == 6){
            this.passwd = passwd;
        }else {
            System.out.println("密码不合法");
            this.passwd = "000000";
        }
    }
    //显示账号信息
    public void showinfo(){
        //查看信息,可以增加权限校验
        System.out.println(name+"\t"+num+"\t"+passwd);
    }
}

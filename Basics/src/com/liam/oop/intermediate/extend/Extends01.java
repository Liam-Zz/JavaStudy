package com.liam.oop.intermediate.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 18;
        pupil.testing();
        pupil.setScore(100);
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.name = "小黑";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(70);
        graduate.info();
    }
}

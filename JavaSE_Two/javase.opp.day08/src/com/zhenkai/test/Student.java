package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description 学生类的成员属性分别是姓名（name），年龄（age），语文成绩（chinese），数学成绩（math），班级（studentClass）（所有的学生都是尊享无忧班级）
 * 定义学习的方法（study）
 **/
public class Student {
    private String name;
    private int age;
    private double chinese;
    private double math;
    public static String studentClass;

    static {
        studentClass = "尊享无忧班";
    }

    public Student(String name, int age, double chinese, double math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
    }

    public Student() {
    }

    public void study() {
        System.out.printf("%s, 年龄：%d岁, 语文成绩：%.2f, 数学成绩： %.2f, 班级：%s%n", name, age, chinese, math, studentClass);
        System.out.println("好好学习，天天向上");
    }
}

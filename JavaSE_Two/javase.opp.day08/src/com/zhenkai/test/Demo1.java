package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description 定义一个学生类，描述班级学生的班级、姓名、年龄、生日这些属性（私有)
 * 定义一个可以通过类名来调用学生学习的方法
 **/
public class Demo1 {
    private String name;
    private String birthday;
    private int age;
    private String studentClass;

    public Demo1() {
    }

    public Demo1(String name, String birthday, String studentClass) {
        this.name = name;
        this.birthday = birthday;
        this.studentClass = studentClass;
    }

    {
        age = 15;
    }
    public static void study() {
        System.out.println("好好学习，天天向上");
    }

    public void print() {
        System.out.printf("%s , %d岁, 生日：%s%n",name,age,birthday);
    }
}

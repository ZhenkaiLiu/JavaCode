package com.zhenkai.opp;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 了解面向对象的基本概念
 **/
public class Student {
    String name;
    int age;
    double score;

    /**
     * 讲解 this 关键字的使用
     *
     * @param score 分数
     */
    public void printPass(double score) {
        if (this.score > score) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    /**
     * 打印信息
     */
    public void print() {
        System.out.println(name + "，" + age + "岁，" + score + "分");
    }

    /**
     * 讲解构造器
     * 无参数构造器：默认自动创建
     */
    public Student() {
        System.out.println("无参数构造被触发执行！");
    }

    /**
     * 有参数构造器
     * 当创建了有参数构造器，就不会自动再创建无参构造器，需要手动创建
     */
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("有参数构造器被触发执行！");
    }
}

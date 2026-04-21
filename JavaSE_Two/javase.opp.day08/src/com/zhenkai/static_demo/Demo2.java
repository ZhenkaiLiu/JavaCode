package com.zhenkai.static_demo;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description 讲解 static 注意事项
 **/
public class Demo2 {
    // 1. 类方法可以直接访问类的成员，不可以直接访问类的实例成员
    // 2. 实例方法可以直接访问类成员，也可以直接访问实例成员
    // 3. 实例方法中可以出现 this 关键字，类方法中不可以出现 this 关键字

    // 类变量
    public static String userName = "清风";
    // 实例变量
    int age;

    /**
     * 类方法
     */
    public static void print() {
        System.out.println(userName);
        printHelloWorld();
        // age = 12; 不能直接访问实例成员
    }

    public static void printHelloWorld() {
        System.out.println("HelloWorld!");
        // System.out.println(this);不能出现 this 关键字
    }

    /**
     * 实例方法
     */
    public void print2() {
        System.out.println(userName);
        printHelloWorld();
        age = 18;
        System.out.println(age);
        printHelloWorld2();
    }

    public void printHelloWorld2() {
        System.out.println("-----实例方法------");
        System.out.println("HelloWorld!");
        System.out.println(this);
    }
}

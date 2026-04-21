package com.zhenkai.static_demo;

/**
 * @author Zhenkai
 * @date 2026/4/20 周一
 * @description
 **/
public class Student {
    // 静态变量（类变量）
    public static String schoolName;

    // 实例变量
    int age;

    /**
     * 打印学校名称 类方法
     */
    public static void print() {
        System.out.println(schoolName);
    }

    /**
     * 打印年龄 实例方法
     */
    public void printAge() {
        System.out.printf("%d 岁%n", age);
    }
}

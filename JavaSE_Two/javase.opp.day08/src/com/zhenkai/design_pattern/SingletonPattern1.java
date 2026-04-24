package com.zhenkai.design_pattern;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description 讲解单例设计模式 —— 懒汉式
 **/
public class SingletonPattern1 {
    public static void main(String[] args) {
        // 设么是设计模式：一个问题有 n 种解法，把最优解法总结出来，共有 20 多种
        // 什么是单例设计模式：确保一个类只有一个对象
        System.out.println(Demo1.print());
        System.out.println(Demo1.print());
        System.out.println(Demo1.print());
        System.out.println(Demo1.print());

        // 使用场景和好处：只需要一个对象（例如任务管理器）；避免浪费内存
    }
}

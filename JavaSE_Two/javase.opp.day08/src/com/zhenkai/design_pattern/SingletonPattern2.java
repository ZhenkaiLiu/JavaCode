package com.zhenkai.design_pattern;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description 讲解单例设计模式 —— 懒汉式单例
 **/
public class SingletonPattern2 {
    public static void main(String[] args) {
        Demo2 demo2 = Demo2.print();
        System.out.println(demo2);

        Demo2 demo3 = Demo2.print();
        System.out.println(demo3);

        System.out.println(demo2 == demo3);

        // 什么场景用懒汉式单例，什么场景用饿汉式单例
        // 需要频繁使用单例，用饿汉式；   不需要频繁使用，用懒汉式
    }
}

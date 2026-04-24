package com.zhenkai.design_pattern;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description 懒汉式单例模式
 * 书写格式：1. 把类的构造器私有；2. 定义一个变量记住类的一个对象；3. 定义一个类方法，返回类对象
 **/
public class Demo1 {
    // 2. 定义一个变量记住类的一个对象
    private static final Demo1 DEMO_1 = new Demo1();

    // 1. 私有构造器
    private Demo1() {
    }

    // 3. 定义一个类方法，返回类对象
    public static Demo1 print() {
        return DEMO_1;
    }
}

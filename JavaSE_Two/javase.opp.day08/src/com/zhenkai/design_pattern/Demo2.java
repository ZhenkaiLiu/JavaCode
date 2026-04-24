package com.zhenkai.design_pattern;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description 懒汉式单例
 * 书写格式：1. 先把构造器私有； 2. 定义一个类变量用于存储对象；3. 提供一个类方法，保证返回的是同个对象
 **/
public class Demo2 {
    // 2. 定义一个类变量用于存储对象
    private static Demo2 demo2;

    // 1. 私有构造器
    private Demo2() {

    }

    // 3. 提供一个类方法，这个方法要确保第一次调用时才创建一个对象，之后都返回这个对象
    public static Demo2 print() {
        if (demo2 == null) {
            demo2 = new Demo2();
        }

        return demo2;
    }
}

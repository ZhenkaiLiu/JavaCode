package com.zhenkai.code_block;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description
 **/
public class BlockDemo1 {
    static String name;
    int age;

    // 静态代码块
    static {
        name = "Zhenkai";
        System.out.println("静态代码块触发执行");
    }


    // 实例代码块
    {
        age = 18;
        System.out.println("实例代码块被触发执行了！");
        System.out.println(this + " 调用了实例代码块！");
    }
    public BlockDemo1() {
        System.out.println("无参数构造器被触发执行！");
    }

    public BlockDemo1(String name) {
        System.out.println("有参数构造器被触发执行！");
    }

}

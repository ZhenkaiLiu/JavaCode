package com.zhenkai.code_block;

/**
 * @author Zhenkai
 * @date 2026/4/24 周五
 * @description 讲解代码块知识点
 **/
public class CodeBlockDemo1 {

    public static void main(String[] args) {
        // 代码块是类的五大成分之一（成员变量、构造器、方法、代码块、内部类）
        // 代码块分为静态代码块和实例代码块
        // 静态代码块：有 static 修饰的代码块    static{}
        // 特点：类加载时自动执行，随类只加载一次，静态代码块也只会执行一次
        // 作用：是对类变量进行初始化赋值
        System.out.println(BlockDemo1.name);
        System.out.println("------------------------");

        // 实例代码块：无 static 修饰的代码块    ｛｝
        // 特点：每次创建对象时，执行实例代码块，并在构造器前执行
        // 作用：和构造器一样，都是完成对象初始化的（如：对实例变量进行初始化赋值）
        BlockDemo1 blockDemo1 = new BlockDemo1();
        System.out.println(blockDemo1.age);

    }
}

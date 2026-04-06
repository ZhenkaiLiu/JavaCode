package com.zhenkai.literal;

/**
 * @author Zhenkai
 * @date 2026/4/6 周一
 * @info 掌握字面量在Java程序中的书写格式
 **/
public class Literal {
    public static void main(String[] args) {
       // 整数和小数
        System.out.println(99);
        System.out.println(99.99);

        // 字符：英文状态下书写 '' 每个字符只能由且仅有一个内容
        System.out.println('a');
        System.out.println('b');
        // 特殊字符 ' ' '\t' (代表一个 Tab 缩进) '\n' (换行)

        // 字符串：英文状态下书写 ""
        System.out.println("Hello");

        // 布尔值：true (真) false (假)
        System.out.println(true);
        System.out.println(false);

        // 空值：null
        String str = null;
        System.out.println(str);
    }
}

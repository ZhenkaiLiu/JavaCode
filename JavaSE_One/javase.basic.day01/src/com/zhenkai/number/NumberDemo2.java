package com.zhenkai.number;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握数据类型和注意事项
 **/
public class NumberDemo2 {
    public static void main(String[] args) {
        // 数据类型分为：基本数据类型 和 引用数据类型
        // 基本数据类型： 四类八种
        // 整形 byte(-128 ~ 127) short int(默认) long
        // byte 1 字节
        byte b1 = -128;
        System.out.println(b1);
        // short 2 字节
        short s1 = 110;
        System.out.println(s1);
        // int 4 字节
        int a1 = 0;
        System.out.println(a1);
        // long 8 字节    注意： 需要在数据后跟 L / l
        long l1 = 10086L;
        System.out.println(l1);

        // 浮点型 float double(默认)
        // float 4 字节   注意： 需要在数据后跟 F / f
        float f1 = 99.85F;
        System.out.println(f1);
        // double 8 字节
        double d1 = 10086.10086;
        System.out.println(d1);

        // 字符型 char 2 字节
        char c1 = 'a';
        System.out.println(c1);

        // 布尔型 boolean true / false 1 字节
        boolean b2 = true;
        System.out.println(b2);

        // 引用数据类型： String
        String s2 = "Zhenkai";
        System.out.println(s2);


    }
}

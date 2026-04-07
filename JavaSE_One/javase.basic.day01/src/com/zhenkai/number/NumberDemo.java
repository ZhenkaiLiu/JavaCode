package com.zhenkai.number;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握数据在计算机中的存储方式和书写格式
 **/
public class NumberDemo {
    public static void main(String[] args) {
        // 任何数据在计算机中都是以二进制形式存储的
        // 计算机存储容量的基本单位是：字节
        // 计算机中数据最小单位是：位    1 个字节占 8 位 （1 B = 8b）
        // 字符在计算机中的存储：ASCII码值 0: 48 a: 65 A: 97
        System.out.println((char) 48);
        System.out.println((char) 65);
        System.out.println((char) 97);

        // 二进制在 Java 中的书写格式: 0B / 0b
        System.out.println(0B10011);
        // 八进制在 Java 中的书写格式: 0
        System.out.println(075);
        // 十六进制在 Java 中的书写格式: 0X / 0x
        System.out.println(0XA);


    }
}

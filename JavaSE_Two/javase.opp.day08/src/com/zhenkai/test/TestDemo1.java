package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Demo1.study();

        Demo1 d1 = new Demo1("张三", "9 月 12 日", "七年级");
        Demo1 d2 = new Demo1("李四", "9 月 15 日", "七年级");

        d1.print();
        d2.print();
    }
}

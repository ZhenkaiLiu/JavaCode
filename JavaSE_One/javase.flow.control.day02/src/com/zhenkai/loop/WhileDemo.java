package com.zhenkai.loop;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 While 循环的使用 注意事项 案例
 **/
public class WhileDemo {
    public static void main(String[] args) {
        // while 循环的格式
        /* 初始化语句;
         *  while (循环条件) ｛
         *   循环体语句;
         *   迭代语句;
         * ｝ */

        // 需求： 世界最高山峰珠穆朗玛峰高度是：8848.86 米 = 8848860 毫米，假如我有一张足够大的它的厚度是 0.1 毫米。
        // 请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
        // 1. 首先定义山峰和纸张的变量
        double mountainHigh = 884860;
        double paperThickness = 0.1;
        int count = 0;

        // 2. 使用 while 循环，循环条件是 纸张厚度超过山峰高度
        while (paperThickness <= mountainHigh) {
            paperThickness *= 2;
            count++;
        }

        System.out.printf("当第 %d 次时,纸张厚度超过珠穆朗玛峰高度,此时纸张厚度 %.2f%n", count, paperThickness);

        // for 循环使用场景： 知道循环次数
        // while 循环使用场景： 不知道循环次数
    }
}

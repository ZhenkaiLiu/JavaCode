package com.zhenkai.loop;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 for 循环的使用，以及案例
 **/
public class ForDemo {
    public static void main(String[] args) {
        // for 循环格式
        /* for (初始化语句; 循环条件; 迭代语句) ｛
            循环体语句;
        ｝ */
        // 案例 1: 求 1 - 100 之间的和，并记录累加次数
        // 1. 定义 count 变量记录累加次数，定义 sum 记录累加总和
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            count++;
        }

        System.out.printf("1 - 100 总和是: %d,累加次数是: %d%n", sum,count);

        System.out.println("----------------------------------------");
        // 案例 2: 求 1 - 200 之间的奇数和，并记录累加次数
        int sum2 = 0;
        int count2 = 0;

        for (int i = 1; i <= 200; i++) {
            // 判断当前遍历到的数是否是奇数
            if (i % 2 == 1) {
                sum2 += i;
                count2++;
            }
        }

        System.out.printf("1 - 200 奇数和是：%d,累加次数是: %d%n",sum2,count2);
    }
}

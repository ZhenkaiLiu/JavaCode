package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 需求：定义一个int类型数组, 求数组中元素的最大值， 并打印最大值
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int[] numbers = {15, 9000, 10000, 20000, 9500, -5};

        // 1. 假设第一个元素就是最大的, 遍历数组,使用 增强 for 循环
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("最大值是: " + max);
    }
}

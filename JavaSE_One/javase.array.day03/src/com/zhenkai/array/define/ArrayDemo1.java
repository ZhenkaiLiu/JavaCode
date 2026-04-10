package com.zhenkai.array.define;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 静态初始化数组案例
 * 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
 **/
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 1. 定义数组
        int[] salesVolume = {16, 26, 36, 6, 100};

        // 2. 遍历数组, 可以用增强 for 循环
        int sum = 0;
        for (int num : salesVolume) {
            sum += num;
        }

        System.out.println("总销售额是: " + sum);
    }
}

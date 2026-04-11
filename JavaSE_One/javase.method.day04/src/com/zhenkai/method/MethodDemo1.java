package com.zhenkai.method;

/**
 * @author Zhenkai
 * @date 2026/4/11 周六
 * @description 求 1 - n 的和
 **/
public class MethodDemo1 {
    public static void main(String[] args) {
        // 1. 方法定义时，要根据实际业务需求设计方法
        // 1 - 100 的总和
        int rs = summation(100);
        System.out.println("1 - 100 的和是: " + rs);
    }

    /**
     * 求 1 - 指定数的总和
     *
     * @param number 需要累加和的终点指数
     * @return 返回 1 到 接收到数字的总和 sum
     */
    public static int summation(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }
}

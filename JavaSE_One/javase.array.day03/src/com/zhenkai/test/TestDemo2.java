package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 某个数组有5个数据：10,20,30,40,50，请将这个数组中的数据进行反转。
 * [10, 20, 30, 40, 50]  反转后 [50, 40, 30, 20, 10]
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // 遍历数组, 使用普通 for 循环
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            // 引入一个临时变量存储
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // 打印反转后的数组
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i == array.length - 1 ? array[i] + "]" :  array[i] + ", ");
        }

        System.out.println();
    }
}

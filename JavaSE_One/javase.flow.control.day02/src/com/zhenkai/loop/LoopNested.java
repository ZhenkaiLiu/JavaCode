package com.zhenkai.loop;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 讲解循环嵌套
 **/
public class LoopNested {
    public static void main(String[] args) {
        // 循环嵌套: 外部循环一次，内部循环一轮
        // 案例：打印 5 行 6 列 *
        // 1. 设计外部循环
        for (int i = 1; i <= 5; i++) {
            // 2. 设计内部循环，打印列数
            for (int j = 1; j <= 6; j++) {
                System.out.print("*" + '\t');
            }
            System.out.println();
        }
    }
}

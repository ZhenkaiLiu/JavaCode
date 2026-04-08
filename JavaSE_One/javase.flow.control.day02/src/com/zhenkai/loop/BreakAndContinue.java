package com.zhenkai.loop;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 break 和 continue 的用法和区别
 **/
public class BreakAndContinue {
    public static void main(String[] args) {
        // break: 用于结束本轮循环，只能在循环或者 switch 分支里使用
        // 案例: 打印 5 行 HelloWorld，在第 3 行后就不用打印了
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println("HelloWorld " + i);
        }

        System.out.println("-----------------------------");

        // continue: 用于结束当前循环的当次执行
        // 案例: 打印 5 行 HelloWorld，在第 3 行后不用打印,其他行依旧打印
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println("HelloWorld " + i);
        }
    }
}

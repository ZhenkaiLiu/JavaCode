package com.zhenkai.branch;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 if 分支结构
 **/
public class IfDemo {
    public static void main(String[] args) {
        // if 的三种形式
        /* if (条件表达式) {   当条件为 true 时，才会执行代码，如果是 false，直接跳出分支
                代码;
            } */

        // 示例： 判断用户钱包余额是否大于 100 元，如果满足扣除 50 元
        double money = 98.5;
        if (money > 100) {
            money -= 50;
            System.out.println("扣款成功，当前余额为： " + money + "元");
        }

        /* if (条件表达式) ｛     当条件为 true 时，才会执行代码，如果是 false，执行 else 分支代码
            代码 1;
        ｝ else {
            代码 2;
        } */

        // 示例： 判断用户钱包余额是否大于 100 元，如果满足扣除 50 元，不满足提示用户余额不足
        double money2 = 98.5;
        if (money2 > 100) {
            money -= 50;
            System.out.println("扣款成功，当前余额为： " + money + "元");
        } else {
            System.out.println("您当前账户余额不足！");
        }

        /* if (条件表达式1) ｛
            代码 1;
        ｝ else if (条件表达式2) ｛
            代码 2;
        ｝..else {
            代码 n;
        } */

        // 示例： [0,60) 不及格 [60,80) 良 [80,100] 优
        double score = 85;
        if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 80) {
            System.out.println("良");
        } else if (score >= 80 && score <= 100) {
            System.out.println("优");
        } else {
            System.out.println("输入的成绩有误！");
        }

    }
}

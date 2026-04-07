package com.zhenkai.operator;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握运算符相关知识
 **/
public class OperatorDemo {
    public static void main(String[] args) {
        // 基本算数运算符： + - * / %(取余)
        // 两个整数相除得到结果依然是整数
        System.out.println(5 / 2);
        System.out.println(1.0 * 5 / 2);
        // + 不仅可以用来做加法，也可以用来拼接字符串
        System.out.println("abc" + 5 + "cba");

        // 自增自减运算符： ++ -- 对变量自身加 1 或 减 1 操作
        int a = 5;
        a++;
        System.out.println(a);

        // 放在表达式中： 表达式前，先对自身加 1 或 减 1，然后将新值付给变量
        int a1 = 9;
        int b1 = ++a1;
        System.out.println("a1: " + a1);
        System.out.println("b1: " + b1);
        // 放在表达式中： 表达式后，先将值付给变量，然后对自身加 1 或 减 1
        int a2 = 20;
        int b2 = a2--;
        System.out.println("a2: " + a2);
        System.out.println("b2: " + b2);

        // 赋值运算符： += -= *= /= %=    会进行一次强制类型转换
        int a3 = 50;
        // a3 = (int) a3 + 50;
        a3 += 50;
        System.out.println(a3);

        // 关系运算符： > < >= <= == !=   返回 boolean 类型结果
        System.out.println(5 > 10);

        // 逻辑运算符： & | ! ^ && ||     注意： 双与的优先级高于双或

        // 三元运算符： 条件表达式 ? 值 1 : 值 2
        // 需求： 成绩必须大于 90，且数学成绩必须 大于 85 分才算优秀
        double score = 60,mathScore = 98;
        double score2 = 90,mathScore2 = 98;
        System.out.println(score >= 90 && mathScore >= 85 ? "优秀" : "良");

    }
}

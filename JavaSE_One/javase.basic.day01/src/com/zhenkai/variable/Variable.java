package com.zhenkai.variable;

/**
 * @author Zhenkai
 * @date 2026/4/6 周一
 * @description 掌握变量的定义和注意事项
 **/
public class Variable {
    public static void main(String[] args) {
        // 变量的定义格式： 数据类型 变量名 = 数据;
        // 变量名命名规范：小写字母开头，满足驼峰模式，要有意义
        int a = 18;
        double score = 65.5;

        /* 变量的注意事项：
         *  1. 变量必须先声明才能使用
         *  2. 声明的变量是什么数据类型，赋值的数据就必须是该类型
         *  3. 变量存在有效范围，在有效范围内，变量名不允许重复
         *  4. 变量名定义时可以先不赋初始值，但使用时必须赋值 */

        // 变量示例场景: 你现在有 188.8 元，一会要发 100 元，再收 20 元.
        double money = 188.8;
        // 发 100 元
        money -= 100;
        // 收 20 元。
        money += 20;

        // 打印最终结果
        System.out.println("当前账户余额为：" + money + "元");
    }
}

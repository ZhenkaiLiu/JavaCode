package com.zhenkai.type_conversion;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握类型转换
 **/
public class TypeConversionDemo1 {
    public static void main(String[] args) {
        // 自动类型转换： 小范围类型的数据可以直接赋值给大范围类型的数据
        // byte short char -> int -> long -> float -> double
        byte b1 = 98;
        int a1 = b1;
        System.out.println(a1);

        char c1 = 'A';
        int a2 = c1;
        System.out.println(a2);

        // 表达式中的自动类型转换： 表达式中，小范围类型的数据自动转换成较大范围的数据参与运算
        // 注意： byte short char 直接转换成 int 参与运算；表达式中的结果由最高数据类型决定
        byte b2 = 50;
        char c2 = 'A';
        // 最高类型是 double，b2 和 c2 直接转换成了 int 类型参与运算
        System.out.println(100.85 + b2 + c2);

        // 强制类型转换： 强制将数据类型范围大的转换成数据类型范围小的
        // 注意： 强制类型转换容易造成数据溢出；浮点型强制转换成整形，直接丢掉小数部分
        // 数据类型 变量a = (数据类型) 变量b
        double d1 = 98.85;
        int a3 = (int) d1;
        System.out.println(a3);

        char c3 = 'a';
        byte b3 = (byte) c3;
        System.out.println(b3);
    }
}

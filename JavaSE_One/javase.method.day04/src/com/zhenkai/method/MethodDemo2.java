package com.zhenkai.method;

/**
 * @author Zhenkai
 * @date 2026/4/11 周六
 * @description 判断一个数是奇数还是偶数
 **/
public class MethodDemo2 {
    public static void main(String[] args) {
        judge(2025);
        judge(2026);
    }

    /**
     * 接受到一个数据后,判断这个数据是奇偶数
     *
     * @param number 接收到的需要判断的数据
     */
    public static void judge(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " 是偶数");
        } else {
            System.out.println(number + " 是奇数");
        }
    }
}

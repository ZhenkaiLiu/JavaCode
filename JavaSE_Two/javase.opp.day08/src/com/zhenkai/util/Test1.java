package com.zhenkai.util;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description 模拟登录需要 5 位 验证码
 * 模拟验证需要 6 位验证码
 **/
public class Test1 {
    public static void main(String[] args) {
        // 模拟登录
        System.out.println(MyUtil.creatCode(5));
        // 模拟验证
        System.out.println(MyUtil.creatCode(6));
    }
}

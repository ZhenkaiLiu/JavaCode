package com.zhenkai.test;

import java.util.Random;

/**
 * @author Zhenkai
 * @date 2026/4/12 周日
 * @description 开发一个程序，可以生成指定位数验证码功能，每位可以是数字、大小写字母
 **/
public class Test2 {
    public static void main(String[] args) {
        // 测试
        System.out.println(creatCode(5));
        System.out.println(creatCode(0));
        System.out.println(creatCode(6));
    }

    /**
     * 开发生成指定位数验证码功能
     *
     * @param num 需要生成的指定位数验证码
     * @return 返回生成的验证码或 null
     */
    public static String creatCode(int num) {
        // 1. 防御式编程
        if (num < 1) {
            System.out.print("长度至少为 1！");
            return null;
        }

        Random random = new Random();

        String code = "";
        final String DATA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // 2. 确定外部循环
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(DATA.length());
            code += DATA.charAt(index);
        }

        return code;
    }
}

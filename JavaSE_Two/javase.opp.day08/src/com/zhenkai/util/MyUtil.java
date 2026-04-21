package com.zhenkai.util;

import java.util.Random;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description 讲解工具类
 * 案例需求：开发一个生成验证码功能
 **/
public class MyUtil {
    // 工具类：都是一些类方法组成，每个方法用来完成一个功能。工具类是给开发人员共同使用的
    // 使用类方法设计工具类的好处：提高代码复用；调用方便；提高开发效率
    // 注意：需要隐藏构造器
    private MyUtil() {

    }
    /**
     * 设计验证码生成功能
     * @param n 需要生成的验证码位数
     * @return 返回生成的验证码或 null
     */
    public static String creatCode(int n) {
        if (n < 1) {
            System.out.println("请确保验证码长度至少为 1");
            return null;
        }

        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            code += data.charAt(random.nextInt(data.length()));
        }

        return code;
    }

}

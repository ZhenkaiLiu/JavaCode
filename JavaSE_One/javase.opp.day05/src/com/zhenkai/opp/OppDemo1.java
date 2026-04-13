package com.zhenkai.opp;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 讲解封装
 **/
public class OppDemo1 {
    // 封装的核心思想：合理公开，合理暴露
    // public 公开  private 隐藏
    private String name;
    private int age;

    /**
     * 判断是否成年
     */
    public void judgmentAge(int age) {
        if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
    }
}

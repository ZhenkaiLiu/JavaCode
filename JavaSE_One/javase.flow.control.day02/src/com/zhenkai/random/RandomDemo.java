package com.zhenkai.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 Random 随机数的相关操作
 **/
public class RandomDemo {
    public static void main(String[] args) {
        // Random: 产生随机数，数据包前不包后
        // 产生指定区间的随机数：a - c     random.nextint(c - a + 1) + a
        // 实例： 产生 25 —— 125 之间的随机数
        Random random = new Random();
        int number = 0;

        for (int i = 1; i <= 50; i++) {
            number = random.nextInt(101) + 25;
            System.out.println(number);
        }


    }
}

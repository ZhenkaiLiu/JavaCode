package com.zhenkai.loop;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 do-while 循环
 **/
public class DoWhileDemo {
    public static void main(String[] args) {
        // do-while 循环的格式
        /* 初始化语句;
         *  do {
         *      循环体语句;
         *      迭代语句;
         * }while(循环条件) */
        // 打印 1 - 100 之间的所有偶数
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}

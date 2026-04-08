package com.zhenkai.test;

import java.util.Random;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 设计双色球
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        /* 设计一个程序，随机生成一组双色球（总共 7 个数字，一组双色球由 6 个红球 + 1 个篮球组成
        其中红球为 1 - 33 之间的数字，且不能重复
        篮球为 1 - 16 之间的数字）
        要求如下：随机生成一组双色球，每个红球数字用"-"（中划线）分割连成字符串显示，蓝球最后一个显示，且和红球之间用空格分隔。如："23-12-3-8-14-17 8" */
        System.out.println(getNumber());
    }

    /**
     * 设计双色球功能
     *
     * @return 返回生成的双色球 number
     */
    public static String getNumber() {
        Random random = new Random();

        // 1. 定义变量用来存储结果
        String redNumber = "";
        int blueNumber;

        // 2. 生成红球
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            int temp;
            do {
                temp = random.nextInt(33) + 1;
            } while (isDuplicate(array, temp, i));

            array[i] = temp;

            if (i < array.length - 1) {
                redNumber += array[i] + "-";
            } else {
                redNumber += array[i];
            }
        }

        // 3. 生成蓝球
        blueNumber = random.nextInt(16) + 1;

        // 4. 拼接最终结果
        return redNumber + " " + blueNumber;
    }

    /**
     * 检测数字是否在数组的前 validLength 个元素中出现过
     *
     * @param arr         红球数组
     * @param num         要检测的数字
     * @param validLength 有效长度（只检查前 validLength 个元素）
     * @return 出现过返回 true，没出现过返回 false
     */
    private static boolean isDuplicate(int[] arr, int num, int validLength) {
        for (int i = 0; i < validLength; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}

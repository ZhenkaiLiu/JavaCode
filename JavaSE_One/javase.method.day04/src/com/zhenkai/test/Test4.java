package com.zhenkai.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 抢红包活动，分别有：9、666、188、520、99999五个红包。请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止
 * 注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的
 **/
public class Test4 {
    public static void main(String[] args) {
        int[] array = {9, 666, 188, 520, 99999};
        gift(array);
    }

    /**
     * 设计抢红包功能
     *
     * @param array 存放红包数据
     */
    public static void gift(int[] array) {
        // 防御式编程
        if (array == null || array.length == 0) {
            System.out.println("数组为空或长度为0");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 统计红包数量
        int conunt = array.length;
        while (conunt > 0) {
            System.out.println("===========抽奖开始===============");
            System.out.print("请输入任意内容开始抽奖： ");
            String info = scanner.next();

            int index = random.nextInt(array.length);
            int money = array[index];

            if (money != 0) {
                System.out.println("恭喜您，抽中 " + money + " 元");
                array[index] = 0;
                conunt--;
            } else {
                System.out.println("当前红包已被抽走！请您在抽一次！");
            }
        }
        scanner.close();
    }
}

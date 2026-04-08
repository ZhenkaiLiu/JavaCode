package com.zhenkai.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中	  结束游戏
 **/
public class RandomDemo2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1. 生成猜测数字，提醒用户输入数字
        System.out.println("==============猜数字游戏===================");
        int luckyNumber = random.nextInt(100) + 1;
        while (true) {
            System.out.println("请您输入你的猜测数字 （温馨提示：是 1 - 100 之间的整数哦）");
            int userNumber = scanner.nextInt();

            // 2. 防御式编程，检查用户输入的数字是否在区间内，不在区间内重新输入
            if (userNumber < 1 || userNumber > 100) {
                System.out.println("您录入的数据不在区间范围内，请重新录入");
            } else if (userNumber > luckyNumber) {
                System.out.println("猜大啦");
            } else if (userNumber < luckyNumber) {
                System.out.println("猜小啦");
            } else {
                System.out.println("恭喜您，猜中了，游戏结束！");
                break;
            }
        }

        scanner.close();
    }
}

package com.zhenkai.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 双色球程序，由前 6 个红球号码和后 1 个蓝球号码组成
 * 前 6 个红球不能重复，区间范围 1 ~ 33，蓝球区间范围 1 ~ 16
 * 请设计一个程序，用户录入一组，系统随机生成一组，根据对比确定中奖情况
 **/
public class Test5 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    // 记住用户购买的号码
    private static String creatUserNumber;
    // 记住中奖号码
    private static String creatLuckNumber;
    // 记住是否购买了彩票情况
    private static boolean isValid = false;

    public static void main(String[] args) {
        start();
    }

    /**
     * 初始界面功能
     *
     */
    public static void start() {
        while (true) {
            System.out.println("=============欢迎登录双色球系统=============");
            System.out.println("您可以选择输入以下命令进行操作：1. 购买彩票 2. 开奖 3. 梦想体验 4. 退出");
            int choice = SCANNER.nextInt();

            switch (choice) {
                case 1:
                    // 购买彩票
                    getUserCode();
                    System.out.println("购买成功：您的彩票号码是：" + creatUserNumber);
                    break;
                case 2:
                    // 开奖
                    drawPrize();
                    break;
                case 3:
                    // 先看中奖号码，再购买彩票，体验中奖
                    getLuckNumber();
                    System.out.println(creatLuckNumber);
                    break;
                case 4:
                    System.out.println("退出系统！");
                    return;
                default:
                    System.out.println("您输入的命令有误！请重新输入!");
            }
        }
    }

    /**
     * 用户购买彩票逻辑实现
     *
     *
     */
    private static void getUserCode() {
        // 1. 提醒用户录入数字，拿到数字后检测是否合法
        System.out.println("=======购买彩票=======");
        String redNumber = "";
        int blueNumber = 0;
        int[] redNumbers = new int[6];

        // 录入红球号码
        for (int i = 0; i < redNumbers.length; i++) {
            System.out.println("请您依次录入第 " + (i + 1) + " 个红球号码（1 - 33之间的整数，每个数字只能录入一次）：");
            int temp;
            do {
                temp = SCANNER.nextInt();
                if (temp < 1 || temp > 33) {
                    System.out.println("您录入的数据超出区间范围，请重新录入！");
                } else if (judgment(temp, redNumbers, i)) {
                    System.out.println("您录入的数据重复，请重新录入！");
                }
            } while (temp < 1 || temp > 33 || judgment(temp, redNumbers, i));

            redNumbers[i] = temp;

            redNumber += redNumbers[i] + (i < redNumbers.length - 1 ? "-" : " ");
        }

        // 录入蓝球号码
        int blueTemp;
        do {
            System.out.println("请您录入蓝球号码（1 - 16之间的整数）：");
            blueTemp = SCANNER.nextInt();
            if (blueTemp < 1 || blueTemp > 16) {
                System.out.println("您录入的数据超出区间范围，请重新录入！");
            }
        } while (blueTemp < 1 || blueTemp > 16);
        blueNumber = blueTemp;

        creatUserNumber = redNumber + blueNumber;
        isValid = true;
    }

    /**
     * 通过随机生成树来当中奖号码
     *
     *
     */
    private static void getLuckNumber() {
        String redNumber = "";
        int blueNumber = 0;
        int[] redNumbers = new int[6];

        // 生成随机红球号码，且不允许重复
        for (int i = 0; i < redNumbers.length; i++) {
            int temp;
            do {
                temp = RANDOM.nextInt(33) + 1;
            } while (judgment(temp, redNumbers, i));

            redNumbers[i] = temp;
            redNumber += redNumbers[i] + (i < redNumbers.length - 1 ? "-" : " ");
        }
        blueNumber = RANDOM.nextInt(16) + 1;

        creatLuckNumber = redNumber + blueNumber;
    }

    /**
     * 判断中奖情况
     */
    private static void drawPrize() {
        System.out.println("=======开奖=========");
        if (isValid) {
            getLuckNumber();
            if (creatLuckNumber.equals(creatUserNumber)) {
                System.out.println("恭喜您中奖了");
                System.out.printf("您的号码是：%s,中奖号码是：%s%n", creatUserNumber, creatLuckNumber);
            } else {
                System.out.println("感谢支持福彩！");
            }
        } else {
            System.out.println("请先购买彩票！");
        }


    }

    /**
     * 判断当前数字是否在数组中出现过
     *
     * @param number      需要判断的数字
     * @param arr         数组
     * @param validLength 有效长度
     * @return 出现过返回 true，未出现过返回 false
     */
    private static boolean judgment(int number, int[] arr, int validLength) {
        for (int i = 0; i < validLength; i++) {
            if (arr[i] == number) {
                return true;
            }
        }

        return false;
    }
}

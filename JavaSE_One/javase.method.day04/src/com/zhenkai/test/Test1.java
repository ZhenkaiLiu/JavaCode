package com.zhenkai.test;

import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/11 周六
 * @description 购买机票，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠
 * 优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折； 11月到来年4月为淡季，头等舱7折，经济舱6.5折
 * 请开发程序计算出用户当前机票的优惠价。
 **/
public class Test1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    /**
     * 设计根据月份和仓位类型，计算优惠后的价格
     *
     * @param originalPrice 原价
     * @param month         月份
     * @param seatClass     舱位类型
     * @return 返回优惠后的价格
     */
    private static double calculatePrice(double originalPrice, int month, String seatClass) {
        // 1. 根据月份判断旺季或淡季
        if (month >= 5 && month < 11) {
            switch (seatClass) {
                case "头等舱":
                    originalPrice *= 0.9;
                    break;
                case "经济舱":
                    originalPrice *= 0.85;
                    break;
            }
        } else {
            switch (seatClass) {
                case "头等舱":
                    originalPrice *= 0.7;
                    break;
                case "经济舱":
                    originalPrice *= 0.65;
                    break;
            }
        }

        return originalPrice;
    }

    /**
     * 设计舱位购买逻辑实现
     *
     * @return 返回舱位
     */
    private static String getSeatClass() {
        boolean isValid = false;
        String seatClass = "";

        // 信号位思想
        while (!isValid) {
            System.out.print("请您选择您想要购买的舱位类型（头等舱 经济舱）：");
            seatClass = scanner.next();
            if ("头等舱".equals(seatClass) || "经济舱".equals(seatClass)) {
                isValid = true;
            } else {
                System.out.println("您输入的舱位类型非法！");
            }
        }

        return seatClass;
    }

    /**
     * 设计验证月份逻辑
     *
     * @return 返回月份
     */
    private static int getMonth() {
        int month = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("请选择出行月份：");
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("您输入的月份有误！请重新输入！");
            } else {
                isValid = true;
            }
        }

        return month;
    }

    /**
     * 设计金额逻辑功能
     *
     * @return 返回正确的原价
     */
    private static double getPrice() {
        double price = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("请您录入原价：");
            price = scanner.nextDouble();
            if (price > 0) {
                isValid = true;
            } else {
                System.out.println("您录入的金额数据非法！请重新录入！");
            }
        }

        return price;
    }

    /**
     * 展示界面
     */
    public static void start() {
        System.out.println("================机票购买系统===============");
        String seatClass = getSeatClass();
        int month = getMonth();
        double price = getPrice();

        System.out.println("\n购票成功，详细信息如下：");
        System.out.println("舱位类型：" + seatClass);
        System.out.println("出行月份：" + month);
        System.out.println("原价：" + price);
        System.out.println("优惠后的价格是：" + calculatePrice(price, month, seatClass));

        scanner.close();
    }

}

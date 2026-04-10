package com.zhenkai.array.define;

import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 动态初始化数组案例
 * 需求: 某歌唱比赛，需要开发一个系统：可以录入 6 名评委的打分，得分方式为去掉一个最高分，去掉一个最低分，然后剩下的分数求平均值，即为选手得分。
 * 请在键盘录入 6 名评委打的分数（0 分到 10 分），将选手得分输出到控制台录入完毕后立即输出平均分做 选手得分
 **/
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 定义一个动态初始化数组
        double[] scores = new double[6];

        // 2. 录入分数, 需要使用普通 for 循环
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.println("请输入第 " + (i + 1) + "位评委老师录入分数");
                double score = scanner.nextDouble();

                // 防御式编程, 确保数据在正常区间内
                if (score < 0 || score > 10) {
                    System.out.println("您录入的数据非法,请重新录入!");
                } else {
                    scores[i] = score;
                    break;
                }
            }
        }

        // 3. 再次遍历数组, 拿到总分后,求平均分, 使用增强 for 循环
        double sum = 0;
        double max = scores[0];
        double min = scores[0];
        System.out.print("所有评委打分: ");
        for (double num : scores) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            System.out.print(num + "  ");
        }

        // 4. 计算平均分,打印结果
        double average = (sum - max - min) / (scores.length - 2);
        System.out.printf("去掉一个最高分: %.2f, 去掉一个最低分: %.2f, 选手最终得分是: %.2f%n", max, min, average);

        scanner.close();

    }
}

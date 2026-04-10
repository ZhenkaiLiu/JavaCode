package com.zhenkai.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 某公司开发部5名开发人员，要进行项目进展汇报演讲，
 * 现在采取随机排名后进行汇报。请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. 定义动态初始化数组
        int[] workerId = new int[5];

        // 2. 录入工号
        for (int i = 0; i < workerId.length; i++) {
            System.out.println("请您录入第 " + (i + 1) + "位员工工号: ");
            int id = scanner.nextInt();

            workerId[i] = id;
        }

        // 3. 遍历数组, 获取随机索引, 进行交换数据
        for (int i = 0; i < workerId.length; i++) {
            int index = random.nextInt(workerId.length);
            int temp = workerId[index];
            workerId[index] = workerId[i];
            workerId[i] = temp;
        }

        // 4. 输出交换顺序后的结果
        System.out.print("员工按照以下工号顺序上台是: ");
        for (int id : workerId) {
            System.out.print(id + "  ");
        }

        scanner.close();
    }
}

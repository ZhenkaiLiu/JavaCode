package com.zhenkai.scanner;

import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 初步掌握 Scanner 的用法
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        // scanner: 键盘录入
        // 1. 导包 2. 得到扫描器对象
        Scanner scanner = new Scanner(System.in);
        // 3. 调用扫描器功能
        System.out.print("请您输入您的姓名： ");
        String name = scanner.next();
        System.out.print("请您输入您的年龄： ");
        int age = scanner.nextInt();
        System.out.print("请您输入您的性别： ");
        String gender = scanner.next();

        System.out.printf("姓名 %s, 年龄 %d 岁，性别 %s%n", name, age, gender);

        // 4. 关闭扫描器
        scanner.close();
    }
}

package com.zhenkai.string;

import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/15 周三
 * @description 案例需求：系统的正确用户名和密码是：itheima 123445@1theima
 * 请在控制台开发一个登录界面，接受用户输入的登录名和密码，判断用户是否登录成功，成功给出提示，并立即结束程序
 * 如果不成功，最多只有三次机会，展示用户是哪个环节出现问题
 **/
public class StringDemo3 {
    private static final String USERNAME = "itheima";
    private static final String PASSWORD = "123456@itheima";

    public static void main(String[] args) {
        login();
    }

    /**
     * 设计登录功能的实现
     */
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        // 控制循环次数，超过三次立即结束循环
        for (int i = 3; i >= 1; i--) {
            System.out.println("请您输入用户名：");
            String userName = scanner.next();
            System.out.println("请您输入密码：");
            String password = scanner.next();

            // 判断用户输入的内容和正确的用户名和密码是否相同
            if (judgment(userName, password)) {
                System.out.println("欢迎登入系统！");
                break;
            } else {
                System.out.println("您输入的用户名或密码错误！请重新输入！");
                System.out.println("当前还有 " + (i - 1) + " 次机会！");
            }
        }
    }

    /**
     * 判断用户名和密码是否与对应的正确内容一致
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回判断结果
     */
    private static boolean judgment(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}

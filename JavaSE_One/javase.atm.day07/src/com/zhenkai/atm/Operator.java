package com.zhenkai.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/17 周五
 * @description ATM 操作系统，设计为工具类
 **/
public class Operator {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final ArrayList<Atm> ATMS = new ArrayList<>();
    private static Atm account; // Current logged-in account

    private Operator() {
    }

    /**
     * 设计展示界面
     */
    public static void start() {
        while (true) {
            System.out.println("===========欢迎您进入 ATM 系统==============");
            System.out.println("1. 用户登录");
            System.out.println("2. 用户开户");
            System.out.print("请选择：");
            int commit = SCANNER.nextInt();
            switch (commit) {
                case 1:
                    // login
                    login();
                    break;
                case 2:
                    creatAccount();
                    // creat
                    break;
                default:
                    System.out.println("您选择的命令有误！\n");
            }
        }
    }

    /**
     * 设计开户功能
     */
    private static void creatAccount() {
        System.out.println("=====开户=====");
        Atm account = new Atm();

        System.out.println("请您输入您的姓名：");
        account.setUserName(SCANNER.next());

        char gender;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("请您输入您的性别：");
            gender = SCANNER.next().charAt(0);
            if (gender != '男' && gender != '女') {
                System.out.println("您输入的性别有误！请重新输入！");
            } else {
                account.setGender(gender);
                isValid = true;
            }
        }

        String passWord;
        String okPassWord;

        while (true) {
            System.out.println("请您设置您的密码：");
            passWord = SCANNER.next();

            System.out.println("请您再次输入您的密码：");
            okPassWord = SCANNER.next();

            if (passWord.equals(okPassWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次输入的密码不一致，请检查！");
            }
        }

        System.out.println("请您设置您的限制额度：");
        account.setLimit(SCANNER.nextDouble());

        account.setCardId(cardId());
        ATMS.add(account);

        System.out.println("恭喜 [" + account.getUserName() + "] 开户成功，您的卡号是： " + account.getCardId());
    }

    /**
     * 设计自动生成卡号功能，8 位卡号不允许与其他账户卡号重复
     *
     * @return 生成的 8 位没有重复的卡号
     */
    private static String cardId() {
        // 定义一个空变量
        String cardId = "";

        while (true) {
            for (int i = 1; i <= 8; i++) {
                cardId += RANDOM.nextInt(10);
            }

            // 判断当前卡号是否重复出现过
            if (search(cardId) == null) {
                // 说明不重复
                return cardId;
            }
        }
    }

    /**
     * 设计检索卡号是否重复出现过
     *
     * @param cardId 需要查找的卡号
     * @return 返回判断结果
     */
    private static Atm search(String cardId) {
        // 遍历对象，拿到每一个值
        for (Atm account : ATMS) {
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }

        return null;
    }

    /**
     * 设计登录功能
     */
    private static void login() {
        System.out.println("====系统登录===");
        // 1. 防御式编程
        if (ATMS.isEmpty()) {
            System.out.println("当前系统无账户");
            return;
        }

        String cardId;
        while (true) {
            System.out.println("请您输入卡号：");
            cardId = SCANNER.next();
            Atm account = search(cardId);

            if (account != null) {
                // 说明当前集合里是存在该账户的
                if (verifyPassword(account)) {
                    // 登录成功后的操作
                    System.out.println("恭喜 [" + account.getUserName() + "] 成功登入系统，您的卡号是：" + account.getCardId());
                    Operator.account = account;
                    loginShow();
                }
            } else {
                System.out.println("当前卡号不存在，请检查！");
            }
        }
    }

    /**
     * 设计验证密码逻辑
     *
     * @param account 需要查询的账户密码
     * @return 判断结果
     */
    private static boolean verifyPassword(Atm account) {
        String passWord;
        for (int i = 0; i < 5; i++) {
            System.out.println("请您输入密码：");
            passWord = SCANNER.next();
            if (account.getPassWord().equals(passWord)) {
                return true;
            } else {
                System.out.println("密码输入错误！今日您还可以输入 " + (4 - i) + " 次！");
            }
        }
        return false;
    }

    /**
     * 设计登录成功后的功能
     */
    private static void loginShow() {
        while (true) {
            System.out.println("=======登录后操作界面======");
            System.out.println(account.getUserName() + "您可以进行一下操作：");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.print("请选择：");

            int command = SCANNER.nextInt();
            switch (command) {
                case 1:
                    showAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrawalMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    modifyPassWord();
                    return;
                case 6:
                    System.out.println(account.getUserName() + "您退出系统成功！");
                    return;
                case 7:
                    deleteAccount();
                    if (account == null) {
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前选择的操作是不存在的，请确认~~");
            }
        }
    }

    /**
     * 查询账户信息进行展示
     */
    private static void showAccount() {
        System.out.println("=====账户查询=====");
        System.out.println("您当前账户信息如下：");
        System.out.println("用户名：" + account.getUserName());
        System.out.println("卡号：" + account.getCardId());
        System.out.println("性别：" + account.getGender());
        System.out.println("限额：" + account.getLimit());
        System.out.println("当前余额：" + account.getMoney());
    }

    /**
     * 存款功能
     */
    private static void deposit() {
        System.out.println("=====存款====");
        System.out.println("请您输入存款金额：");
        double money = SCANNER.nextDouble();
        account.setMoney(account.getMoney() + money);

        System.out.println("存款成功，当前余额是：" + account.getMoney());
    }

    /**
     * 取款功能
     */
    private static void withdrawalMoney() {
        System.out.println("====取款====");
        if (account.getMoney() < 100) {
            System.out.println("当前余额小于 100 元，无法取现！");
            return;
        }

        System.out.println("请您输入取款额度：");
        double money = SCANNER.nextDouble();

        if (money > account.getLimit()) {
            System.out.println("取款金额超过账户限额！");
            return;
        }

        if (money > account.getMoney()) {
            System.out.println("余额不足！当前余额：" + account.getMoney());
            return;
        }

        account.setMoney(account.getMoney() - money);
        System.out.println("取款成功！当前余额为：" + account.getMoney());
    }

    private static void transferMoney() {
        System.out.println("====转账====");
        if (ATMS.size() < 2) {
            System.out.println("当前只有 1 个账户，无法转账！");
            return;
        }

        if (account.getMoney() == 0) {
            System.out.println("您当前账户余额为 0，不能转账！");
            return;
        }

        String cardId;
        Atm targetAccount = null;

        while (true) {
            System.out.println("请您输入对方账户卡号：");
            cardId = SCANNER.next();

            if (cardId.equals(account.getCardId())) {
                System.out.println("不能给自己转账！");
                continue;
            }

            targetAccount = search(cardId);
            if (targetAccount != null) {
                break;
            } else {
                System.out.println("您输入的对方账户不存在！");
            }
        }

        System.out.println("请您输入[" + targetAccount.getUserName() + "]的姓氏进行验证：");
        String surName = SCANNER.next();
        if (!targetAccount.getUserName().startsWith(surName)) {
            System.out.println("验证失败！");
            return;
        }

        System.out.println("验证通过！请您输入转账金额：");
        double money = SCANNER.nextDouble();

        if (money > account.getMoney()) {
            System.out.println("余额不足！当前余额：" + account.getMoney());
            return;
        }

        if (money > account.getLimit()) {
            System.out.println("转账金额超过账户限额！");
            return;
        }

        account.setMoney(account.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);

        System.out.println("转账成功！转出金额：" + money);
        System.out.println("当前余额：" + account.getMoney());
    }

    private static void deleteAccount() {
        System.out.println("====注销账户====");
        System.out.println("确定要注销账户吗？此操作不可恢复！(y/n)");
        String confirm = SCANNER.next();

        if (!"y".equalsIgnoreCase(confirm)) {
            System.out.println("取消注销操作！");
            return;
        }

        if (verifyPassword(account)) {
            ATMS.remove(account);
            System.out.println("账户注销成功！");
            account = null;
        } else {
            System.out.println("密码验证失败，取消注销！");
        }
    }

    private static void modifyPassWord() {
        System.out.println("====密码修改====");

        boolean passwordVerified = verifyPassword(account);
        if (!passwordVerified) {
            System.out.println("密码验证失败，无法修改密码！");
            return;
        }

        String newPassWord;
        String okPassWord;

        while (true) {
            System.out.println("请您输入新密码：");
            newPassWord = SCANNER.next();

            System.out.println("请您再次输入密码：");
            okPassWord = SCANNER.next();

            if (newPassWord.equals(okPassWord)) {
                account.setPassWord(newPassWord);
                System.out.println("密码修改成功！");
                return;
            } else {
                System.out.println("两次密码不一致，请重新输入！");
            }
        }
    }
}

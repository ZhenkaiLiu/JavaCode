package com.zhenkai.arraylist.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/16 周四
 * @description 商家端操作类，负责食品的上架、下架、修改功能
 * 设计成工具类
 **/
public class Operator {
    private static final ArrayList<Food> FOODS = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    private Operator() {
    }

    /**
     * 展示功能
     */
    public static void start() {
        while (true) {
            System.out.println("===========商家后台管理系统===============");
            System.out.println("请根据以下命令选择对应操作： 1. 上架菜品 2. 浏览菜品 3. 修改菜品 4. 下架菜品 5. 退出系统");
            int commit = SCANNER.nextInt();
            switch (commit) {
                case 1:
                    // 上架菜品 .add();
                    add();
                    break;
                case 2:
                    // 浏览菜品 .get();
                    get();
                    break;
                case 3:
                    // 修改菜品 .set();
                    set();
                    break;
                case 4:
                    // 下架菜品 .remove();
                    remove();
                    break;
                case 5:
                    System.out.println("---退出系统---");
                    return;
                default:
                    System.out.println("您输入的命令有误！");
            }
        }
    }

    /**
     * 上架菜品逻辑实现
     *
     */
    private static void add() {
        System.out.println("=======食品上架=======");
        Food food = new Food();
        System.out.println("请您输入食物的名称：");
        food.setName(SCANNER.next());
        System.out.println("请您输入食物的详细信息：");
        food.setInformation(SCANNER.next());
        System.out.println("请您输入食品的折扣：");
        food.setDiscount(SCANNER.nextDouble());
        System.out.println("请您输入食品的原价：");
        food.setOriginalPrice(SCANNER.nextDouble());
        double discountedPrice = food.getOriginalPrice() * (0.1 * food.getDiscount());
        food.setDiscountedPrice(discountedPrice);

        FOODS.add(food);
        System.out.println("[" + food.getName() + "] 上架成功！");
    }

    /**
     * 设计菜品浏览
     */
    private static void get() {
        System.out.println("======菜品浏览=======");

        // 防御式编程
        if (FOODS.isEmpty()) {
            System.out.println("请您先上架菜品！");
            return;
        }

        int index = 0;
        for (Food food : FOODS) {
            System.out.println("菜品信息如下：");
            System.out.println("菜名：" + food.getName());
            System.out.println("详情：" + food.getInformation());
            System.out.printf("折扣：%.2f%n", food.getDiscount());
            System.out.printf("原价：￥ %.2f%n", food.getOriginalPrice());
            System.out.printf("优惠价：￥ %.2f%n", food.getDiscountedPrice());

            index++;
            if (FOODS.size() > index) {
                System.out.println("-----------------------------------");
            }
        }
    }

    /**
     * 修改菜品逻辑
     */
    private static void set() {
        System.out.println("=======菜品修改======");
        // 防御式编程
        if (FOODS.isEmpty()) {
            System.out.println("请先上架菜品！");
            return;
        }

        System.out.println("请您输入您需要修改的菜品名称：");
        String name = SCANNER.next();

        Food targetFood = null;
        for (Food food : FOODS) {
            if (food.getName().equals(name)) {
                targetFood = food;
                break;
            }
        }

        if (targetFood == null) {
            System.out.println("未找到名为 [" + name + "] 的菜品！");
            return;
        }

        System.out.println("您可以选择修改： 1. 菜名 2. 详情 3. 折扣 4. 原价");
        int choice = SCANNER.nextInt();

        switch (choice) {
            case 1:
                System.out.println("请输入新的菜名：");
                targetFood.setName(SCANNER.next());
                break;
            case 2:
                System.out.println("请输入新的详情：");
                targetFood.setInformation(SCANNER.next());
                break;
            case 3:
                System.out.println("请输入新的折扣：");
                double newDiscount = SCANNER.nextDouble();
                targetFood.setDiscount(newDiscount);
                // 重新计算优惠价
                double newDiscountedPrice = targetFood.getOriginalPrice() * (0.1 * newDiscount);
                targetFood.setDiscountedPrice(newDiscountedPrice);
                break;
            case 4:
                System.out.println("请输入新的原价：");
                double newOriginalPrice = SCANNER.nextDouble();
                targetFood.setOriginalPrice(newOriginalPrice);
                // 重新计算优惠价
                double newPriceDiscounted = newOriginalPrice * (0.1 * targetFood.getDiscount());
                targetFood.setDiscountedPrice(newPriceDiscounted);
                break;
            default:
                System.out.println("输入有误，修改取消！");
                return;
        }

        System.out.println("菜品 [" + targetFood.getName() + "] 修改成功！");
    }

    /**
     * 下架菜品
     */
    private static void remove() {
        System.out.println("=========下架菜品=======");
        // 防御式编程
        if (FOODS.isEmpty()) {
            System.out.println("请先上架菜品！");
            return;
        }

        System.out.println("请您输入需要下架的菜品");
        String name = SCANNER.next();

        Food targetFood = null;
        for (Food food : FOODS) {
            if (food.getName().equals(name)) {
                targetFood = food;
                break;
            }
        }
        if (targetFood == null) {
            System.out.println("未找到名为 [" + name + "] 的菜品！");
            return;
        }

        FOODS.remove(targetFood);
        System.out.println("菜品 [" + targetFood.getName() + "] 下架成功！");

    }

}

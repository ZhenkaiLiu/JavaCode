package com.zhenkai.branch;

import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/8 周三
 * @description 掌握 Switch 分支的特点 注意事项 穿透现象
 **/
public class SwitchDemo {
    public static void main(String[] args) {
        // switch 分支： 通过值匹配，来决定执行哪段代码
        /* switch (表达式) ｛   根据表达式的值寻找 case 值进行匹配，执行代码，遇到 break 跳出，如果都没有，就执行 default 代码
            case 值 1:
                代码 1;
                break;
            case 值 2:
                代码 2;
                break;
            ...
            default:
                代码 n;
        ｝*/

        // 示例： 根据用户录入的数字，来决定输出内容
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您录入1 ~ 3 之间的数字！");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println(number + 10);
                break;
            case 2:
                System.out.println(number += 20);
                break;
            case 3:
                System.out.println(number += 30);
                break;
            default:
                System.out.println("您录入的数据非法！");
        }

        /* 注意事项：
        1. switch 分支表达式只能是 byte short int char,JDK 5 后支持枚举,JDK 7 后支持 String,不支持 double float long
        2. case 值后的 break 不能省略,省略会出现穿透现象,只有当 case 代码相同时，可以把相同的代码放在一个 case 块里
        3. case 值不允许重复
        4. case 值只能是字面量，不能是变量 */

        // 多个代码相同时，将相同代码放在同一 case 代码块下
        // 示例：当数字是 1 和 2 时，都执行加 100 操作
        System.out.println("请您再次输入 1 ~ 3 之间的数字");
        int number2 = scanner.nextInt();
        switch (number2) {
            case 1:
            case 2:
                System.out.println(number2 += 100);
                break;
            case 3:
                System.out.println(number2 += 30);
                break;
            default:
                System.out.println("数据非法！");
        }

        scanner.close();
    }
}

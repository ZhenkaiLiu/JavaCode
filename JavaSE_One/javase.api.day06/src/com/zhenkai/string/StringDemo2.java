package com.zhenkai.string;

/**
 * @author Zhenkai
 * @date 2026/4/15 周三
 * @description 讲解 String 常用的方法
 **/
public class StringDemo2 {
    public static void main(String[] args) {
        // 1. 获取字符串的长度： .length();
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("S1 的长度是：" + s1.length());
        System.out.println("S1 的最大索引是：" + (s1.length() - 1));

        // 2. 获取字符串某个索引处的值并返回： .charAt(索引);
        System.out.println("S1 第最后一个位置的值是：" + s1.charAt(25));
        System.out.println("S1 第 11 个位置的值是：" + s1.charAt(10));
        // 字符串遍历的方式一：
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(i == s1.length() - 1 ? s1.charAt(i) + "\n" : s1.charAt(i) + " ");
        }
        System.out.println("--------------------------------------");

        // 3. 把字符串转换成字符数组，再进行遍历： .toCharArray();
        // 字符串的遍历方式二：
        char[] c1 = s1.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            System.out.print(i == c1.length - 1 ? c1[i] + "\n" : c1[i] + " ");
        }

        // 4. 判断字符串内容，返回 boolean 类型的结果： .equals();
        System.out.println("abcdefghijklmnopqrstuvwxyz".equals(s1));

        // 5. 忽略大小写进行比较字符串内容: .equalsIgnoreCase();
        System.out.println("abcdefghijklmnopqrstuvwxyz".equalsIgnoreCase(s1));

        // 6. 截取字符串内容，包前不包后: .substring(开始索引， 结束索引);
        String s2 = s1.substring(0, 10);
        System.out.println(s2);

        // 7. 从当前索引位置截取到字符串末尾内容： .substring(当前索引);
        System.out.println("第 11 个位置到末尾的内容是：" + s1.substring(10));

        // 8. 把字符串中的某个内容替换成新内容： .replace(需要替换的内容, 替换的新内容)
        System.out.println("把大写字母替换成小写字母：" + s1.replace("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz"));

        // 9. 判断某个字符串中是否包含某个关键字： .contains();
        System.out.println(s1.contains("HIJK"));
        System.out.println(s1.contains("abcde"));

        // 10. 判断字符串中是否以某个内容开头： .startWith();
        System.out.println(s1.startsWith("ABC"));
        System.out.println(s1.startsWith("abc"));

        // 11. 把字符串中按某个内容分割成多个字符串，最后放到一个字符串数组中返回： .split();
        String s3 = "Today, Week, Work, Yesterday";
        String[] arr = s3.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

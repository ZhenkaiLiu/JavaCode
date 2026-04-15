package com.zhenkai.string;

/**
 * @author Zhenkai
 * @date 2026/4/15 周三
 * @description 讲解 String 相关知识和注意事项
 **/
public class StringDemo1 {
    public static void main(String[] args) {
        // 1. String 对象的两种创建形式
        // 直接创建，通过英文 “” 里的内容都作为字符串内容，创建成功后被存放在字符常量池，每份内容只存储一份
        String name = "清风";
        System.out.println(name);

        // 通过 new String 创建，并调用构造器初始化字符串
        String s1 = new String();
        s1 = "吴彦祖";
        System.out.println(s1);

        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);
        System.out.println(s2);

        /* 注意事项：
        * 1. String 对象的内容是不可变字符串对象，通过 "" 都会存放在堆内存中的字符串常量池中，且相同的内容之存放一份
        * 2. 但通过 new 方式创建的字符串对象，每 new 一次都会产生一个新的对象存放在堆内存中 */



    }
}

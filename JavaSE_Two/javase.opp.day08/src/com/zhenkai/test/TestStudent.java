package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/21 周二
 * @description
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18,98,90);
        Student s2 = new Student("李四",19,90,98);

        s1.study();
        s2.study();
    }
}

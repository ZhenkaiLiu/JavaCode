package com.zhenkai.array.define;

/**
 * @author Zhenkai
 * @date 2026/4/10 周五
 * @description 掌握数组的定义格式, 静态初始化数组和动态初始化数组的区别, 注意事项
 **/
public class ArrayDefine1 {
    public static void main(String[] args) {
        // 1. 静态初始化数组: 定义数组时直接给数组赋值
        // 2. 格式: 数据类型[] 数组名 = new 数据类型[] {元素1, 元素2…… 元素 n}
        int[] arr1 = new int[]{10, 20, 30};

        // 简化格式: 数据类型[] 数组名 = {元素1, 元素2…… 元素 n}
        int[] arr2 = {40, 50, 60};

        // 注意: 数据类型[] 数组名 也可以写成 数据类型 数组名[] (但不建议)
        int arr3[] = {1, 2, 3};

        // 在计算机中的原理,new 出来的东西都在堆内存中开辟一块空间, 产生一个地址值就给变量
        // 数组名存放的就是堆内存中的地址值, 数组就是引用类型数据
        System.out.println(arr1);

        // 3. 数组的访问: 数组名[索引]; 索引是从 0 开始的
        System.out.println(arr1[0]);
        System.out.println(arr1[2]);

        // 4. 数组的长度: 数组中存放的元素数量     数组名.length;
        // 获取数组的最大索引: 数组名.length - 1; 仅限数组中存在数据, 如果没有数据的话,会出现索引越界异常报错
        System.out.println("arr1 的长度是: " + arr1.length);
        System.out.println("arr1 的最大索引是: " + (arr1.length - 1));

        // 5. 数组的遍历:
        // a. 普通 for 循环遍历数组 for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("---------------------------");

        // b. 增强 for 循环遍历数组 for (数据类型 变量名 : 数组名) { System.out.println(变量名); }
        for (int num : arr1) {
            System.out.println(num);
        }
        /* 什么时候应该用增强 for 循环:
        1. 只读遍历：你只需要依次访问每个元素的值，不关心它的位置（索引）
        2. 查找、统计、聚合：例如求和、查找最大值、判断是否存在某个值等
        3. 追求代码简洁性和可读性：没有特殊索引需求时, 增强 for 循环更清晰，减少出错可能

            什么时候使用普通 for 循环:
        1. 需要数组索引：例如访问前后元素、处理相邻元素、记录索引位置等
        2. 修改基本类型数组的元素值：增强循环无法修改原数组的基本类型值（因为循环变量是副本）
        3. 反向遍历：从最后一个元素向前遍历
        4. 非顺序遍历：步长不为1（如每隔一个元素），或跳跃式访问      例如: for (i = 0; i < arr.length; i += 2)

        核心原则：能用增强 for 就不用普通 for，让代码更简洁；当需要索引或写回基本类型时，退回到普通 for */

        // 6. 动态初始化数组: 定义时先不存入元素值, 只确定数组的长度和数据类型
        // 格式: 数据类型[] 数组名 = new 数据类型[长度]
        double[] score = new double[3];

        // 注意: 动态初始化数组,存在默认值,byte short char int long : 0; Sting : null; boolean : false; float double : 0.0;
        System.out.println(score[0]);
        String[] array = new String[3];
        System.out.println(array[2]);

        // 静态初始化数组和动态初始化数组不能混用


    }
}

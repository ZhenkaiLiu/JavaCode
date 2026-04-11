package com.zhenkai.method;

/**
 * @author Zhenkai
 * @date 2026/4/11 周六
 * @description 比较两个int类型的数组是否一样，返回true或者false
 **/
public class MethodDemo4 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {10, 20, 30};
        System.out.println(judgement(arr1, arr2));

        int[] arr3 = null;
        System.out.println(judgement(arr1, arr3));

        int[] arr4 = {10, 20, 30};
        System.out.println(judgement(arr2, arr4));
    }

    /**
     * 判断两个整数数组是否一致
     *
     * @param arr1 需要判断的数组 1
     * @param arr2 需要判断的数组 2
     * @return 返回 true 或 false
     */
    public static boolean judgement(int[] arr1, int[] arr2) {
        // 判断两个数组是否都是空数组
        if (arr1 == null && arr2 == null) {
            return true;
        }

        // 判断其中一个是空数组
        if (arr1 == null || arr2 == null) {
            return false;
        }

        // 判断两个数组长度是否一样
        if (arr1.length != arr2.length) {
            return false;
        }

        // 遍历数组,看两个数组上的位置元素是否一样
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}

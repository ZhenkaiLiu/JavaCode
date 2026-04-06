/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握数组的遍历和增强循环
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        // 普通遍历方式
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("---------------------------------");
        // 增强循环：主要用于数组、集合的遍历
        for (int num : arr1) {
            System.out.println(num);
        }

        System.out.println("---------------------------------");
        String[] arr2 = {"我是","练习时长","两年半的","个人练习生"};
        for (String a : arr2) {
            System.out.println(a);
        }
    }
}

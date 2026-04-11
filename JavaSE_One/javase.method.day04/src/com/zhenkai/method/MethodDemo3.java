package com.zhenkai.method;

/**
 * @author Zhenkai
 * @date 2026/4/11 周六
 * @description 讲解 Java 的参数传递机制
 **/
public class MethodDemo3 {
    public static void main(String[] args) {
        // Java 的参数传递都是值传递
        // 在传输实参给形参时,传输的都是实参变量的副本 (拷贝一份)
        int a = 100;
        print(a);
        System.out.println("main 内: " + a);

        System.out.println("-------------------------");
        // 引用类型参数传递,同样是值传递,但唯一区别在于传输的是地址值
        // 因此如果方法内部发生改变,形参也会发生改变
        int[] arr = {11, 22, 33, 44};
        for (int num : arr) {
            System.out.println("main 内: " + num);
        }

        System.out.println("-------------------------");
        print(arr);
    }

    /**
     *
     * @param number 需要打印的数字
     */
    public static void print(int number) {
        System.out.println("方法内 1: " + number);

        // 传输的是实参的副本,因此在方法内改变形参,不影响方法外的实参
        number = 200;
        System.out.println("方法内 2: " + number);
    }

    /**
     *
     * @param arr 需要打印的数组
     */
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.println("方法内 1: " + num);
        }

        System.out.println("-------------------------");

        arr[2] = 220;
        arr[3] = 100;

        for (int num2 : arr) {
            System.out.println("方法内 2: " + num2);
        }
    }
}

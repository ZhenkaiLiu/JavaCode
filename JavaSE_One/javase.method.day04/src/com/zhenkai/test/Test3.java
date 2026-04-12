package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/12 周日
 * @description 开发一个数字加密程序
 * <ul>
 *     <li>加密规则如下：</li>
 *     <li>对密码中的每一位数都加 5，在对 10 求余，最后将所有数字进行反转，得到一串加密后的新数据</li>
 * </ul>
 **/
public class Test3 {
    public static void main(String[] args) {
        // 测试
        System.out.println(dataEncryption("1983"));
        // 反编译
        System.out.println(dataEncryption("8346"));
    }

    /**
     * 设计数据加密逻辑实现
     *
     * @param password 需要加密的数据
     * @return 返回加密成功的数据或null
     */
    public static String dataEncryption(String password) {
        if (password == null) {
            System.out.print("当前无数据！");
            return null;
        }
        if (password.length() < 4) {
            System.out.print("当前长度不足！");
            return null;
        }

        // 拿到需要加密数据的每一位
        char[] chars = split(password);

        // 对数据开始加密操作
        for (int i = 0; i < chars.length; i++) {
            int digit = chars[i] - '0';
            int encrypted = (digit + 5) % 10;
            chars[i] = (char)(encrypted + '0');
        }

        // 对数据进行反转
        reversalArray(chars);

        String code = "";
        for (char c : chars) {
            code += c;
        }

        return code;
    }

    /**
     * 设计拿到数据逻辑实现
     *
     * @param password 需要拆分的数据
     */
    private static char[] split(String password) {
        if (password == null || password.length() == 0) {
            System.out.println("当前不存在元素！");
            return null;
        }

        char[] chars = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            chars[i] = password.charAt(i);
        }

        return chars;
    }

    /**
     * 反转数组
     *
     * @param array 需要反转的数组
     *
     */
    private static void reversalArray(char[] array) {
        if (array == null || array.length == 0) {
            System.out.println("数据长度非法！");
            return;
        }

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }
}

import java.util.Random;

/**
 * @author Zhenkai
 * @date 2026/4/7 周二
 * @description 掌握方法的标准写法，代码的规范要求。
 * 案例需求：生成指定位数的验证码
 **/
public class Template {
    public static void main(String[] args) {
        // 测试非法数
        System.out.println(createCode(0));

        // 测试生成 3 位验证码
        System.out.println("生成的 3 位验证码是： " + createCode(3));

        // 测试生成 5 位验证码
        System.out.println("生成的 5 位验证码是： " + createCode(5));

    }

    /**
     * 生成随机位数验证码
     *
     * @param number 验证码的位数，数字需要大于 0
     * @return 返回生成的随机验证码或错误提示
     */
    public static String createCode(int number) {
        // 防御式编程
        if (number < 1) {
            return "数据错误，数字需要大于 0！";
        }

        // 定义空白字符串用于拼接
        String code = "";
        // 定义存放的数据：大小写字母 + 数字
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();
        // 指定循环次数
        for (int i = 0; i < number; i++) {
            // 生成一个随机索引的值赋给 code
            code += data.charAt(random.nextInt(data.length()));
        }

        return code;
    }
}

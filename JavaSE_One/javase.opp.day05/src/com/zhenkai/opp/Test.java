package com.zhenkai.opp;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 讲解面向对象的基本概念，注意事项，this 关键字，构造器
 **/
public class Test {
    public static void main(String[] args) {
        // 类名.对象名 = new 类名();
        Student s1 = new Student();
        // s1 对象名里存储的是堆内存中的地址值
        System.out.println(s1);

        s1.name = "清风";
        s1.score = 58.5;
        s1.age = 22;
        s1.print();
        s1.printPass(60);
        System.out.println("----------------------------");

        // 调用构造器
        /* 构造器：是一种特殊的方法，要求：名字与所在类名一样，且不能写返回值类型
         无参数构造器
        * public class 类名 {
        *   public 类名() {

            }
        * } */
        // 每当 new 对象时，第一步是在堆内存中开辟一块空间并产生地址值；第二步是根据参数选择调用哪个构造器

        Student s2 = new Student("X", 89, 21);
        s2.print();
        s2.age = 25;
        s2.print();
        s2.printPass(60);

        /* 面向对象的注意事项：
        * 1. 类中定义的变量叫做成员变量，类中定义的方法叫做成员方法
        * 2. 成员变量本身存在默认值，不需要定义时赋值
        * 3. 一个代码文件中可以有多个 class 类，但只能有一个 public 修饰
        * 4. 对象与对象之间的数据不会互相影响，但多个变量指向同一个对象就会产生影响
        * 5. 如果一个对象没有一个变量引用它，该对象无法操作，被成为垃圾对象
        * Java 中存在垃圾自动回收机制，自动清理垃圾对象 */
    }
}

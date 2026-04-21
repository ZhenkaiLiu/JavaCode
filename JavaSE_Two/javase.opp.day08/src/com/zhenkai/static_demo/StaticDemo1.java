package com.zhenkai.static_demo;

/**
 * @author Zhenkai
 * @date 2026/4/20 周一
 * @description 讲解 static 相关知识
 **/
public class StaticDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        // static：静态，可以修饰成员变量和成员方法
        // 1. 静态变量（类变量）：有 static 修饰，属于类，在计算机中只有一份，被类的对象共享
        // 访问：类名.类变量（推荐） 对象名.类变量（不推荐）
        // 应用场景：某个数据只需一份，且希望能被共享（访问、修改），则该变量设计为类变量
        Student.schoolName = "XX 中学";
        System.out.println(Student.schoolName);
        s1.schoolName = "XX 大学"; // 不推荐：应使用类名访问类变量
        System.out.println(s1.schoolName);
        System.out.println(Student.schoolName);

        // 2. 实例变量： 无 static 修饰，属于每个对象
        // 访问：对象.实例变量
        s1.age = 18;
        System.out.println(s1.age);

        // 3. 注意事项：
        // (1) 类变量一般使用 public 修饰，对外公开
        // (2) 在同一个类中访问自己类的类变量，可以省略类名不写；
        //     在某个类中访问其他类中的类变量，必须带类名访问
        System.out.println("-------------------------");

        // 4. static 修饰成员方法
        // 类方法：有 static 修饰的成员方法，属于类
        // 访问：类名.类方法（推荐） 对象名.类方法（不推荐）
        // 使用场景：
        Student.print();
        s1.print(); // 不推荐：应使用类名访问类方法

        // 5. 实例方法：无 static 修饰的成员方法，属于对象
        // 访问：对象.实例方法
        s2.age = 22;
        s1.printAge();
        s2.printAge();
    }
}

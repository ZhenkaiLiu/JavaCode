package com.zhenkai.opp;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 讲解实体 JavaBean
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        OppDemo2 demo2 = new OppDemo2();
        demo2.setName("明月");
        demo2.setAge(18);
        demo2.setScore(500);

        System.out.println(demo2.getName());
        System.out.println(demo2.getAge());
        System.out.println(demo2.getScore());

        // 实体类仅用来封装数据
        // 实体类的应用场景：在开发中，仅用来封装数据，其他的业务处理交给其他类完成
    }
}

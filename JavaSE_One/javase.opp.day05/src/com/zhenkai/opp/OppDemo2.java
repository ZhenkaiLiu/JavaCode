package com.zhenkai.opp;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 掌握实体类
 **/
public class OppDemo2 {
    // 实体类：是一种特殊的类，将内部所有成员变量全部私有，对外提供 get set 方法
    // set 方法：用来赋值
    // get 方法：用来取值
    // 实体类中必须要有一个公共的无参构造器
    private String name;
    private int age;
    private double score;

    public OppDemo2() {

    }

    public OppDemo2(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

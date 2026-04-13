package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 案例：模仿电影信息系统
 * <ul>
 *     <li>需求 1：展示系统中的全部电影，每部电影展示名称和价格</li>
 *     <li>需求 2：允许用户根据电影编号查询电影详细信息</li>
 * </ul>
 **/
public class Test {
    public static void main(String[] args) {
        MovieOperator operator = new MovieOperator();
        operator.start();
    }
}

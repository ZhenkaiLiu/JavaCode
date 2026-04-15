package com.zhenkai.arraylist;

import java.util.ArrayList;

/**
 * @author Zhenkai
 * @date 2026/4/15 周三
 * @description 案例一：假如当前购物车里有：Java 入门，宁夏枸杞，黑枸杞，笔记本，特级枸杞，枸杞子，菊花茶
 * 现在用户不想要任何枸杞产品，选择批量删除，请完成需求
 **/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java 入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("笔记本");
        list.add("特级枸杞");
        list.add("菊花茶");
        list.add("枸杞子");
        System.out.println(list);

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            String info = list.get(i);
            if (info.contains("枸杞")) {
                list.remove(info);
                i--;
            }
        }
        System.out.println(list);
    }
}

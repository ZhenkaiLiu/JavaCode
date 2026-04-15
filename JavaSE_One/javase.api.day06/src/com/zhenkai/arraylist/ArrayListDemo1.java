package com.zhenkai.arraylist;

import java.util.ArrayList;

/**
 * @author Zhenkai
 * @date 2026/4/15 周三
 * @description 讲解 ArrayList 相关知识点和注意事项
 **/
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 集合：是一种容器，用来装数据，类似于数组
        // 为什么要学集合，因为数组的大小一经创建就是固定的，但是集合大小可变，开发场景更多

        // 1. 创建 ArrayList 对象 ArrayList<> list = new ArrayList<>();
        // <> 里可以指定类型数据，如果不写就是范型类，可以装任何数据
        ArrayList<String> list1 = new ArrayList<>();

        // 2. 给容器里增加内容： .add();     增
        list1.add("好好学习");
        list1.add("天天向上");
        list1.add("good good study");
        list1.add("day day up");
        System.out.println(list1);

        // 3. 返回容器中存储个数： .size();
        System.out.println(list1.size());

        // 4. 给容器根据某个索引删除集合中的某个值，并返回被删除的元素： .remove(索引);    删
        String remove = list1.remove(3);
        System.out.println(remove);
        System.out.println(list1);
        // 删除指定元素，删除成功返回 true
        System.out.println(list1.remove("天天向上"));
        System.out.println(list1);

        // 5. 将某个索引位置处的数据进行修改，并返回原先的值： .set(索引, 需要修改的内容);       改
        String set = list1.set(1, "好好学习");
        System.out.println(set);
        System.out.println(list1);

        // 6. 根据索引获取某个位置处的值： .get(索引);  查
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));

    }
}

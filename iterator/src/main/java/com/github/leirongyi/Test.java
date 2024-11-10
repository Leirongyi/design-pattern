package com.github.leirongyi;

import com.github.leirongyi.iterator.ConcreteAggregate;
import com.github.leirongyi.iterator.Iterator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个具体集合对象
        ConcreteAggregate aggregate = new ConcreteAggregate(5);

        // 添加一些元素到集合中
        aggregate.add("Item 1");
        aggregate.add("Item 2");
        aggregate.add("Item 3");
        aggregate.add("Item 4");
        aggregate.add("Item 5");

        // 获取迭代器
        Iterator iterator = aggregate.createIterator();

        // 遍历集合中的元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
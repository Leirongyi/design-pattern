package com.github.leirongyi.iterator;

import lombok.Getter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体集合，存储元素，并且能够返回一个迭代器
 */
public class ConcreteAggregate implements Aggregate {
    // 存储元素
    private Object[] items;
    // 获取集合大小
    @Getter
    private int size = 0;

    public ConcreteAggregate(int capacity) {
        items = new Object[capacity];
    }

    // 添加元素
    public void add(Object item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    // 获取元素
    public Object getItem(int index) {
        if (index < size) {
            return items[index];
        }
        return null;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}

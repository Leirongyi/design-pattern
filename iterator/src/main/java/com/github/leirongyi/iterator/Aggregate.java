package com.github.leirongyi.iterator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 集合接口，定义创建迭代器方法
 */
public interface Aggregate {
    // 创建迭代器
    Iterator createIterator();
}

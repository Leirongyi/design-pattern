package com.github.leirongyi.iterator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 迭代器接口，定义访问集合元素的方法
 */

public interface Iterator {
    // 判断是否有下一个元素
    boolean hasNext();
    // 返回下一个元素
    Object next();

}

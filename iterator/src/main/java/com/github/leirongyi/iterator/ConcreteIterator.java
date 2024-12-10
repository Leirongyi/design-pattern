package com.github.leirongyi.iterator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体迭代器，实现迭代器接口
 */
public class ConcreteIterator implements Iterator {
    // 具体集合
    private ConcreteAggregate aggregate;
    // 当前索引
    private int currentIndex = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.getSize();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return aggregate.getItem(currentIndex++);
        }
        return null;
    }
}

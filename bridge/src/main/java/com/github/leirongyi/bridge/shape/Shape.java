package com.github.leirongyi.bridge.shape;

import com.github.leirongyi.bridge.color.Color;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public abstract class Shape {
    // 通过组合实现接口的引用
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    // 定义抽象方法，具体形状需要实现此方法
    public abstract void draw();
}

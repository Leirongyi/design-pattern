package com.github.leirongyi.bridge.shape;

import com.github.leirongyi.bridge.color.Color;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 扩展抽象类：方形
 */
public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing square with ");
        color.applyColor();
    }
}

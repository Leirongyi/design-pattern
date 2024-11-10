package com.github.leirongyi;

import com.github.leirongyi.bridge.color.Blue;
import com.github.leirongyi.bridge.color.Color;
import com.github.leirongyi.bridge.color.Red;
import com.github.leirongyi.bridge.shape.Circle;
import com.github.leirongyi.bridge.shape.Shape;
import com.github.leirongyi.bridge.shape.Square;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建具体的颜色实现
        Color red = new Red();
        Color blue = new Blue();

        // 创建不同的形状并将颜色传入
        Shape circle = new Circle(red);
        Shape square = new Square(blue);

        // 绘制形状
        circle.draw();
        square.draw();

    }
}
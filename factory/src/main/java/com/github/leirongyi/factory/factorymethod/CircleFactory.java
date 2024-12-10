package com.github.leirongyi.factory.factorymethod;

import com.github.leirongyi.factory.shape.Circle;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 圆形工厂
 */
public class CircleFactory implements FactoryMethod {

    @Override
    public Circle getShape() {
        return new Circle();
    }
}

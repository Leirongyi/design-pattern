package com.github.leirongyi.factory.factorymethod;

import com.github.leirongyi.factory.shape.Shape;
import com.github.leirongyi.factory.shape.Square;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 方形工厂
 */
public class SquareFactory implements FactoryMethod {
    @Override
    public Shape getShape() {
        return new Square();
    }
}

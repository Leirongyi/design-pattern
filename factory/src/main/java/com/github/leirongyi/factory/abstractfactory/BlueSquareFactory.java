package com.github.leirongyi.factory.abstractfactory;


import com.github.leirongyi.factory.color.Blue;
import com.github.leirongyi.factory.shape.Square;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 蓝色方形工厂
 */
public class BlueSquareFactory extends AbstractFactory {
    @Override
    public Square getShape() {
        return new Square();
    }

    @Override
    public Blue getColor() {
        return new Blue();
    }
}

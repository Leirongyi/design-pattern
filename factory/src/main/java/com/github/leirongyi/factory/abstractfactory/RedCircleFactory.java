package com.github.leirongyi.factory.abstractfactory;


import com.github.leirongyi.factory.color.Red;
import com.github.leirongyi.factory.shape.Circle;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 红色圆形工厂
 */
public class RedCircleFactory extends AbstractFactory {

    @Override
    public Circle getShape() {
        return new Circle();
    }

    @Override
    public Red getColor() {
        return new Red();
    }
}

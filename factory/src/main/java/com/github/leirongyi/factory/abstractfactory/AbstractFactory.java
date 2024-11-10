package com.github.leirongyi.factory.abstractfactory;


import com.github.leirongyi.factory.color.Color;
import com.github.leirongyi.factory.shape.Shape;

/**
 * @author cade li
 * @date 2022/3/1
 * @description 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Color getColor();
}

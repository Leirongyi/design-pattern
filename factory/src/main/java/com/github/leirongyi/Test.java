package com.github.leirongyi;

import com.github.leirongyi.factory.abstractfactory.RedCircleFactory;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        RedCircleFactory redCircleFactory = new RedCircleFactory();
        redCircleFactory.getColor().fill();
        redCircleFactory.getShape().print();
    }
}
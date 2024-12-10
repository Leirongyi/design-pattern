package com.github.leirongyi.decorator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 简单咖啡
 */
public class SimpleCoffee implements Coffee{

    @Override
    public double cost() {
        return 10.0;
    }

}

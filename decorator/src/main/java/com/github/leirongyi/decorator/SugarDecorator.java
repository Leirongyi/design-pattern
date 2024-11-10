package com.github.leirongyi.decorator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 糖装饰器
 */
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double cost() {
        // 返回被装饰的咖啡的价格加上糖的价格
        return this.decoratorCoffee.cost() + 1.5;
    }
}

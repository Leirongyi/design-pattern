package com.github.leirongyi.decorator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 牛奶装饰器
 */
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double cost() {
        // 返回被装饰的咖啡的价格加上牛奶的价格
        return super.cost() + 3;
    }


}

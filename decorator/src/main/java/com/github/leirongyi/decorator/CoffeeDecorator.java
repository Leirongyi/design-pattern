package com.github.leirongyi.decorator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 咖啡装饰器基类
 */
public abstract class CoffeeDecorator implements Coffee{
    // 被装饰的 Coffee 对象
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public double cost() {
        // 委托给被装饰的 Coffee 对象
        return this.decoratorCoffee.cost();
    }

}

package com.github.leirongyi;

import com.github.leirongyi.decorator.Coffee;
import com.github.leirongyi.decorator.MilkDecorator;
import com.github.leirongyi.decorator.SimpleCoffee;
import com.github.leirongyi.decorator.SugarDecorator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建简单咖啡对象
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple coffee cost: " + simpleCoffee.cost());

        // 给简单咖啡加牛奶
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Coffee with milk cost: " + milkCoffee.cost());

        // 给简单咖啡加糖
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Coffee with sugar cost: " + sugarCoffee.cost());

        // 给简单咖啡加牛奶和糖
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Coffee with milk and sugar cost: " + milkSugarCoffee.cost());
    }
}
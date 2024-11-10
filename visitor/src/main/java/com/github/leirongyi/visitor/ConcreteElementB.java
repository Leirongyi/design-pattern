package com.github.leirongyi.visitor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体元素B实现，表示另一种类型的元素
 */

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 将当前元素传递给访问者
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("ConcreteElementB operation");
    }
}
package com.github.leirongyi.visitor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体访问者实现，定义对每种元素类型的操作
 */

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting ConcreteElementB");
        elementB.operationB();
    }
}
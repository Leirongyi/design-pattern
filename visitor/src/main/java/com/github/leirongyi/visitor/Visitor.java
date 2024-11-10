package com.github.leirongyi.visitor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description  访问者接口，定义对每种元素的访问方法
 */

public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}

package com.github.leirongyi;

import com.github.leirongyi.visitor.ConcreteElementA;
import com.github.leirongyi.visitor.ConcreteElementB;
import com.github.leirongyi.visitor.ConcreteVisitor;
import com.github.leirongyi.visitor.ObjectStructure;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建具体元素
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        // 创建对象结构并添加元素
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);

        // 创建具体访问者
        ConcreteVisitor visitor = new ConcreteVisitor();

        // 使用访问者访问所有元素
        objectStructure.accept(visitor);
    }
}
package com.github.leirongyi.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 对象结构，管理多个元素，并允许访问者遍历这些元素
 */

public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    // 添加元素
    public void addElement(Element element) {
        elements.add(element);
    }

    // 接受访问者访问所有元素
    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}
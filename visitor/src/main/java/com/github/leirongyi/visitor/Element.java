package com.github.leirongyi.visitor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 元素接口，声明接受访问者的方法
 */

public interface Element {
    void accept(Visitor visitor);
}
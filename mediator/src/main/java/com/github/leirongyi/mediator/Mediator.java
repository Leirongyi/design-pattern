package com.github.leirongyi.mediator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 中介者接口，定义与同事对象的交互方法
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}

package com.github.leirongyi.mediator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 同事抽象类，定义中介者的交互方法
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 发送消息
    public abstract void send(String message);
    // 接收消息
    public abstract void receive(String message);

}

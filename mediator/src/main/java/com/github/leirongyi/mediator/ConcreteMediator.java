package com.github.leirongyi.mediator;

import lombok.Setter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体中介者类，实现协调同事之间的通信
 */
@Setter
public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            // 如果消息来自A，B接收
            colleagueB.receive(message);
        } else {
            // 如果消息来自B，A接收
            colleagueA.receive(message);
        }
    }
}


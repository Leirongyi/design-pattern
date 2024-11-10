package com.github.leirongyi.mediator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体同事B
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ConcreteColleagueB send message: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleagueB receive message: " + message);
    }
}

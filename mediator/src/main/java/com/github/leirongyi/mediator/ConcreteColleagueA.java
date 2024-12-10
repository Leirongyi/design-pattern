package com.github.leirongyi.mediator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 具体同事A
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ColleagueA send message: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueA receive message: " + message);
    }
}

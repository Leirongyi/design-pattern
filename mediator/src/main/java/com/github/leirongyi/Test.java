package com.github.leirongyi;

import com.github.leirongyi.mediator.ConcreteColleagueA;
import com.github.leirongyi.mediator.ConcreteColleagueB;
import com.github.leirongyi.mediator.ConcreteMediator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 创建具体同事对象
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        // 设置中介者的同事对象
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        // 同事对象发送消息
        colleagueA.send("Hello from A!");
        colleagueB.send("Hello from B!");    }
}
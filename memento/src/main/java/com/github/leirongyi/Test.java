package com.github.leirongyi;

import com.github.leirongyi.memento.Caretaker;
import com.github.leirongyi.memento.Originator;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建发起人和看护者
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置状态并保存到备忘录
        originator.setState("State1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State3");

        // 恢复到之前的状态
        System.out.println("Current State: " + originator.getState());
        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Restored State to: " + originator.getState());
        originator.restoreStateFromMemento(caretaker.getMemento(1));
        System.out.println("Restored State to: " + originator.getState());
    }
}
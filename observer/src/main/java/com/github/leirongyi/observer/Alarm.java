package com.github.leirongyi.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 报警中心
 */
public class Alarm {

    private final String name;
    private final Set<Observer> observers = new HashSet<>();

    public Alarm(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String msg) {
        System.out.println(name + "发布了消息：" + msg);
        observers.forEach(observer -> observer.update(msg));
    }

}

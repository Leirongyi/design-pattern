package com.github.leirongyi.observer;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 主题接口 (被观察者)
 */
public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers(String msg);

}

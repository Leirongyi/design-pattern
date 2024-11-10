package com.github.leirongyi.observer;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 操作员
 */
public class Operator implements Observer {
    private final String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "收到了消息：" + msg);
    }
}

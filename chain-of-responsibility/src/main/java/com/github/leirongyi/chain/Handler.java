package com.github.leirongyi.chain;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 抽象处理类
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);


}

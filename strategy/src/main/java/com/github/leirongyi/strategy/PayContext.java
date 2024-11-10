package com.github.leirongyi.strategy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class PayContext {

    private final PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay() {
        payStrategy.pay();
    }

}

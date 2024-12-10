package com.github.leirongyi.strategy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class WeChatPay implements PayStrategy {

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}

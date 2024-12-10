package com.github.leirongyi.strategy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class AliPay implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}

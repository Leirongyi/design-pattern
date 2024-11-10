package com.github.leirongyi;

import com.github.leirongyi.strategy.PayContext;
import com.github.leirongyi.strategy.WeChatPay;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class Test {

    public static void main(String[] args) {
        PayContext context= new PayContext(new WeChatPay());
        context.pay();
    }
}

package com.github.leirongyi.pipeline.business.filter;

import com.github.leirongyi.pipeline.AbstractBizFilter;
import com.github.leirongyi.pipeline.business.OrderContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 校验订单
 */
public class CheckOrderFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        // 随机值模拟失败
        if (Math.random() < 0.5) {
            System.out.println("校验订单信息，未通过");
            context.setContinueChain(false);
        } else {
            System.out.println("校验订单信息, 通过");
        }
    }
}


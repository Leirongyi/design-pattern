package com.github.leirongyi.pipeline.business.filter;

import com.github.leirongyi.pipeline.AbstractBizFilter;
import com.github.leirongyi.pipeline.business.OrderContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 拉取付款方式
 */
public class UserPayWayFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        System.out.println("拉取用户付款方式信息");
    }
}

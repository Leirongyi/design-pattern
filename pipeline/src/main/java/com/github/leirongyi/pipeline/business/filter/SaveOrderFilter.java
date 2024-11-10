package com.github.leirongyi.pipeline.business.filter;

import com.github.leirongyi.pipeline.AbstractBizFilter;
import com.github.leirongyi.pipeline.business.OrderContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 保存下单请求信息
 */
public class SaveOrderFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        System.out.println("保存下单请求信息");
    }
}

package com.github.leirongyi.pipeline.business;

import com.github.leirongyi.pipeline.BizFilterChain;
import com.github.leirongyi.pipeline.business.enums.OrderCodeEnum;
import com.github.leirongyi.pipeline.selector.FilterSelector;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 订单服务实现
 */
public class OrderServiceImpl implements OrderService {
    /**
     * 下单
     */
    @Override
    public void placeOrder(OrderParam orderParam) {
        FilterSelector filterSelector = OrderFilterSelectorFactory.getFilterSelector(OrderCodeEnum.PLACE_ORDER);
        // 订单上下文，业务是 PLACE_ORDER
        OrderContext orderContext = new OrderContext(OrderCodeEnum.PLACE_ORDER, filterSelector);
        orderContext.setParam(orderParam);
        // 开始责任链处理
        BizFilterChain<OrderContext> filterChain = OrderPipelineConfig.pipeline().getFilterChain();
        filterChain.filter(orderContext);
        // 获取经过处理后的 model
        OrderModel model = orderContext.getModel();
        System.out.println("---------------------");
        System.out.println("获取经过责任链处理的上下文, " + model);
        // 后续可配合策略根据 model 选择性处理
    }
}


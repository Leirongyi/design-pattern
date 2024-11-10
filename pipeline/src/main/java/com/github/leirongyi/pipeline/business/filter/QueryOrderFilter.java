package com.github.leirongyi.pipeline.business.filter;

import com.github.leirongyi.pipeline.AbstractBizFilter;
import com.github.leirongyi.pipeline.business.OrderContext;
import com.github.leirongyi.pipeline.business.OrderModel;
import com.github.leirongyi.pipeline.business.bean.Good;
import com.github.leirongyi.pipeline.business.bean.User;

import java.util.Objects;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 查询订单信息的过滤器
 */
public class QueryOrderFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        System.out.println("查询订单信息");
        OrderModel model = context.getModel();
        if (Objects.isNull(model)) {
            model = new OrderModel();
            context.setModel(model);
            // 获取 Good User 详细信息
            Good good = Good.builder()
                    .id(context.getParam().getGoodId())
                    .name("商品1")
                    .price(100.00)
                    .build();
            User user = User.builder()
                    .id(context.getParam().getUserId())
                    .name("用户1")
                    .vipFlag(true)
                    .build();
            // 让 model 逐渐丰满
            model.setGood(good);
            model.setUser(user);
        }
    }
}

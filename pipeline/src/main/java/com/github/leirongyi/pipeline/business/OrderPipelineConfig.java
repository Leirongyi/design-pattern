package com.github.leirongyi.pipeline.business;

import com.github.leirongyi.pipeline.BizFilter;
import com.github.leirongyi.pipeline.FilterChainPipeline;
import com.github.leirongyi.pipeline.business.filter.CheckOrderFilter;
import com.github.leirongyi.pipeline.business.filter.QueryOrderFilter;
import com.github.leirongyi.pipeline.business.filter.SaveOrderFilter;
import com.github.leirongyi.pipeline.business.filter.UserPayWayFilter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 订单业务 pipeline 单例类
 * 若使用 Spring 容器，可直接注入到容器中使用
 */
public class OrderPipelineConfig {

    private OrderPipelineConfig() {
    }

    public static FilterChainPipeline<BizFilter<OrderContext>, OrderContext> pipeline() {
        return OrderPipelineHolder.PIPELINE;
    }

    private static class OrderPipelineHolder {
        private static final FilterChainPipeline<BizFilter<OrderContext>, OrderContext> PIPELINE;

        static {
            PIPELINE = new FilterChainPipeline<>();
            PIPELINE.addFilter(new SaveOrderFilter());
            PIPELINE.addFilter(new QueryOrderFilter());
            PIPELINE.addFilter(new CheckOrderFilter());
            PIPELINE.addFilter(new UserPayWayFilter());
        }

    }

}

package com.github.leirongyi;

import com.github.leirongyi.pipeline.business.OrderParam;
import com.github.leirongyi.pipeline.business.OrderServiceImpl;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {

    public static void main(String[] args) {
        // 此处配合容器可注入
        OrderServiceImpl orderService = new OrderServiceImpl();
        // 构造参数
        OrderParam orderParam = new OrderParam();
        orderParam.setGoodId(10001L);
        orderParam.setUserId(1L);
        // 责任链处理
        orderService.placeOrder(orderParam);
    }


}
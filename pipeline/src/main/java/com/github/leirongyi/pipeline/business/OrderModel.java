package com.github.leirongyi.pipeline.business;

import com.github.leirongyi.pipeline.business.bean.Good;
import com.github.leirongyi.pipeline.business.bean.User;
import lombok.Data;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 订单业务总模型
 */

@Data
public class OrderModel {
    private Good good;
    private User user;
}

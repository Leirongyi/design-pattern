package com.github.leirongyi.pipeline.business;

import com.github.leirongyi.pipeline.context.AbstractBizContext;
import com.github.leirongyi.pipeline.enums.BizCode;
import com.github.leirongyi.pipeline.selector.FilterSelector;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 订单业务上下文
 */

@Getter
@Setter
@ToString
public class OrderContext extends AbstractBizContext {
    private boolean continueChain = true;
    private OrderParam param;
    private OrderModel model;

    public OrderContext(BizCode bizCode, FilterSelector filterSelector) {
        super(bizCode, filterSelector);
    }

    @Override
    public boolean continueChain() {
        return continueChain;
    }
}

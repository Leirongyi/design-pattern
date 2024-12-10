package com.github.leirongyi.pipeline.context;

import com.github.leirongyi.pipeline.enums.BizCode;
import com.github.leirongyi.pipeline.selector.FilterSelector;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 业务上下文抽象类
 */
public abstract class AbstractBizContext implements BizContext {

    private final BizCode bizCode;
    private final FilterSelector filterSelector;

    public AbstractBizContext(BizCode bizCode, FilterSelector filterSelector) {
        this.bizCode = bizCode;
        this.filterSelector = filterSelector;
    }

    @Override
    public BizCode getBizCode() {
        return bizCode;
    }

    @Override
    public FilterSelector getFilterSelector() {
        return filterSelector;
    }
}

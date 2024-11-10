package com.github.leirongyi.pipeline.context;

import com.github.leirongyi.pipeline.enums.BizCode;
import com.github.leirongyi.pipeline.selector.FilterSelector;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 业务上下文顶级接口
 */
public interface BizContext {

    BizCode getBizCode();

    FilterSelector getFilterSelector();

    boolean continueChain();
}

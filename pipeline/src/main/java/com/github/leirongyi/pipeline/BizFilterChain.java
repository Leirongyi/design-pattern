package com.github.leirongyi.pipeline;

import com.github.leirongyi.pipeline.context.BizContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 业务过滤器链
 */
public interface BizFilterChain<T extends BizContext> {

    void filter(T bizContext);

    void next(T bizContext);
}

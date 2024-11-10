package com.github.leirongyi.pipeline;

import com.github.leirongyi.pipeline.context.BizContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 业务过滤器
 */
public interface BizFilter<T extends BizContext> {

    void doFilter(T context, BizFilterChain<T> filterChain);

}

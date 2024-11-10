package com.github.leirongyi.pipeline;

import com.github.leirongyi.pipeline.context.BizContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 过滤器抽象
 */
public abstract class AbstractBizFilter<T extends BizContext> implements BizFilter<T> {

    /**
     * 过滤方法模板
     * @param context 业务上下文
     * @param filterChain 过滤器链
     */
    @Override
    public void doFilter(T context, BizFilterChain<T> filterChain) {
        // 判断是否需要执行当前过滤器
        if (context.getFilterSelector().matchFilter(this.getClass().getSimpleName())) {
            this.handle(context);
        }
        if (context.continueChain()) {
            filterChain.next(context);
        }
    }

    /**
     * 过滤处理主逻辑
     * @param context 业务上下文
     */
    public abstract void handle(T context);

}

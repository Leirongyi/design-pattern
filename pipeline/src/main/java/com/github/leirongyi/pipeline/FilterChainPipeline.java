package com.github.leirongyi.pipeline;

import cn.hutool.core.util.ObjectUtil;
import com.github.leirongyi.pipeline.context.BizContext;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 管道
 */
public class FilterChainPipeline<T extends BizFilter<A>, A extends BizContext> {

    private DefaultBizFilterChain<A> firstChain;
    private DefaultBizFilterChain<A> lastChain;

    public DefaultBizFilterChain<A> getFilterChain() {
        return firstChain;
    }

    /**
     * 添加过滤器大纲
     * @param filter 过滤器
     */
    public void addFilter(T filter) {
        DefaultBizFilterChain<A> newChain = new DefaultBizFilterChain<>(null, filter);
        if (ObjectUtil.isNull(firstChain)) {
            firstChain = newChain;
            lastChain = firstChain;
            return;
        }
        lastChain.setNext(newChain);
        lastChain = newChain;
    }


}

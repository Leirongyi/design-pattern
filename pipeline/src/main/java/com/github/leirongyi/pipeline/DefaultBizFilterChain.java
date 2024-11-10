package com.github.leirongyi.pipeline;

import cn.hutool.core.util.ObjectUtil;
import com.github.leirongyi.pipeline.context.BizContext;
import lombok.Setter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 默认业务过滤链
 */
public class DefaultBizFilterChain<T extends BizContext> implements BizFilterChain<T> {

    @Setter
    private BizFilterChain<T> next;
    private final BizFilter<T> filter;

    public DefaultBizFilterChain(BizFilterChain<T> next, BizFilter<T> filter) {
        this.next = next;
        this.filter = filter;
    }

    /**
     * 当前 filter 处理
     * @param context 业务上下文
     */
    @Override
    public void filter(T context) {
        filter.doFilter(context, this);
    }

    /**
     * 下一个 filter 处理
     * @param context 业务上下文
     */
    @Override
    public void next(T context) {
        if (ObjectUtil.isNotNull(this.next)) {
            this.next.filter(context);
        }
    }
}

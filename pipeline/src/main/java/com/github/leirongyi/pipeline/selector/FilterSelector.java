package com.github.leirongyi.pipeline.selector;

import java.util.List;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 过滤器选择器
 */
public interface FilterSelector {

    boolean matchFilter(String filterName);

    List<String> getFilterNames();

}

package com.github.leirongyi.pipeline.selector;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 基于本地 list 的过滤器选择器
 */

@NoArgsConstructor
public class LocalListFilterSelector implements FilterSelector {

    private List<String> filterNames = new ArrayList<>();

    public LocalListFilterSelector(List<String> filterNames) {
        this.filterNames = filterNames;
    }

    public void addFilter(String filterName) {
        this.filterNames.add(filterName);
    }

    public void addFilters(List<String> filterNames) {
        this.filterNames.addAll(filterNames);
    }

    @Override
    public boolean matchFilter(String filterName) {
        return filterNames.stream().anyMatch(filterName::equals);
    }

    @Override
    public List<String> getFilterNames() {
        return filterNames;
    }

}

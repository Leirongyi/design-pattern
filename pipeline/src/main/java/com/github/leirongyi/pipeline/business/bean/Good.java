package com.github.leirongyi.pipeline.business.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 商品
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Good {

    private Long id;
    private String name;
    private double price;
}

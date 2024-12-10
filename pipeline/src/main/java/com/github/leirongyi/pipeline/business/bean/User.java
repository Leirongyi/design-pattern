package com.github.leirongyi.pipeline.business.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 用户
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String name;
    private Boolean vipFlag;
}

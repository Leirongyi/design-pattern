package com.github.leirongyi.pipeline.business.enums;

import com.github.leirongyi.pipeline.enums.BizCode;
import lombok.Getter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 订单业务编码枚举
 */
@Getter
public enum OrderCodeEnum implements BizCode {

    /**
     * 下单业务
     */
    PLACE_ORDER("PLACE_ORDER");

    private final String code;

    OrderCodeEnum(String code) {
        this.code = code;
    }

}

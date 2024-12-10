package com.github.leirongyi.state;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 灯状态接口
 */
public interface LightState {

    void on(LightContext context);
    void off(LightContext context);

}

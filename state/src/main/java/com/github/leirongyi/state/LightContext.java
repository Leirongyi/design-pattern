package com.github.leirongyi.state;

import lombok.Data;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 灯上下文 （控制器）
 */
@Data
public class LightContext {
    private LightOnState onState = new LightOnState();
    private LightOffState offState = new LightOffState();

    private LightState state;

    public LightContext(LightState state) {
        this.state = state;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }

}

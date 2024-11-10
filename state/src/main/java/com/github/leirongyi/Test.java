package com.github.leirongyi;

import com.github.leirongyi.state.LightContext;
import com.github.leirongyi.state.LightOffState;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 初始状态为关灯
        LightContext lightContext = new LightContext(new LightOffState());

        lightContext.off();
        lightContext.on();
        lightContext.on();
        lightContext.off();
        lightContext.off();

    }
}
package com.github.leirongyi.state;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 开启状态
 */
public class LightOnState implements LightState {
    @Override
    public void on(LightContext context) {
        System.out.println("灯已经开了");
    }

    @Override
    public void off(LightContext context) {
        System.out.println("关灯了");
        // 切换到关闭状态
        context.setState(context.getOffState());
    }
}

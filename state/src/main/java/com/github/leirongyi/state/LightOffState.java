package com.github.leirongyi.state;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 关灯状态
 */
public class LightOffState implements LightState{

    @Override
    public void on(LightContext context) {
        System.out.println("开灯了");
        // 改变状态
        context.setState(context.getOnState());
    }

    @Override
    public void off(LightContext context) {
        System.out.println("灯已经关了");
    }
}

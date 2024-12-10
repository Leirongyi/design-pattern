package com.github.leirongyi;

import com.github.leirongyi.command.*;
import com.github.leirongyi.command.receiver.AirConditioner;
import com.github.leirongyi.command.receiver.Television;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建接收者
        Television television = new Television();
        AirConditioner airConditioner = new AirConditioner();

        // 创建命令对象
        Command tvOn = new TurnOnTelevisionCommand(television);
        Command tvOff = new TurnOffTelevisionCommand(television);
        Command acOn = new TurnOnAirConditionerCommand(airConditioner);
        Command acOff = new TurnOffAirConditionerCommand(airConditioner);

        // 创建遥控器
        RemoteControl remoteControl = new RemoteControl();

        // 使用遥控器控制电视和空调
        System.out.println("Using Remote Control for TV:");
        // 电视开机
        remoteControl.setCommand(tvOn);
        remoteControl.pressButton();
        // 电视关机
        remoteControl.setCommand(tvOff);
        remoteControl.pressButton();

        System.out.println("Using Remote Control for Air Conditioner:");
        // 空调开机
        remoteControl.setCommand(acOn);
        remoteControl.pressButton();
        // 空调关机
        remoteControl.setCommand(acOff);
        remoteControl.pressButton();
    }
}
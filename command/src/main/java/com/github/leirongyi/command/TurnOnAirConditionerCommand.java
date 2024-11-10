package com.github.leirongyi.command;

import com.github.leirongyi.command.receiver.AirConditioner;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 空调开机命令
 */

public class TurnOnAirConditionerCommand implements Command {
    private AirConditioner airConditioner;

    public TurnOnAirConditionerCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}

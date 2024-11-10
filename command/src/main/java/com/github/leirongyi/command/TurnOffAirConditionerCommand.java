package com.github.leirongyi.command;

import com.github.leirongyi.command.receiver.AirConditioner;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description空调关机命令Ò
 */
public class TurnOffAirConditionerCommand implements Command {
    private AirConditioner airConditioner;

    public TurnOffAirConditionerCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}

package com.github.leirongyi.command;

import com.github.leirongyi.command.receiver.Television;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 电视关机命令
 */
public class TurnOffTelevisionCommand implements Command {
    private Television television;

    public TurnOffTelevisionCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}

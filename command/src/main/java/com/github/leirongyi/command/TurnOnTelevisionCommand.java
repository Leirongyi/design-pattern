package com.github.leirongyi.command;

import com.github.leirongyi.command.receiver.Television;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 电视开机命令
 */

 public class TurnOnTelevisionCommand implements Command {
    private Television television;

    public TurnOnTelevisionCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
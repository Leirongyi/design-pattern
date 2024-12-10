package com.github.leirongyi.command;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 遥控器类（调用者类）
 */
public class RemoteControl {
    private Command command;

    // 设置命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行命令
    public void pressButton() {
        command.execute();
    }
}
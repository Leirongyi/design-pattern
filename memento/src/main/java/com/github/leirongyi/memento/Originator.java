package com.github.leirongyi.memento;

import lombok.Data;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 发起人，创建并恢复备忘录
 */

@Data
public class Originator {

    private String state;

    // 创建备忘录, 保存当前对象
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // 从备忘录中恢复状态
    public void restoreStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}

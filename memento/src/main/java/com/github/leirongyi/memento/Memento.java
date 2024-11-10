package com.github.leirongyi.memento;

import lombok.Getter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description备忘录类，保存发起人的状态
 */

@Getter
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

}

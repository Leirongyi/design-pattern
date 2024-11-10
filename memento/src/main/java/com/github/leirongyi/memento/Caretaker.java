package com.github.leirongyi.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 看护者，负责管理备忘录的保存和恢复
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    // 添加备忘录
    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }
    // 获取备忘录
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}

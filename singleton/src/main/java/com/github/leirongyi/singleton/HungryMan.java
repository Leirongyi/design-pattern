package com.github.leirongyi.singleton;

/**
 * @author 雷荣易
 * @date 2024/08/05
 * <p>
 * 饿汉模式
 */
public class HungryMan {

    private static final HungryMan INSTANCE = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getInstance() {
        return INSTANCE;
    }

}

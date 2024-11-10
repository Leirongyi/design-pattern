package com.github.leirongyi.singleton;

/**
 * @author 雷荣易
 * @date 2024/08/05
 *
 * 懒汉模式
 */
public class LazyMan {

    private static LazyMan INSTANCE = null;

    private LazyMan() {
    }

    public static synchronized LazyMan getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyMan();
        }
        return INSTANCE;
    }

}

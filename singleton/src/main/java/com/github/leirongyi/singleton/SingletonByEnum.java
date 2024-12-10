package com.github.leirongyi.singleton;

/**
 * @author 雷荣易
 * @date 2024/08/05
 *
 * 枚举单例模式, 线程安全, 反序列化
 */
public enum SingletonByEnum {

    INSTANCE,
    ;

    public static SingletonByEnum getInstance() {

        return INSTANCE;
    }

}

package com.github.leirongyi.singleton;

/**
 * @author 雷荣易
 * @date 2024/08/05
 * <p>
 * 懒汉模式-线程安全, 内部类实现
 */
public class SafeLazyManByInner {

    private SafeLazyManByInner() {
    }

    private static final class ManHolder {
        static final SafeLazyManByInner INSTANCE = new SafeLazyManByInner();
    }

    public static SafeLazyManByInner getInstance() {
        return ManHolder.INSTANCE;
    }

}

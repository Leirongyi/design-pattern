package com.github.leirongyi.singleton;

/**
 * @author 雷荣易
 * @date 2024/08/05
 * <p>
 * 懒汉式，线程安全，利用 synchronized 和双重检查
 */
public class SafeLazyMan {


    /**
     * 使用 volatile 的原因：
     * new 操作：分配内存-初始化对象-引用赋值
     * 这三步可能会重排，可能先将地址赋值给引用，再初始化对象
     * 导致其他线程第一次检查时虽然不为 null 了，但其实没有对象，引发空指针问题
     */
    private static volatile SafeLazyMan INSTANCE;

    private SafeLazyMan() {
    }

    public static SafeLazyMan getInstance() {
        // 双重检查
        // 第一次检查，如果实例不为空，直接返回
        if (INSTANCE == null) {
            synchronized (SafeLazyMan.class) {
                // 第二次检查，如果实例为空，则创建实例
                if (INSTANCE == null) {
                    INSTANCE = new SafeLazyMan();
                }
            }
        }
        return INSTANCE;
    }

}

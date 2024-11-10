package com.github.leirongyi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 中介 （动态代理实现）
 */
public class DynamicProxyClient implements InvocationHandler {

    private final RentOuter rentOuter;

    public DynamicProxyClient(RentOuter rentOuter) {
        this.rentOuter = rentOuter;
    }

    /**
     * 获取 RentOuter 的代理实例
     *
     * @return RentOuter 的代理实例
     */
    public RentOuter getInstance(){
        Class<?> aClass = this.rentOuter.getClass();
        return (RentOuter) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    /**
     * 代理方法
     *
     * @param proxy 代理对象
     * @param method 被代理对象的方法
     * @param args 方法参数
     * @return 方法返回值
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        sign();
        pay();
        // 传入维护的 rentOuter (注意不是 proxy)
        return method.invoke(this.rentOuter, args);
    }


    private void seeHouse(){
        System.out.println("中介看房");
    }
    private void sign(){
        System.out.println("中介签合同");
    }
    private void pay(){
        System.out.println("中介收钱");
    }

}

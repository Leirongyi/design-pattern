package com.github.leirongyi;

import com.github.leirongyi.proxy.*;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("静态代理模式：");
        StaticProxyClient clientStatic = new StaticProxyClient(new Lessor());
        clientStatic.rentOut();

        System.out.println("===============================");
        System.out.println("动态代理模式：");
        DynamicProxyClient clientDy = new DynamicProxyClient(new Lessor());
        RentOuter instanceDy = clientDy.getInstance();
        instanceDy.rentOut();

        System.out.println("===============================");
        System.out.println("Cglib代理模式：");
        CglibProxyClient clientCg = new CglibProxyClient();
        RentOuter instanceCg = clientCg.getInstance(Lessor.class);
        instanceCg.rentOut();
    }
}
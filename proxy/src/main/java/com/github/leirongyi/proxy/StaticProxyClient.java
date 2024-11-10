package com.github.leirongyi.proxy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 中介 （静态代理实现）
 */
public class StaticProxyClient implements RentOuter{
    private final RentOuter rentOuter;

    public StaticProxyClient(RentOuter rentOuter) {
        this.rentOuter = rentOuter;
    }

    @Override
    public void rentOut() {
        seeHouse();
        sign();
        pay();
        rentOuter.rentOut();
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

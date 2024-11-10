package com.github.leirongyi.proxy;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 出租人实现 - 房东
 */
public class Lessor implements RentOuter {
    @Override
    public void rentOut() {
        System.out.println("出租房子");
    }
}

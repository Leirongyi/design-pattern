package com.github.leirongyi.adater;

/**
 * @author 雷荣易
 * @date 2024/11/9
 *
 * TypeC 使用者
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作
 */
public class Client {

    public void useTypeC(TypeC typeC) {
        typeC.slot();
    }

}

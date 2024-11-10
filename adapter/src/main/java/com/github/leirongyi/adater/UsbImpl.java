package com.github.leirongyi.adater;

/**
 * @author 雷荣易
 * @date 2024/11/9
 *
 * Usb 实现类
 */
public class UsbImpl implements Usb {

    @Override
    public void slot() {
        System.out.println("Usb slotted");
    }
}

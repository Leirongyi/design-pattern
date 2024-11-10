package com.github.leirongyi.adater;

/**
 * @author 雷荣易
 * @date 2024/11/9
 *
 * USB to TypeC 适配器
 */
public class TypeCAdapter implements TypeC{

    private final Usb usb;
    public TypeCAdapter(Usb usb) {
        this.usb = usb;
    }


    @Override
    public void slot() {
        System.out.println("TypeC slotted");
        usb.slot();
    }
}

package com.github.leirongyi;

import com.github.leirongyi.adater.Client;
import com.github.leirongyi.adater.TypeC;
import com.github.leirongyi.adater.TypeCAdapter;
import com.github.leirongyi.adater.UsbImpl;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class Test {
    public static void main(String[] args) {
        TypeC typeC = new TypeCAdapter(new UsbImpl());
        Client client = new Client();
        client.useTypeC(typeC);
    }
}
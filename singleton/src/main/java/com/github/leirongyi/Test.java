package com.github.leirongyi;

import com.github.leirongyi.singleton.LazyMan;

/**
 * @author 雷荣易
 * @date 2024/08/05
 */
public class Test {


    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(LazyMan.getInstance().hashCode());
            }).start();
        }
    }


}

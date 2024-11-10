package com.github.leirongyi;

import com.github.leirongyi.facade.SmartHomeFacade;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建外观对象
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // 启动晚间例行程序
        smartHome.startEveningRoutine();

        // 结束晚间例行程序
        smartHome.endEveningRoutine();
    }
}
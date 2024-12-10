package com.github.leirongyi;

import com.github.leirongyi.chain.CEOHandler;
import com.github.leirongyi.chain.DirectorHandler;
import com.github.leirongyi.chain.Handler;
import com.github.leirongyi.chain.ManagerHandler;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建处理者对象
        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();
        Handler ceo = new CEOHandler();

        // 设置责任链
        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        // 客户端发起请求
        System.out.println("Request: Manager");
        manager.handleRequest("Manager");

        System.out.println("Request: Director");
        manager.handleRequest("Director");

        System.out.println("Request: CEO");
        manager.handleRequest("CEO");

        System.out.println("Request: Unknown");
        manager.handleRequest("Unknown");
    }
}
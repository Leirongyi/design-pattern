package com.github.leirongyi.chain;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description CEOHandler
 */
public class CEOHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("CEO".equals(request)) {
            System.out.println("CEO approved the request.");
        } else {
            System.out.println("Request was not handled.");
        }
    }
}
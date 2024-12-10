package com.github.leirongyi.chain;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 经理处理者
 */
public class ManagerHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("Manager".equals(request)) {
            System.out.println("Manager approved the request.");
        } else if (nextHandler != null) {
            // 转发请求给下一个处理者
            nextHandler.handleRequest(request);
        }
    }
}
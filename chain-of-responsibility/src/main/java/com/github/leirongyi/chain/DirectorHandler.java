package com.github.leirongyi.chain;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 主任处理器
 */
public class DirectorHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("Director".equals(request)) {
            System.out.println("Director approved the request.");
        } else if (nextHandler != null) {
            // 转发请求给下一个处理者
            nextHandler.handleRequest(request);
        }
    }
}
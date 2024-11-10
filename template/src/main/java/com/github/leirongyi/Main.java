package com.github.leirongyi;

import com.github.leirongyi.template.EmailMsgSender;
import com.github.leirongyi.template.MsgSender;
import com.github.leirongyi.template.ShortMsgSender;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Main {

    public static void main(String[] args) {
        MsgSender emailMsgSender = new EmailMsgSender();
        emailMsgSender.send("Email msg");
        System.out.println("---------------------");
        MsgSender shortMsgSender = new ShortMsgSender();
        shortMsgSender.send("Short msg");
    }
}
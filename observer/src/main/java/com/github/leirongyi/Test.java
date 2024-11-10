package com.github.leirongyi;

import com.github.leirongyi.observer.Alarm;
import com.github.leirongyi.observer.Operator;

/**
 * @author 雷荣易
 * @date 2024/11/9
 */
public class Test {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("异常报警器");
        Operator operator1 = new Operator("operator1");
        Operator operator2 = new Operator("operator2");
        alarm.addObserver(operator1);
        alarm.addObserver(operator2);

        alarm.notifyObservers("出现异常");
        alarm.removeObserver(operator1);
        alarm.notifyObservers("再次出现异常");

    }
}
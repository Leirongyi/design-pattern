package com.github.leirongyi;

import com.github.leirongyi.interpreter.AddExpression;
import com.github.leirongyi.interpreter.Expression;
import com.github.leirongyi.interpreter.NumberExpression;
import com.github.leirongyi.interpreter.SubtractExpression;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建表达式：(5 + 2) - 3
        Expression five = new NumberExpression(5);
        Expression two = new NumberExpression(2);
        Expression three = new NumberExpression(3);

        // 构建加法表达式：5 + 2
        Expression addExpression = new AddExpression(five, two);

        // 构建减法表达式：(5 + 2) - 3
        Expression subtractExpression = new SubtractExpression(addExpression, three);

        // 解释整个表达式
        System.out.println("Result: " + subtractExpression.interpret());
    }
}
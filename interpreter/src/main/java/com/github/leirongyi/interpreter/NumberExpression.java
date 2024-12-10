package com.github.leirongyi.interpreter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 常量数值表达式 （终结符表达式）
 */
public class NumberExpression implements Expression{
    private int number;
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

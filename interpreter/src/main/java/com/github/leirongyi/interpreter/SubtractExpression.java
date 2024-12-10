package com.github.leirongyi.interpreter;

/**
 * @author 雷荣易
 * @date 2024/11/10
 * @description 减法表达式 （非终结符表达式）
 */
public class SubtractExpression implements Expression {

    private Expression left;
    private Expression right;
    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
package com.github.leirongyi.prototype;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 图像抽象类 (原型角色)
 */
public abstract class Shape implements  Cloneable{

    public abstract void print();

    @Override
    protected Object clone() {
        // 浅拷贝
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}

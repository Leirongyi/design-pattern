package com.github.leirongyi;

import com.github.leirongyi.prototype.ShapeCache;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(ShapeCache.getShape("square"));
        System.out.println(ShapeCache.getShape("square") == ShapeCache.getShape("square"));
    }
}
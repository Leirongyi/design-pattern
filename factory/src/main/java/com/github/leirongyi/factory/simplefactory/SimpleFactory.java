package com.github.leirongyi.factory.simplefactory;

import com.github.leirongyi.factory.shape.Circle;
import com.github.leirongyi.factory.shape.Shape;
import com.github.leirongyi.factory.shape.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 简单工厂
 */
public class SimpleFactory {

    private static final Map<String, Supplier<Shape>> cacheMap = new HashMap<>();

    static {
        cacheMap.put("Circle", Circle::new);
        cacheMap.put("Square", Square::new);
    }

    public static Shape getShape(String type) {
        return cacheMap.get(type).get();
    }
}

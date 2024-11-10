package com.github.leirongyi.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 图形缓存 （使用者角色）
 */
public class ShapeCache {

    private static final Map<String, Shape> cacheMap = new HashMap<>();

    static {
        cacheMap.put("circle", new Circle());
        cacheMap.put("square", new Square());
    }

    public static Shape getShape(String type) {
        return (Shape) cacheMap.get(type).clone();
    }


}

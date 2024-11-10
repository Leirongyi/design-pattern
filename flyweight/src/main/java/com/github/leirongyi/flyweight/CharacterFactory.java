package com.github.leirongyi.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 享元工厂类，管理享元对象的创建与共享
 */

public class CharacterFactory {
    private Map<java.lang.Character, CharacterFlyweight> flyweightMap;

    public CharacterFactory() {
        flyweightMap = new HashMap<>();
    }

    // 获取享元对象，如果不存在则创建
    public CharacterFlyweight getCharacter(char symbol) {
        if (!flyweightMap.containsKey(symbol)) {
            flyweightMap.put(symbol, new Character(symbol));
        }
        return flyweightMap.get(symbol);
    }
}

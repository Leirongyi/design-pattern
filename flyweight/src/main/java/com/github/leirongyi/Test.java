package com.github.leirongyi;

import com.github.leirongyi.flyweight.CharacterFactory;
import com.github.leirongyi.flyweight.CharacterFlyweight;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // 客户端请求字符对象
        CharacterFlyweight charA1 = factory.getCharacter('A');
        CharacterFlyweight charA2 = factory.getCharacter('A');
        CharacterFlyweight charB = factory.getCharacter('B');

        // 显示字符，注意共享的对象
        charA1.display(0, 0);
        charA2.display(10, 10);
        charB.display(20, 20);

        // 通过引用的对象相同，可以看到共享的效果
        // true，A是共享的
        System.out.println("charA1 == charA2: " + (charA1 == charA2));
    }

}
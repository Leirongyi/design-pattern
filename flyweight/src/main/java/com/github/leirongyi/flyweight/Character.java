package com.github.leirongyi.flyweight;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description ConcreteFlyweight（具体享元类）
 */
public class Character implements CharacterFlyweight {
    private char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying character '" + symbol + "' at position (" + x + ", " + y + ")");
    }
    @Override
    public boolean equals(Object obj) {
        // 检查是否为同一对象
        if (this == obj) {
            return true;
        }
        // 检查类型是否一致
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // 强制类型转换
        Character other = (Character) obj;
        // 比较字符值
        return this.symbol == other.symbol;
    }

    @Override
    public int hashCode() {
        return (int) symbol;
    }

}
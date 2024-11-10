package com.github.leirongyi;

import com.github.leirongyi.builer.Computer;
import com.github.leirongyi.builer.Director;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();

        Director director = new Director(builder);

        // Construct a Gaming PC
        Computer gamingPc = director.constructGamingPC();
        System.out.println("Gaming PC: " + gamingPc);

        // Construct an Office PC
        Computer officePc = director.constructOfficePC();
        System.out.println("Office PC: " + officePc);
    }
}
package com.github.leirongyi.builer;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 指挥者类：负责控制构建的流程，使用 Builder 来构建产品。
 */
public class Director {
    private Computer.Builder builder;

    public Director(Computer.Builder builder) {
        this.builder = builder;
    }

    // 指挥者方法，用来构建不同的计算机配置
    public Computer constructGamingPC() {
        return builder.setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .build();
    }

    public Computer constructOfficePC() {
        return builder.setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .build();
    }
}

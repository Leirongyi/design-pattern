package com.github.leirongyi.builer;

import lombok.Data;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 电脑（产品类）：表示最终的复杂对象。
 */
@Data
public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    // 构造器私有化，防止直接创建对象
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", graphicsCard=" + graphicsCard + "]";
    }

    // Builder（抽象建造者类）：定义构建产品的各个步骤，但不提供具体的实现。
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        //  setter 方法返回 this，以便链式调用
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Build the final product
        public Computer build() {
            return new Computer(this);
        }
    }
}
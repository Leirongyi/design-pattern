package com.github.leirongyi.composite;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 设计者 (Leaf 叶子节点)
 */
public class Designer implements Employee{
    private String name;
    private int salary;

    public Designer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Designer: " + name + ", salary: " + salary);
    }
}

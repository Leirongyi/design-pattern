package com.github.leirongyi.composite;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 开发者 （Leaf 节点）
 */
public class Developer implements Employee{

    private String name;
    private int salary;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + ", Salary: " + salary);
    }
}
